package com.mental_health.demo.response;

public record UserResponse(Long id, String username, String email, String password, String role) {
}
