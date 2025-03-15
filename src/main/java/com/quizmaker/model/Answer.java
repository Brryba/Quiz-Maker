package com.quizmaker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    @Column(unique = true, nullable = false)
    private Integer answerId;
    private Integer questionId;
    private String answerText;

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getAnswerId() {
        return answerId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}
