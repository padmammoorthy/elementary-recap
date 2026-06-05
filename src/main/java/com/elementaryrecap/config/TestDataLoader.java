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
            new Test("Saxon Intermediate 1", Test.Difficulty.MEDIUM, "standard", "Multi-step: fractions, decimals, percent, geometry"),
            new Test("Saxon Intermediate 2", Test.Difficulty.MEDIUM, "standard", "Multi-step: ratios, proportions, signed numbers"),
            new Test("Saxon Intermediate 3", Test.Difficulty.MEDIUM, "standard", "Multi-step: area, volume, equations, interest"),
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

        int idx = 0;
        for (Test test : tests) {
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
            q = mediumQuestion(seed + 500); // Easy tests now use medium-level questions with different seed
        } else if (diff == Test.Difficulty.MEDIUM) {
            q = mediumQuestion(seed);
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

    private String getSvg(String questionText) {
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

    private String[] mediumQuestion(int seed) {
        int a, b, c;
        switch (seed % 25) {
            case 0: a=3+seed%8; b=5+seed%15; c=a*b+(seed%5); return s("Solve: "+a+"x+"+seed%5+"="+c, "x="+b, "x="+(b+1), "x="+(b-1), "x="+c, "Subtract "+seed%5+" then divide by "+a, a+"x="+(c-seed%5)+", x="+b);
            case 1: a=5+seed%8; b=12+seed%10; c=a*a+b*b; return s("Right triangle legs "+a+","+b+". Hypotenuse^2?", ""+c, ""+(c+1), ""+(a*b), ""+(c-1), "a^2+b^2=c^2", a+"^2+"+b+"^2="+c);
            case 2: a=1000+seed*200; b=5+seed%5; c=2+seed%3; return s("Interest: $"+a+" at "+b+"% for "+c+" years?", "$"+(a*b*c/100), "$"+(a*b/100), "$"+a, "$"+(a*b*c/10), "I=Prt", a+"*"+b+"/100*"+c+"="+(a*b*c/100));
            case 3: a=30+seed%60; b=50+seed%40; c=180-a-b; return s("Triangle: angles "+a+","+b+",?", ""+c, ""+(180-a), ""+b, "90", "Sum=180", "180-"+a+"-"+b+"="+c);
            case 4: a=4+seed%6; b=6+seed%8; c=(a+b)*(3+seed%4)/2; return s("Trapezoid: bases "+a+","+b+" height "+(3+seed%4)+". Area?", ""+c, ""+(a*b), ""+(a+b), ""+(c*2), "A=(b1+b2)/2*h", "("+a+"+"+b+")/2*"+(3+seed%4)+"="+c);
            case 5: a=3+seed%5; b=4+seed%6; c=a*b*(2+seed%3); return s("Volume: "+a+"x"+b+"x"+(2+seed%3)+"?", ""+c, ""+(a*b), ""+(a+b), ""+(c+10), "V=lwh", a+"*"+b+"*"+(2+seed%3)+"="+c);
            case 6: a=5+seed%10; c=6*a*a; return s("Surface area cube edge "+a+"?", ""+c, ""+(a*a*a), ""+(a*a), ""+(4*a*a), "SA=6s^2", "6*"+a+"^2="+c);
            case 7: a=4+seed%8; c=(int)(3.14*a*a); return s("Circle area r="+a+" (pi=3.14)?", ""+c, ""+(2*a), ""+(a*a), ""+(c*2), "A=pi*r^2", "3.14*"+a+"^2="+c);
            case 8: a=7+seed%10; c=(int)(3.14*2*a); return s("Circumference r="+a+" (pi=3.14)?", ""+c, ""+(a*2), ""+(a*a), ""+a, "C=2*pi*r", "2*3.14*"+a+"="+c);
            case 9: a=40+seed%40; b=100; c=b-b*a/100; return s("$"+b+" after "+a+"% discount?", "$"+c, "$"+a, "$"+(b-a), "$"+(c+5), "Subtract discount", b+"-"+b+"*"+a+"/100="+c);
            case 10: a=3+seed%5; b=5+seed%7; return s("Ratio "+a+":"+b+". Total "+(a+b)*6+". Larger?", ""+(b*6), ""+(a*6), ""+((a+b)*6), ""+(b*3), "Divide total by sum", (a+b)*6+"/"+(a+b)+"=6. "+b+"*6="+b*6);
            case 11: a=3+seed%7; b=a+2; return s("Scale 1:"+b+". Model "+a+" cm. Actual?", ""+(a*b)+" cm", ""+a+" cm", ""+b+" cm", ""+(a+b)+" cm", "Multiply by scale", a+"*"+b+"="+(a*b));
            case 12: a=3+seed%5; b=10+seed%10; return s("Solve: x/"+a+"+"+seed%3+"="+(b/a+seed%3), "x="+b, "x="+(b+a), "x="+(b-a), "x="+(b*a), "Subtract then multiply", "x/"+a+"="+b/a+", x="+b);
            case 13: a=20+seed%30; b=a+10+seed%15; return s("Percent increase "+a+" to "+b+"?", ""+((b-a)*100/a)+"%", ""+(b-a)+"%", ""+a+"%", ""+b+"%", "(change/original)*100", "("+b+"-"+a+")/"+a+"*100="+((b-a)*100/a)+"%");
            case 14: a=5+seed%5; return s("Interior angle sum "+(a+3)+"-gon?", ""+((a+1)*180), ""+((a+2)*180), "360", ""+((a)*180), "(n-2)*180", "("+(a+3)+"-2)*180="+(a+1)*180);
            case 15: a=45+seed%45; return s("Isosceles: base angles "+a+" each. Vertex?", ""+(180-2*a), ""+a, ""+(90-a), "90", "180-2*base", "180-2*"+a+"="+(180-2*a));
            case 16: a=4+seed%6; b=3+seed%4; return s(a+"(x-"+b+")="+(a*(7+seed%8))+". Solve.", "x="+(b+7+seed%8), "x="+(7+seed%8), "x="+b, "x="+(a*b), "Divide then add", "x-"+b+"="+(7+seed%8)+", x="+(b+7+seed%8));
            case 17: a=3+seed%5; b=a*2+1; return s("Solve: 2x+1="+b, "x="+((b-1)/2), "x="+b, "x="+(b-1), "x="+(b+1), "Subtract 1, divide 2", "2x="+(b-1)+", x="+((b-1)/2));
            case 18: a=6+seed%8; b=8+seed%8; return s("Diagonal rectangle "+a+"x"+b+"? (c^2)", ""+(a*a+b*b), ""+(a+b), ""+(a*b), ""+(2*(a+b)), "Pythagorean", a+"^2+"+b+"^2="+(a*a+b*b));
            case 19: a=5+seed%10; return s("sqrt("+a*a+")=?", ""+a, ""+(a+1), ""+(a-1), ""+(a*a/2), "What^2="+a*a+"?", a+"*"+a+"="+a*a);
            case 20: a=1500+seed*300; b=6+seed%4; c=3; return s("Compound yr1: $"+a+" at "+b+"%?", "$"+(a+a*b/100), "$"+(a*b/100), "$"+a, "$"+(a*2), "A=P(1+r)", a+"*1.0"+b+"="+(a+a*b/100));
            case 21: a=3+seed%5; b=7+seed%8; return s("Proportion: "+a+"/"+b+" = x/"+(b*(2+seed%3)), "x="+(a*(2+seed%3)), "x="+b, "x="+a, "x="+(a+b), "Cross multiply", a+"*"+(b*(2+seed%3))+"="+b+"*x");
            case 22: a=5+seed%8; b=a+3; return s("Similar triangles: side "+a+" maps to "+b+". Side 12 maps to?", ""+(12*b/a), ""+12, ""+(12+b-a), ""+(12*a/b), "Scale factor "+b+"/"+a, "12*"+b+"/"+a+"="+(12*b/a));
            case 23: a=60+seed%30; return s("Exterior angle of polygon = "+(360/(3+seed%3))+". How many sides?", ""+(3+seed%3), ""+(4+seed%3), ""+(2+seed%3), "12", "360/ext=sides", "360/"+(360/(3+seed%3))+"="+(3+seed%3));
            default: a=8+seed%12; b=6+seed%10; return s("Parallelogram base "+a+" height "+b+". Area?", ""+(a*b), ""+(2*(a+b)), ""+(a+b), ""+(a*b/2), "A=bh", a+"*"+b+"="+(a*b));
        }
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
