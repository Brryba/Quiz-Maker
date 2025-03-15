package com.quizmaker.service;

import com.quizmaker.model.Question;
import com.quizmaker.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question findQuestionById(int id) {
        return this.questionRepository.findQuestionById(id);
    }

    public List<Question> findQuestionsByQuizId(int quizId) {
        return questionRepository.findByQuizId(quizId);
    }

    public Question addQuestion(Question question) {
        return questionRepository.save(question);
    }

    public Question updateQuestion(Question question) {
        //Not finished
        return questionRepository.save(question);
    }

    public void deleteQuestion(int questionId) {
        questionRepository.deleteById(questionId);
    }
}
