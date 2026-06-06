package com.bank.auth_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class AuthResponse {

    private String token;
    private String tokenType = "Bearer";
    private String role;
    private String username;
}
