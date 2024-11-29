package com.mental_health.demo.service;

import com.mental_health.demo.entity.SuggestionEntity;
import com.mental_health.demo.repository.SuggestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SuggestionService {
    private final SuggestionRepository suggestionRepository;

    public SuggestionService(SuggestionRepository suggestionRepository) {
        this.suggestionRepository = suggestionRepository;
    }

    public void save(SuggestionEntity mood) {

        suggestionRepository.save(mood);
    }


    public List<SuggestionEntity> findAll() {

        return suggestionRepository.findAll();
    }

    public Optional<SuggestionEntity> findById(Long id) {

        return suggestionRepository.findById(id);
    }

    public void delete(Long id) {

        suggestionRepository.deleteById(id);
    }
}
