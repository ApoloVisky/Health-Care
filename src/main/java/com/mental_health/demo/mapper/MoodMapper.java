package com.mental_health.demo.mapper;

import com.mental_health.demo.entity.MoodEntity;
import com.mental_health.demo.request.MoodRequest;
import com.mental_health.demo.response.MoodResponse;
import lombok.experimental.UtilityClass;
import org.mapstruct.Mapper;

@UtilityClass
@Mapper(componentModel = "spring")
public class MoodMapper {

    public MoodResponse toResponse(MoodEntity moodEntity) {
        return MoodResponse
                .builder()
                .id(moodEntity.getId())
                .emotion(moodEntity.getEmotion())
                .note(moodEntity.getNote())
                .build();
    }

    public MoodEntity toEntity(MoodRequest moodRequest) {
        return MoodEntity
                .builder()
                .emotion(moodRequest.emotion())
                .note(moodRequest.note())
                .build();
    }
}
