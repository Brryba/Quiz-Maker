package com.quizmaker.repository;

import com.quizmaker.model.Answer;
import com.quizmaker.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
    Question findQuestionById(int id);
    List<Question> findByQuizId(Integer quizId);
}
