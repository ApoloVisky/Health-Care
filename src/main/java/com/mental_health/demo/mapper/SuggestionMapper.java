package com.mental_health.demo.mapper;


import com.mental_health.demo.entity.SuggestionEntity;
import com.mental_health.demo.request.SuggestionRequest;
import com.mental_health.demo.response.SuggestionResponse;
import lombok.experimental.UtilityClass;
import org.mapstruct.Mapper;

@UtilityClass
@Mapper(componentModel = "spring")
public class SuggestionMapper {

    public SuggestionResponse toResponse(SuggestionEntity suggestionEntity) {
        return SuggestionResponse
                .builder()
                .id(suggestionEntity.getId())
                .emotion(suggestionEntity.getEmotion())
                .content(suggestionEntity.getContent())
                .build();
    }

    public SuggestionEntity toEntity(SuggestionRequest suggestionRequest) {
        return SuggestionEntity
                .builder()
                .emotion(suggestionRequest.emotion())
                .content(suggestionRequest.content())
                .build();
    }
}
