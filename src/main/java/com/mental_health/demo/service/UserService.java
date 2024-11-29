package com.mental_health.demo.service;

import com.mental_health.demo.entity.SuggestionEntity;
import com.mental_health.demo.entity.UserEntity;
import com.mental_health.demo.mapper.SuggestionMapper;
import com.mental_health.demo.mapper.UserMapper;
import com.mental_health.demo.repository.UserRepository;
import com.mental_health.demo.request.UserRequest;
import com.mental_health.demo.response.UserResponse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public UserResponse save(UserRequest user) {

        UserEntity newUser = UserMapper.toEntity(user);
         UserEntity savedUser = userRepository.save(newUser);
         return UserMapper.toResponse(savedUser);
    }

    public String findByEmail(String email) {

        return userRepository.findByEmail(email);
    }

    public List<UserResponse> findAll() {
        List<UserEntity> userEntities = userRepository.findAll();
        return userEntities.stream()
                .map(UserMapper::toResponse)
                .toList();

    }

    public Optional<UserResponse> findById(Long id) {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        return userEntity.map(UserMapper::toResponse);

    }

    public void delete(Long id) {

        userRepository.deleteById(id);
    }
}
