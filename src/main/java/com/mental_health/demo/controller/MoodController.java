package com.mental_health.demo.controller;


import com.mental_health.demo.request.MoodRequest;
import com.mental_health.demo.response.MoodResponse;
import com.mental_health.demo.service.MoodService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mood")
public class MoodController {

    private final MoodService moodService;

    public MoodController(MoodService moodService) {
        this.moodService = moodService;
    }


    @PostMapping("/save")
    public ResponseEntity<MoodResponse> save(@RequestBody @Valid MoodRequest mood) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(moodService.save(mood));

    }

    @GetMapping
    public ResponseEntity<List<MoodResponse>> findAll() {

        return ResponseEntity.ok(moodService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<MoodResponse>> findById(@PathVariable Long id) {

        return ResponseEntity.ok(moodService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        moodService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
