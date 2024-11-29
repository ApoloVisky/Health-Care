package com.mental_health.demo.response;

import lombok.Builder;

@Builder

public record UserResponse(Long id, String username, String email, String role) {
}
