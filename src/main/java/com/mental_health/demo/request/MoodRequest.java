package com.mental_health.demo.request;

import com.mental_health.demo.entity.UserEntity;
import lombok.Builder;

@Builder

public  record MoodRequest(UserEntity user, String emotion, String note) {
}
