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
                a = 30 + seed % 60; b = 180 - a;
                return new String[]{"Supplement of " + a + " degrees?", String.valueOf(b), String.valueOf(90-a), String.valueOf(a), String.valueOf(360-a), "A", "Supplementary angles sum to 180.", "180-" + a + "=" + b};
            case 11:
                a = 10 + seed % 80; b = 90 - a;
                return new String[]{"Complement of " + a + " degrees?", String.valueOf(b), String.valueOf(180-a), String.valueOf(a+90), String.valueOf(a), "A", "Complementary angles sum to 90.", "90-" + a + "=" + b};
            case 12:
                a = 3 + seed % 10; b = 4 + seed % 12; c = a*a + b*b;
                return new String[]{"Right triangle legs " + a + " and " + b + ". Hypotenuse^2?", String.valueOf(c), String.valueOf(c+1), String.valueOf(a*b), String.valueOf(c-1), "A", "a^2+b^2=c^2.", a + "^2+" + b + "^2=" + a*a + "+" + b*b + "=" + c};
            case 13:
                a = 500 + seed*100; b = 4 + seed % 6; c = 2 + seed % 4; result = a * b * c / 100;
                return new String[]{"Simple interest: $" + a + " at " + b + "% for " + c + " years?", "$" + result, "$" + (result+10), "$" + (result-5), "$" + (a+result), "A", "I=Prt.", a + "*" + b + "/100*" + c + "=" + result};
            case 14:
                a = 40 + seed % 50; b = 180 - a - (30 + seed%20);
                return new String[]{"Triangle angles: " + a + ", " + (180-a-b) + ", ?", String.valueOf(b), String.valueOf(180-a), String.valueOf(a), String.valueOf(90), "A", "Angles sum to 180.", "180-" + a + "-" + (180-a-b) + "=" + b};
            case 15:
                a = 5 + seed % 15; result = a * a;
                return new String[]{"Area of square side " + a + "?", String.valueOf(result), String.valueOf(4*a), String.valueOf(2*a), String.valueOf(result+a), "A", "A=side^2.", a + "^2=" + result};
            case 16:
                a = 4 + seed % 10; b = 6 + seed % 10; result = a * b / 2;
                return new String[]{"Area of triangle base " + a + " height " + b + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b), String.valueOf(result*3), "A", "A=(1/2)bh.", "(1/2)(" + a + ")(" + b + ")=" + result};
            case 17:
                a = 5 + seed % 10; result = (int)(3.14 * 2 * a);
                return new String[]{"Circumference r=" + a + " (pi=3.14)?", String.valueOf(result), String.valueOf(result/2), String.valueOf(a*a), String.valueOf(result*2), "A", "C=2*pi*r.", "2*3.14*" + a + "=" + result};
            case 18:
                a = 3 + seed % 8; result = (int)(3.14 * a * a);
                return new String[]{"Area of circle r=" + a + " (pi=3.14)?", String.valueOf(result), String.valueOf(2*a), String.valueOf(a*a), String.valueOf(result+a), "A", "A=pi*r^2.", "3.14*" + a + "^2=" + result};
            case 19:
                a = 3 + seed % 6; b = 4 + seed % 8; c = 5 + seed % 5; result = a*b*c;
                return new String[]{"Volume of box " + a + "x" + b + "x" + c + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf(a+b+c), String.valueOf(result+10), "A", "V=lwh.", a + "*" + b + "*" + c + "=" + result};
            case 20:
                a = 3 + seed % 8; result = 6*a*a;
                return new String[]{"Surface area of cube edge " + a + "?", String.valueOf(result), String.valueOf(a*a*a), String.valueOf(a*a), String.valueOf(4*a*a), "A", "SA=6s^2.", "6*" + a + "^2=" + result};
            case 21:
                a = 20 + seed % 60; b = 100 - a;
                return new String[]{"Price was $" + 100 + ". After " + a + "% discount?", "$" + b, "$" + (b+5), "$" + (b-5), "$" + a, "A", "Subtract discount.", "100-" + a + "=" + b};
            case 22:
                a = 5 + seed % 3; b = (a-2) * 180;
                return new String[]{"Interior angle sum of " + a + "-sided polygon?", String.valueOf(b), String.valueOf(b+180), String.valueOf(360), String.valueOf(b-180), "A", "(n-2)*180.", "(" + a + "-2)*180=" + b};
            case 23:
                a = 1000 + seed*200; b = 5 + seed % 5; c = 2 + seed % 3; result = a * b * c / 100;
                return new String[]{"Interest: $" + a + ", " + b + "%, " + c + " yrs?", "$" + result, "$" + (result+20), "$" + (result-10), "$" + a, "A", "I=Prt.", "I=" + a + "*0.0" + b + "*" + c + "=" + result};
            case 24:
                a = 8 + seed % 12; b = 4 + seed % 8; result = (a + b) / 2 * (3 + seed%5);
                return new String[]{"Trapezoid area: bases " + a + "," + b + " height " + (3+seed%5) + "?", String.valueOf(result), String.valueOf(a*b), String.valueOf((a+b)*(3+seed%5)), String.valueOf(result+5), "A", "A=(b1+b2)/2*h.", "(" + a + "+" + b + ")/2*" + (3+seed%5) + "=" + result};
            case 25:
                a = 5 + seed % 8; b = a + 3 + seed%4; result = (int)Math.sqrt(a*a + b*b);
                return new String[]{"Diagonal of rectangle " + a + " by " + b + "? (estimate)", "sqrt(" + (a*a+b*b) + ")", String.valueOf(a+b), String.valueOf(a*b), String.valueOf(a*2), "A", "Use Pythagorean on diagonal.", "sqrt(" + a + "^2+" + b + "^2)=sqrt(" + (a*a+b*b) + ")"};
            case 26:
                a = 40 + seed % 40; b = a; c = 180 - 2*a;
                return new String[]{"Isosceles triangle: base angles " + a + " each. Vertex?", String.valueOf(c), String.valueOf(a), String.valueOf(180-a), String.valueOf(90), "A", "Sum=180.", "180-" + a + "-" + a + "=" + c};
            case 27:
                a = 80 + seed % 40; b = 180 - a;
                return new String[]{"Angle on straight line: one is " + a + ". Other?", String.valueOf(b), String.valueOf(a), String.valueOf(360-a), String.valueOf(90), "A", "Linear pair sums to 180.", "180-" + a + "=" + b};
            case 28:
                a = 3 + seed % 5; b = a * 3;
                return new String[]{"Scale 1:" + a + ". Model is " + (10+seed%20) + " cm. Actual?", String.valueOf((10+seed%20)*a) + " cm", String.valueOf(10+seed%20) + " cm", String.valueOf((10+seed%20)/a) + " cm", String.valueOf((10+seed%20)+a) + " cm", "A", "Multiply by scale.", (10+seed%20) + "*" + a + "=" + ((10+seed%20)*a)};
            case 29:
                a = 7 + seed % 10; b = a - 2 - seed%3; c = a + b + (seed%5+3);
                return new String[]{"Triangle sides " + a + "," + b + "," + (seed%5+3) + ". Perimeter?", String.valueOf(a+b+seed%5+3), String.valueOf(a*b), String.valueOf(a+b), String.valueOf((a+b)*2), "A", "Add all sides.", a + "+" + b + "+" + (seed%5+3) + "=" + (a+b+seed%5+3)};
            case 30:
                a = 2 + seed % 5; b = 10 + seed % 20; result = b * (100 + a) / 100;
                return new String[]{"$" + b + " increased by " + a + "0%. New amount?", "$" + (b + b*a/10), "$" + (b + a), "$" + (b*2), "$" + (b - b*a/10), "A", "Multiply by (1+rate).", b + " + " + b + "*" + a + "0/100"};
            case 31:
                a = 5 + seed % 20; result = a * a;
                return new String[]{"sqrt(" + result + ") = ?", String.valueOf(a), String.valueOf(a+1), String.valueOf(a-1), String.valueOf(result/2), "A", "What squared = " + result + "?", a + "*" + a + "=" + result};
            case 32:
                a = 3 + seed % 7; b = 5 + seed % 7; c = a + b;
                return new String[]{"Ratio " + a + ":" + b + ". Total " + (c*(2+seed%4)) + ". Smaller part?", String.valueOf(a*(2+seed%4)), String.valueOf(b*(2+seed%4)), String.valueOf(c), String.valueOf(a*b), "A", "Divide total by sum of ratio.", (c*(2+seed%4)) + "/" + c + "=" + (2+seed%4) + ". " + a + "*" + (2+seed%4) + "=" + (a*(2+seed%4))};
            case 33:
                a = 4 + seed % 6; b = 2 + seed % 4; result = a * a * b;
                return new String[]{"Volume cylinder r=" + a + " h=" + b + " (approx)?", String.valueOf((int)(3.14*a*a*b)), String.valueOf(a*a*b), String.valueOf(2*a*b), String.valueOf(a*b), "A", "V=pi*r^2*h.", "3.14*" + (a*a) + "*" + b};
            case 34:
                a = 60 + seed % 30;
                return new String[]{"Exterior angle of regular polygon is " + (360/(3+seed%5)) + ". Sides?", String.valueOf(3+seed%5), String.valueOf(4+seed%5), String.valueOf(2+seed%5), "12", "A", "360/exterior angle = sides.", "360/" + (360/(3+seed%5)) + "=" + (3+seed%5)};
            case 35:
                a = 1000 + seed*500; b = 8 + seed%4;
                return new String[]{"Compound interest: $" + a + " at " + b + "% for 1 year?", "$" + (a + a*b/100), "$" + (a*b/100), "$" + a, "$" + (a*2), "A", "A=P(1+r).", a + "*(1+" + b + "/100)=" + (a+a*b/100)};
            case 36:
                a = 3 + seed % 5; b = a + 2; result = a * b;
                return new String[]{"Solve: x/" + a + " = " + b, "x=" + (a*b), "x=" + b, "x=" + a, "x=" + (a+b), "A", "Multiply both sides by " + a + ".", "x=" + a + "*" + b + "=" + result};
            case 37:
                a = 45 + seed % 45; b = 180 - a;
                return new String[]{a + " and " + b + " are what type of angles?", "Supplementary", "Complementary", "Vertical", "Adjacent", "A", "Sum to 180.", a + "+" + b + "=180"};
            case 38:
                a = 6 + seed % 10; b = 8 + seed % 10; result = 2*(a*b + a*(3+seed%4) + b*(3+seed%4));
                return new String[]{"Surface area box " + a + "x" + b + "x" + (3+seed%4) + "?", String.valueOf(result), String.valueOf(a*b*(3+seed%4)), String.valueOf(result/2), String.valueOf(a*b), "A", "SA=2(lw+lh+wh).", "2(" + (a*b) + "+" + (a*(3+seed%4)) + "+" + (b*(3+seed%4)) + ")=" + result};
            case 39:
                a = 2 + seed % 6; b = 3 + seed % 5;
                return new String[]{"Solve: " + a + "(x-" + b + ")=" + (a*(10+seed%10)), "x=" + (b+10+seed%10), "x=" + (10+seed%10), "x=" + b, "x=" + (a*b), "A", "Divide by " + a + " then add " + b + ".", a + "(x-" + b + ")=" + (a*(10+seed%10)) + ". x-" + b + "=" + (10+seed%10) + ". x=" + (b+10+seed%10)};
            case 40:
                a = 3 + seed % 5; b = a * 2 + 1; result = (b - 1) / 2;
                return new String[]{"Solve: 2x+1=" + b, "x=" + result, "x=" + (result+1), "x=" + (result-1), "x=" + b, "A", "Subtract 1, divide by 2.", "2x=" + (b-1) + ", x=" + result};
            case 41:
                a = 10 + seed % 20; b = a + 5 + seed%10; result = b - a;
                return new String[]{"Percent increase from " + a + " to " + b + "?", String.valueOf(result*100/a) + "%", String.valueOf(result) + "%", String.valueOf(a) + "%", String.valueOf(b) + "%", "A", "(change/original)*100.", "(" + result + "/" + a + ")*100=" + (result*100/a) + "%"};
            case 42:
                a = 6 + seed % 8; b = 8 + seed % 10; c = 10 + seed % 12;
                return new String[]{"Can " + a + "," + b + "," + c + " form a triangle?", (a+b > c && a+c > b && b+c > a) ? "Yes" : "No", (a+b > c) ? "No" : "Yes", "Only right", "Cannot tell", "A", "Triangle inequality: sum of any 2 sides > third.", a + "+" + b + "=" + (a+b) + (a+b>c?" > ":" <= ") + c};
            case 43:
                a = 20 + seed % 30;
                return new String[]{"Vertical angles: one is " + a + ". Other vertical angle?", String.valueOf(a), String.valueOf(180-a), String.valueOf(90-a), String.valueOf(360-a), "A", "Vertical angles are equal.", "Vertical angles are always equal: " + a};
            case 44:
                a = 3 + seed % 5; b = 7 + seed % 10;
                return new String[]{"Similar figures scale " + a + ":" + b + ". Small side 12. Large?", String.valueOf(12*b/a), String.valueOf(12*a/b), String.valueOf(12+b), String.valueOf(a*b), "A", "Multiply by scale factor.", "12*" + b + "/" + a + "=" + (12*b/a)};
            case 45:
                a = 5 + seed % 10; b = a * (3 + seed%3);
                return new String[]{"Solve proportion: " + a + "/15 = x/" + b, "x=" + (a*b/15), "x=" + b, "x=15", "x=" + (a+b), "A", "Cross multiply.", a + "*" + b + "=15*x. x=" + (a*b/15)};
            case 46:
                a = 10 + seed % 15; b = 180 - 90 - a;
                return new String[]{"Right triangle: one acute angle " + a + ". Other?", String.valueOf(b), String.valueOf(90-a+10), String.valueOf(a), String.valueOf(180-a), "A", "Acute angles in right triangle sum to 90.", "90-" + a + "=" + b};
            case 47:
                a = 1000 + seed * 300; b = 6 + seed%4; c = 3 + seed%3; result = a*b*c/100;
                return new String[]{"Investment $" + a + " at " + b + "% for " + c + " years. Interest?", "$" + result, "$" + (result+50), "$" + (result-25), "$" + (a+result), "A", "I=P*r*t.", a + "*" + b + "/100*" + c + "=$" + result};
            case 48:
                a = 4 + seed % 6; result = (int)(3.14 * a * a / 2);
                return new String[]{"Area of semicircle r=" + a + " (pi=3.14)?", String.valueOf(result), String.valueOf(result*2), String.valueOf((int)(3.14*a)), String.valueOf(a*a), "A", "Half of pi*r^2.", "(1/2)*3.14*" + a + "^2=" + result};
            case 49:
                a = 5 + seed % 10; b = 12 + seed % 10;
                return new String[]{"Ladder " + b + " ft, base " + a + " from wall. Height?", "sqrt(" + (b*b-a*a) + ")", String.valueOf(a+b), String.valueOf(b-a), String.valueOf(a*b), "A", "Pythagorean: h^2=ladder^2-base^2.", b + "^2-" + a + "^2=" + (b*b) + "-" + (a*a) + "=" + (b*b-a*a)};
            default:
                a = 10 + seed; b = 5 + seed/3; result = a * b;
                return new String[]{a + " x " + b + " = ?", String.valueOf(result), String.valueOf(result+10), String.valueOf(result-5), String.valueOf(result+1), "A", "Multiply.", a + " x " + b + " = " + result};
        }
    }
}
