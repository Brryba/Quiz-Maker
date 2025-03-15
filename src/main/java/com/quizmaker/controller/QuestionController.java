package com.quizmaker.controller;

import com.quizmaker.model.Quiz;
import com.quizmaker.repository.AnswerRepository;
import com.quizmaker.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private final QuestionService questionService;
    private final AnswerRepository answerRepository;

    public QuestionController(QuestionService questionService, AnswerRepository answerRepository) {
        this.questionService = questionService;
        this.answerRepository = answerRepository;
    }

    @GetMapping
    public ResponseEntity<Quiz> getQuestion(@RequestParam int id) {
        return null;
    }
}
