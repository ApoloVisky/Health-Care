package com.mental_health.demo.controller;


import com.mental_health.demo.entity.MoodEntity;
import com.mental_health.demo.service.MoodService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mood")
public class MoodController {

    private final MoodService moodService;

    public MoodController(MoodService moodService) {
        this.moodService = moodService;
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }

    @PostMapping("/save")
    public ResponseEntity<MoodEntity> save(@RequestBody @Valid MoodEntity mood) {
        moodService.save(mood);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(mood);

    }

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(moodService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok(moodService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        moodService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
