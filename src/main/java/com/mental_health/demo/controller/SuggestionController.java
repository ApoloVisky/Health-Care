package com.mental_health.demo.controller;

import com.mental_health.demo.entity.SuggestionEntity;
import com.mental_health.demo.request.SuggestionRequest;
import com.mental_health.demo.response.SuggestionResponse;
import com.mental_health.demo.service.SuggestionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/suggest")
public class SuggestionController {


    private final SuggestionService suggestionService;

    public SuggestionController(SuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }

    @PostMapping("/save")
    public ResponseEntity<SuggestionResponse> save(@RequestBody @Valid SuggestionRequest mood) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(suggestionService.save(mood));

    }

    @GetMapping
    public ResponseEntity<List<SuggestionResponse>> findAll() {

        return ResponseEntity.ok(suggestionService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<SuggestionResponse>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(suggestionService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        suggestionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
