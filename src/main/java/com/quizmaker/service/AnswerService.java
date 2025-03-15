package com.quizmaker.service;

import com.quizmaker.model.Answer;
import com.quizmaker.repository.AnswerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public List<Answer> getAnswersByQuestionId(int questionId) {
        return answerRepository.findByQuestionId(questionId);
    }

    public Answer addAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    public Answer updateAnswer(Answer answer) {
        //The answer object I need from DB
        Optional<Answer> optionalAnswer = answerRepository.findById(answer.getAnswerId());
        if (optionalAnswer.isPresent()) {
            Answer answerToUpdate = optionalAnswer.get();
            answerToUpdate.setQuestionId(answer.getQuestionId());
            answerToUpdate.setAnswerId(answer.getAnswerId());

            return answerRepository.save(answerToUpdate);
        }
        return null;
    }

    public void deleteAnswer(Integer answerId) {
        answerRepository.deleteById(answerId);
    }

    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }
}
