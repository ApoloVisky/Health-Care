package com.mental_health.demo.service;

import com.mental_health.demo.entity.SuggestionEntity;
import com.mental_health.demo.mapper.SuggestionMapper;
import com.mental_health.demo.repository.SuggestionRepository;
import com.mental_health.demo.request.SuggestionRequest;
import com.mental_health.demo.response.SuggestionResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuggestionService {
    private final SuggestionRepository suggestionRepository;

    public SuggestionService(SuggestionRepository suggestionRepository) {
        this.suggestionRepository = suggestionRepository;
    }

    public SuggestionResponse save(SuggestionRequest request) {
        SuggestionEntity newSuggestion = SuggestionMapper.toEntity(request);
        SuggestionEntity savedSuggestion = suggestionRepository.save(newSuggestion);
        return SuggestionMapper.toResponse(savedSuggestion);


    }


    public List<SuggestionResponse> findAll() {
        List<SuggestionEntity> suggestionEntities = suggestionRepository.findAll();
        return suggestionEntities.stream()
                .map(SuggestionMapper::toResponse)
                .toList();


    }

    public Optional<SuggestionResponse> findById(Long id) {
        Optional<SuggestionEntity> suggestionEntity = suggestionRepository.findById(id);
        return suggestionEntity.map(SuggestionMapper::toResponse);

    }

    public void delete(Long id) {

        suggestionRepository.deleteById(id);
    }
}
