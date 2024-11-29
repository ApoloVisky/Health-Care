package com.mental_health.demo.repository;

import com.mental_health.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserRepository extends JpaRepository<UserEntity, Long> {


    String findByEmail(String email);
}
