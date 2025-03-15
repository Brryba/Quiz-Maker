package com.quizmaker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "questions")
public class Question {
    @Id
    @Column(unique = true, nullable = false)
    private Integer questionId;
    private Integer quizId;
    private String questionText;

    public Integer getCorrectAnswerID() {
        return correctAnswerID;
    }

    public void setCorrectAnswerID(Integer correctAnswerID) {
        this.correctAnswerID = correctAnswerID;
    }

    private Integer correctAnswerID;

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Integer getQuestionId() {
        return questionId;
    }
}
