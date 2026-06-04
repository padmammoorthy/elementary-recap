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

        // Create 9 standard tests + 6 geometry tests + 5 fun tests
        List<Test> tests = new ArrayList<>(List.of(
            new Test("Math Basics - Easy 1", Test.Difficulty.EASY, "standard", "Addition, subtraction, and place value"),
            new Test("Math Basics - Easy 2", Test.Difficulty.EASY, "standard", "Multiplication and division facts"),
            new Test("Math Basics - Easy 3", Test.Difficulty.EASY, "standard", "Fractions and decimals introduction"),
            new Test("Intermediate Math 1", Test.Difficulty.MEDIUM, "standard", "Multi-digit operations and word problems"),
            new Test("Intermediate Math 2", Test.Difficulty.MEDIUM, "standard", "Fraction operations and percent"),
            new Test("Intermediate Math 3", Test.Difficulty.MEDIUM, "standard", "Ratios, proportions, and data"),
            new Test("Advanced Math 1", Test.Difficulty.HARD, "standard", "Multi-step equations and integers"),
            new Test("Advanced Math 2", Test.Difficulty.HARD, "standard", "Geometry, measurement, and algebra"),
            new Test("Advanced Math 3", Test.Difficulty.HARD, "standard", "Comprehensive challenge"),
            new Test("Geometry - Medium 1", Test.Difficulty.MEDIUM, "geometry", "Angles, triangles, and quadrilaterals"),
            new Test("Geometry - Medium 2", Test.Difficulty.MEDIUM, "geometry", "Perimeter, area, and circumference"),
            new Test("Geometry - Medium 3", Test.Difficulty.MEDIUM, "geometry", "Coordinate plane and transformations"),
            new Test("Geometry - Hard 1", Test.Difficulty.HARD, "geometry", "Pythagorean theorem and surface area"),
            new Test("Geometry - Hard 2", Test.Difficulty.HARD, "geometry", "Volume, circles, and composite shapes"),
            new Test("Geometry - Hard 3", Test.Difficulty.HARD, "geometry", "Similar figures and geometric proofs"),
            new Test("Fun Test 1", Test.Difficulty.MEDIUM, "fun", "Mixed math puzzles and brain teasers"),
            new Test("Fun Test 2", Test.Difficulty.MEDIUM, "fun", "Real-world math applications"),
            new Test("Fun Test 3", Test.Difficulty.MEDIUM, "fun", "Pattern recognition and logic"),
            new Test("Fun Test 4", Test.Difficulty.HARD, "fun", "Challenge problems across all topics"),
            new Test("Fun Test 5", Test.Difficulty.HARD, "fun", "Math olympiad style problems")
        ));
        testRepository.saveAll(tests);

        // Generate questions per test (50 for standard/geometry, 20 for fun)
        for (Test test : tests) {
            List<TestQuestion> questions = generateTestQuestions(test);
            testQuestionRepository.saveAll(questions);
        }
        System.out.println("Loaded " + tests.size() + " tests");
    }

    private List<TestQuestion> generateTestQuestions(Test test) {
        List<TestQuestion> questions = new ArrayList<>();
        Long testId = test.getId();

        if ("fun".equals(test.getCategory())) {
            addFunQuestions(questions, testId);
        } else if ("geometry".equals(test.getCategory())) {
            if (test.getDifficulty() == Test.Difficulty.MEDIUM) {
                addMediumGeometryQuestions(questions, testId);
            } else {
                addHardGeometryQuestions(questions, testId);
            }
        } else if (test.getDifficulty() == Test.Difficulty.EASY) {
            addEasyQuestions(questions, testId);
        } else if (test.getDifficulty() == Test.Difficulty.MEDIUM) {
            addMediumQuestions(questions, testId);
        } else {
            addHardQuestions(questions, testId);
        }
        return questions;
    }

    private void addFunQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"If you have 3 cats and each has 4 legs, how many legs total?","12","8","16","6","A","3 groups of 4.","Multiply: 3x4=12 legs."));
        list.add(tq(testId,"A pizza is cut into 8 slices. You eat 3. What fraction is left?","5/8","3/8","3/5","5/3","A","Remaining pieces over total.","8-3=5 left, so 5/8."));
        list.add(tq(testId,"If today is Wednesday, what day is it in 100 days?","Friday","Thursday","Saturday","Monday","A","100/7=14 R2. Wednesday+2=Friday.","Divide by 7, use remainder."));
        list.add(tq(testId,"How many squares on a standard checkerboard?","204","64","100","128","A","1x1:64, 2x2:49, 3x3:36...sum=204.","Count all sizes of squares."));
        list.add(tq(testId,"I am thinking of a number. Double it, add 6, divide by 2, subtract 3. Get original. Always?","Yes","No","Sometimes","Only even","A","(2n+6)/2-3 = n+3-3 = n.","Work backwards with algebra."));
        for (int i = 6; i <= 20; i++) {
            list.add(tq(testId, "Fun puzzle "+(i)+": What is "+(i*7)+" / 7?", String.valueOf(i), String.valueOf(i+1), String.valueOf(i-1), String.valueOf(i+2), "A", "Divide "+i*7+" by 7.", "Division fact: "+i*7+"/7="+i));
        }
    }

    private void addMediumGeometryQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"Triangle angles: 55, 75, ?","50","55","60","45","A","180-55-75=50.","Sum of angles = 180."));
        list.add(tq(testId,"Perimeter of rectangle 14 x 9","46","23","126","36","A","2(14+9)=46.","P = 2(l+w)."));
        list.add(tq(testId,"Area of triangle: base 12, height 8","48","96","20","40","A","(1/2)(12)(8)=48.","A = (1/2)bh."));
        list.add(tq(testId,"Circumference: diameter 7 (pi=3.14)","21.98","43.96","7","14","A","3.14x7=21.98.","C = pi x d."));
        list.add(tq(testId,"Classify angle of 135 degrees","Obtuse","Acute","Right","Straight","A","Between 90 and 180.","Obtuse = greater than 90."));
        list.add(tq(testId,"Regular pentagon: each interior angle?","108","120","90","72","A","(5-2)x180/5=108.","Formula: (n-2)x180/n."));
        list.add(tq(testId,"Parallelogram: base 11, height 7. Area?","77","36","18","154","A","A = base x height.","Not perimeter!"));
        list.add(tq(testId,"Complement of 37 degrees?","53","143","37","90","A","90-37=53.","Complementary sum to 90."));
        list.add(tq(testId,"Square area = 144. Side?","12","14","11","13","A","sqrt(144)=12.","Side = sqrt(area)."));
        list.add(tq(testId,"Radius = 6. Area of circle?","113.04","37.68","36","18.84","A","3.14x36=113.04.","A = pi x r^2."));
        for (int i = 11; i <= 50; i++) {
            int side = i + 2;
            list.add(tq(testId,"Perimeter of equilateral triangle side "+side+"?", String.valueOf(side*3), String.valueOf(side*2), String.valueOf(side*4), String.valueOf(side), "A", "3 equal sides: 3x"+side+".", "Equilateral = 3 x side."));
        }
    }

    private void addHardGeometryQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"Right triangle legs 7 and 24. Hypotenuse?","25","31","23","26","A","49+576=625, sqrt=25.","a^2+b^2=c^2."));
        list.add(tq(testId,"Surface area of rectangular prism 8x5x3","158","120","79","240","A","2(40+24+15)=158.","SA=2(lw+lh+wh)."));
        list.add(tq(testId,"Volume of cylinder r=4, h=10 (pi=3.14)","502.4","125.6","251.2","1005","A","3.14x16x10=502.4.","V=pi*r^2*h."));
        list.add(tq(testId,"Area of trapezoid: bases 10,16; height 7","91","182","26","65","A","(10+16)/2 x 7 = 91.","A=(b1+b2)/2 x h."));
        list.add(tq(testId,"Diagonal of rectangle 9x12?","15","21","10","13","A","sqrt(81+144)=sqrt(225)=15.","Use Pythagorean theorem."));
        list.add(tq(testId,"Interior angle sum of decagon (10 sides)?","1440","1800","1080","360","A","(10-2)x180=1440.","(n-2) x 180."));
        list.add(tq(testId,"Circumference of wheel r=21 (pi=22/7)","132","66","44","264","A","2x22/7x21=132.","C=2*pi*r."));
        list.add(tq(testId,"Similar figures: scale 3:5. Small area=27. Large area?","75","45","135","81","A","Scale^2=9:25. 27x25/9=75.","Area scales by square of ratio."));
        list.add(tq(testId,"Composite shape: rectangle 10x6 with semicircle (d=6) on top. Area?","74.13","60","88.26","46","A","60 + 3.14x9/2 = 60+14.13=74.13.","Rectangle + half circle."));
        list.add(tq(testId,"Cone: r=3, slant height=5. Lateral surface area?","47.1","28.26","94.2","15","A","pi*r*l = 3.14x3x5=47.1.","SA_lateral = pi*r*l."));
        for (int i = 11; i <= 50; i++) {
            int a = 3 + (i % 10);
            int b = 4 + (i % 12);
            int csq = a*a + b*b;
            list.add(tq(testId,"Right triangle legs "+a+" and "+b+". Hypotenuse^2=?", String.valueOf(csq), String.valueOf(csq+1), String.valueOf(csq-1), String.valueOf(a*b), "A", a+"^2+"+b+"^2="+csq+".", "Pythagorean: a^2+b^2=c^2."));
        }
    }

    private TestQuestion tq(Long testId, String text, String a, String b, String c, String d, String ans, String hint, String solution) {
        TestQuestion q = new TestQuestion();
        q.setTestId(testId);
        q.setQuestionText(text);
        q.setOptionA(a);
        q.setOptionB(b);
        q.setOptionC(c);
        q.setOptionD(d);
        q.setCorrectAnswer(ans);
        q.setHint(hint);
        q.setSolutionExplanation(solution);
        return q;
    }

    private void addEasyQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"Simplify: 3x+2x","5x","6x","x","5x^2","A","Combine like terms.","3x+2x=5x (add coefficients)"));
        list.add(tq(testId,"Solve: x+8=15","x=7","x=23","x=8","x=-7","A","Subtract 8.","x=15-8=7"));
        list.add(tq(testId,"Evaluate: 2(3)+4","10","8","14","6","A","Order of operations.","6+4=10"));
        list.add(tq(testId,"Slope of y=5x-2?","5","-2","2","5x","A","Coefficient of x.","In y=mx+b, m=5"));
        list.add(tq(testId,"Solve: 2x=14","x=7","x=28","x=12","x=16","A","Divide by 2.","x=14/2=7"));
        list.add(tq(testId,"y-intercept of y=3x+4?","4","3","7","0","A","b value.","When x=0, y=4"));
        list.add(tq(testId,"Simplify: x*x","x^2","2x","x","x+x","A","Multiply.","x^1*x^1=x^2"));
        list.add(tq(testId,"Evaluate f(2) if f(x)=x+3","5","2","3","6","A","Substitute.","2+3=5"));
        list.add(tq(testId,"GCF of 6x and 9x?","3x","6x","9x","x","A","Largest common factor.","3x divides both"));
        list.add(tq(testId,"Solve: x-5=10","x=15","x=5","x=-5","x=50","A","Add 5.","x=10+5=15"));
        list.add(tq(testId,"Is (2,4) on y=2x?","Yes","No","Maybe","Need more info","A","Check: 2(2)=4.","Substitute: 4=4 true"));
        list.add(tq(testId,"Solve: 3x+1=10","x=3","x=4","x=11/3","x=10/3","A","3x=9.","x=9/3=3"));
        list.add(tq(testId,"Expand: 2(x+3)","2x+6","2x+3","x+6","2x+5","A","Distribute.","2*x+2*3"));
        list.add(tq(testId,"Slope through (0,0) and (2,6)?","3","6","2","1","A","Rise/run.","6/2=3"));
        list.add(tq(testId,"Factor: 4x+8","4(x+2)","2(2x+4)","4x(1+2)","8(x+1)","A","GCF=4.","4*x+4*2"));
        list.add(tq(testId,"Solve: x/4=3","x=12","x=7","x=4/3","x=3/4","A","Multiply by 4.","x=4*3=12"));
        list.add(tq(testId,"Perimeter of square side 5?","20","25","10","15","A","4*side.","4*5=20"));
        list.add(tq(testId,"Simplify: 5x-2x","3x","7x","3","10x","A","Subtract coefficients.","5x-2x=3x"));
        list.add(tq(testId,"Evaluate: (-3)^2","9","-9","6","-6","A","Square is positive.","(-3)*(-3)=9"));
        list.add(tq(testId,"Next in 2,5,8,11,...?","14","12","13","15","A","Add 3.","11+3=14"));
        // Fill to 50 with more easy questions
        for (int i = 21; i <= 50; i++) {
            list.add(tq(testId,"Solve: x+"+(i)+("="+(i+5)),"x=5","x="+(i+5),"x="+(i),"x="+(2*i+5),"A","Subtract "+i+".","x="+(i+5)+"-"+i+"=5"));
        }
    }

    private void addMediumQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"Solve: 3(2x-4)=2(x+6)","x=6","x=3","x=9","x=4","A","Distribute then solve.","6x-12=2x+12, 4x=24, x=6"));
        list.add(tq(testId,"Factor: x^2-5x-14","(x-7)(x+2)","(x+7)(x-2)","(x-14)(x+1)","(x-7)(x-2)","A","Product -14, sum -5.","Factors: -7 and 2"));
        list.add(tq(testId,"Solve system: x+y=10, x-y=4","(7,3)","(5,5)","(3,7)","(4,6)","A","Add equations.","2x=14, x=7, y=3"));
        list.add(tq(testId,"Vertex of y=x^2-6x+8?","(3,-1)","(6,8)","(-3,-1)","(3,1)","A","x=3, y=9-18+8=-1.","Complete square or formula"));
        list.add(tq(testId,"Solve: |2x-3|=7","x=5,-2","x=5,2","x=-5,2","x=5 only","A","Two cases.","2x-3=7 or 2x-3=-7"));
        list.add(tq(testId,"Simplify: sqrt(75)","5sqrt3","3sqrt5","25sqrt3","15","A","25*3.","sqrt(25)*sqrt(3)=5sqrt3"));
        list.add(tq(testId,"Solve: x^2-9=0","x=3,-3","x=9,-9","x=3","x=81","A","Difference of squares.","(x+3)(x-3)=0"));
        list.add(tq(testId,"Write equation: slope -2, y-int 5","y=-2x+5","y=2x+5","y=-2x-5","y=5x-2","A","y=mx+b.","m=-2, b=5"));
        list.add(tq(testId,"f(x)=2^x. f(4)?","16","8","32","4","A","2^4.","2*2*2*2=16"));
        list.add(tq(testId,"Solve: 2x^2+x-6=0","x=3/2,-2","x=-3/2,2","x=3,-2","x=2,-3","A","Factor or formula.","(2x-3)(x+2)=0"));
        list.add(tq(testId,"Perp to y=4x+1 slope?","-1/4","4","1/4","-4","A","Negative reciprocal.","m=-1/4"));
        list.add(tq(testId,"Discriminant x^2+3x+5?","-11","29","3","11","A","9-20=-11.","b^2-4ac=9-20"));
        list.add(tq(testId,"Solve: sqrt(2x+1)=5","x=12","x=13","x=24","x=2","A","Square: 2x+1=25.","2x=24, x=12"));
        list.add(tq(testId,"Factor: 3x^2-12","3(x+2)(x-2)","(3x+6)(x-2)","3(x^2-4)","3x(x-4)","A","GCF then diff of squares.","3(x^2-4)=3(x+2)(x-2)"));
        list.add(tq(testId,"a1=3,d=4. a10?","39","43","35","40","A","3+9(4)=39.","an=a1+(n-1)d"));
        list.add(tq(testId,"Solve: -1<2x+3<=9","(-2,3]","[-2,3]","(-2,3)","[-2,3)","A","Subtract 3, divide 2.","-4<2x<=6"));
        list.add(tq(testId,"y=500(0.8)^t. After t=3?","256","400","320","200","A","500*0.512.","500*0.8^3=256"));
        list.add(tq(testId,"Factor: 4x^2-25","(2x+5)(2x-5)","(4x+5)(x-5)","(2x-5)^2","4(x^2-25)","A","Diff of squares.","(2x)^2-5^2"));
        list.add(tq(testId,"Solve: x^2+4x-5=0","x=1,-5","x=-1,5","x=5,-1","x=-5,1","A","(x+5)(x-1)=0.","Factor"));
        list.add(tq(testId,"Median of 2,5,7,8,12?","7","5","8","6","A","Middle value.","5 values, middle is 3rd"));
        for (int i = 21; i <= 50; i++) {
            int a_val = i * 2;
            list.add(tq(testId,"Solve: 2x+"+(i-20)+"="+(a_val),"x="+((a_val-(i-20))/2),"x="+(a_val),"x="+(i),"x="+(a_val+i),"A","Subtract then divide.","2x="+(a_val-(i-20))));
        }
    }

    private void addHardQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"Solve: |3x-2|+1>6","x>7/3 or x<-1","(-1,7/3)","x>7/3","x<-1","A","|3x-2|>5, two cases.","3x-2>5 or 3x-2<-5"));
        list.add(tq(testId,"Factor: 6x^2-7x-3","(2x-3)(3x+1)","(6x+1)(x-3)","(3x-3)(2x+1)","(2x+3)(3x-1)","A","ac method: -18, factors 2,-9.","Rewrite middle term"));
        list.add(tq(testId,"Solve: sqrt(3x+7)=x+1","x=3","x=-2","x=3,-2","x=3 (check -2)","A","Square, solve quadratic, check.","x^2-x-6=0, check both"));
        list.add(tq(testId,"System: 3x-2y=7, 5x+y=11","(29/13,8/13)","(3,1)","(2,1)","(1,3)","A","Elimination.","Multiply and add"));
        list.add(tq(testId,"Vertex form of y=2x^2-12x+7?","y=2(x-3)^2-11","y=2(x-3)^2+7","y=2(x+3)^2-11","y=(2x-6)^2+7","A","Complete the square.","Factor 2, complete"));
        list.add(tq(testId,"Solve: x^4-5x^2+4=0","x=+/-1,+/-2","x=+/-1","x=+/-2","x=1,4","A","Substitute u=x^2.","u^2-5u+4=0, u=1,4"));
        list.add(tq(testId,"Rationalize: 3/(sqrt5+sqrt2)","3(sqrt5-sqrt2)/3=sqrt5-sqrt2","3sqrt5/7","3/(sqrt5-sqrt2)","(3sqrt5+3sqrt2)/7","A","Conjugate, denom=5-2=3.","Multiply top and bottom"));
        list.add(tq(testId,"Solve: 2^(2x)-5*2^x+4=0","x=0,2","x=1,4","x=0,4","x=2,4","A","Let u=2^x. u^2-5u+4=0.","u=1,4 then 2^x=1,4"));
        list.add(tq(testId,"Find c: x^2+cx+9 perfect square","c=6 or c=-6","c=6 only","c=9","c=3","A","(x+3)^2=x^2+6x+9.","2*3=6 or 2*(-3)=-6"));
        list.add(tq(testId,"Area=-2x^2+80x. Max area?","800","400","1600","80","A","x=20, A=-800+1600=800.","Vertex at x=-80/-4=20"));
        list.add(tq(testId,"Solve: (x+2)/(x-1)=3/(x-1)+2","x=3","x=1","No solution","x=-1","A","Multiply by (x-1), check x!=1.","x+2=3+2(x-1)"));
        list.add(tq(testId,"Sum geometric: 3+6+12+...+768?","1533","1500","1024","768","A","a=3,r=2,n=9.","S=3(2^9-1)/(2-1)=1533"));
        list.add(tq(testId,"Solve: x^(2/3)=4","x=8","x=16","x=2","x=64","A","Raise to 3/2 power.","x=(4)^(3/2)=8"));
        list.add(tq(testId,"If f(x)=x^2-3x, solve f(x)=10","x=5,-2","x=5,2","x=-5,2","x=10","A","x^2-3x-10=0.","(x-5)(x+2)=0"));
        list.add(tq(testId,"Standard deviation of 2,4,6,8,10?","sqrt8=2sqrt2","2","4","sqrt10","A","Mean=6, variance=8.","Sum of squared deviations/5"));
        list.add(tq(testId,"Solve: log_2(x)+log_2(x-2)=3","x=4","x=8","x=-2","x=2","A","log_2(x(x-2))=3.","x^2-2x=8, check x>2"));
        list.add(tq(testId,"Factor: x^3-8","(x-2)(x^2+2x+4)","(x-2)^3","(x+2)(x^2-2x+4)","(x-8)(x^2+1)","A","Difference of cubes.","a^3-b^3=(a-b)(a^2+ab+b^2)"));
        list.add(tq(testId,"Solve inequality: x^2-4x-5>0","(-inf,-1)U(5,inf)","(-1,5)","[-1,5]","(5,inf)","A","Factor (x-5)(x+1)>0.","Positive outside roots"));
        list.add(tq(testId,"Write quadratic with roots 2/3 and -4","3x^2+10x-8=0","x^2+10/3x-8/3=0","3x^2-10x-8=0","x^2-10x+8=0","A","(x-2/3)(x+4)=0, multiply by 3.","3x^2+10x-8"));
        list.add(tq(testId,"Arithmetic series S_50: a1=7, d=3?","4025","3725","5000","3500","A","S=50/2*(2*7+49*3)=25*161.","S=n/2*(2a1+(n-1)d)"));
        for (int i = 21; i <= 50; i++) {
            int coeff = (i % 5) + 2;
            int constant = i * 3;
            int answer = (constant - i) / coeff;
            list.add(tq(testId,"Solve: "+coeff+"x+"+i+"="+constant,"x="+answer,"x="+(answer+1),"x="+(answer-1),"x="+(answer*2),"A","Subtract "+i+", divide by "+coeff+".",""+coeff+"x="+(constant-i)));
        }
    }
}
