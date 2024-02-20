package org.dhanush.questionservice.services;

import jakarta.transaction.Transactional;
import org.dhanush.questionservice.dtos.ViewQuestionDto;
import org.dhanush.questionservice.entites.Question;
import org.dhanush.questionservice.repositories.IQuestionRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class QuestionService {
    @Autowired
    private final IQuestionRepository questionRepository;
    @Autowired
    private ModelMapper modelMapper;

    public QuestionService(IQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {

            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);

    }

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {

        try {

            return new ResponseEntity<>(questionRepository.findByCategory(category), HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> createQuestion(Question question) {
        try {

            questionRepository.save(question);
            return new ResponseEntity<>("question created Success", HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("Error in creating Question", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String category, int size) {
        List<Integer> questions = questionRepository.getQuestionsByCategory(category,size);
        return new ResponseEntity<>(questions,HttpStatus.OK);
    }

    public ResponseEntity<List<ViewQuestionDto>> getQuestionsFromId(List<Integer> questionIds) {
            List<Question> questions = new ArrayList<>();
            for (Integer id:questionIds){
                questions.add(questionRepository.findById(id).get());
            }
            List<ViewQuestionDto> questionDtos = modelMapper.map(questions,new TypeToken<List<ViewQuestionDto>>(){}.getType());
            return new ResponseEntity<>(questionDtos,HttpStatus.OK);

    }
}
