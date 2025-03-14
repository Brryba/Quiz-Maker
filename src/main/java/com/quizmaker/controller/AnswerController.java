package com.quizmaker.controller;


import com.quizmaker.model.answer.Answer;
import com.quizmaker.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/answer")
public class AnswerController {
    private final AnswerService answerService;

    @Autowired
    AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @GetMapping
    public List<Answer> getAnswers(@RequestParam Integer questionId) {
        System.out.println(answerService.getAnswersByQuestionId(questionId));
        return answerService.getAnswersByQuestionId(questionId);
    }

    @PostMapping
    public ResponseEntity<Answer> createAnswer(@RequestBody Answer answer) {
        Answer createdAnswer = answerService.addAnswer(answer);
        return new ResponseEntity<>(createdAnswer, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Answer> updateAnswer(@RequestBody Answer answer) {
        Answer updatedAnswer = answerService.updateAnswer(answer);
        if (updatedAnswer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedAnswer, HttpStatus.OK);
    }

    @DeleteMapping("/{answerID}")
    public ResponseEntity<Answer> deleteAnswer(@PathVariable Integer answerID) {
        answerService.deleteAnswer(answerID);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
