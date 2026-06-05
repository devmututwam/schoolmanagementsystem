package com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.dto;

import com.schoolmanagementsystem.schoolmanagementsystem.modules.auth.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String email;
    private String password;
    private Role role;
}
