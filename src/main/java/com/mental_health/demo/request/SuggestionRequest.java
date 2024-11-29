package com.mental_health.demo.request;

import lombok.Builder;

@Builder
public record SuggestionRequest(String emotion, String content) {
}
