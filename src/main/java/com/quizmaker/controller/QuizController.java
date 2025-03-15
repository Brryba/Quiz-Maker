package com.quizmaker.controller;

import com.quizmaker.model.Quiz;
import com.quizmaker.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private final QuizService quizService;

    @GetMapping
    public List<Quiz> getQuizByID(@RequestParam(required = false) Integer quizId) {
        if (quizId == null) {
            return null;
        }
        return null;
    }

    @PostMapping
    public ResponseEntity<Quiz> createQuiz(@RequestBody Quiz quiz) {
        return null;
    }

    @PutMapping
    public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz quiz) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<Quiz> deleteQuiz(@RequestBody Quiz quiz) {
        return null;
    }

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
}
