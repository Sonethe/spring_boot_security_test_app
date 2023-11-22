package com.example.spring_boot_security_test_app.dtos;

import lombok.Data;

@Data
public class JwtRequest {
    private String username;
    private String password;
}
