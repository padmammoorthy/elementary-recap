package com.elementaryrecap.config;

import com.elementaryrecap.model.Test;
import com.elementaryrecap.model.TestQuestion;
import com.elementaryrecap.repository.TestRepository;
import com.elementaryrecap.repository.TestQuestionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Order(2)
public class TestDataLoader implements CommandLineRunner {

    private final TestRepository testRepository;
    private final TestQuestionRepository testQuestionRepository;

    public TestDataLoader(TestRepository testRepository, TestQuestionRepository testQuestionRepository) {
        this.testRepository = testRepository;
        this.testQuestionRepository = testQuestionRepository;
    }

    @Override
    public void run(String... args) {
        if (testRepository.count() > 0) return;

        List<Test> tests = new ArrayList<>(List.of(
            new Test("Saxon Basics - Easy 1", Test.Difficulty.EASY, "standard", "Sections 1-4: Arithmetic, fractions, decimals"),
            new Test("Saxon Basics - Easy 2", Test.Difficulty.EASY, "standard", "Sections 5-8: Operations, ratios, geometry, integers"),
            new Test("Saxon Basics - Easy 3", Test.Difficulty.EASY, "standard", "Sections 9-12: Algebra, percent, Pythagorean, graphing"),
            new Test("Saxon Intermediate 1", Test.Difficulty.MEDIUM, "standard", "25 Geometry + 25 Advanced Algebra/Percent"),
            new Test("Saxon Intermediate 2", Test.Difficulty.MEDIUM, "standard", "25 Geometry + 25 Advanced: Ratios/Interest/Exponents"),
            new Test("Saxon Intermediate 3", Test.Difficulty.MEDIUM, "standard", "25 Geometry + 25 Advanced: Equations/Functions/Stats"),
            new Test("Saxon Advanced 1", Test.Difficulty.HARD, "standard", "Complex: Pythagorean, scientific notation, slope"),
            new Test("Saxon Advanced 2", Test.Difficulty.HARD, "standard", "Complex: algebraic expressions, inequalities, functions"),
            new Test("Saxon Advanced 3", Test.Difficulty.HARD, "standard", "Comprehensive: all Saxon Course 2 topics"),
            new Test("Geometry Medium 1", Test.Difficulty.MEDIUM, "geometry", "Angles, triangles, quadrilaterals, polygons"),
            new Test("Geometry Medium 2", Test.Difficulty.MEDIUM, "geometry", "Perimeter, area, circumference, surface area"),
            new Test("Geometry Medium 3", Test.Difficulty.MEDIUM, "geometry", "Coordinate plane, transformations, symmetry"),
            new Test("Geometry Hard 1", Test.Difficulty.HARD, "geometry", "Pythagorean theorem, complex figures, indirect measure"),
            new Test("Geometry Hard 2", Test.Difficulty.HARD, "geometry", "Volume, surface area, sectors, composite shapes"),
            new Test("Geometry Hard 3", Test.Difficulty.HARD, "geometry", "Similar triangles, scale factor, geometric probability"),
            new Test("Fun Test 1", Test.Difficulty.MEDIUM, "fun", "Math puzzles and brain teasers"),
            new Test("Fun Test 2", Test.Difficulty.MEDIUM, "fun", "Real-world math applications"),
            new Test("Fun Test 3", Test.Difficulty.MEDIUM, "fun", "Pattern recognition and logic"),
            new Test("Fun Test 4", Test.Difficulty.HARD, "fun", "Challenge problems"),
            new Test("Fun Test 5", Test.Difficulty.HARD, "fun", "Math olympiad style"),
            new Test("Olympiad Challenge 1", Test.Difficulty.HARD, "fun", "AMC/MATHCOUNTS: number theory"),
            new Test("Olympiad Challenge 2", Test.Difficulty.HARD, "fun", "AMC/MATHCOUNTS: geometry"),
            new Test("Olympiad Challenge 3", Test.Difficulty.HARD, "fun", "AMC/MATHCOUNTS: algebra and problem solving")
        ));
        testRepository.saveAll(tests);

        // Load easy test questions from JSON file
        try {
            com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
            java.io.InputStream is = new org.springframework.core.io.ClassPathResource("data/test_questions.json").getInputStream();
            java.util.List<java.util.Map<String, Object>> jsonQuestions = mapper.readValue(is, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<java.util.Map<String, Object>>>() {});
            
            // Map test numbers to actual test IDs (first 3 are easy tests)
            Long[] easyTestIds = {tests.get(0).getId(), tests.get(1).getId(), tests.get(2).getId()};
            
            for (java.util.Map<String, Object> jq : jsonQuestions) {
                int testNum = (Integer) jq.get("testNum");
                if (testNum >= 1 && testNum <= 3) {
                    TestQuestion tq = new TestQuestion();
                    tq.setTestId(easyTestIds[testNum - 1]);
                    tq.setQuestionText((String) jq.get("questionText"));
                    tq.setOptionA((String) jq.get("optionA"));
                    tq.setOptionB((String) jq.get("optionB"));
                    tq.setOptionC((String) jq.get("optionC"));
                    tq.setOptionD((String) jq.get("optionD"));
                    tq.setCorrectAnswer((String) jq.get("correctAnswer"));
                    tq.setHint((String) jq.get("hint"));
                    tq.setSolutionExplanation((String) jq.get("solutionExplanation"));
                    String svgType = (String) jq.get("svgType");
                    if (svgType != null && !svgType.isEmpty()) {
                        tq.setIllustration(getSvg(svgType));
                    } else {
                        tq.setIllustration(getSvg(tq.getQuestionText()));
                    }
                    testQuestionRepository.save(tq);
                }
            }
        } catch (Exception e) {
            System.err.println("Could not load test JSON: " + e.getMessage());
        }

        // Load hard test questions from JSON (tests at indices 6,7,8 are hard standard)
        try {
            com.fasterxml.jackson.databind.ObjectMapper mapper2 = new com.fasterxml.jackson.databind.ObjectMapper();
            java.io.InputStream is2 = new org.springframework.core.io.ClassPathResource("data/hard_test_questions.json").getInputStream();
            java.util.List<java.util.Map<String, Object>> hardJson = mapper2.readValue(is2, new com.fasterxml.jackson.core.type.TypeReference<java.util.List<java.util.Map<String, Object>>>() {});
            
            // Hard standard tests are at indices 6,7,8
            Long[] hardTestIds = {tests.get(6).getId(), tests.get(7).getId(), tests.get(8).getId()};
            int perTest = hardJson.size() / 3;
            for (int i = 0; i < hardJson.size(); i++) {
                java.util.Map<String, Object> jq = hardJson.get(i);
                int testNum = i / perTest;
                if (testNum >= 3) testNum = 2;
                TestQuestion tq = new TestQuestion();
                tq.setTestId(hardTestIds[testNum]);
                tq.setQuestionText((String) jq.get("questionText"));
                tq.setOptionA((String) jq.get("optionA"));
                tq.setOptionB((String) jq.get("optionB"));
                tq.setOptionC((String) jq.get("optionC"));
                tq.setOptionD((String) jq.get("optionD"));
                tq.setCorrectAnswer((String) jq.get("correctAnswer"));
                tq.setHint((String) jq.get("hint"));
                tq.setSolutionExplanation((String) jq.get("solutionExplanation"));
                String svgType = (String) jq.get("svgType");
                if (svgType != null && !svgType.isEmpty()) {
                    tq.setIllustration(getSvg(svgType));
                } else {
                    tq.setIllustration(getSvg(tq.getQuestionText()));
                }
                testQuestionRepository.save(tq);
            }
        } catch (Exception e) {
            System.err.println("Could not load hard test JSON: " + e.getMessage());
        }

        // Generate questions for remaining tests (medium, geometry, fun) - skip easy(0-2) and hard(6-8)
        int idx = 3;
        for (int t = 3; t < tests.size(); t++) {
            if (t >= 6 && t <= 8) { idx++; continue; } // Skip hard tests (loaded from JSON)
            Test test = tests.get(t);
            int count = "fun".equals(test.getCategory()) ? 20 : 50;
            List<TestQuestion> questions = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                questions.add(makeQuestion(test.getId(), idx, i, test.getDifficulty()));
            }
            testQuestionRepository.saveAll(questions);
            idx++;
        }
        System.out.println("Loaded " + tests.size() + " tests");
    }

    private TestQuestion makeQuestion(Long testId, int testIdx, int qIdx, Test.Difficulty diff) {
        int seed = testIdx * 53 + qIdx * 7; // unique per test+question
        String[] q;
        if (diff == Test.Difficulty.EASY) {
            q = hardQuestion(seed + 1000); // Easy tests now use hard questions with unique seeds
        } else if (diff == Test.Difficulty.MEDIUM) {
            q = hardQuestion(seed + 500); // Medium tests also use hard questions with different seeds
        } else {
            q = hardQuestion(seed);
        }
        TestQuestion tq = new TestQuestion();
        tq.setTestId(testId);
        tq.setQuestionText(q[0]);
        tq.setOptionA(q[1]);
        tq.setOptionB(q[2]);
        tq.setOptionC(q[3]);
        tq.setOptionD(q[4]);
        tq.setCorrectAnswer("A");
        tq.setHint(q[5]);
        tq.setSolutionExplanation(q[6]);
        tq.setIllustration(getSvg(q[0]));
        return tq;
    }

    private String getSvg(String input) {
        if (input == null) return null;
        String questionText = input;
        // Check if input is a svgType keyword
        if (input.equals("triangle")) return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"30,85 100,15 170,85\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><path d=\"M 50 85 A 20 20 0 0 0 45 70\" stroke=\"#e17055\" stroke-width=\"1.5\" fill=\"none\"/></svg>";
        if (input.equals("pythagorean")) return "<svg viewBox=\"0 0 200 120\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"120\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"30,100 30,30 150,100\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><rect x=\"30\" y=\"90\" width=\"10\" height=\"10\" fill=\"none\" stroke=\"#6c5ce7\"/><text x=\"20\" y=\"70\" font-size=\"10\" fill=\"#e17055\">a</text><text x=\"85\" y=\"115\" font-size=\"10\" fill=\"#00b894\">b</text><text x=\"85\" y=\"55\" font-size=\"10\" fill=\"#6c5ce7\">c</text></svg>";
        if (input.equals("circle")) return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><circle cx=\"100\" cy=\"50\" r=\"35\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"100\" y1=\"50\" x2=\"135\" y2=\"50\" stroke=\"#e17055\" stroke-width=\"1.5\"/><text x=\"115\" y=\"45\" font-size=\"9\" fill=\"#e17055\">r</text></svg>";
        if (input.equals("angle")) return "<svg viewBox=\"0 0 200 80\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"80\" fill=\"#f8f7ff\" rx=\"6\"/><line x1=\"30\" y1=\"60\" x2=\"170\" y2=\"60\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"30\" y1=\"60\" x2=\"120\" y2=\"20\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><path d=\"M 55 60 A 25 25 0 0 0 48 45\" stroke=\"#e17055\" stroke-width=\"2\" fill=\"none\"/></svg>";
        if (input.equals("rectangle")) return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><rect x=\"30\" y=\"20\" width=\"120\" height=\"60\" fill=\"#a29bfe\" fill-opacity=\"0.15\" stroke=\"#6c5ce7\" stroke-width=\"2\"/></svg>";
        if (input.equals("volume")) return "<svg viewBox=\"0 0 200 120\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"120\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"40,90 120,90 135,65 55,65\" fill=\"#a29bfe\" fill-opacity=\"0.15\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><polygon points=\"120,90 135,65 135,35 120,60\" fill=\"#a29bfe\" fill-opacity=\"0.1\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><polygon points=\"55,65 135,65 135,35 55,35\" fill=\"#a29bfe\" fill-opacity=\"0.05\" stroke=\"#6c5ce7\" stroke-width=\"2\"/></svg>";
        if (input.equals("cylinder")) return "<svg viewBox=\"0 0 200 120\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"120\" fill=\"#f8f7ff\" rx=\"6\"/><ellipse cx=\"100\" cy=\"30\" rx=\"40\" ry=\"12\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"60\" y1=\"30\" x2=\"60\" y2=\"90\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"140\" y1=\"30\" x2=\"140\" y2=\"90\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><ellipse cx=\"100\" cy=\"90\" rx=\"40\" ry=\"12\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/></svg>";
        if (input.equals("sphere")) return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><circle cx=\"100\" cy=\"50\" r=\"35\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><ellipse cx=\"100\" cy=\"50\" rx=\"35\" ry=\"12\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"1\" stroke-dasharray=\"3,3\"/></svg>";
        if (input.equals("trapezoid")) return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"50,80 30,30 150,30 170,80\" fill=\"#55efc4\" fill-opacity=\"0.15\" stroke=\"#00b894\" stroke-width=\"2\"/></svg>";
        if (input.equals("coordinate")) return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><line x1=\"20\" y1=\"50\" x2=\"180\" y2=\"50\" stroke=\"#333\" stroke-width=\"1\"/><line x1=\"100\" y1=\"10\" x2=\"100\" y2=\"90\" stroke=\"#333\" stroke-width=\"1\"/><circle cx=\"130\" cy=\"30\" r=\"4\" fill=\"#e17055\"/></svg>";
        if (input.equals("number_line")) return "<svg viewBox=\"0 0 200 50\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"50\" fill=\"#f8f7ff\" rx=\"6\"/><line x1=\"20\" y1=\"25\" x2=\"180\" y2=\"25\" stroke=\"#333\" stroke-width=\"2\"/><polygon points=\"180,20 190,25 180,30\" fill=\"#333\"/><circle cx=\"100\" cy=\"25\" r=\"4\" fill=\"#6c5ce7\"/></svg>";
        if (input.equals("integer")) return "<svg viewBox=\"0 0 200 50\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"50\" fill=\"#f8f7ff\" rx=\"6\"/><line x1=\"20\" y1=\"25\" x2=\"180\" y2=\"25\" stroke=\"#333\" stroke-width=\"2\"/><text x=\"50\" y=\"40\" font-size=\"9\" fill=\"#e17055\">-5</text><text x=\"100\" y=\"40\" font-size=\"9\">0</text><text x=\"150\" y=\"40\" font-size=\"9\" fill=\"#00b894\">+5</text></svg>";
        // Fall through to keyword detection in questionText
        String t = questionText.toLowerCase();
        if (t.contains("right triangle") || t.contains("legs") || t.contains("hypotenuse") || t.contains("ladder") || t.contains("pythagorean")) {
            return "<svg viewBox=\"0 0 200 120\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"120\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"30,100 30,30 150,100\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><rect x=\"30\" y=\"90\" width=\"10\" height=\"10\" fill=\"none\" stroke=\"#6c5ce7\"/><text x=\"20\" y=\"70\" font-size=\"10\" fill=\"#e17055\">a</text><text x=\"85\" y=\"115\" font-size=\"10\" fill=\"#00b894\">b</text><text x=\"85\" y=\"55\" font-size=\"10\" fill=\"#6c5ce7\">c</text></svg>";
        } else if (t.contains("triangle") && (t.contains("angle") || t.contains("isosceles"))) {
            return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"30,85 100,15 170,85\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><path d=\"M 50 85 A 20 20 0 0 0 45 70\" stroke=\"#e17055\" stroke-width=\"1.5\" fill=\"none\"/><path d=\"M 150 85 A 20 20 0 0 1 155 70\" stroke=\"#00b894\" stroke-width=\"1.5\" fill=\"none\"/></svg>";
        } else if (t.contains("rectangle") && (t.contains("area") || t.contains("perimeter") || t.contains("diagonal"))) {
            return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><rect x=\"30\" y=\"20\" width=\"120\" height=\"60\" fill=\"#a29bfe\" fill-opacity=\"0.15\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><text x=\"90\" y=\"15\" text-anchor=\"middle\" font-size=\"10\" fill=\"#6c5ce7\">l</text><text x=\"20\" y=\"55\" font-size=\"10\" fill=\"#6c5ce7\">w</text></svg>";
        } else if (t.contains("circle") || t.contains("circumference") || t.contains("semicircle") || t.contains("sector")) {
            return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><circle cx=\"100\" cy=\"50\" r=\"35\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"100\" y1=\"50\" x2=\"135\" y2=\"50\" stroke=\"#e17055\" stroke-width=\"1.5\"/><text x=\"115\" y=\"45\" font-size=\"9\" fill=\"#e17055\">r</text></svg>";
        } else if (t.contains("cube") || t.contains("box") || t.contains("volume") || t.contains("surface area") && t.contains("prism")) {
            return "<svg viewBox=\"0 0 200 120\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"120\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"40,90 120,90 135,65 55,65\" fill=\"#a29bfe\" fill-opacity=\"0.15\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><polygon points=\"120,90 135,65 135,35 120,60\" fill=\"#a29bfe\" fill-opacity=\"0.1\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><polygon points=\"55,65 135,65 135,35 55,35\" fill=\"#a29bfe\" fill-opacity=\"0.05\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><text x=\"85\" y=\"105\" font-size=\"9\" fill=\"#6c5ce7\">l x w x h</text></svg>";
        } else if (t.contains("trapezoid")) {
            return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"50,80 30,30 150,30 170,80\" fill=\"#55efc4\" fill-opacity=\"0.15\" stroke=\"#00b894\" stroke-width=\"2\"/><text x=\"90\" y=\"25\" font-size=\"9\" fill=\"#00b894\">b1</text><text x=\"100\" y=\"95\" font-size=\"9\" fill=\"#00b894\">b2</text></svg>";
        } else if (t.contains("angle") || t.contains("supplement") || t.contains("complement") || t.contains("exterior") || t.contains("interior")) {
            return "<svg viewBox=\"0 0 200 80\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"80\" fill=\"#f8f7ff\" rx=\"6\"/><line x1=\"30\" y1=\"60\" x2=\"170\" y2=\"60\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"30\" y1=\"60\" x2=\"120\" y2=\"20\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><path d=\"M 55 60 A 25 25 0 0 0 48 45\" stroke=\"#e17055\" stroke-width=\"2\" fill=\"none\"/></svg>";
        } else if (t.contains("slope")) {
            return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><line x1=\"20\" y1=\"85\" x2=\"180\" y2=\"85\" stroke=\"#333\" stroke-width=\"1\"/><line x1=\"20\" y1=\"10\" x2=\"20\" y2=\"85\" stroke=\"#333\" stroke-width=\"1\"/><line x1=\"40\" y1=\"70\" x2=\"160\" y2=\"25\" stroke=\"#6c5ce7\" stroke-width=\"2.5\"/><circle cx=\"40\" cy=\"70\" r=\"3\" fill=\"#e17055\"/><circle cx=\"160\" cy=\"25\" r=\"3\" fill=\"#e17055\"/></svg>";
        } else if (t.contains("cylinder")) {
            return "<svg viewBox=\"0 0 200 120\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"120\" fill=\"#f8f7ff\" rx=\"6\"/><ellipse cx=\"100\" cy=\"30\" rx=\"40\" ry=\"12\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"60\" y1=\"30\" x2=\"60\" y2=\"90\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"140\" y1=\"30\" x2=\"140\" y2=\"90\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><ellipse cx=\"100\" cy=\"90\" rx=\"40\" ry=\"12\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><text x=\"100\" y=\"115\" text-anchor=\"middle\" font-size=\"9\" fill=\"#6c5ce7\">V=pi*r^2*h</text></svg>";
        } else if (t.contains("sphere")) {
            return "<svg viewBox=\"0 0 200 100\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"100\" fill=\"#f8f7ff\" rx=\"6\"/><circle cx=\"100\" cy=\"50\" r=\"35\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><ellipse cx=\"100\" cy=\"50\" rx=\"35\" ry=\"12\" fill=\"none\" stroke=\"#6c5ce7\" stroke-width=\"1\" stroke-dasharray=\"3,3\"/><line x1=\"100\" y1=\"50\" x2=\"135\" y2=\"50\" stroke=\"#e17055\" stroke-width=\"1.5\"/></svg>";
        } else if (t.contains("parallelogram")) {
            return "<svg viewBox=\"0 0 200 80\" xmlns=\"http://www.w3.org/2000/svg\"><rect width=\"200\" height=\"80\" fill=\"#f8f7ff\" rx=\"6\"/><polygon points=\"50,65 30,20 150,20 170,65\" fill=\"#a29bfe\" fill-opacity=\"0.15\" stroke=\"#6c5ce7\" stroke-width=\"2\"/><line x1=\"30\" y1=\"20\" x2=\"30\" y2=\"65\" stroke=\"#e17055\" stroke-width=\"1.5\" stroke-dasharray=\"3,3\"/><text x=\"20\" y=\"45\" font-size=\"9\" fill=\"#e17055\">h</text></svg>";
        }
        return null; // No illustration for non-geometry questions
    }

    private String[] hardQuestion(int seed) {
        int a, b, c;
        switch (seed % 25) {
            case 0: a=5+seed%12; b=12+seed%20; c=(int)Math.sqrt(a*a+b*b); return s("Legs "+a+","+b+". Hypotenuse=sqrt("+(a*a+b*b)+"). Approx?", "~"+c, "~"+(c+2), "~"+(c-2), "~"+(a+b), "a^2+b^2=c^2", a+"^2+"+b+"^2="+(a*a+b*b));
            case 1: a=2000+seed*500; b=7+seed%4; c=3+seed%3; return s("Interest $"+a+", "+b+"%, "+c+" yrs. Total with interest?", "$"+(a+a*b*c/100), "$"+(a*b*c/100), "$"+a, "$"+(a*2), "A=P+I=P+Prt", a+"+"+(a*b*c/100)+"="+(a+a*b*c/100));
            case 2: a=3+seed%5; b=5+seed%6; c=a*a*b; return s("Volume cylinder r="+a+" h="+b+" (pi~3). Approx?", "~"+(3*a*a*b), "~"+(a*a*b), "~"+(2*a*b), "~"+(6*a*a), "V=pi*r^2*h", "3*"+a+"^2*"+b+"~"+(3*a*a*b));
            case 3: a=40+seed%30; b=60+seed%30; c=180-a-b; return s("Triangle "+a+","+b+","+c+". Exterior angle at "+c+"?", ""+(180-c), ""+(a+b), ""+c, "360", "Exterior=180-interior", "180-"+c+"="+(180-c)+" or "+a+"+"+b);
            case 4: a=3+seed%5; b=4+seed%5; c=5+seed%5; return s("Box "+a+"x"+b+"x"+c+". Surface area?", ""+(2*(a*b+a*c+b*c)), ""+(a*b*c), ""+(a+b+c), ""+((a*b+a*c+b*c)), "SA=2(lw+lh+wh)", "2("+(a*b)+"+"+(a*c)+"+"+(b*c)+")="+(2*(a*b+a*c+b*c)));
            case 5: a=80+seed%20; b=100; c=(b-a)*100/b; return s("Price dropped $"+b+" to $"+a+". % decrease?", c+"%", (b-a)+"%", a+"%", b+"%", "(change/original)*100", "("+b+"-"+a+")/"+b+"*100="+c+"%");
            case 6: a=3+seed%4; b=5+seed%4; return s("Solve: "+a+"(2x-"+b+")="+a*(2*(10+seed%5)-b), "x="+(10+seed%5), "x="+(5+seed%5), "x="+b, "x="+(a*b), "Distribute, solve", "2x-"+b+"="+(2*(10+seed%5)-b)+", 2x="+(2*(10+seed%5))+", x="+(10+seed%5));
            case 7: a=4+seed%6; return s("("+a+"x10^5)(3x10^3) in scientific notation?", (a*3)>=10 ? (a*3/10)+"."+((a*3)%10)+"x10^9" : (a*3)+"x10^8", (a*3)+"x10^15", (a+3)+"x10^8", (a*3)+"x10^5", "Multiply coefficients, add exponents", a+"*3="+(a*3)+", 10^(5+3)=10^8");
            case 8: a=5+seed%10; b=a+3+seed%5; return s("Slope (1,"+a+") to (4,"+b+")?", ""+((b-a)+"/3"), ""+(b-a), ""+(a-b), "3/"+(b-a), "rise/run", "("+b+"-"+a+")/(4-1)="+(b-a)+"/3");
            case 9: a=5+seed%8; c=(int)(3.14*a*a/2); return s("Semicircle area r="+a+" (pi=3.14)?", "~"+c, "~"+(c*2), "~"+(int)(3.14*2*a), "~"+(a*a), "Half of pi*r^2", "(1/2)*3.14*"+a+"^2~"+c);
            case 10: a=2+seed%4; b=3+seed%3; c=a+b; return s("Ratio "+a+":"+b+":"+c+". Total "+(a+b+c)*(3+seed%3)+". Middle?", ""+(b*(3+seed%3)), ""+(a*(3+seed%3)), ""+(c*(3+seed%3)), ""+((a+b+c)*(3+seed%3)), "Divide by sum of ratios", (a+b+c)*(3+seed%3)+"/"+(a+b+c)+"="+(3+seed%3)+". "+b+"*"+(3+seed%3)+"="+(b*(3+seed%3)));
            case 11: a=15+seed%10; b=a*3/5; return s("Ladder "+a+"ft, reaches "+b+"ft high. Base from wall?", "sqrt("+(a*a-b*b)+")", ""+(a-b), ""+(a+b), ""+a, "Pythagorean: base^2=ladder^2-height^2", a+"^2-"+b+"^2="+(a*a-b*b));
            case 12: a=5+seed%5; b=a+2; return s("Successive discounts 20% then 10% on $"+(a*20)+". Final?", "$"+(a*20*80/100*90/100), "$"+(a*20*70/100), "$"+(a*20-30), "$"+(a*20*72/100+1), "Apply each discount sequentially", a*20+"*0.8="+(a*20*80/100)+". "+(a*20*80/100)+"*0.9="+(a*20*80/100*90/100));
            case 13: a=6+seed%6; b=8+seed%6; c=a+b; return s("Trapezoid bases "+a+","+b+" height "+(seed%5+4)+". Area?", ""+((a+b)*(seed%5+4)/2), ""+(a*b), ""+(a+b), ""+((a+b)*(seed%5+4)), "(b1+b2)/2*h", "("+a+"+"+b+")/2*"+(seed%5+4)+"="+((a+b)*(seed%5+4)/2));
            case 14: a=3+seed%4; return s("Evaluate: (-"+a+")^3 + (-"+a+")^2", ""+(-a*a*a+a*a), ""+(-a*a*a-a*a), ""+(a*a*a+a*a), ""+(a*a*a-a*a), "Odd power neg, even power pos", "-("+a+"^3)+("+a+"^2)="+(-a*a*a)+"+"+a*a+"="+(-a*a*a+a*a));
            case 15: a=3+seed%5; b=7+seed%8; return s("f(x)="+a+"x-"+b+". Find f("+(b+seed%5)+")", ""+(a*(b+seed%5)-b), ""+(a+b+seed%5), ""+(a*(b+seed%5)), ""+(a*b), "Substitute x="+(b+seed%5), a+"("+(b+seed%5)+")-"+b+"="+(a*(b+seed%5)-b));
            case 16: a=3+seed%4; return s("Solve: 2x+"+a+" > "+(a+10)+". Graph?", "x > "+5, "x < "+5, "x > "+(a+10), "x = 5", "Subtract "+a+", divide by 2", "2x>"+(10)+", x>5");
            case 17: a=5+seed%8; b=3+seed%5; return s("Algebraic: "+a+"x^2 * "+b+"x^3 = ?", (a*b)+"x^5", (a*b)+"x^6", (a+b)+"x^5", (a*b)+"x^2", "Multiply coefficients, add exponents", a+"*"+b+"="+(a*b)+", x^(2+3)=x^5");
            case 18: a=4+seed%6; b=a*3; return s("Convert "+b+" inches to feet and inches", (b/12)+" ft "+(b%12)+" in", b+" ft", (b/12)+" ft", b/12+" ft "+(b%12+1)+" in", "12 inches = 1 foot", b+"/12="+(b/12)+" R "+(b%12));
            case 19: a=7+seed%8; return s("Regular "+a+"-gon. Each interior angle?", ""+((a-2)*180/a), ""+(360/a), ""+180, ""+((a-2)*180), "(n-2)*180/n", "("+a+"-2)*180/"+a+"="+((a-2)*180/a));
            case 20: a=5+seed%10; b=a*2+seed%5; return s("30% of what number = "+b+"?", ""+(b*100/30), ""+b, ""+(b*30/100), ""+(b+30), "n*30/100="+b, "n="+b+"*100/30="+(b*100/30));
            case 21: a=3+seed%5; b=7+seed%5; return s("Solve: "+a+"/x = "+(a*b)+"/"+(b*(2+seed%3)), "x="+(2+seed%3), "x="+b, "x="+a, "x="+(a*b), "Cross multiply", a+"*"+(b*(2+seed%3))+"="+(a*b)+"*x, x="+(2+seed%3));
            case 22: a=seed%3+3; return s("Volume of sphere r="+a+" (pi=3.14, V=4/3*pi*r^3)?", "~"+(int)(4.19*a*a*a), "~"+(int)(3.14*a*a*a), "~"+(a*a*a), "~"+(int)(3.14*a*a), "V=(4/3)pi*r^3", "4/3*3.14*"+a+"^3~"+(int)(4.19*a*a*a));
            case 23: a=4+seed%6; b=2+seed%4; return s("Slope-intercept: slope "+a+", y-int -"+b+". Equation?", "y="+a+"x-"+b, "y=-"+a+"x+"+b, "y="+a+"x+"+b, "y="+b+"x-"+a, "y=mx+b", "m="+a+", b=-"+b);
            default: a=8+seed%10; b=15+seed%10; return s("Similar triangles: sides 6,"+a+",10 ~ 9,?,15. Find ?", ""+(a*3/2), ""+a, ""+(a+3), ""+(a*2), "Scale factor 9/6=3/2", a+"*3/2="+(a*3/2));
        }
    }

    private String[] s(String q, String a, String b, String c, String d, String hint, String solution) {
        return new String[]{q, a, b, c, d, hint, solution};
    }

    private static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
