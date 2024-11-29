package com.mental_health.demo.service;

import com.mental_health.demo.entity.MoodEntity;
import com.mental_health.demo.repository.MoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoodService {

    private final MoodRepository moodRepository;

    public MoodService(MoodRepository moodRepository) {
        this.moodRepository = moodRepository;
    }

    public void save(MoodEntity user) {

        moodRepository.save(user);
    }


    public List<MoodEntity> findAll() {

        return moodRepository.findAll();
    }

    public Optional<MoodEntity> findById(Long id) {

        return moodRepository.findById(id);
    }

    public void delete(Long id) {

        moodRepository.deleteById(id);
    }
}
