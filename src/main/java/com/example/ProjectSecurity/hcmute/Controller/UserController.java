package com.example.ProjectSecurity.hcmute.Controller;




import com.example.ProjectSecurity.hcmute.AuthenticationRequest;
import com.example.ProjectSecurity.hcmute.AuthenticationResponse;
import com.example.ProjectSecurity.hcmute.Request.LoginRequest;
import com.example.ProjectSecurity.hcmute.Request.RegisterRequest;
import com.example.ProjectSecurity.hcmute.Service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class UserController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        try {
            return ResponseEntity.ok(authenticationService.authenticate(request));
        } catch (BadCredentialsException e) {
            return ResponseEntity.status(401).body("Invalid email or password");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Internal server error");
        }
    }

}
