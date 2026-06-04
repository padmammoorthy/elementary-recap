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
        list.add(tq(testId,"Evaluate 3x+5 when x=4","17","12","20","7","A","Substitute x=4.","3(4)+5=12+5=17"));
        list.add(tq(testId,"Find the missing number: n+15=42","27","57","28","26","A","Subtract 15.","42-15=27"));
        list.add(tq(testId,"What is 3/4 of 24?","18","6","8","16","A","Multiply 24 by 3/4.","24x3/4=18"));
        list.add(tq(testId,"Write 17/5 as a mixed number","3 2/5","2 3/5","3 1/5","4 2/5","A","17 divided by 5.","17/5=3 remainder 2"));
        list.add(tq(testId,"Round 3,456 to the nearest hundred","3,500","3,400","3,460","4,000","A","Look at tens: 5>=5.","5 rounds up"));
        list.add(tq(testId,"Name the property: 5+3=3+5","Commutative","Associative","Distributive","Identity","A","Order changed.","Addition is commutative"));
        list.add(tq(testId,"Perimeter of rectangle 12 by 8?","40","96","20","32","A","P=2(l+w).","2(12+8)=40"));
        list.add(tq(testId,"Reduce 12/18 to lowest terms","2/3","3/4","6/9","4/6","A","Divide by GCF=6.","12/6=2, 18/6=3"));
        list.add(tq(testId,"Convert 3/5 to a decimal","0.6","0.35","0.53","0.06","A","3 divided by 5.","3/5=0.6"));
        list.add(tq(testId,"What percent equals 1/4?","25%","4%","14%","40%","A","1/4=0.25.","0.25=25%"));
        list.add(tq(testId,"Area of rectangle 9 by 7?","63","32","16","72","A","A=lxw.","9x7=63"));
        list.add(tq(testId,"Find: (-5)+8","3","-3","13","-13","A","Move right 8.","Starting at -5, go right 8"));
        list.add(tq(testId,"Classify a 40-degree angle","Acute","Obtuse","Right","Straight","A","Less than 90.","Acute angles are 0-90 degrees"));
        list.add(tq(testId,"How many feet in 1 mile?","5,280","1,000","5,000","1,760","A","Standard conversion.","1 mile = 5,280 feet"));
        list.add(tq(testId,"Find the next term: 3,7,11,15,...","19","16","20","18","A","Add 4.","15+4=19"));
        list.add(tq(testId,"Reciprocal of 2/3?","3/2","2/3","-2/3","1","A","Flip the fraction.","Swap numerator and denominator"));
        list.add(tq(testId,"How many degrees in a right angle?","90","180","45","360","A","Definition.","Right = 90 degrees"));
        list.add(tq(testId,"Solve: 5n=45","9","225","40","50","A","Divide by 5.","45/5=9"));
        list.add(tq(testId,"List factors of 12","1,2,3,4,6,12","2,3,4,6","1,12","2,4,6,12","A","All pairs.","1x12, 2x6, 3x4"));
        list.add(tq(testId,"Is 15 prime or composite?","Composite","Prime","Neither","Both","A","15=3x5.","Has factors besides 1 and itself"));
        for (int i = 21; i <= 50; i++) {
            int a = 3 + (i % 7); int b = i + 2;
            list.add(tq(testId,"Solve: x+"+a+"="+b,"x="+(b-a),"x="+(b+a),"x="+(a),"x="+(b),"A","Subtract "+a+".","x="+(b)+"-"+a+"="+(b-a)));
        }
    }

    private void addMediumQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"Evaluate: 5+3x(8-2)^2/4","32","23","14","50","A","PEMDAS carefully.","(6)^2=36, 3x36/4=27, 5+27=32"));
        list.add(tq(testId,"Solve: 2/3+3/4","17/12 or 1 5/12","5/7","5/12","6/7","A","LCD=12.","8/12+9/12=17/12"));
        list.add(tq(testId,"Area of triangle base 14, height 9","63","126","23","28","A","A=(1/2)bh.","(1/2)(14)(9)=63"));
        list.add(tq(testId,"Write 0.00045 in scientific notation","4.5x10^-4","45x10^-5","4.5x10^-3","0.45x10^-3","A","Move decimal 4 right.","4.5 x 10^-4"));
        list.add(tq(testId,"Circumference of circle d=21 (pi=22/7)?","66","44","132","33","A","C=pi*d.","22/7 x 21 = 66"));
        list.add(tq(testId,"Solve proportion: 4/7=x/35","20","5","28","12","A","Cross multiply.","4x35=7x, x=20"));
        list.add(tq(testId,"(-8)x(-6)=?","48","-48","14","-14","A","Neg x neg = positive.","8x6=48, both negative so positive"));
        list.add(tq(testId,"Convert 3 hours 45 minutes to minutes","225","345","180","215","A","3x60+45.","180+45=225"));
        list.add(tq(testId,"Volume of box 8x5x6","240","19","80","300","A","V=lwh.","8x5x6=240"));
        list.add(tq(testId,"Find 35% of 80","28","24","32","35","A","0.35x80.","Multiply decimal by number"));
        list.add(tq(testId,"Simplify: 4x+3y-x+2y","3x+5y","5x+5y","3x+y","4x+5y","A","Combine like terms.","(4x-x)+(3y+2y)"));
        list.add(tq(testId,"Prime factorization of 72","2^3 x 3^2","2x36","8x9","2^2 x 18","A","Factor completely.","72=8x9=2^3 x 3^2"));
        list.add(tq(testId,"Solve: 3x-7=20","9","27/3","7","4","A","Add 7, divide 3.","3x=27, x=9"));
        list.add(tq(testId,"LCM of 8 and 12?","24","96","4","48","A","First common multiple.","8:8,16,24; 12:12,24"));
        list.add(tq(testId,"Average of 78,85,92,88,77?","84","80","85","82","A","Sum/5.","420/5=84"));
        list.add(tq(testId,"Unit rate: $5.76 for 8 lbs","$0.72/lb","$0.58/lb","$0.80/lb","$1.44/lb","A","Divide.","5.76/8=0.72"));
        list.add(tq(testId,"What is (-3)^3?","-27","27","-9","9","A","Odd power stays negative.","-3x-3x-3=-27"));
        list.add(tq(testId,"Angle supplement of 65 degrees?","115","25","65","180","A","180-65.","Supplements sum to 180"));
        list.add(tq(testId,"Solve: 4.5/0.9=?","5","0.5","50","4.5","A","Move decimals.","45/9=5"));
        list.add(tq(testId,"Surface area cube edge 4?","96","64","16","24","A","6 faces.","6x(4^2)=96"));
        for (int i = 21; i <= 50; i++) {
            int a = 2 + (i % 4); int b = i * 2 + 3;
            list.add(tq(testId,"Solve: "+a+"x+5="+b,"x="+((b-5)/a),"x="+(b/a),"x="+(b-5),"x="+(b+5),"A","Subtract 5, divide by "+a+".",""+a+"x="+(b-5)));
        }
    }

    private void addHardQuestions(List<TestQuestion> list, Long testId) {
        list.add(tq(testId,"Pythagorean: legs 9 and 40. Hypotenuse?","41","49","45","39","A","a^2+b^2=c^2.","81+1600=1681, sqrt=41"));
        list.add(tq(testId,"Solve: 2x+5=3(x-4)","17","7","-7","12","A","Distribute then solve.","2x+5=3x-12, 17=x"));
        list.add(tq(testId,"Area circle r=7 (pi=22/7)?","154","44","308","22","A","A=pi*r^2.","22/7 x 49 = 154"));
        list.add(tq(testId,"Write equation: slope 2, through (3,7)","y=2x+1","y=2x+7","y=2x-1","y=2x+3","A","y-7=2(x-3).","y=2x-6+7=2x+1"));
        list.add(tq(testId,"Percent of change: 80 to 100?","25%","20%","80%","125%","A","Change/original.","20/80=0.25=25%"));
        list.add(tq(testId,"Volume of cylinder r=5 h=8 (pi=3.14)?","628","314","200","1256","A","V=pi*r^2*h.","3.14x25x8=628"));
        list.add(tq(testId,"Simplify: (3x^2)(4x^3)","12x^5","7x^5","12x^6","7x^6","A","Multiply coefficients, add exponents.","3x4=12, 2+3=5"));
        list.add(tq(testId,"Simple interest: $800, 5%, 3 years?","$120","$840","$960","$24","A","I=Prt.","800x0.05x3=120"));
        list.add(tq(testId,"Slope between (-2,5) and (4,-1)?","-1","1","-3","3","A","(y2-y1)/(x2-x1).","(-1-5)/(4-(-2))=-6/6=-1"));
        list.add(tq(testId,"Factor: 6x+15","3(2x+5)","6(x+15)","3x(2+5)","15(x+1)","A","GCF=3.","3(2x+5)"));
        list.add(tq(testId,"Interior angles of hexagon?","720","360","540","1080","A","(n-2)x180.","(6-2)x180=720"));
        list.add(tq(testId,"Solve: x^2=121","x=11,-11","x=11","x=-11","x=121","A","Two square roots.","sqrt(121)=11 and -11"));
        list.add(tq(testId,"Similar triangles scale 3:5. Side 12 in small. Large?","20","18","15","36","A","12x5/3.","Scale up by 5/3"));
        list.add(tq(testId,"Evaluate: 2^(-3)","1/8","8","-8","-1/8","A","Negative exponent=reciprocal.","1/2^3=1/8"));
        list.add(tq(testId,"Compound probability: P(H then H)?","1/4","1/2","1/8","3/4","A","Independent events multiply.","1/2 x 1/2 = 1/4"));
        list.add(tq(testId,"Distance (0,0) to (5,12)?","13","17","7","60","A","Pythagorean.","sqrt(25+144)=sqrt(169)=13"));
        list.add(tq(testId,"Solve: 3/x=12/20","x=5","x=4","x=3","x=6","A","Cross multiply.","3x20=12x, x=5"));
        list.add(tq(testId,"Slope-intercept of 2x+3y=12?","y=(-2/3)x+4","y=2x+4","y=(2/3)x-4","y=-2x+12","A","Solve for y.","3y=-2x+12, y=(-2/3)x+4"));
        list.add(tq(testId,"Volume pyramid base 6x6, height 10?","120","360","60","216","A","V=(1/3)Bh.","(1/3)(36)(10)=120"));
        list.add(tq(testId,"Estimate sqrt(85)","9.2","8.5","10","7.5","A","Between 9^2=81 and 10^2=100.","Closer to 81, so about 9.2"));
        for (int i = 21; i <= 50; i++) {
            int a = (i % 8) + 3; int b = (i % 6) + 4; int csq = a*a + b*b;
            list.add(tq(testId,"Right triangle legs "+a+" and "+b+". Find c^2.",""+csq,""+(csq+1),""+(csq-1),""+(a*b),"A","a^2+b^2=c^2.",""+a+"^2+"+b+"^2="+a*a+"+"+b*b+"="+csq));
        }
    }
}
