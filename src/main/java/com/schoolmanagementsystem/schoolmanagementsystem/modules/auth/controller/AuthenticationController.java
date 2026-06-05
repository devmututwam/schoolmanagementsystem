package com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.controller;

import com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.dto.AuthenticationRequest;
import com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.dto.AuthenticationResponse;
import com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.dto.RegisterRequest;
import com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}
