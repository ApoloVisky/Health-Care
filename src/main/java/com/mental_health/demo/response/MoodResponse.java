package com.mental_health.demo.response;

import com.mental_health.demo.entity.UserEntity;
import lombok.Builder;

@Builder
public record MoodResponse(Long id, UserEntity user, String emotion, String note) {
}
