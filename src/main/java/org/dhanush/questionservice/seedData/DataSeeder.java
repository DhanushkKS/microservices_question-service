package org.dhanush.questionservice.seedData;

import org.dhanush.questionservice.entites.Question;
import org.dhanush.questionservice.repositories.IQuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {


    private final IQuestionRepository questionRepository;

    public DataSeeder(IQuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        questionRepository.saveAll(List.of(SampleQuestions.dummyQuestions));

    }
}
