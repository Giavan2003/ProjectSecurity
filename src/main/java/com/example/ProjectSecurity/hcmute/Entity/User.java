package com.example.ProjectSecurity.hcmute.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Collection;

@Entity
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String email;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    // Getters and setters...

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null; // Cung cấp quyền nếu có
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return fullName; // Trả về email như username
    }

    @Override
    public boolean isAccountNonExpired() {
        return true; // Có thể tùy chỉnh
    }

    @Override
    public boolean isAccountNonLocked() {
        return true; // Có thể tùy chỉnh
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true; // Có thể tùy chỉnh
    }

    @Override
    public boolean isEnabled() {
        return true; // Có thể tùy chỉnh
    }
}
