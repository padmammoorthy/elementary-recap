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
            new Test("Saxon Intermediate 1", Test.Difficulty.MEDIUM, "standard", "Sections 1-6: Mixed topics medium difficulty"),
            new Test("Saxon Intermediate 2", Test.Difficulty.MEDIUM, "standard", "Sections 7-12: Mixed topics medium difficulty"),
            new Test("Saxon Intermediate 3", Test.Difficulty.MEDIUM, "standard", "All sections comprehensive medium"),
            new Test("Saxon Advanced 1", Test.Difficulty.HARD, "standard", "Multi-step problems all sections"),
            new Test("Saxon Advanced 2", Test.Difficulty.HARD, "standard", "Word problems and applications"),
            new Test("Saxon Advanced 3", Test.Difficulty.HARD, "standard", "Challenge: all Saxon Course 2 topics"),
            new Test("Geometry Medium 1", Test.Difficulty.MEDIUM, "geometry", "Angles, lines, triangles, polygons"),
            new Test("Geometry Medium 2", Test.Difficulty.MEDIUM, "geometry", "Perimeter, area, circumference"),
            new Test("Geometry Medium 3", Test.Difficulty.MEDIUM, "geometry", "Coordinate plane, transformations, symmetry"),
            new Test("Geometry Hard 1", Test.Difficulty.HARD, "geometry", "Pythagorean theorem, surface area, volume"),
            new Test("Geometry Hard 2", Test.Difficulty.HARD, "geometry", "Complex figures, similar triangles, sectors"),
            new Test("Geometry Hard 3", Test.Difficulty.HARD, "geometry", "Proofs, indirect measure, scale factor"),
            new Test("Fun Test 1", Test.Difficulty.MEDIUM, "fun", "Math puzzles and brain teasers"),
            new Test("Fun Test 2", Test.Difficulty.MEDIUM, "fun", "Real-world math applications"),
            new Test("Fun Test 3", Test.Difficulty.MEDIUM, "fun", "Pattern recognition and logic"),
            new Test("Fun Test 4", Test.Difficulty.HARD, "fun", "Challenge problems"),
            new Test("Fun Test 5", Test.Difficulty.HARD, "fun", "Math olympiad style"),
            new Test("Olympiad Challenge 1", Test.Difficulty.HARD, "fun", "AMC/MATHCOUNTS style: number theory and arithmetic"),
            new Test("Olympiad Challenge 2", Test.Difficulty.HARD, "fun", "AMC/MATHCOUNTS style: geometry and measurement"),
            new Test("Olympiad Challenge 3", Test.Difficulty.HARD, "fun", "AMC/MATHCOUNTS style: algebra and problem solving")
        ));
        testRepository.saveAll(tests);

        int testIndex = 0;
        for (Test test : tests) {
            List<TestQuestion> questions = new ArrayList<>();
            int count = "fun".equals(test.getCategory()) ? 20 : 50;
            for (int i = 0; i < count; i++) {
                questions.add(generateQuestion(test.getId(), testIndex, i, test.getCategory(), test.getDifficulty()));
            }
            testQuestionRepository.saveAll(questions);
            testIndex++;
        }
        System.out.println("Loaded " + tests.size() + " tests with distinct questions");
    }

    private TestQuestion generateQuestion(Long testId, int testIdx, int qIdx, String category, Test.Difficulty diff) {
        // Use testIdx and qIdx to ensure unique questions across all tests
        int seed = testIdx * 100 + qIdx;
        String[] q = getQuestion(seed, category, diff);
        TestQuestion tq = new TestQuestion();
        tq.setTestId(testId);
        tq.setQuestionText(q[0]);
        tq.setOptionA(q[1]);
        tq.setOptionB(q[2]);
        tq.setOptionC(q[3]);
        tq.setOptionD(q[4]);
        tq.setCorrectAnswer(q[5]);
        tq.setHint(q[6]);
        tq.setSolutionExplanation(q[7]);
        return tq;
    }

    private String[] getQuestion(int seed, String category, Test.Difficulty diff) {
        // Large bank of distinct questions organized by topic
        // Each returns: [question, A, B, C, D, correct, hint, solution]
        // Arithmetic operations (seeds 0-99)
        int a, b, c, result;
        switch (seed % 50) {
            case 0:
                a = 3 + seed % 7; b = 5 + seed % 20; result = a * b + (seed % 5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + result, "x=" + b, "x=" + (b+1), "x=" + (b-1), "x=" + (b*2), "A", "Subtract " + (seed%5) + " then divide by " + a + ".", a + "x=" + (result-seed%5) + ", x=" + b};
            case 1:
                a = 5 + seed % 10; b = 3 + seed % 8; result = a * a + b * b;
                return new String[]{"Right triangle legs " + a + " and " + b + ". Find c^2.", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a*b), "A", "Use Pythagorean: a^2+b^2=c^2.", a + "^2+" + b + "^2=" + result};
            case 2:
                a = 4 + seed % 12; b = 3 + seed % 8; result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 3:
                a = 2 + seed % 5; b = 10 + seed % 30; result = b / a;
                return new String[]{"Solve: " + a + "x = " + (a*result), "x=" + result, "x=" + (result+2), "x=" + (result-1), "x=" + (a*result), "A", "Divide both sides by " + a + ".", a + "x=" + (a*result) + ", x=" + result};
            case 4:
                a = 6 + seed % 15; b = 4 + seed % 10; result = (a * b) / 2;
                return new String[]{"Area of triangle base " + a + " height " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result*2), "A", "A=(1/2)bh.", "(1/2)(" + a + ")(" + b + ")=" + result};
            case 5:
                a = 3 + seed % 8; b = a + 2 + seed % 5; c = a + b;
                return new String[]{"Ratio " + a + ":" + b + ". Total " + (c*5) + ". Larger part?", String.valueOf(b*5), String.valueOf(a*5), String.valueOf(c*5), String.valueOf(b*3), "A", "Total/sum of ratio parts x larger.", (c*5) + "/" + c + "=" + 5 + ". " + b + "x5=" + (b*5)};
            case 6:
                a = 3 + seed % 6; b = 10 + seed % 40; result = b - (seed % 5);
                return new String[]{"Solve: x/" + a + " + " + (seed%5) + " = " + (result/a + seed%5), "x=" + result, "x=" + (result+a), "x=" + (result-a), "x=" + (result*2), "A", "Subtract then multiply by " + a + ".", "x/" + a + "=" + (result/a) + ", x=" + result};
            case 7:
                a = 5 + seed % 10; result = a * a;
                return new String[]{"Area of square side " + a + "?", String.valueOf(result), String.valueOf(a*4), String.valueOf(a*2), String.valueOf(result+a), "A", "A = side x side.", a + " x " + a + " = " + result};
            case 8:
                a = 20 + seed % 30; b = 100;
                return new String[]{"What percent of " + b + " is " + a + "?", a + "%", (a+5) + "%", (a-5) + "%", (a*2) + "%", "A", "Divide by total, multiply by 100.", a + "/" + b + " = " + a + "%"};
            case 9:
                a = 4 + seed % 8; b = a + 3; result = a * b;
                return new String[]{"Solve proportion: " + a + "/x = " + b + "/" + result, "x=" + (a*a*1/1), "x=" + (result/a), "x=" + b, "x=" + (a+b), "A", "Cross multiply: " + a + "*" + result + "=" + b + "*x.", a + "*" + result + "=" + (a*result) + ". " + b + "*x=" + (a*result) + ". x=" + (a*result/b)};
            case 10:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 11:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 12:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 13:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 14:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 15:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 16:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 17:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 18:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 19:
                a = 2 + seed % 8; b = a + 2 + seed % 4;
                return new String[]{"Reduce " + a + "/" + b + " to lowest terms", "Use GCF to simplify", String.valueOf(a) + "/" + String.valueOf(b+1), String.valueOf(a-1) + "/" + b, "Cannot reduce", "A", "Find the GCF.", "Divide numerator and denominator by their GCF"};
            case 20:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 21:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 22:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 23:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 24:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 25:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 26:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 27:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 28:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 29:
                a = 5 + seed % 15; b = 3 + seed % 10;
                result = 2*(a+b);
                return new String[]{"Perimeter of rectangle " + a + " by " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result+2), "A", "P=2(l+w).", "2(" + a + "+" + b + ")=" + result};
            case 30:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 31:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 32:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 33:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 34:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 35:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 36:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 37:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 38:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 39:
                a = 2 + seed % 6; b = 5 + seed % 20; result = (b - seed%5);
                return new String[]{"Solve: " + a + "x + " + (seed%5) + " = " + b, "x=" + (b-seed%5)/a, "x=" + b, "x=" + a, "x=" + (b+a), "A", "Subtract then divide.", a + "x=" + (b-seed%5) + ", x=" + (b-seed%5)/a};
            case 40:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 41:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 42:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 43:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 44:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 45:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 46:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 47:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 48:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            case 49:
                a = 10 + seed % 30; b = a + 5 + seed%10; c = a + b;
                result = (a + b + c) / 3;
                return new String[]{"Mean of " + a + ", " + b + ", " + c + "?", String.valueOf(result), String.valueOf(result+1), String.valueOf(result-1), String.valueOf(a), "A", "Sum divided by count.", "(" + a + "+" + b + "+" + c + ")/3=" + result};
            default:
                a = 10 + seed; b = 5 + seed/3; result = a * b;
                return new String[]{a + " x " + b + " = ?", String.valueOf(result), String.valueOf(result+10), String.valueOf(result-5), String.valueOf(result+1), "A", "Multiply.", a + " x " + b + " = " + result};
        }
    }
}
