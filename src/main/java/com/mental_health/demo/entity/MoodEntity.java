package com.mental_health.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
@Table(name = "mood_tb")
public class MoodEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @CreationTimestamp
    private LocalDate date;

    @NotBlank
    private String emotion; // Ex.: "Feliz", "Ansioso"

    private String note; // Notas opcionais do usuário
}
