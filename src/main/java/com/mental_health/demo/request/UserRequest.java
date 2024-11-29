package com.mental_health.demo.request;

import lombok.Builder;

@Builder

public record UserRequest(String username, String password, String email, String role) {
}
