package com.quizmaker.service;

import com.quizmaker.model.Quiz;
import com.quizmaker.repository.QuizRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    private final QuizRepository quizRepository;

    public List<Quiz> findAll() {
        return quizRepository.findAll();
    }

    public Quiz findQuizById(int id) {
        return quizRepository.getReferenceById(id);
    }

    public Quiz addQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public Quiz updateQuiz(Quiz quiz) {
        //
        return quizRepository.save(quiz);
    }

    public void deleteQuiz(int id) {
        quizRepository.deleteById(id);
    }

    public QuizService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }
}
