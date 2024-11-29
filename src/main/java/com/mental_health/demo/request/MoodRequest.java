package com.mental_health.demo.request;

import lombok.Builder;

@Builder

public  record MoodRequest(String user, String emotion, String note) {
}
