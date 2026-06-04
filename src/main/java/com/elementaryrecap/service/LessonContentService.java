package com.elementaryrecap.service;
import com.elementaryrecap.model.LessonContent;
import com.elementaryrecap.model.LessonContent.Section;
import com.elementaryrecap.model.LessonContent.WorkedExample;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class LessonContentService {
    private final List<LessonContent> lessons;
    public LessonContentService() { this.lessons = new ArrayList<>(); initializeLessons(); }
    public List<LessonContent> getAllLessons() { return lessons; }
    public Optional<LessonContent> getLessonBySlug(String slug) { return lessons.stream().filter(l -> l.getSlug().equals(slug)).findFirst(); }
    public Map<String, List<LessonContent>> getLessonsByChapter() {
        LinkedHashMap<String, List<LessonContent>> map = new LinkedHashMap<>();
        for (LessonContent l : lessons) map.computeIfAbsent(l.getChapter(), k -> new ArrayList<>()).add(l);
        return map; }
    private void initializeLessons() {
        lessons.add(new LessonContent("lesson-1", "Arithmetic with Whole Numbers and Money, Variables and Evaluation", "1", "Arithmetic with Whole Numbers and Money, Variables and Evaluation", "Section 1: Lessons 1-10", 1,
            Arrays.asList(new Section("Worked Examples", "Arithmetic with Whole Numbers and Money, Variables and Evaluation",
                Arrays.asList(
            new WorkedExample("Find: $45.67 + $23.89", Arrays.asList("Line up decimal points", "$45.67 + $23.89", "7+9=16 carry, 6+8+1=15 carry, 5+3+1=9, 4+2=6", "$69.56"), "$69.56"),
            new WorkedExample("Evaluate 3x+7 when x=5", Arrays.asList("Replace x with 5", "3(5)+7", "15+7=22"), "22"),
            new WorkedExample("Find: 456 x 78", Arrays.asList("456x8=3648", "456x70=31920", "3648+31920=35568"), "35,568"),
            new WorkedExample("Find change from $20 for $13.47 purchase", Arrays.asList("$20.00 - $13.47", "Borrow and subtract", "$6.53"), "$6.53"),
            new WorkedExample("Evaluate: 4(a-b) when a=9, b=3", Arrays.asList("a-b = 9-3 = 6", "4(6) = 24"), "24")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-2", "Properties of Operations", "2", "Properties of Operations", "Section 1: Lessons 1-10", 2,
            Arrays.asList(new Section("Worked Examples", "Properties of Operations",
                Arrays.asList(
            new WorkedExample("Name property: 7+3=3+7", Arrays.asList("Order of numbers changed", "Addition stayed the same"), "Commutative Property of Addition"),
            new WorkedExample("Apply distributive: 6(30+4)", Arrays.asList("6x30=180", "6x4=24", "180+24=204"), "204"),
            new WorkedExample("Name: (2x5)x3=2x(5x3)", Arrays.asList("Grouping changed, not order"), "Associative Property of Multiplication"),
            new WorkedExample("What is 47x1?", Arrays.asList("Any number times 1 equals itself"), "47 (Identity Property)"),
            new WorkedExample("Simplify: 8x25x4", Arrays.asList("Rearrange: (8x25)x4? No: (25x4)x8", "100x8=800"), "800")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-3", "Missing Numbers", "3", "Missing Numbers", "Section 1: Lessons 1-10", 3,
            Arrays.asList(new Section("Worked Examples", "Missing Numbers",
                Arrays.asList(
            new WorkedExample("Find n: n+15=42", Arrays.asList("Subtract 15 from both sides", "n=42-15"), "n=27"),
            new WorkedExample("Find x: 3x=36", Arrays.asList("Divide both sides by 3", "x=36/3"), "x=12"),
            new WorkedExample("Find y: y-8=25", Arrays.asList("Add 8 to both sides", "y=25+8"), "y=33"),
            new WorkedExample("Find n: n/4=9", Arrays.asList("Multiply both sides by 4", "n=9x4"), "n=36"),
            new WorkedExample("Find w: 5w+3=28", Arrays.asList("Subtract 3: 5w=25", "Divide by 5: w=5"), "w=5")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-4", "Number Line, Sequences", "4", "Number Line, Sequences", "Section 1: Lessons 1-10", 4,
            Arrays.asList(new Section("Worked Examples", "Number Line, Sequences",
                Arrays.asList(
            new WorkedExample("Find next 3: 5,10,15,20,...", Arrays.asList("Rule: add 5", "20+5=25, 25+5=30, 30+5=35"), "25, 30, 35"),
            new WorkedExample("Find next 3: 2,6,18,54,...", Arrays.asList("Rule: multiply by 3", "54x3=162, 162x3=486, 486x3=1458"), "162, 486, 1,458"),
            new WorkedExample("Find the rule: 100,92,84,76,...", Arrays.asList("100-92=8, 92-84=8", "Rule: subtract 8"), "Subtract 8"),
            new WorkedExample("Find 10th term: 4,7,10,13,...", Arrays.asList("Rule: add 3", "a10=4+(10-1)(3)=4+27"), "31"),
            new WorkedExample("Place -3,0,2.5,-1 on number line", Arrays.asList("Order: -3,-1,0,2.5", "Left to right on number line"), "−3, −1, 0, 2.5")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-5", "Place Value Through Trillions, Reading and Writing Numbers", "5", "Place Value Through Trillions, Reading and Writing Numbers", "Section 1: Lessons 1-10", 5,
            Arrays.asList(new Section("Worked Examples", "Place Value Through Trillions, Reading and Writing Numbers",
                Arrays.asList(
            new WorkedExample("Value of 8 in 3,845,921?", Arrays.asList("8 is in hundred-thousands place", "Value: 800,000"), "800,000"),
            new WorkedExample("Write in expanded: 5,060,300", Arrays.asList("5,000,000+60,000+300"), "5,000,000 + 60,000 + 300"),
            new WorkedExample("Standard form: seven million forty thousand", Arrays.asList("7,000,000+40,000"), "7,040,000"),
            new WorkedExample("How many thousands in 2,450,000?", Arrays.asList("2,450,000/1,000=2,450"), "2,450"),
            new WorkedExample("What is 100,000 more than 4,567,890?", Arrays.asList("Add to hundred-thousands place"), "4,667,890")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-6", "Factors, Divisibility", "6", "Factors, Divisibility", "Section 1: Lessons 1-10", 6,
            Arrays.asList(new Section("Worked Examples", "Factors, Divisibility",
                Arrays.asList(
            new WorkedExample("List factors of 36", Arrays.asList("Try pairs: 1x36,2x18,3x12,4x9,6x6"), "1,2,3,4,6,9,12,18,36"),
            new WorkedExample("Is 48 divisible by 6?", Arrays.asList("48/6=8 exactly, yes"), "Yes"),
            new WorkedExample("GCF of 24 and 36?", Arrays.asList("24: 1,2,3,4,6,8,12,24", "36: 1,2,3,4,6,9,12,18,36", "Largest common: 12"), "12"),
            new WorkedExample("Is 7 a factor of 56?", Arrays.asList("56/7=8, yes"), "Yes"),
            new WorkedExample("Find all factor pairs of 20", Arrays.asList("1x20, 2x10, 4x5"), "(1,20), (2,10), (4,5)")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-7", "Lines and Angles", "7", "Lines and Angles", "Section 1: Lessons 1-10", 7,
            Arrays.asList(new Section("Worked Examples", "Lines and Angles",
                Arrays.asList(
            new WorkedExample("Classify: 75 degrees", Arrays.asList("Less than 90"), "Acute"),
            new WorkedExample("Classify: 135 degrees", Arrays.asList("Greater than 90, less than 180"), "Obtuse"),
            new WorkedExample("Complement of 35 degrees?", Arrays.asList("90-35=55"), "55 degrees"),
            new WorkedExample("Supplement of 110 degrees?", Arrays.asList("180-110=70"), "70 degrees"),
            new WorkedExample("Two angles on a line sum to?", Arrays.asList("Straight line=180"), "180 degrees")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-8", "Fractions and Percents, Inch Ruler", "8", "Fractions and Percents, Inch Ruler", "Section 1: Lessons 1-10", 8,
            Arrays.asList(new Section("Worked Examples", "Fractions and Percents, Inch Ruler",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("0.25 x 80 = 20"), "20"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5=0.6=60%"), "60%"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60=0.25=25%"), "25%"),
            new WorkedExample("Item $45, 20% off. Sale price?", Arrays.asList("20% of 45=9, 45-9=36"), "$36"),
            new WorkedExample("Convert 0.125 to percent", Arrays.asList("Move decimal 2 right"), "12.5%")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-9", "Fraction Operations, Reciprocals", "9", "Fraction Operations, Reciprocals", "Section 1: Lessons 1-10", 9,
            Arrays.asList(new Section("Worked Examples", "Fraction Operations, Reciprocals",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-10", "Writing Division Answers as Mixed Numbers, Improper Fractions", "10", "Writing Division Answers as Mixed Numbers, Improper Fractions", "Section 1: Lessons 1-10", 10,
            Arrays.asList(new Section("Worked Examples", "Writing Division Answers as Mixed Numbers, Improper Fractions",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-11", "Problems About Combining, Problems About Separating", "11", "Problems About Combining, Problems About Separating", "Section 2: Lessons 11-20", 11,
            Arrays.asList(new Section("Worked Examples", "Problems About Combining, Problems About Separating",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-12", "Problems About Comparing, Elapsed-Time Problems", "12", "Problems About Comparing, Elapsed-Time Problems", "Section 2: Lessons 11-20", 12,
            Arrays.asList(new Section("Worked Examples", "Problems About Comparing, Elapsed-Time Problems",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-13", "Problems About Equal Groups", "13", "Problems About Equal Groups", "Section 2: Lessons 11-20", 13,
            Arrays.asList(new Section("Worked Examples", "Problems About Equal Groups",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-14", "Problems About Parts of a Whole", "14", "Problems About Parts of a Whole", "Section 2: Lessons 11-20", 14,
            Arrays.asList(new Section("Worked Examples", "Problems About Parts of a Whole",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-15", "Equivalent Fractions, Reducing Fractions Part 1", "15", "Equivalent Fractions, Reducing Fractions Part 1", "Section 2: Lessons 11-20", 15,
            Arrays.asList(new Section("Worked Examples", "Equivalent Fractions, Reducing Fractions Part 1",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-16", "US Customary System, Functions", "16", "US Customary System, Functions", "Section 2: Lessons 11-20", 16,
            Arrays.asList(new Section("Worked Examples", "US Customary System, Functions",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-17", "Measuring Angles with a Protractor", "17", "Measuring Angles with a Protractor", "Section 2: Lessons 11-20", 17,
            Arrays.asList(new Section("Worked Examples", "Measuring Angles with a Protractor",
                Arrays.asList(
            new WorkedExample("Classify: 75 degrees", Arrays.asList("Less than 90"), "Acute"),
            new WorkedExample("Classify: 135 degrees", Arrays.asList("Greater than 90, less than 180"), "Obtuse"),
            new WorkedExample("Complement of 35 degrees?", Arrays.asList("90-35=55"), "55 degrees"),
            new WorkedExample("Supplement of 110 degrees?", Arrays.asList("180-110=70"), "70 degrees"),
            new WorkedExample("Two angles on a line sum to?", Arrays.asList("Straight line=180"), "180 degrees")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-18", "Polygons, Similar and Congruent", "18", "Polygons, Similar and Congruent", "Section 2: Lessons 11-20", 18,
            Arrays.asList(new Section("Worked Examples", "Polygons, Similar and Congruent",
                Arrays.asList(
            new WorkedExample("Angles of triangle sum to?", Arrays.asList("Always 180"), "180 degrees"),
            new WorkedExample("Interior angle sum of pentagon?", Arrays.asList("(5-2)x180=540"), "540 degrees"),
            new WorkedExample("Triangle: 55,65,?", Arrays.asList("180-55-65=60"), "60 degrees"),
            new WorkedExample("Classify: all sides equal", Arrays.asList("Equilateral"), "Equilateral triangle"),
            new WorkedExample("Name shape: 4 sides, all angles 90, all sides equal", Arrays.asList("Square"), "Square")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-19", "Perimeter", "19", "Perimeter", "Section 2: Lessons 11-20", 19,
            Arrays.asList(new Section("Worked Examples", "Perimeter",
                Arrays.asList(
            new WorkedExample("Perimeter rectangle 14x9", Arrays.asList("P=2(14+9)=2(23)"), "46 units"),
            new WorkedExample("Perimeter square side 13", Arrays.asList("P=4x13"), "52 units"),
            new WorkedExample("Perimeter triangle 7,8,12", Arrays.asList("7+8+12"), "27 units"),
            new WorkedExample("Regular hexagon side 5. P=?", Arrays.asList("6x5"), "30 units"),
            new WorkedExample("Rectangle P=50, l=15. Width?", Arrays.asList("50=2(15+w), 25=15+w, w=10"), "10 units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-20", "Exponents, Rectangular Area Part 1, Square Root", "20", "Exponents, Rectangular Area Part 1, Square Root", "Section 2: Lessons 11-20", 20,
            Arrays.asList(new Section("Worked Examples", "Exponents, Rectangular Area Part 1, Square Root",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-21", "Prime and Composite Numbers, Prime Factorization", "21", "Prime and Composite Numbers, Prime Factorization", "Section 3: Lessons 21-30", 21,
            Arrays.asList(new Section("Worked Examples", "Prime and Composite Numbers, Prime Factorization",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-22", "Problems About a Fraction of a Group", "22", "Problems About a Fraction of a Group", "Section 3: Lessons 21-30", 22,
            Arrays.asList(new Section("Worked Examples", "Problems About a Fraction of a Group",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-23", "Subtracting Mixed Numbers with Regrouping", "23", "Subtracting Mixed Numbers with Regrouping", "Section 3: Lessons 21-30", 23,
            Arrays.asList(new Section("Worked Examples", "Subtracting Mixed Numbers with Regrouping",
                Arrays.asList(
            new WorkedExample("Circumference d=14 (pi=22/7)", Arrays.asList("C=pi*d=22/7*14"), "44 units"),
            new WorkedExample("Circumference r=10 (pi=3.14)", Arrays.asList("C=2*pi*r=2*3.14*10"), "62.8 units"),
            new WorkedExample("Wheel radius 35cm. Distance in 1 turn?", Arrays.asList("C=2*22/7*35=220"), "220 cm"),
            new WorkedExample("Find radius if C=44 (pi=22/7)", Arrays.asList("44=2*22/7*r, r=7"), "7 units"),
            new WorkedExample("Semicircle perimeter d=10 (pi=3.14)", Arrays.asList("Half C + d = 15.7+10"), "25.7 units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-24", "Reducing Fractions Part 2", "24", "Reducing Fractions Part 2", "Section 3: Lessons 21-30", 24,
            Arrays.asList(new Section("Worked Examples", "Reducing Fractions Part 2",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-25", "Dividing Fractions", "25", "Dividing Fractions", "Section 3: Lessons 21-30", 25,
            Arrays.asList(new Section("Worked Examples", "Dividing Fractions",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-26", "Multiplying and Dividing Mixed Numbers", "26", "Multiplying and Dividing Mixed Numbers", "Section 3: Lessons 21-30", 26,
            Arrays.asList(new Section("Worked Examples", "Multiplying and Dividing Mixed Numbers",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-27", "Multiples, Least Common Multiple, Equivalent Division", "27", "Multiples, Least Common Multiple, Equivalent Division", "Section 3: Lessons 21-30", 27,
            Arrays.asList(new Section("Worked Examples", "Multiples, Least Common Multiple, Equivalent Division",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-28", "Two-Step Word Problems, Average Part 1", "28", "Two-Step Word Problems, Average Part 1", "Section 3: Lessons 21-30", 28,
            Arrays.asList(new Section("Worked Examples", "Two-Step Word Problems, Average Part 1",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-29", "Rounding Whole Numbers, Rounding Mixed Numbers, Estimating", "29", "Rounding Whole Numbers, Rounding Mixed Numbers, Estimating", "Section 3: Lessons 21-30", 29,
            Arrays.asList(new Section("Worked Examples", "Rounding Whole Numbers, Rounding Mixed Numbers, Estimating",
                Arrays.asList(
            new WorkedExample("Find: $45.67 + $23.89", Arrays.asList("Line up decimal points", "$45.67 + $23.89", "7+9=16 carry, 6+8+1=15 carry, 5+3+1=9, 4+2=6", "$69.56"), "$69.56"),
            new WorkedExample("Evaluate 3x+7 when x=5", Arrays.asList("Replace x with 5", "3(5)+7", "15+7=22"), "22"),
            new WorkedExample("Find: 456 x 78", Arrays.asList("456x8=3648", "456x70=31920", "3648+31920=35568"), "35,568"),
            new WorkedExample("Find change from $20 for $13.47 purchase", Arrays.asList("$20.00 - $13.47", "Borrow and subtract", "$6.53"), "$6.53"),
            new WorkedExample("Evaluate: 4(a-b) when a=9, b=3", Arrays.asList("a-b = 9-3 = 6", "4(6) = 24"), "24")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-30", "Common Denominators, Adding and Subtracting Fractions", "30", "Common Denominators, Adding and Subtracting Fractions", "Section 3: Lessons 21-30", 30,
            Arrays.asList(new Section("Worked Examples", "Common Denominators, Adding and Subtracting Fractions",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-31", "Reading and Writing Decimal Numbers", "31", "Reading and Writing Decimal Numbers", "Section 4: Lessons 31-40", 31,
            Arrays.asList(new Section("Worked Examples", "Reading and Writing Decimal Numbers",
                Arrays.asList(
            new WorkedExample("Write 0.045 in words", Arrays.asList("45 thousandths"), "Forty-five thousandths"),
            new WorkedExample("Add: 12.56+8.7", Arrays.asList("Line up decimals: 12.56+8.70"), "21.26"),
            new WorkedExample("Multiply: 2.5 x 0.4", Arrays.asList("25x4=100, 2 decimal places"), "1.0"),
            new WorkedExample("Divide: 7.2/0.8", Arrays.asList("Move decimals: 72/8"), "9"),
            new WorkedExample("Round 3.456 to nearest hundredth", Arrays.asList("Look at thousandths: 6>=5"), "3.46")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-32", "Metric System", "32", "Metric System", "Section 4: Lessons 31-40", 32,
            Arrays.asList(new Section("Worked Examples", "Metric System",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-33", "Comparing Decimals, Rounding Decimals", "33", "Comparing Decimals, Rounding Decimals", "Section 4: Lessons 31-40", 33,
            Arrays.asList(new Section("Worked Examples", "Comparing Decimals, Rounding Decimals",
                Arrays.asList(
            new WorkedExample("Write 0.045 in words", Arrays.asList("45 thousandths"), "Forty-five thousandths"),
            new WorkedExample("Add: 12.56+8.7", Arrays.asList("Line up decimals: 12.56+8.70"), "21.26"),
            new WorkedExample("Multiply: 2.5 x 0.4", Arrays.asList("25x4=100, 2 decimal places"), "1.0"),
            new WorkedExample("Divide: 7.2/0.8", Arrays.asList("Move decimals: 72/8"), "9"),
            new WorkedExample("Round 3.456 to nearest hundredth", Arrays.asList("Look at thousandths: 6>=5"), "3.46")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-34", "Decimal Numbers on the Number Line", "34", "Decimal Numbers on the Number Line", "Section 4: Lessons 31-40", 34,
            Arrays.asList(new Section("Worked Examples", "Decimal Numbers on the Number Line",
                Arrays.asList(
            new WorkedExample("Find next 3: 5,10,15,20,...", Arrays.asList("Rule: add 5", "20+5=25, 25+5=30, 30+5=35"), "25, 30, 35"),
            new WorkedExample("Find next 3: 2,6,18,54,...", Arrays.asList("Rule: multiply by 3", "54x3=162, 162x3=486, 486x3=1458"), "162, 486, 1,458"),
            new WorkedExample("Find the rule: 100,92,84,76,...", Arrays.asList("100-92=8, 92-84=8", "Rule: subtract 8"), "Subtract 8"),
            new WorkedExample("Find 10th term: 4,7,10,13,...", Arrays.asList("Rule: add 3", "a10=4+(10-1)(3)=4+27"), "31"),
            new WorkedExample("Place -3,0,2.5,-1 on number line", Arrays.asList("Order: -3,-1,0,2.5", "Left to right on number line"), "−3, −1, 0, 2.5")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-35", "Adding, Subtracting, Multiplying, Dividing Decimals", "35", "Adding, Subtracting, Multiplying, Dividing Decimals", "Section 4: Lessons 31-40", 35,
            Arrays.asList(new Section("Worked Examples", "Adding, Subtracting, Multiplying, Dividing Decimals",
                Arrays.asList(
            new WorkedExample("Write 0.045 in words", Arrays.asList("45 thousandths"), "Forty-five thousandths"),
            new WorkedExample("Add: 12.56+8.7", Arrays.asList("Line up decimals: 12.56+8.70"), "21.26"),
            new WorkedExample("Multiply: 2.5 x 0.4", Arrays.asList("25x4=100, 2 decimal places"), "1.0"),
            new WorkedExample("Divide: 7.2/0.8", Arrays.asList("Move decimals: 72/8"), "9"),
            new WorkedExample("Round 3.456 to nearest hundredth", Arrays.asList("Look at thousandths: 6>=5"), "3.46")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-36", "Ratio, Sample Space", "36", "Ratio, Sample Space", "Section 4: Lessons 31-40", 36,
            Arrays.asList(new Section("Worked Examples", "Ratio, Sample Space",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-37", "Area of a Triangle, Rectangular Area Part 2", "37", "Area of a Triangle, Rectangular Area Part 2", "Section 4: Lessons 31-40", 37,
            Arrays.asList(new Section("Worked Examples", "Area of a Triangle, Rectangular Area Part 2",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-38", "Interpreting Graphs", "38", "Interpreting Graphs", "Section 4: Lessons 31-40", 38,
            Arrays.asList(new Section("Worked Examples", "Interpreting Graphs",
                Arrays.asList(
            new WorkedExample("Read bar graph: tallest bar=45", Arrays.asList("Tallest=most"), "Most popular (45)"),
            new WorkedExample("Line graph going up means?", Arrays.asList("Values increasing"), "Increasing trend"),
            new WorkedExample("Pie chart: 25% section degrees?", Arrays.asList("360x0.25=90"), "90 degrees"),
            new WorkedExample("Stem 4 leaves 2,5,7 means?", Arrays.asList("42, 45, 47"), "42, 45, 47"),
            new WorkedExample("Mode of bar graph data?", Arrays.asList("Tallest bar is mode"), "Most frequent value")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-39", "Proportions", "39", "Proportions", "Section 4: Lessons 31-40", 39,
            Arrays.asList(new Section("Worked Examples", "Proportions",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-40", "Sum of Angle Measures of a Triangle, Angle Pairs", "40", "Sum of Angle Measures of a Triangle, Angle Pairs", "Section 4: Lessons 31-40", 40,
            Arrays.asList(new Section("Worked Examples", "Sum of Angle Measures of a Triangle, Angle Pairs",
                Arrays.asList(
            new WorkedExample("Angles of triangle sum to?", Arrays.asList("Always 180"), "180 degrees"),
            new WorkedExample("Interior angle sum of pentagon?", Arrays.asList("(5-2)x180=540"), "540 degrees"),
            new WorkedExample("Triangle: 55,65,?", Arrays.asList("180-55-65=60"), "60 degrees"),
            new WorkedExample("Classify: all sides equal", Arrays.asList("Equilateral"), "Equilateral triangle"),
            new WorkedExample("Name shape: 4 sides, all angles 90, all sides equal", Arrays.asList("Square"), "Square")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-41", "Using Formulas, Distributive Property", "41", "Using Formulas, Distributive Property", "Section 5: Lessons 41-50", 41,
            Arrays.asList(new Section("Worked Examples", "Using Formulas, Distributive Property",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-42", "Repeating Decimals", "42", "Repeating Decimals", "Section 5: Lessons 41-50", 42,
            Arrays.asList(new Section("Worked Examples", "Repeating Decimals",
                Arrays.asList(
            new WorkedExample("Write 0.045 in words", Arrays.asList("45 thousandths"), "Forty-five thousandths"),
            new WorkedExample("Add: 12.56+8.7", Arrays.asList("Line up decimals: 12.56+8.70"), "21.26"),
            new WorkedExample("Multiply: 2.5 x 0.4", Arrays.asList("25x4=100, 2 decimal places"), "1.0"),
            new WorkedExample("Divide: 7.2/0.8", Arrays.asList("Move decimals: 72/8"), "9"),
            new WorkedExample("Round 3.456 to nearest hundredth", Arrays.asList("Look at thousandths: 6>=5"), "3.46")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-43", "Converting Decimals to Fractions, Fractions to Decimals, Percents", "43", "Converting Decimals to Fractions, Fractions to Decimals, Percents", "Section 5: Lessons 41-50", 43,
            Arrays.asList(new Section("Worked Examples", "Converting Decimals to Fractions, Fractions to Decimals, Percents",
                Arrays.asList(
            new WorkedExample("Write 0.045 in words", Arrays.asList("45 thousandths"), "Forty-five thousandths"),
            new WorkedExample("Add: 12.56+8.7", Arrays.asList("Line up decimals: 12.56+8.70"), "21.26"),
            new WorkedExample("Multiply: 2.5 x 0.4", Arrays.asList("25x4=100, 2 decimal places"), "1.0"),
            new WorkedExample("Divide: 7.2/0.8", Arrays.asList("Move decimals: 72/8"), "9"),
            new WorkedExample("Round 3.456 to nearest hundredth", Arrays.asList("Look at thousandths: 6>=5"), "3.46")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-44", "Division Answers", "44", "Division Answers", "Section 5: Lessons 41-50", 44,
            Arrays.asList(new Section("Worked Examples", "Division Answers",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-45", "Dividing by a Decimal Number", "45", "Dividing by a Decimal Number", "Section 5: Lessons 41-50", 45,
            Arrays.asList(new Section("Worked Examples", "Dividing by a Decimal Number",
                Arrays.asList(
            new WorkedExample("Write 0.045 in words", Arrays.asList("45 thousandths"), "Forty-five thousandths"),
            new WorkedExample("Add: 12.56+8.7", Arrays.asList("Line up decimals: 12.56+8.70"), "21.26"),
            new WorkedExample("Multiply: 2.5 x 0.4", Arrays.asList("25x4=100, 2 decimal places"), "1.0"),
            new WorkedExample("Divide: 7.2/0.8", Arrays.asList("Move decimals: 72/8"), "9"),
            new WorkedExample("Round 3.456 to nearest hundredth", Arrays.asList("Look at thousandths: 6>=5"), "3.46")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-46", "Unit Price, Rates, Sales Tax", "46", "Unit Price, Rates, Sales Tax", "Section 5: Lessons 41-50", 46,
            Arrays.asList(new Section("Worked Examples", "Unit Price, Rates, Sales Tax",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-47", "Powers of 10", "47", "Powers of 10", "Section 5: Lessons 41-50", 47,
            Arrays.asList(new Section("Worked Examples", "Powers of 10",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-48", "Fraction-Decimal-Percent Equivalents", "48", "Fraction-Decimal-Percent Equivalents", "Section 5: Lessons 41-50", 48,
            Arrays.asList(new Section("Worked Examples", "Fraction-Decimal-Percent Equivalents",
                Arrays.asList(
            new WorkedExample("Write 0.045 in words", Arrays.asList("45 thousandths"), "Forty-five thousandths"),
            new WorkedExample("Add: 12.56+8.7", Arrays.asList("Line up decimals: 12.56+8.70"), "21.26"),
            new WorkedExample("Multiply: 2.5 x 0.4", Arrays.asList("25x4=100, 2 decimal places"), "1.0"),
            new WorkedExample("Divide: 7.2/0.8", Arrays.asList("Move decimals: 72/8"), "9"),
            new WorkedExample("Round 3.456 to nearest hundredth", Arrays.asList("Look at thousandths: 6>=5"), "3.46")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-49", "Adding Mixed Measures", "49", "Adding Mixed Measures", "Section 5: Lessons 41-50", 49,
            Arrays.asList(new Section("Worked Examples", "Adding Mixed Measures",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-50", "Unit Multipliers and Unit Conversion", "50", "Unit Multipliers and Unit Conversion", "Section 5: Lessons 41-50", 50,
            Arrays.asList(new Section("Worked Examples", "Unit Multipliers and Unit Conversion",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-51", "Scientific Notation for Large Numbers", "51", "Scientific Notation for Large Numbers", "Section 6: Lessons 51-60", 51,
            Arrays.asList(new Section("Worked Examples", "Scientific Notation for Large Numbers",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-52", "Order of Operations", "52", "Order of Operations", "Section 6: Lessons 51-60", 52,
            Arrays.asList(new Section("Worked Examples", "Order of Operations",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-53", "Ratio Word Problems", "53", "Ratio Word Problems", "Section 6: Lessons 51-60", 53,
            Arrays.asList(new Section("Worked Examples", "Ratio Word Problems",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-54", "Multiplying Rates", "54", "Multiplying Rates", "Section 6: Lessons 51-60", 54,
            Arrays.asList(new Section("Worked Examples", "Multiplying Rates",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-55", "Average and Rate Problems with Multiple Steps", "55", "Average and Rate Problems with Multiple Steps", "Section 6: Lessons 51-60", 55,
            Arrays.asList(new Section("Worked Examples", "Average and Rate Problems with Multiple Steps",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-56", "Plotting Functions", "56", "Plotting Functions", "Section 6: Lessons 51-60", 56,
            Arrays.asList(new Section("Worked Examples", "Plotting Functions",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-57", "Negative Exponents, Scientific Notation for Small Numbers", "57", "Negative Exponents, Scientific Notation for Small Numbers", "Section 6: Lessons 51-60", 57,
            Arrays.asList(new Section("Worked Examples", "Negative Exponents, Scientific Notation for Small Numbers",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-58", "Line Symmetry, Functions Part 1", "58", "Line Symmetry, Functions Part 1", "Section 6: Lessons 51-60", 58,
            Arrays.asList(new Section("Worked Examples", "Line Symmetry, Functions Part 1",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-59", "Adding Integers on the Number Line", "59", "Adding Integers on the Number Line", "Section 6: Lessons 51-60", 59,
            Arrays.asList(new Section("Worked Examples", "Adding Integers on the Number Line",
                Arrays.asList(
            new WorkedExample("Find next 3: 5,10,15,20,...", Arrays.asList("Rule: add 5", "20+5=25, 25+5=30, 30+5=35"), "25, 30, 35"),
            new WorkedExample("Find next 3: 2,6,18,54,...", Arrays.asList("Rule: multiply by 3", "54x3=162, 162x3=486, 486x3=1458"), "162, 486, 1,458"),
            new WorkedExample("Find the rule: 100,92,84,76,...", Arrays.asList("100-92=8, 92-84=8", "Rule: subtract 8"), "Subtract 8"),
            new WorkedExample("Find 10th term: 4,7,10,13,...", Arrays.asList("Rule: add 3", "a10=4+(10-1)(3)=4+27"), "31"),
            new WorkedExample("Place -3,0,2.5,-1 on number line", Arrays.asList("Order: -3,-1,0,2.5", "Left to right on number line"), "−3, −1, 0, 2.5")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-60", "Fractional Part of a Number, Percent of a Number Part 1", "60", "Fractional Part of a Number, Percent of a Number Part 1", "Section 6: Lessons 51-60", 60,
            Arrays.asList(new Section("Worked Examples", "Fractional Part of a Number, Percent of a Number Part 1",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("0.25 x 80 = 20"), "20"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5=0.6=60%"), "60%"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60=0.25=25%"), "25%"),
            new WorkedExample("Item $45, 20% off. Sale price?", Arrays.asList("20% of 45=9, 45-9=36"), "$36"),
            new WorkedExample("Convert 0.125 to percent", Arrays.asList("Move decimal 2 right"), "12.5%")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-61", "Area of a Parallelogram, Angles of a Parallelogram", "61", "Area of a Parallelogram, Angles of a Parallelogram", "Section 7: Lessons 61-70", 61,
            Arrays.asList(new Section("Worked Examples", "Area of a Parallelogram, Angles of a Parallelogram",
                Arrays.asList(
            new WorkedExample("Classify: 75 degrees", Arrays.asList("Less than 90"), "Acute"),
            new WorkedExample("Classify: 135 degrees", Arrays.asList("Greater than 90, less than 180"), "Obtuse"),
            new WorkedExample("Complement of 35 degrees?", Arrays.asList("90-35=55"), "55 degrees"),
            new WorkedExample("Supplement of 110 degrees?", Arrays.asList("180-110=70"), "70 degrees"),
            new WorkedExample("Two angles on a line sum to?", Arrays.asList("Straight line=180"), "180 degrees")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-62", "Classifying Triangles", "62", "Classifying Triangles", "Section 7: Lessons 61-70", 62,
            Arrays.asList(new Section("Worked Examples", "Classifying Triangles",
                Arrays.asList(
            new WorkedExample("Angles of triangle sum to?", Arrays.asList("Always 180"), "180 degrees"),
            new WorkedExample("Interior angle sum of pentagon?", Arrays.asList("(5-2)x180=540"), "540 degrees"),
            new WorkedExample("Triangle: 55,65,?", Arrays.asList("180-55-65=60"), "60 degrees"),
            new WorkedExample("Classify: all sides equal", Arrays.asList("Equilateral"), "Equilateral triangle"),
            new WorkedExample("Name shape: 4 sides, all angles 90, all sides equal", Arrays.asList("Square"), "Square")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-63", "Symbols of Inclusion", "63", "Symbols of Inclusion", "Section 7: Lessons 61-70", 63,
            Arrays.asList(new Section("Worked Examples", "Symbols of Inclusion",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-64", "Adding Signed Numbers", "64", "Adding Signed Numbers", "Section 7: Lessons 61-70", 64,
            Arrays.asList(new Section("Worked Examples", "Adding Signed Numbers",
                Arrays.asList(
            new WorkedExample("Find: -5+(-3)", Arrays.asList("Same sign: add, keep negative"), "−8"),
            new WorkedExample("Find: -8+12", Arrays.asList("Different signs: 12-8=4, positive"), "4"),
            new WorkedExample("Find: 7-(-4)", Arrays.asList("Subtract negative=add: 7+4"), "11"),
            new WorkedExample("Find: (-6)x(-3)", Arrays.asList("Neg x neg = positive"), "18"),
            new WorkedExample("Find: (-24)/6", Arrays.asList("Neg/pos = negative"), "−4")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-65", "Circumference, Pi", "65", "Circumference, Pi", "Section 7: Lessons 61-70", 65,
            Arrays.asList(new Section("Worked Examples", "Circumference, Pi",
                Arrays.asList(
            new WorkedExample("Circumference d=14 (pi=22/7)", Arrays.asList("C=pi*d=22/7*14"), "44 units"),
            new WorkedExample("Circumference r=10 (pi=3.14)", Arrays.asList("C=2*pi*r=2*3.14*10"), "62.8 units"),
            new WorkedExample("Wheel radius 35cm. Distance in 1 turn?", Arrays.asList("C=2*22/7*35=220"), "220 cm"),
            new WorkedExample("Find radius if C=44 (pi=22/7)", Arrays.asList("44=2*22/7*r, r=7"), "7 units"),
            new WorkedExample("Semicircle perimeter d=10 (pi=3.14)", Arrays.asList("Half C + d = 15.7+10"), "25.7 units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-66", "Ratio Problems Involving Totals", "66", "Ratio Problems Involving Totals", "Section 7: Lessons 61-70", 66,
            Arrays.asList(new Section("Worked Examples", "Ratio Problems Involving Totals",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-67", "Geometric Solids", "67", "Geometric Solids", "Section 7: Lessons 61-70", 67,
            Arrays.asList(new Section("Worked Examples", "Geometric Solids",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-68", "Algebraic Addition", "68", "Algebraic Addition", "Section 7: Lessons 61-70", 68,
            Arrays.asList(new Section("Worked Examples", "Algebraic Addition",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-69", "More on Scientific Notation", "69", "More on Scientific Notation", "Section 7: Lessons 61-70", 69,
            Arrays.asList(new Section("Worked Examples", "More on Scientific Notation",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-70", "Volume", "70", "Volume", "Section 7: Lessons 61-70", 70,
            Arrays.asList(new Section("Worked Examples", "Volume",
                Arrays.asList(
            new WorkedExample("Volume box 8x5x4", Arrays.asList("V=lwh=8x5x4"), "160 cubic units"),
            new WorkedExample("Volume cube edge 6", Arrays.asList("V=6x6x6"), "216 cubic units"),
            new WorkedExample("Volume cylinder r=3 h=10 (pi=3.14)", Arrays.asList("V=3.14x9x10"), "282.6 cubic units"),
            new WorkedExample("Volume pyramid base 36 h=10", Arrays.asList("V=(1/3)(36)(10)"), "120 cubic units"),
            new WorkedExample("Volume cone r=4 h=9 (pi=3.14)", Arrays.asList("V=(1/3)(3.14)(16)(9)"), "150.72 cubic units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-71", "Finding the Whole Group When a Fraction Is Known", "71", "Finding the Whole Group When a Fraction Is Known", "Section 8: Lessons 71-80", 71,
            Arrays.asList(new Section("Worked Examples", "Finding the Whole Group When a Fraction Is Known",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-72", "Implied Ratios", "72", "Implied Ratios", "Section 8: Lessons 71-80", 72,
            Arrays.asList(new Section("Worked Examples", "Implied Ratios",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-73", "Multiplying and Dividing Signed Numbers", "73", "Multiplying and Dividing Signed Numbers", "Section 8: Lessons 71-80", 73,
            Arrays.asList(new Section("Worked Examples", "Multiplying and Dividing Signed Numbers",
                Arrays.asList(
            new WorkedExample("Find: -5+(-3)", Arrays.asList("Same sign: add, keep negative"), "−8"),
            new WorkedExample("Find: -8+12", Arrays.asList("Different signs: 12-8=4, positive"), "4"),
            new WorkedExample("Find: 7-(-4)", Arrays.asList("Subtract negative=add: 7+4"), "11"),
            new WorkedExample("Find: (-6)x(-3)", Arrays.asList("Neg x neg = positive"), "18"),
            new WorkedExample("Find: (-24)/6", Arrays.asList("Neg/pos = negative"), "−4")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-74", "Fractional Part of a Number Part 2", "74", "Fractional Part of a Number Part 2", "Section 8: Lessons 71-80", 74,
            Arrays.asList(new Section("Worked Examples", "Fractional Part of a Number Part 2",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-75", "Area of a Complex Figure, Area of a Trapezoid", "75", "Area of a Complex Figure, Area of a Trapezoid", "Section 8: Lessons 71-80", 75,
            Arrays.asList(new Section("Worked Examples", "Area of a Complex Figure, Area of a Trapezoid",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-76", "Complex Fractions", "76", "Complex Fractions", "Section 8: Lessons 71-80", 76,
            Arrays.asList(new Section("Worked Examples", "Complex Fractions",
                Arrays.asList(
            new WorkedExample("Reduce 12/18", Arrays.asList("GCF of 12,18 = 6", "12/6=2, 18/6=3"), "2/3"),
            new WorkedExample("Convert 2 3/5 to improper", Arrays.asList("2x5+3=13, keep 5"), "13/5"),
            new WorkedExample("Find 3/4 of 28", Arrays.asList("28x3/4 = 84/4"), "21"),
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12+3/12"), "11/12"),
            new WorkedExample("Divide: 3/4 / 2/3", Arrays.asList("Flip: 3/4 x 3/2 = 9/8"), "9/8 or 1 1/8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-77", "Percent of a Number Part 2", "77", "Percent of a Number Part 2", "Section 8: Lessons 71-80", 77,
            Arrays.asList(new Section("Worked Examples", "Percent of a Number Part 2",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("0.25 x 80 = 20"), "20"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5=0.6=60%"), "60%"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60=0.25=25%"), "25%"),
            new WorkedExample("Item $45, 20% off. Sale price?", Arrays.asList("20% of 45=9, 45-9=36"), "$36"),
            new WorkedExample("Convert 0.125 to percent", Arrays.asList("Move decimal 2 right"), "12.5%")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-78", "Graphing Inequalities", "78", "Graphing Inequalities", "Section 8: Lessons 71-80", 78,
            Arrays.asList(new Section("Worked Examples", "Graphing Inequalities",
                Arrays.asList(
            new WorkedExample("Read bar graph: tallest bar=45", Arrays.asList("Tallest=most"), "Most popular (45)"),
            new WorkedExample("Line graph going up means?", Arrays.asList("Values increasing"), "Increasing trend"),
            new WorkedExample("Pie chart: 25% section degrees?", Arrays.asList("360x0.25=90"), "90 degrees"),
            new WorkedExample("Stem 4 leaves 2,5,7 means?", Arrays.asList("42, 45, 47"), "42, 45, 47"),
            new WorkedExample("Mode of bar graph data?", Arrays.asList("Tallest bar is mode"), "Most frequent value")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-79", "Estimating Area", "79", "Estimating Area", "Section 8: Lessons 71-80", 79,
            Arrays.asList(new Section("Worked Examples", "Estimating Area",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-80", "Transformations", "80", "Transformations", "Section 8: Lessons 71-80", 80,
            Arrays.asList(new Section("Worked Examples", "Transformations",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-81", "Using Proportions to Solve Percent Problems", "81", "Using Proportions to Solve Percent Problems", "Section 9: Lessons 81-90", 81,
            Arrays.asList(new Section("Worked Examples", "Using Proportions to Solve Percent Problems",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("0.25 x 80 = 20"), "20"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5=0.6=60%"), "60%"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60=0.25=25%"), "25%"),
            new WorkedExample("Item $45, 20% off. Sale price?", Arrays.asList("20% of 45=9, 45-9=36"), "$36"),
            new WorkedExample("Convert 0.125 to percent", Arrays.asList("Move decimal 2 right"), "12.5%")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-82", "Area of a Circle", "82", "Area of a Circle", "Section 9: Lessons 81-90", 82,
            Arrays.asList(new Section("Worked Examples", "Area of a Circle",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-83", "Multiplying Powers of 10, Scientific Notation Multiplication", "83", "Multiplying Powers of 10, Scientific Notation Multiplication", "Section 9: Lessons 81-90", 83,
            Arrays.asList(new Section("Worked Examples", "Multiplying Powers of 10, Scientific Notation Multiplication",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-84", "Algebraic Terms", "84", "Algebraic Terms", "Section 9: Lessons 81-90", 84,
            Arrays.asList(new Section("Worked Examples", "Algebraic Terms",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-85", "Order of Operations with Signed Numbers, Functions Part 2", "85", "Order of Operations with Signed Numbers, Functions Part 2", "Section 9: Lessons 81-90", 85,
            Arrays.asList(new Section("Worked Examples", "Order of Operations with Signed Numbers, Functions Part 2",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-86", "Number Families", "86", "Number Families", "Section 9: Lessons 81-90", 86,
            Arrays.asList(new Section("Worked Examples", "Number Families",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-87", "Multiplying Algebraic Terms", "87", "Multiplying Algebraic Terms", "Section 9: Lessons 81-90", 87,
            Arrays.asList(new Section("Worked Examples", "Multiplying Algebraic Terms",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-88", "Multiple Unit Multipliers, Converting Units of Area", "88", "Multiple Unit Multipliers, Converting Units of Area", "Section 9: Lessons 81-90", 88,
            Arrays.asList(new Section("Worked Examples", "Multiple Unit Multipliers, Converting Units of Area",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-89", "Diagonals, Interior Angles, Exterior Angles", "89", "Diagonals, Interior Angles, Exterior Angles", "Section 9: Lessons 81-90", 89,
            Arrays.asList(new Section("Worked Examples", "Diagonals, Interior Angles, Exterior Angles",
                Arrays.asList(
            new WorkedExample("Classify: 75 degrees", Arrays.asList("Less than 90"), "Acute"),
            new WorkedExample("Classify: 135 degrees", Arrays.asList("Greater than 90, less than 180"), "Obtuse"),
            new WorkedExample("Complement of 35 degrees?", Arrays.asList("90-35=55"), "55 degrees"),
            new WorkedExample("Supplement of 110 degrees?", Arrays.asList("180-110=70"), "70 degrees"),
            new WorkedExample("Two angles on a line sum to?", Arrays.asList("Straight line=180"), "180 degrees")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-90", "Mixed Number and Negative Coefficients", "90", "Mixed Number and Negative Coefficients", "Section 9: Lessons 81-90", 90,
            Arrays.asList(new Section("Worked Examples", "Mixed Number and Negative Coefficients",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-91", "Evaluations with Signed Numbers", "91", "Evaluations with Signed Numbers", "Section 10: Lessons 91-100", 91,
            Arrays.asList(new Section("Worked Examples", "Evaluations with Signed Numbers",
                Arrays.asList(
            new WorkedExample("Find: -5+(-3)", Arrays.asList("Same sign: add, keep negative"), "−8"),
            new WorkedExample("Find: -8+12", Arrays.asList("Different signs: 12-8=4, positive"), "4"),
            new WorkedExample("Find: 7-(-4)", Arrays.asList("Subtract negative=add: 7+4"), "11"),
            new WorkedExample("Find: (-6)x(-3)", Arrays.asList("Neg x neg = positive"), "18"),
            new WorkedExample("Find: (-24)/6", Arrays.asList("Neg/pos = negative"), "−4")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-92", "Percent of Change", "92", "Percent of Change", "Section 10: Lessons 91-100", 92,
            Arrays.asList(new Section("Worked Examples", "Percent of Change",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("0.25 x 80 = 20"), "20"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5=0.6=60%"), "60%"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60=0.25=25%"), "25%"),
            new WorkedExample("Item $45, 20% off. Sale price?", Arrays.asList("20% of 45=9, 45-9=36"), "$36"),
            new WorkedExample("Convert 0.125 to percent", Arrays.asList("Move decimal 2 right"), "12.5%")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-93", "Two-Step Equations and Inequalities", "93", "Two-Step Equations and Inequalities", "Section 10: Lessons 91-100", 93,
            Arrays.asList(new Section("Worked Examples", "Two-Step Equations and Inequalities",
                Arrays.asList(
            new WorkedExample("Solve: 2x+5=17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6"), "x=6"),
            new WorkedExample("Solve: x/4-3=5", Arrays.asList("Add 3: x/4=8", "Multiply by 4: x=32"), "x=32"),
            new WorkedExample("Solve: 3(x-2)=15", Arrays.asList("Divide by 3: x-2=5", "Add 2: x=7"), "x=7"),
            new WorkedExample("Solve: 5x+3=2x+18", Arrays.asList("3x=15, x=5"), "x=5"),
            new WorkedExample("Solve: n/3+7=12", Arrays.asList("n/3=5, n=15"), "n=15")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-94", "Compound Probability, Independent Events", "94", "Compound Probability, Independent Events", "Section 10: Lessons 91-100", 94,
            Arrays.asList(new Section("Worked Examples", "Compound Probability, Independent Events",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-95", "Volume of a Right Solid", "95", "Volume of a Right Solid", "Section 10: Lessons 91-100", 95,
            Arrays.asList(new Section("Worked Examples", "Volume of a Right Solid",
                Arrays.asList(
            new WorkedExample("Volume box 8x5x4", Arrays.asList("V=lwh=8x5x4"), "160 cubic units"),
            new WorkedExample("Volume cube edge 6", Arrays.asList("V=6x6x6"), "216 cubic units"),
            new WorkedExample("Volume cylinder r=3 h=10 (pi=3.14)", Arrays.asList("V=3.14x9x10"), "282.6 cubic units"),
            new WorkedExample("Volume pyramid base 36 h=10", Arrays.asList("V=(1/3)(36)(10)"), "120 cubic units"),
            new WorkedExample("Volume cone r=4 h=9 (pi=3.14)", Arrays.asList("V=(1/3)(3.14)(16)(9)"), "150.72 cubic units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-96", "Estimating Angle Measures, Distributive Property with Algebra", "96", "Estimating Angle Measures, Distributive Property with Algebra", "Section 10: Lessons 91-100", 96,
            Arrays.asList(new Section("Worked Examples", "Estimating Angle Measures, Distributive Property with Algebra",
                Arrays.asList(
            new WorkedExample("Classify: 75 degrees", Arrays.asList("Less than 90"), "Acute"),
            new WorkedExample("Classify: 135 degrees", Arrays.asList("Greater than 90, less than 180"), "Obtuse"),
            new WorkedExample("Complement of 35 degrees?", Arrays.asList("90-35=55"), "55 degrees"),
            new WorkedExample("Supplement of 110 degrees?", Arrays.asList("180-110=70"), "70 degrees"),
            new WorkedExample("Two angles on a line sum to?", Arrays.asList("Straight line=180"), "180 degrees")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-97", "Similar Triangles, Indirect Measures", "97", "Similar Triangles, Indirect Measures", "Section 10: Lessons 91-100", 97,
            Arrays.asList(new Section("Worked Examples", "Similar Triangles, Indirect Measures",
                Arrays.asList(
            new WorkedExample("Angles of triangle sum to?", Arrays.asList("Always 180"), "180 degrees"),
            new WorkedExample("Interior angle sum of pentagon?", Arrays.asList("(5-2)x180=540"), "540 degrees"),
            new WorkedExample("Triangle: 55,65,?", Arrays.asList("180-55-65=60"), "60 degrees"),
            new WorkedExample("Classify: all sides equal", Arrays.asList("Equilateral"), "Equilateral triangle"),
            new WorkedExample("Name shape: 4 sides, all angles 90, all sides equal", Arrays.asList("Square"), "Square")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-98", "Scale, Scale Factor", "98", "Scale, Scale Factor", "Section 10: Lessons 91-100", 98,
            Arrays.asList(new Section("Worked Examples", "Scale, Scale Factor",
                Arrays.asList(
            new WorkedExample("List factors of 36", Arrays.asList("Try pairs: 1x36,2x18,3x12,4x9,6x6"), "1,2,3,4,6,9,12,18,36"),
            new WorkedExample("Is 48 divisible by 6?", Arrays.asList("48/6=8 exactly, yes"), "Yes"),
            new WorkedExample("GCF of 24 and 36?", Arrays.asList("24: 1,2,3,4,6,8,12,24", "36: 1,2,3,4,6,9,12,18,36", "Largest common: 12"), "12"),
            new WorkedExample("Is 7 a factor of 56?", Arrays.asList("56/7=8, yes"), "Yes"),
            new WorkedExample("Find all factor pairs of 20", Arrays.asList("1x20, 2x10, 4x5"), "(1,20), (2,10), (4,5)")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-99", "Pythagorean Theorem", "99", "Pythagorean Theorem", "Section 10: Lessons 91-100", 99,
            Arrays.asList(new Section("Worked Examples", "Pythagorean Theorem",
                Arrays.asList(
            new WorkedExample("Legs 3 and 4. Hypotenuse?", Arrays.asList("3^2+4^2=9+16=25", "sqrt(25)=5"), "5"),
            new WorkedExample("Legs 5 and 12. Hypotenuse?", Arrays.asList("25+144=169, sqrt=13"), "13"),
            new WorkedExample("Hyp=13, leg=5. Other leg?", Arrays.asList("169-25=144, sqrt=12"), "12"),
            new WorkedExample("Is 8,15,17 a right triangle?", Arrays.asList("64+225=289, 17^2=289, Yes!"), "Yes"),
            new WorkedExample("Ladder 10ft, base 6ft. Height?", Arrays.asList("100-36=64, sqrt=8"), "8 ft")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-100", "Estimating Square Roots, Irrational Numbers", "100", "Estimating Square Roots, Irrational Numbers", "Section 10: Lessons 91-100", 100,
            Arrays.asList(new Section("Worked Examples", "Estimating Square Roots, Irrational Numbers",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 4/7=x/21", Arrays.asList("Cross: 4x21=7x, 84=7x, x=12"), "x=12"),
            new WorkedExample("Unit rate: $6.50 for 5 lb", Arrays.asList("6.50/5=$1.30"), "$1.30 per pound"),
            new WorkedExample("Scale 1cm=50km. 6cm=?", Arrays.asList("6x50=300"), "300 km"),
            new WorkedExample("3:5 ratio. Total 48. Larger?", Arrays.asList("48x5/8=30"), "30")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-101", "Translating Expressions into Equations", "101", "Translating Expressions into Equations", "Section 11: Lessons 101-110", 101,
            Arrays.asList(new Section("Worked Examples", "Translating Expressions into Equations",
                Arrays.asList(
            new WorkedExample("Solve: 2x+5=17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6"), "x=6"),
            new WorkedExample("Solve: x/4-3=5", Arrays.asList("Add 3: x/4=8", "Multiply by 4: x=32"), "x=32"),
            new WorkedExample("Solve: 3(x-2)=15", Arrays.asList("Divide by 3: x-2=5", "Add 2: x=7"), "x=7"),
            new WorkedExample("Solve: 5x+3=2x+18", Arrays.asList("3x=15, x=5"), "x=5"),
            new WorkedExample("Solve: n/3+7=12", Arrays.asList("n/3=5, n=15"), "n=15")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-102", "Transversals, Simplifying Equations", "102", "Transversals, Simplifying Equations", "Section 11: Lessons 101-110", 102,
            Arrays.asList(new Section("Worked Examples", "Transversals, Simplifying Equations",
                Arrays.asList(
            new WorkedExample("Solve: 2x+5=17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6"), "x=6"),
            new WorkedExample("Solve: x/4-3=5", Arrays.asList("Add 3: x/4=8", "Multiply by 4: x=32"), "x=32"),
            new WorkedExample("Solve: 3(x-2)=15", Arrays.asList("Divide by 3: x-2=5", "Add 2: x=7"), "x=7"),
            new WorkedExample("Solve: 5x+3=2x+18", Arrays.asList("3x=15, x=5"), "x=5"),
            new WorkedExample("Solve: n/3+7=12", Arrays.asList("n/3=5, n=15"), "n=15")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-103", "Powers of Negative Numbers, Dividing Terms", "103", "Powers of Negative Numbers, Dividing Terms", "Section 11: Lessons 101-110", 103,
            Arrays.asList(new Section("Worked Examples", "Powers of Negative Numbers, Dividing Terms",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-104", "Semicircles, Arcs, and Sectors", "104", "Semicircles, Arcs, and Sectors", "Section 11: Lessons 101-110", 104,
            Arrays.asList(new Section("Worked Examples", "Semicircles, Arcs, and Sectors",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-105", "Surface Area of a Right Solid and Sphere, More on Roots", "105", "Surface Area of a Right Solid and Sphere, More on Roots", "Section 11: Lessons 101-110", 105,
            Arrays.asList(new Section("Worked Examples", "Surface Area of a Right Solid and Sphere, More on Roots",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-106", "Solving Literal Equations, Transforming Formulas", "106", "Solving Literal Equations, Transforming Formulas", "Section 11: Lessons 101-110", 106,
            Arrays.asList(new Section("Worked Examples", "Solving Literal Equations, Transforming Formulas",
                Arrays.asList(
            new WorkedExample("Solve: 2x+5=17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6"), "x=6"),
            new WorkedExample("Solve: x/4-3=5", Arrays.asList("Add 3: x/4=8", "Multiply by 4: x=32"), "x=32"),
            new WorkedExample("Solve: 3(x-2)=15", Arrays.asList("Divide by 3: x-2=5", "Add 2: x=7"), "x=7"),
            new WorkedExample("Solve: 5x+3=2x+18", Arrays.asList("3x=15, x=5"), "x=5"),
            new WorkedExample("Solve: n/3+7=12", Arrays.asList("n/3=5, n=15"), "n=15")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-107", "Slope", "107", "Slope", "Section 11: Lessons 101-110", 107,
            Arrays.asList(new Section("Worked Examples", "Slope",
                Arrays.asList(
            new WorkedExample("Slope between (1,3) and (4,9)", Arrays.asList("(9-3)/(4-1)=6/3"), "2"),
            new WorkedExample("Slope of y=3x-5?", Arrays.asList("Coefficient of x"), "3"),
            new WorkedExample("Slope between (-2,4) and (3,-1)", Arrays.asList("(-1-4)/(3-(-2))=-5/5"), "−1"),
            new WorkedExample("Slope of horizontal line?", Arrays.asList("No rise"), "0"),
            new WorkedExample("Slope of vertical line?", Arrays.asList("No run"), "Undefined")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-108", "Formulas and Substitution", "108", "Formulas and Substitution", "Section 11: Lessons 101-110", 108,
            Arrays.asList(new Section("Worked Examples", "Formulas and Substitution",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-109", "Equations with Exponents", "109", "Equations with Exponents", "Section 11: Lessons 101-110", 109,
            Arrays.asList(new Section("Worked Examples", "Equations with Exponents",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-110", "Simple Interest and Compound Interest, Successive Discounts", "110", "Simple Interest and Compound Interest, Successive Discounts", "Section 11: Lessons 101-110", 110,
            Arrays.asList(new Section("Worked Examples", "Simple Interest and Compound Interest, Successive Discounts",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-111", "Dividing in Scientific Notation", "111", "Dividing in Scientific Notation", "Section 12: Lessons 111-120", 111,
            Arrays.asList(new Section("Worked Examples", "Dividing in Scientific Notation",
                Arrays.asList(
            new WorkedExample("Evaluate: 3^4", Arrays.asList("3x3x3x3=81"), "81"),
            new WorkedExample("Write 4,500,000 in scientific notation", Arrays.asList("4.5 x 10^6"), "4.5 x 10^6"),
            new WorkedExample("Evaluate: 10^(-3)", Arrays.asList("1/10^3=1/1000"), "0.001"),
            new WorkedExample("Simplify: x^3 * x^4", Arrays.asList("Add exponents: x^7"), "x^7"),
            new WorkedExample("Find: 2^5", Arrays.asList("2x2x2x2x2=32"), "32")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-112", "Applications of the Pythagorean Theorem", "112", "Applications of the Pythagorean Theorem", "Section 12: Lessons 111-120", 112,
            Arrays.asList(new Section("Worked Examples", "Applications of the Pythagorean Theorem",
                Arrays.asList(
            new WorkedExample("Legs 3 and 4. Hypotenuse?", Arrays.asList("3^2+4^2=9+16=25", "sqrt(25)=5"), "5"),
            new WorkedExample("Legs 5 and 12. Hypotenuse?", Arrays.asList("25+144=169, sqrt=13"), "13"),
            new WorkedExample("Hyp=13, leg=5. Other leg?", Arrays.asList("169-25=144, sqrt=12"), "12"),
            new WorkedExample("Is 8,15,17 a right triangle?", Arrays.asList("64+225=289, 17^2=289, Yes!"), "Yes"),
            new WorkedExample("Ladder 10ft, base 6ft. Height?", Arrays.asList("100-36=64, sqrt=8"), "8 ft")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-113", "Volume of Pyramids, Cones, and Spheres", "113", "Volume of Pyramids, Cones, and Spheres", "Section 12: Lessons 111-120", 113,
            Arrays.asList(new Section("Worked Examples", "Volume of Pyramids, Cones, and Spheres",
                Arrays.asList(
            new WorkedExample("Volume box 8x5x4", Arrays.asList("V=lwh=8x5x4"), "160 cubic units"),
            new WorkedExample("Volume cube edge 6", Arrays.asList("V=6x6x6"), "216 cubic units"),
            new WorkedExample("Volume cylinder r=3 h=10 (pi=3.14)", Arrays.asList("V=3.14x9x10"), "282.6 cubic units"),
            new WorkedExample("Volume pyramid base 36 h=10", Arrays.asList("V=(1/3)(36)(10)"), "120 cubic units"),
            new WorkedExample("Volume cone r=4 h=9 (pi=3.14)", Arrays.asList("V=(1/3)(3.14)(16)(9)"), "150.72 cubic units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-114", "Volume, Capacity, and Mass in the Metric System", "114", "Volume, Capacity, and Mass in the Metric System", "Section 12: Lessons 111-120", 114,
            Arrays.asList(new Section("Worked Examples", "Volume, Capacity, and Mass in the Metric System",
                Arrays.asList(
            new WorkedExample("Volume box 8x5x4", Arrays.asList("V=lwh=8x5x4"), "160 cubic units"),
            new WorkedExample("Volume cube edge 6", Arrays.asList("V=6x6x6"), "216 cubic units"),
            new WorkedExample("Volume cylinder r=3 h=10 (pi=3.14)", Arrays.asList("V=3.14x9x10"), "282.6 cubic units"),
            new WorkedExample("Volume pyramid base 36 h=10", Arrays.asList("V=(1/3)(36)(10)"), "120 cubic units"),
            new WorkedExample("Volume cone r=4 h=9 (pi=3.14)", Arrays.asList("V=(1/3)(3.14)(16)(9)"), "150.72 cubic units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-115", "Factoring Algebraic Expressions", "115", "Factoring Algebraic Expressions", "Section 12: Lessons 111-120", 115,
            Arrays.asList(new Section("Worked Examples", "Factoring Algebraic Expressions",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-116", "Slope-Intercept Form of Linear Equations", "116", "Slope-Intercept Form of Linear Equations", "Section 12: Lessons 111-120", 116,
            Arrays.asList(new Section("Worked Examples", "Slope-Intercept Form of Linear Equations",
                Arrays.asList(
            new WorkedExample("Solve: 2x+5=17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6"), "x=6"),
            new WorkedExample("Solve: x/4-3=5", Arrays.asList("Add 3: x/4=8", "Multiply by 4: x=32"), "x=32"),
            new WorkedExample("Solve: 3(x-2)=15", Arrays.asList("Divide by 3: x-2=5", "Add 2: x=7"), "x=7"),
            new WorkedExample("Solve: 5x+3=2x+18", Arrays.asList("3x=15, x=5"), "x=5"),
            new WorkedExample("Solve: n/3+7=12", Arrays.asList("n/3=5, n=15"), "n=15")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-117", "Copying Angles and Triangles", "117", "Copying Angles and Triangles", "Section 12: Lessons 111-120", 117,
            Arrays.asList(new Section("Worked Examples", "Copying Angles and Triangles",
                Arrays.asList(
            new WorkedExample("Angles of triangle sum to?", Arrays.asList("Always 180"), "180 degrees"),
            new WorkedExample("Interior angle sum of pentagon?", Arrays.asList("(5-2)x180=540"), "540 degrees"),
            new WorkedExample("Triangle: 55,65,?", Arrays.asList("180-55-65=60"), "60 degrees"),
            new WorkedExample("Classify: all sides equal", Arrays.asList("Equilateral"), "Equilateral triangle"),
            new WorkedExample("Name shape: 4 sides, all angles 90, all sides equal", Arrays.asList("Square"), "Square")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-118", "Division by Zero", "118", "Division by Zero", "Section 12: Lessons 111-120", 118,
            Arrays.asList(new Section("Worked Examples", "Division by Zero",
                Arrays.asList(
            new WorkedExample("Solve: x+8=15", Arrays.asList("Subtract 8: x=7"), "x=7"),
            new WorkedExample("Find: 3/4 of 20", Arrays.asList("20x3/4=15"), "15"),
            new WorkedExample("Evaluate: 5^2-3^2", Arrays.asList("25-9=16"), "16"),
            new WorkedExample("Perimeter square side 9", Arrays.asList("4x9=36"), "36"),
            new WorkedExample("Find 10% of 250", Arrays.asList("250/10=25"), "25")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-119", "Graphing Area and Volume Formulas", "119", "Graphing Area and Volume Formulas", "Section 12: Lessons 111-120", 119,
            Arrays.asList(new Section("Worked Examples", "Graphing Area and Volume Formulas",
                Arrays.asList(
            new WorkedExample("Area rectangle 15x8", Arrays.asList("A=length x width", "15x8=120"), "120 sq units"),
            new WorkedExample("Area triangle base 12 height 9", Arrays.asList("A=(1/2)bh=(1/2)(12)(9)"), "54 sq units"),
            new WorkedExample("Area circle r=7 (pi=22/7)", Arrays.asList("A=pi*r^2=22/7*49"), "154 sq units"),
            new WorkedExample("Area parallelogram b=11 h=6", Arrays.asList("A=bxh=11x6"), "66 sq units"),
            new WorkedExample("Area trapezoid bases 8,14 h=5", Arrays.asList("A=(8+14)/2 x 5=55"), "55 sq units")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-120", "Graphing Nonlinear Equations", "120", "Graphing Nonlinear Equations", "Section 12: Lessons 111-120", 120,
            Arrays.asList(new Section("Worked Examples", "Graphing Nonlinear Equations",
                Arrays.asList(
            new WorkedExample("Solve: 2x+5=17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6"), "x=6"),
            new WorkedExample("Solve: x/4-3=5", Arrays.asList("Add 3: x/4=8", "Multiply by 4: x=32"), "x=32"),
            new WorkedExample("Solve: 3(x-2)=15", Arrays.asList("Divide by 3: x-2=5", "Add 2: x=7"), "x=7"),
            new WorkedExample("Solve: 5x+3=2x+18", Arrays.asList("3x=15, x=5"), "x=5"),
            new WorkedExample("Solve: n/3+7=12", Arrays.asList("n/3=5, n=15"), "n=15")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
    }
}