package com.quizmaker.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Quiz {
    @Id
    @Column(unique = true, nullable = false)
    private Integer QuizId;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuizId() {
        return QuizId;
    }

    public void setQuizId(Integer quizId) {
        QuizId = quizId;
    }
}
