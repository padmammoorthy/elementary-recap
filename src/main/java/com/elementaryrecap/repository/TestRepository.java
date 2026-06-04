package com.elementaryrecap.repository;

import com.elementaryrecap.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test> findByCategory(String category);
    List<Test> findByCategoryAndDifficulty(String category, Test.Difficulty difficulty);
}
