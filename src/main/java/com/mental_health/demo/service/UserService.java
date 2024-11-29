package com.mental_health.demo.service;

import com.mental_health.demo.entity.UserEntity;
import com.mental_health.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void save(UserEntity user) {

        userRepository.save(user);
    }

    public String findByEmail(String email) {

        return userRepository.findByEmail(email);
    }

    public List<UserEntity> findAll() {

        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(Long id) {

        return userRepository.findById(id);
    }

    public void delete(Long id) {

        userRepository.deleteById(id);
    }
}
