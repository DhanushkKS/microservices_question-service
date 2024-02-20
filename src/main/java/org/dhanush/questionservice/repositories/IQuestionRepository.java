package org.dhanush.questionservice.repositories;

//import org.dhanush.quiz_monolith.entites.Question;

import org.dhanush.questionservice.entites.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestionRepository extends JpaRepository<Question, Integer> {
    List<Question> findByCategory(String category);

    @Query(value = "SELECT q.id FROM question q WHERE q.category=:category ORDER BY RANDOM() LIMIT :size", nativeQuery = true)
    List<Integer> getQuestionsByCategory(String category, int size);
}
