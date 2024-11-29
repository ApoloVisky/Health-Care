package com.mental_health.demo.service;

import com.mental_health.demo.entity.MoodEntity;
import com.mental_health.demo.mapper.MoodMapper;
import com.mental_health.demo.repository.MoodRepository;
import com.mental_health.demo.request.MoodRequest;
import com.mental_health.demo.response.MoodResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoodService {

    private final MoodRepository moodRepository;

    public MoodService(MoodRepository moodRepository) {
        this.moodRepository = moodRepository;
    }

    public MoodResponse save(MoodRequest user) {
        MoodEntity newMood = MoodMapper.toEntity(user);
        MoodEntity savedMood = moodRepository.save(newMood);
        return MoodMapper.toResponse(savedMood);

    }


    public List<MoodResponse> findAll() {
        List<MoodEntity> moodEntities = moodRepository.findAll();
        return moodEntities.stream()
                .map(MoodMapper::toResponse)
                .toList();

    }

    public Optional<MoodResponse> findById(Long id) {
        Optional<MoodEntity> moodEntity = moodRepository.findById(id);
        return moodEntity.map(MoodMapper::toResponse);

    }

    public void delete(Long id) {

        moodRepository.deleteById(id);
    }
}
