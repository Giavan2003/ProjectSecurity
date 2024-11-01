package com.example.ProjectSecurity.hcmute.Service;

import com.example.ProjectSecurity.hcmute.AuthenticationRequest;
import com.example.ProjectSecurity.hcmute.AuthenticationResponse;
import com.example.ProjectSecurity.hcmute.Entity.User;
import com.example.ProjectSecurity.hcmute.Repository.UserRepository;
import com.example.ProjectSecurity.hcmute.Request.LoginRequest;
import com.example.ProjectSecurity.hcmute.Request.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        User user = new User();
        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        userRepository.save(user);

        String jwtToken = jwtService.genrateToken(user); // Gọi đúng phương thức
        return new AuthenticationResponse(jwtToken);}

    public AuthenticationResponse authenticate(LoginRequest request) {
        try {

            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
            );
        } catch (BadCredentialsException e) {
            throw new RuntimeException("Invalid email or password");
        }

        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        String jwtToken = jwtService.genrateToken(user);
        return new AuthenticationResponse(jwtToken);
    }


}
