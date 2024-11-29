package com.mental_health.demo.response;

import com.mental_health.demo.entity.UserEntity;

public record MoodResponse(Long id, UserEntity user, String emotion, String note) {
}
