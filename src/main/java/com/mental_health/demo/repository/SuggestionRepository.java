package com.mental_health.demo.repository;

import com.mental_health.demo.entity.SuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuggestionRepository extends JpaRepository<SuggestionEntity, Long> {
}
