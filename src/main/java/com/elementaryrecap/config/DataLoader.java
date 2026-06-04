package com.elementaryrecap.config;

import com.elementaryrecap.model.Question;
import com.elementaryrecap.repository.QuestionRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
@Order(1)
public class DataLoader implements CommandLineRunner {

    private final QuestionRepository questionRepository;

    public DataLoader(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (questionRepository.count() > 0) return;

        ClassPathResource resource = new ClassPathResource("data/questions.json");
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = resource.getInputStream();
        List<Question> questions = mapper.readValue(inputStream, new TypeReference<List<Question>>() {});
        questionRepository.saveAll(questions);
    }
}
