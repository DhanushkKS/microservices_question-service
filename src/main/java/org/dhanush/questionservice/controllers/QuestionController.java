package org.dhanush.questionservice.controllers;


import org.dhanush.questionservice.dtos.ViewQuestionDto;
import org.dhanush.questionservice.entites.Question;
import org.dhanush.questionservice.entites.Response;
import org.dhanush.questionservice.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/v1/question")

public class QuestionController {

    @Autowired
    private final QuestionService questionService;


    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping(value = "allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {

        return questionService.getAllQuestions();
    }

    @GetMapping(value = "category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping(value = "create")
    public ResponseEntity<String> createQuestion(@RequestBody Question question) {
        return questionService.createQuestion(question);
    }
    //generate q

    @GetMapping("generate")
    public ResponseEntity<List<Integer> > getQuestionsForQuiz(@RequestParam String category,@RequestParam int size){
        return questionService.getQuestionsForQuiz(category,size);
    }

    //get questions(qusetion id)

    @PostMapping("getQuestions")
    public ResponseEntity<List<ViewQuestionDto>> getQuestionsFromId(@RequestBody List<Integer> questionIds){
        return questionService.getQuestionsFromId(questionIds);
    }
    //calculate answeres
    @PostMapping("getScore")
    public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses){
        return questionService.getScore(responses);
    }


}
