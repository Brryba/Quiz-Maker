package com.quizmaker.model.answer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "answers")
public class Answer {
    @Id
    private Integer answerId;
    private Integer questionId;
    private Boolean isCorrect;

    public Integer getQuestionId() {
        return questionId;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
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

    public void setIsCorrect(Boolean correct) {
        isCorrect = correct;
    }
}
