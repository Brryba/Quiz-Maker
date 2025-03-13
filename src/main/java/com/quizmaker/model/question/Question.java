package com.quizmaker.model.question;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "questions")
public class Question {
    @Id
    @Column(name = "questionID", unique = true, nullable = false)
    private Long questionId;
    private String questionText;

    public String getQuestionText() {
        return questionText;
    }

    public Long getQuestionId() {
        return questionId;
    }
}
