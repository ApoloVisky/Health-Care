package com.mental_health.demo.response;

import lombok.Builder;

@Builder

public record SuggestionResponse(Long id, String emotion, String content) {
}
