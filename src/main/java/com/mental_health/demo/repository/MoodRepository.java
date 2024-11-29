package com.mental_health.demo.repository;

import com.mental_health.demo.entity.MoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodRepository extends JpaRepository<MoodEntity, Long> {
}
