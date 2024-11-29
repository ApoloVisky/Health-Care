package com.mental_health.demo.mapper;


import com.mental_health.demo.entity.UserEntity;
import com.mental_health.demo.request.UserRequest;
import com.mental_health.demo.response.UserResponse;
import lombok.experimental.UtilityClass;
import org.mapstruct.Mapper;

@UtilityClass
@Mapper(componentModel = "spring")
public class UserMapper {

    public UserResponse toResponse(UserEntity userEntity) {
        return UserResponse
                .builder()
                .id(userEntity.getId())
                .username(userEntity.getName())
                .email(userEntity.getEmail())
                .role(userEntity.getRole())
                .build();
    }

    public UserEntity toEntity(UserRequest userRequest) {
        return UserEntity
                .builder()
                .name(userRequest.username())
                .email(userRequest.email())
                .password(userRequest.password())
                .role(userRequest.role())
                .build();
    }
}
