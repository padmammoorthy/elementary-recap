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
        lessons.add(new LessonContent("number-sense-and-sequences", "Number Sense and Sequences", "1", "Identify patterns in sequences and use number sense.", "Section 1: Lessons 1-10", 1,
            Arrays.asList(new Section("Worked Examples", "Identify patterns in sequences and use number sense.",
                Arrays.asList(
            new WorkedExample("Find the next three numbers: 3, 6, 9, 12, __, __, __", Arrays.asList("Pattern: adding 3 each time", "12 + 3 = 15", "15 + 3 = 18", "18 + 3 = 21"), "15, 18, 21"),
            new WorkedExample("Find the pattern: 2, 4, 8, 16, __, __", Arrays.asList("Each number is doubled (multiplied by 2)", "16 x 2 = 32", "32 x 2 = 64"), "32, 64"),
            new WorkedExample("What is the rule? 50, 45, 40, 35, ...", Arrays.asList("Each number decreases", "50-45=5, 45-40=5", "Rule: subtract 5"), "Subtract 5"),
            new WorkedExample("Find the 10th term: 5, 10, 15, 20, ...", Arrays.asList("Rule: multiply position by 5", "10th term = 10 x 5"), "50"),
            new WorkedExample("What are the next 2 terms: 1, 1, 2, 3, 5, 8, ...", Arrays.asList("Each number = sum of previous two", "5 + 8 = 13", "8 + 13 = 21"), "13, 21")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("addition-and-subtraction-facts", "Addition and Subtraction Facts", "2", "Review basic addition and subtraction facts.", "Section 1: Lessons 1-10", 2,
            Arrays.asList(new Section("Worked Examples", "Review basic addition and subtraction facts.",
                Arrays.asList(
            new WorkedExample("Find: 8 + 7", Arrays.asList("Make a ten: 8 + 2 = 10", "Remaining: 7 - 2 = 5", "10 + 5 = 15"), "15"),
            new WorkedExample("Find: 15 - 8", Arrays.asList("Think: 8 + ? = 15", "8 + 7 = 15", "So 15 - 8 = 7"), "7"),
            new WorkedExample("Find the missing number: ? + 9 = 16", Arrays.asList("Subtract 9 from both sides", "16 - 9 = 7"), "7"),
            new WorkedExample("Find: 13 - 6 + 4", Arrays.asList("Work left to right: 13 - 6 = 7", "Then: 7 + 4 = 11"), "11"),
            new WorkedExample("Which fact family includes 7, 8, 15?", Arrays.asList("7 + 8 = 15", "8 + 7 = 15", "15 - 7 = 8", "15 - 8 = 7"), "7+8=15, 8+7=15, 15-7=8, 15-8=7")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("place-value-through-millions", "Place Value Through Millions", "3", "Read and write numbers through millions.", "Section 1: Lessons 1-10", 3,
            Arrays.asList(new Section("Worked Examples", "Read and write numbers through millions.",
                Arrays.asList(
            new WorkedExample("Write in expanded form: 4,567,230", Arrays.asList("4,000,000 + 500,000 + 60,000 + 7,000 + 200 + 30"), "4,000,000 + 500,000 + 60,000 + 7,000 + 200 + 30"),
            new WorkedExample("What is the value of the 8 in 3,845,921?", Arrays.asList("8 is in the hundred-thousands place", "Value: 800,000"), "800,000"),
            new WorkedExample("Write in standard form: six million, forty thousand, three hundred", Arrays.asList("6 million = 6,000,000", "40 thousand = 40,000", "300 = 300", "Total: 6,040,300"), "6,040,300"),
            new WorkedExample("How many thousands are in 45,000?", Arrays.asList("Divide by 1,000", "45,000 / 1,000 = 45"), "45"),
            new WorkedExample("What number is 10,000 more than 456,789?", Arrays.asList("Add 10,000 to the ten-thousands place", "456,789 + 10,000 = 466,789"), "466,789")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-and-ordering-whole-numbers", "Comparing and Ordering Whole Numbers", "4", "Use inequality symbols to compare numbers.", "Section 1: Lessons 1-10", 4,
            Arrays.asList(new Section("Worked Examples", "Use inequality symbols to compare numbers.",
                Arrays.asList(
            new WorkedExample("Compare using < , > , or = : 45,678 ___ 45,768", Arrays.asList("Same ten-thousands (4) and thousands (5)", "Hundreds: 6 < 7"), "45,678 < 45,768"),
            new WorkedExample("Order from least to greatest: 8,204; 8,240; 8,024", Arrays.asList("Compare thousands: all 8", "Compare hundreds: 0 < 2 = 2", "8,024, then compare 8,204 and 8,240: 0 < 4"), "8,024; 8,204; 8,240"),
            new WorkedExample("Which number is between 3,450 and 3,540?", Arrays.asList("Must be > 3,450 AND < 3,540", "3,499 works: 3,450 < 3,499 < 3,540"), "3,499 (answers may vary)"),
            new WorkedExample("Write the largest number using digits 5, 0, 3, 8, 1", Arrays.asList("Arrange digits from largest to smallest", "8, 5, 3, 1, 0"), "85,310"),
            new WorkedExample("Write the smallest 5-digit number using 7, 2, 0, 4, 9", Arrays.asList("Smallest first (but can't start with 0)", "2, 0, 4, 7, 9"), "20,479")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("rounding-whole-numbers", "Rounding Whole Numbers", "5", "Round numbers to any place value.", "Section 1: Lessons 1-10", 5,
            Arrays.asList(new Section("Worked Examples", "Round numbers to any place value.",
                Arrays.asList(
            new WorkedExample("Round 4,567 to the nearest hundred", Arrays.asList("Look at tens digit: 6", "6 >= 5, so round up", "4,567 rounds to 4,600"), "4,600"),
            new WorkedExample("Round 83,450 to the nearest thousand", Arrays.asList("Look at hundreds: 4", "4 < 5, round down", "83,450 rounds to 83,000"), "83,000"),
            new WorkedExample("Estimate 4,782 + 3,156 by rounding to thousands", Arrays.asList("4,782 rounds to 5,000", "3,156 rounds to 3,000", "5,000 + 3,000 = 8,000"), "About 8,000"),
            new WorkedExample("Round 749,500 to the nearest hundred-thousand", Arrays.asList("Look at ten-thousands: 4", "4 < 5, round down"), "700,000"),
            new WorkedExample("Is 6,500 closer to 6,000 or 7,000?", Arrays.asList("Distance to 6,000: 500", "Distance to 7,000: 500", "Exactly halfway (convention: round up)"), "Equally close (rounds to 7,000)")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-whole-numbers", "Adding Whole Numbers", "6", "Add multi-digit numbers with regrouping.", "Section 1: Lessons 1-10", 6,
            Arrays.asList(new Section("Worked Examples", "Add multi-digit numbers with regrouping.",
                Arrays.asList(
            new WorkedExample("Add: 4,567 + 2,845", Arrays.asList("7+5=12, write 2 carry 1", "6+4+1=11, write 1 carry 1", "5+8+1=14, write 4 carry 1", "4+2+1=7"), "7,412"),
            new WorkedExample("Add: 36,478 + 45,639", Arrays.asList("8+9=17, carry 1", "7+3+1=11, carry 1", "4+6+1=11, carry 1", "6+5+1=12, carry 1", "3+4+1=8"), "82,117"),
            new WorkedExample("Add: 9,999 + 8,888", Arrays.asList("9+8=17, carry", "9+8+1=18, carry", "9+8+1=18, carry", "9+8+1=18"), "18,887"),
            new WorkedExample("Add three numbers: 2,345 + 4,567 + 1,234", Arrays.asList("Add first two: 2,345 + 4,567 = 6,912", "Then add third: 6,912 + 1,234 = 8,146"), "8,146"),
            new WorkedExample("Add: 56,789 + 43,211", Arrays.asList("9+1=10, carry", "8+1+1=10, carry", "7+2+1=10, carry", "6+3+1=10, carry", "5+4+1=10"), "100,000")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtracting-whole-numbers", "Subtracting Whole Numbers", "7", "Subtract multi-digit numbers with borrowing.", "Section 1: Lessons 1-10", 7,
            Arrays.asList(new Section("Worked Examples", "Subtract multi-digit numbers with borrowing.",
                Arrays.asList(
            new WorkedExample("Subtract: 8,003 - 4,567", Arrays.asList("Borrow from thousands through zeros", "13-7=6, 9-6=3, 9-5=4, 7-4=3"), "3,436"),
            new WorkedExample("Subtract: 50,000 - 23,456", Arrays.asList("Borrow through all zeros", "10-6=4, 9-5=4, 9-4=5, 9-3=6, 4-2=2"), "26,544"),
            new WorkedExample("Subtract: 100,000 - 1", Arrays.asList("Borrow through each zero", "All 9s with final 9"), "99,999"),
            new WorkedExample("Find: 45,000 - 18,765", Arrays.asList("Borrow carefully", "10-5=5, 9-6=3, 9-7=2, 4-8 borrow: 14-8=6, 3-1=2"), "26,235"),
            new WorkedExample("Subtract and check: 7,200 - 3,845", Arrays.asList("7200-3845: borrow multiple times", "Check: 3,355 + 3,845 = 7,200"), "3,355")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplication-facts", "Multiplication Facts", "8", "Review multiplication facts through 12.", "Section 1: Lessons 1-10", 8,
            Arrays.asList(new Section("Worked Examples", "Review multiplication facts through 12.",
                Arrays.asList(
            new WorkedExample("Find: 7 x 8", Arrays.asList("Think: 7 groups of 8", "Or: 7x8 = 56 (memorize)"), "56"),
            new WorkedExample("Find: 9 x 12", Arrays.asList("9 x 12 = 9 x 10 + 9 x 2", "= 90 + 18 = 108"), "108"),
            new WorkedExample("What two numbers multiply to 72 and add to 17?", Arrays.asList("Factor pairs of 72: 1x72, 2x36, 3x24, 4x18, 6x12, 8x9", "8 + 9 = 17"), "8 and 9"),
            new WorkedExample("Find the missing factor: ? x 6 = 78", Arrays.asList("Divide: 78 / 6 = 13"), "13"),
            new WorkedExample("Find: 11 x 11", Arrays.asList("11 x 11 = 121", "Pattern: 11^2 = 121"), "121")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("properties-of-addition-and-multiplicatio", "Properties of Addition and Multiplication", "9", "Apply commutative, associative, and identity properties.", "Section 1: Lessons 1-10", 9,
            Arrays.asList(new Section("Worked Examples", "Apply commutative, associative, and identity properties.",
                Arrays.asList(
            new WorkedExample("Show the commutative property: 4 x 7 = ? x ?", Arrays.asList("Commutative: order doesn't matter", "4 x 7 = 7 x 4 = 28"), "7 x 4 = 28"),
            new WorkedExample("Show associative property: (3 x 4) x 5 = 3 x (? x ?)", Arrays.asList("Grouping doesn't matter", "(3x4)x5 = 12x5 = 60", "3x(4x5) = 3x20 = 60"), "3 x (4 x 5) = 60"),
            new WorkedExample("What is the identity element for multiplication?", Arrays.asList("Any number x 1 = that number", "Example: 45 x 1 = 45"), "1"),
            new WorkedExample("Use the distributive property: 6 x 43", Arrays.asList("6 x 43 = 6 x (40 + 3)", "= 6x40 + 6x3", "= 240 + 18 = 258"), "258"),
            new WorkedExample("What is 0 x 5,000?", Arrays.asList("Zero property: anything times 0 = 0"), "0")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-about-combining", "Word Problems About Combining", "10", "Solve one-step word problems.", "Section 1: Lessons 1-10", 10,
            Arrays.asList(new Section("Worked Examples", "Solve one-step word problems.",
                Arrays.asList(
            new WorkedExample("Sam had 45 cards. He got 28 more. Then gave 15 away. How many now?", Arrays.asList("Start: 45", "Got more: 45 + 28 = 73", "Gave away: 73 - 15 = 58"), "58 cards"),
            new WorkedExample("A store had 1,200 books. Sold 456, received 234 new ones. How many?", Arrays.asList("1,200 - 456 = 744", "744 + 234 = 978"), "978 books"),
            new WorkedExample("Two towns: population 34,567 and 28,943. Difference?", Arrays.asList("34,567 - 28,943", "= 5,624"), "5,624 people"),
            new WorkedExample("Joe saved $125/month for 6 months. Total saved?", Arrays.asList("This is addition (or multiplication)", "$125 x 6 = $750"), "$750"),
            new WorkedExample("Bus A: 48 riders. Bus B: 53 riders. Bus C: 37 riders. Total?", Arrays.asList("48 + 53 + 37", "= 138"), "138 riders")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("division-facts", "Division Facts", "11", "Review division facts and relate to multiplication.", "Section 2: Lessons 11-20", 11,
            Arrays.asList(new Section("Worked Examples", "Review division facts and relate to multiplication.",
                Arrays.asList(
            new WorkedExample("72 / 9 = ?", Arrays.asList("Think: 9 x ? = 72", "9 x 8 = 72"), "8"),
            new WorkedExample("Find: 108 / 12", Arrays.asList("12 x 9 = 108"), "9"),
            new WorkedExample("What is 0 / 5?", Arrays.asList("0 divided by anything = 0"), "0"),
            new WorkedExample("Find: 144 / 12", Arrays.asList("12 x 12 = 144"), "12"),
            new WorkedExample("Why can't we divide by 0?", Arrays.asList("Division by zero is undefined", "No number times 0 gives another number"), "Undefined")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lines-segments-and-rays", "Lines, Segments, and Rays", "12", "Identify and classify lines, segments, and rays.", "Section 2: Lessons 11-20", 12,
            Arrays.asList(new Section("Worked Examples", "Identify and classify lines, segments, and rays.",
                Arrays.asList(
            new WorkedExample("Name this: <------>", Arrays.asList("Has two endpoints", "Goes both directions"), "Line (if arrows both ends) or segment (if dots both ends)"),
            new WorkedExample("Draw a ray starting at point A", Arrays.asList("One endpoint (A), extends one direction forever"), "Ray AB"),
            new WorkedExample("Are these lines parallel or intersecting?", Arrays.asList("Lines going same direction never meet = parallel", "Lines that cross = intersecting"), "Depends on the figure"),
            new WorkedExample("Name two perpendicular objects in a classroom", Arrays.asList("Wall meets floor at 90 degrees", "Corner of a book"), "Wall and floor (examples vary)"),
            new WorkedExample("How many line segments in a triangle?", Arrays.asList("Triangle has 3 sides", "Each side is a segment"), "3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("angles", "Angles", "13", "Classify and measure angles.", "Section 2: Lessons 11-20", 13,
            Arrays.asList(new Section("Worked Examples", "Classify and measure angles.",
                Arrays.asList(
            new WorkedExample("Classify this angle: 75 degrees", Arrays.asList("Less than 90 degrees", "Acute angles are between 0 and 90"), "Acute"),
            new WorkedExample("What is the measure of a right angle?", Arrays.asList("A right angle forms an L shape", "Exactly 90 degrees"), "90 degrees"),
            new WorkedExample("An angle measures 135 degrees. Classify it.", Arrays.asList("Greater than 90 but less than 180", "This is an obtuse angle"), "Obtuse"),
            new WorkedExample("Two angles add to 90. One is 35. Find other.", Arrays.asList("Complementary angles sum to 90", "90 - 35 = 55"), "55 degrees"),
            new WorkedExample("A straight angle measures:", Arrays.asList("A straight line = 180 degrees"), "180 degrees")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multi-digit-multiplication", "Multi-Digit Multiplication", "14", "Multiply by a single digit with regrouping.", "Section 2: Lessons 11-20", 14,
            Arrays.asList(new Section("Worked Examples", "Multiply by a single digit with regrouping.",
                Arrays.asList(
            new WorkedExample("Multiply: 345 x 7", Arrays.asList("7 x 5 = 35, write 5 carry 3", "7 x 4 = 28, +3 = 31, write 1 carry 3", "7 x 3 = 21, +3 = 24"), "2,415"),
            new WorkedExample("Find: 608 x 9", Arrays.asList("9x8=72, carry 7", "9x0=0, +7=7", "9x6=54"), "5,472"),
            new WorkedExample("Calculate: 1,234 x 5", Arrays.asList("5x4=20, carry 2", "5x3=15, +2=17, carry 1", "5x2=10, +1=11, carry 1", "5x1=5, +1=6"), "6,170"),
            new WorkedExample("Find: 999 x 8", Arrays.asList("Use: 1000x8 - 1x8", "= 8,000 - 8"), "7,992"),
            new WorkedExample("Multiply: 456 x 3", Arrays.asList("3x6=18, carry 1", "3x5=15, +1=16, carry 1", "3x4=12, +1=13"), "1,368")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("division-with-remainders", "Division with Remainders", "15", "Divide with remainders and interpret them.", "Section 2: Lessons 11-20", 15,
            Arrays.asList(new Section("Worked Examples", "Divide with remainders and interpret them.",
                Arrays.asList(
            new WorkedExample("Divide 47 by 6", Arrays.asList("6 x 7 = 42", "47 - 42 = 5 remainder"), "7 remainder 5"),
            new WorkedExample("Divide 100 by 7", Arrays.asList("7 x 14 = 98", "100 - 98 = 2"), "14 R 2"),
            new WorkedExample("83 / 9 = ?", Arrays.asList("9 x 9 = 81", "83 - 81 = 2"), "9 R 2"),
            new WorkedExample("Interpret: 23 children, 4 per car. Cars needed?", Arrays.asList("23 / 4 = 5 R 3", "Need extra car for remaining 3"), "6 cars (round up)"),
            new WorkedExample("Find: 50 / 8", Arrays.asList("8 x 6 = 48", "50 - 48 = 2"), "6 R 2")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("even-and-odd-numbers", "Even and Odd Numbers", "16", "Identify even and odd numbers and their properties.", "Section 2: Lessons 11-20", 16,
            Arrays.asList(new Section("Worked Examples", "Identify even and odd numbers and their properties.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("factors", "Factors", "17", "Find all factor pairs of a number.", "Section 2: Lessons 11-20", 17,
            Arrays.asList(new Section("Worked Examples", "Find all factor pairs of a number.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-equal-groups", "Word Problems: Equal Groups", "18", "Solve multiplication and division word problems.", "Section 2: Lessons 11-20", 18,
            Arrays.asList(new Section("Worked Examples", "Solve multiplication and division word problems.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fractions-parts-of-a-whole", "Fractions: Parts of a Whole", "19", "Represent and identify fractions.", "Section 2: Lessons 11-20", 19,
            Arrays.asList(new Section("Worked Examples", "Represent and identify fractions.",
                Arrays.asList(
            new WorkedExample("What fraction is shaded: 3 of 8 parts?", Arrays.asList("Numerator (top) = shaded parts = 3", "Denominator (bottom) = total parts = 8"), "3/8"),
            new WorkedExample("A pizza has 6 slices. You ate 2. Fraction eaten?", Arrays.asList("Eaten: 2", "Total: 6", "Fraction: 2/6 = 1/3"), "2/6 or 1/3"),
            new WorkedExample("Name the numerator and denominator of 5/9", Arrays.asList("Numerator (top): 5", "Denominator (bottom): 9"), "Numerator=5, Denominator=9"),
            new WorkedExample("What fraction of an hour is 15 minutes?", Arrays.asList("15 minutes out of 60 minutes", "15/60 = 1/4"), "1/4"),
            new WorkedExample("Draw a fraction equal to 1/2", Arrays.asList("Shade 2 of 4 parts, or 3 of 6 parts", "All equal half the whole"), "2/4, 3/6, 4/8, etc.")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fractions-parts-of-a-set", "Fractions: Parts of a Set", "20", "Find a fraction of a group of objects.", "Section 2: Lessons 11-20", 20,
            Arrays.asList(new Section("Worked Examples", "Find a fraction of a group of objects.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fractions-on-a-number-line", "Fractions on a Number Line", "21", "Locate fractions on a number line.", "Section 3: Lessons 21-30", 21,
            Arrays.asList(new Section("Worked Examples", "Locate fractions on a number line.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("equivalent-fractions", "Equivalent Fractions", "22", "Generate equivalent fractions.", "Section 3: Lessons 21-30", 22,
            Arrays.asList(new Section("Worked Examples", "Generate equivalent fractions.",
                Arrays.asList(
            new WorkedExample("Find fraction equivalent to 3/4 with denominator 12", Arrays.asList("4 x 3 = 12", "So multiply numerator too: 3 x 3 = 9"), "9/12"),
            new WorkedExample("Simplify 8/12", Arrays.asList("GCF of 8 and 12 = 4", "8/4 = 2, 12/4 = 3"), "2/3"),
            new WorkedExample("Are 2/5 and 6/15 equivalent?", Arrays.asList("2/5: multiply by 3/3 = 6/15", "Yes, they are equal"), "Yes"),
            new WorkedExample("Find: 5/6 = ?/18", Arrays.asList("6 x 3 = 18", "5 x 3 = 15"), "15/18"),
            new WorkedExample("Simplify 24/36", Arrays.asList("GCF = 12", "24/12 = 2, 36/12 = 3"), "2/3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("reducing-fractions", "Reducing Fractions", "23", "Simplify fractions to lowest terms.", "Section 3: Lessons 21-30", 23,
            Arrays.asList(new Section("Worked Examples", "Simplify fractions to lowest terms.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-fractions", "Comparing Fractions", "24", "Compare fractions with unlike denominators.", "Section 3: Lessons 21-30", 24,
            Arrays.asList(new Section("Worked Examples", "Compare fractions with unlike denominators.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("mixed-numbers-and-improper-fractions", "Mixed Numbers and Improper Fractions", "25", "Convert between mixed numbers and improper fractions.", "Section 3: Lessons 21-30", 25,
            Arrays.asList(new Section("Worked Examples", "Convert between mixed numbers and improper fractions.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("elapsed-time", "Elapsed Time", "26", "Calculate elapsed time between events.", "Section 3: Lessons 21-30", 26,
            Arrays.asList(new Section("Worked Examples", "Calculate elapsed time between events.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-by-10-100-1000", "Multiplying by 10, 100, 1000", "27", "Use patterns to multiply by powers of 10.", "Section 3: Lessons 21-30", 27,
            Arrays.asList(new Section("Worked Examples", "Use patterns to multiply by powers of 10.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("two-digit-multiplication", "Two-Digit Multiplication", "28", "Multiply two 2-digit numbers.", "Section 3: Lessons 21-30", 28,
            Arrays.asList(new Section("Worked Examples", "Multiply two 2-digit numbers.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("area-of-rectangles", "Area of Rectangles", "29", "Calculate area using length times width.", "Section 3: Lessons 21-30", 29,
            Arrays.asList(new Section("Worked Examples", "Calculate area using length times width.",
                Arrays.asList(
            new WorkedExample("Find the area of a rectangle: length 12, width 8", Arrays.asList("Area = length x width", "A = 12 x 8"), "96 square units"),
            new WorkedExample("A room is 15 ft by 10 ft. Area?", Arrays.asList("A = 15 x 10 = 150 sq ft"), "150 square feet"),
            new WorkedExample("A square has side 9 cm. Area?", Arrays.asList("A = side x side = 9 x 9"), "81 sq cm"),
            new WorkedExample("Find area: rectangle 25 by 4", Arrays.asList("A = 25 x 4 = 100"), "100 square units"),
            new WorkedExample("Which has more area: 8x6 or 7x7?", Arrays.asList("8x6 = 48", "7x7 = 49", "49 > 48"), "7x7 rectangle (49 > 48)")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparison-word-problems", "Comparison Word Problems", "30", "Solve comparison word problems.", "Section 3: Lessons 21-30", 30,
            Arrays.asList(new Section("Worked Examples", "Solve comparison word problems.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("long-division", "Long Division", "31", "Divide multi-digit numbers by one digit.", "Section 4: Lessons 31-40", 31,
            Arrays.asList(new Section("Worked Examples", "Divide multi-digit numbers by one digit.",
                Arrays.asList(
            new WorkedExample("Divide: 456 / 3", Arrays.asList("3 into 4 = 1 R1", "3 into 15 = 5", "3 into 6 = 2"), "152"),
            new WorkedExample("Divide: 2,856 / 7", Arrays.asList("7 into 28 = 4", "7 into 5 = 0 R5", "7 into 56 = 8"), "408"),
            new WorkedExample("Divide: 1,344 / 6", Arrays.asList("6 into 13 = 2 R1", "6 into 14 = 2 R2", "6 into 24 = 4"), "224"),
            new WorkedExample("Divide: 9,261 / 3", Arrays.asList("3 into 9 = 3", "3 into 2 = 0 R2", "3 into 26 = 8 R2", "3 into 21 = 7"), "3,087"),
            new WorkedExample("Divide: 7,200 / 8", Arrays.asList("8 into 72 = 9", "8 into 0 = 0", "8 into 0 = 0"), "900")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("perimeter", "Perimeter", "32", "Calculate perimeter of polygons.", "Section 4: Lessons 31-40", 32,
            Arrays.asList(new Section("Worked Examples", "Calculate perimeter of polygons.",
                Arrays.asList(
            new WorkedExample("Add: 4.56 + 3.78", Arrays.asList("Line up decimals: 6+8=14 carry, 5+7+1=13 carry, 4+3+1=8"), "8.34"),
            new WorkedExample("Subtract: 10 - 3.45", Arrays.asList("10.00-3.45, borrow: 6.55"), "6.55"),
            new WorkedExample("Multiply: 2.5 x 3.4", Arrays.asList("25x34=850, 2 decimal places"), "8.50"),
            new WorkedExample("Divide: 7.2 / 0.8", Arrays.asList("Move decimals: 72/8=9"), "9"),
            new WorkedExample("Round 4.567 to nearest tenth", Arrays.asList("Look at hundredths (6>=5): round up"), "4.6")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("decimal-place-value", "Decimal Place Value", "33", "Read and write decimals through thousandths.", "Section 4: Lessons 31-40", 33,
            Arrays.asList(new Section("Worked Examples", "Read and write decimals through thousandths.",
                Arrays.asList(
            new WorkedExample("Write 0.45 in words", Arrays.asList("4 is in tenths place", "5 is in hundredths place"), "Forty-five hundredths"),
            new WorkedExample("What is the place value of 7 in 3.078?", Arrays.asList("After decimal: tenths, hundredths, thousandths", "7 is in the hundredths place"), "Hundredths"),
            new WorkedExample("Write as a decimal: 3 and 25 thousandths", Arrays.asList("3 ones, 0 tenths, 2 hundredths, 5 thousandths"), "3.025"),
            new WorkedExample("Write 0.6 as a fraction", Arrays.asList("6 tenths = 6/10 = 3/5"), "6/10 or 3/5"),
            new WorkedExample("Which is greater: 0.08 or 0.1?", Arrays.asList("0.08 = 0.08", "0.1 = 0.10", "0.10 > 0.08"), "0.1")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-decimals", "Comparing Decimals", "34", "Compare and order decimal numbers.", "Section 4: Lessons 31-40", 34,
            Arrays.asList(new Section("Worked Examples", "Compare and order decimal numbers.",
                Arrays.asList(
            new WorkedExample("Add: 4.56 + 3.78", Arrays.asList("Line up decimals: 6+8=14 carry, 5+7+1=13 carry, 4+3+1=8"), "8.34"),
            new WorkedExample("Subtract: 10 - 3.45", Arrays.asList("10.00-3.45, borrow: 6.55"), "6.55"),
            new WorkedExample("Multiply: 2.5 x 3.4", Arrays.asList("25x34=850, 2 decimal places"), "8.50"),
            new WorkedExample("Divide: 7.2 / 0.8", Arrays.asList("Move decimals: 72/8=9"), "9"),
            new WorkedExample("Round 4.567 to nearest tenth", Arrays.asList("Look at hundredths (6>=5): round up"), "4.6")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-and-subtracting-decimals", "Adding and Subtracting Decimals", "35", "Add and subtract decimals.", "Section 4: Lessons 31-40", 35,
            Arrays.asList(new Section("Worked Examples", "Add and subtract decimals.",
                Arrays.asList(
            new WorkedExample("Add: 4.56 + 3.78", Arrays.asList("Line up decimals: 6+8=14 carry, 5+7+1=13 carry, 4+3+1=8"), "8.34"),
            new WorkedExample("Subtract: 10 - 3.45", Arrays.asList("10.00-3.45, borrow: 6.55"), "6.55"),
            new WorkedExample("Multiply: 2.5 x 3.4", Arrays.asList("25x34=850, 2 decimal places"), "8.50"),
            new WorkedExample("Divide: 7.2 / 0.8", Arrays.asList("Move decimals: 72/8=9"), "9"),
            new WorkedExample("Round 4.567 to nearest tenth", Arrays.asList("Look at hundredths (6>=5): round up"), "4.6")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-decimals", "Multiplying Decimals", "36", "Multiply decimals and count decimal places.", "Section 4: Lessons 31-40", 36,
            Arrays.asList(new Section("Worked Examples", "Multiply decimals and count decimal places.",
                Arrays.asList(
            new WorkedExample("Add: 4.56 + 3.78", Arrays.asList("Line up decimals: 6+8=14 carry, 5+7+1=13 carry, 4+3+1=8"), "8.34"),
            new WorkedExample("Subtract: 10 - 3.45", Arrays.asList("10.00-3.45, borrow: 6.55"), "6.55"),
            new WorkedExample("Multiply: 2.5 x 3.4", Arrays.asList("25x34=850, 2 decimal places"), "8.50"),
            new WorkedExample("Divide: 7.2 / 0.8", Arrays.asList("Move decimals: 72/8=9"), "9"),
            new WorkedExample("Round 4.567 to nearest tenth", Arrays.asList("Look at hundredths (6>=5): round up"), "4.6")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-decimals", "Dividing Decimals", "37", "Divide decimals by whole numbers.", "Section 4: Lessons 31-40", 37,
            Arrays.asList(new Section("Worked Examples", "Divide decimals by whole numbers.",
                Arrays.asList(
            new WorkedExample("Add: 4.56 + 3.78", Arrays.asList("Line up decimals: 6+8=14 carry, 5+7+1=13 carry, 4+3+1=8"), "8.34"),
            new WorkedExample("Subtract: 10 - 3.45", Arrays.asList("10.00-3.45, borrow: 6.55"), "6.55"),
            new WorkedExample("Multiply: 2.5 x 3.4", Arrays.asList("25x34=850, 2 decimal places"), "8.50"),
            new WorkedExample("Divide: 7.2 / 0.8", Arrays.asList("Move decimals: 72/8=9"), "9"),
            new WorkedExample("Round 4.567 to nearest tenth", Arrays.asList("Look at hundredths (6>=5): round up"), "4.6")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("triangles", "Triangles", "38", "Classify triangles by sides and angles.", "Section 4: Lessons 31-40", 38,
            Arrays.asList(new Section("Worked Examples", "Classify triangles by sides and angles.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("quadrilaterals", "Quadrilaterals", "39", "Identify and classify quadrilaterals.", "Section 4: Lessons 31-40", 39,
            Arrays.asList(new Section("Worked Examples", "Identify and classify quadrilaterals.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("powers-and-exponents", "Powers and Exponents", "40", "Write and evaluate numbers with exponents.", "Section 4: Lessons 31-40", 40,
            Arrays.asList(new Section("Worked Examples", "Write and evaluate numbers with exponents.",
                Arrays.asList(
            new WorkedExample("Evaluate: 2^5", Arrays.asList("2 x 2 x 2 x 2 x 2", "= 4 x 4 x 2 = 32"), "32"),
            new WorkedExample("Write 10,000 as a power of 10", Arrays.asList("10 x 10 x 10 x 10 = 10^4"), "10^4"),
            new WorkedExample("Find: 3^4", Arrays.asList("3 x 3 x 3 x 3", "= 9 x 9 = 81"), "81"),
            new WorkedExample("Evaluate: 5^3", Arrays.asList("5 x 5 x 5 = 125"), "125"),
            new WorkedExample("Compare: 2^6 and 4^3", Arrays.asList("2^6 = 64", "4^3 = 64", "They are equal!"), "Equal (both 64)")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-fractions-like-denom", "Adding Fractions (Like Denom)", "41", "Add fractions with same denominator.", "Section 5: Lessons 41-50", 41,
            Arrays.asList(new Section("Worked Examples", "Add fractions with same denominator.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-fractions-unlike-denom", "Adding Fractions (Unlike Denom)", "42", "Find LCD and add fractions.", "Section 5: Lessons 41-50", 42,
            Arrays.asList(new Section("Worked Examples", "Find LCD and add fractions.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-mixed-numbers", "Adding Mixed Numbers", "43", "Add mixed numbers.", "Section 5: Lessons 41-50", 43,
            Arrays.asList(new Section("Worked Examples", "Add mixed numbers.",
                Arrays.asList(
            new WorkedExample("Add: 2/3 + 1/4", Arrays.asList("LCD=12: 8/12 + 3/12 = 11/12"), "11/12"),
            new WorkedExample("Subtract: 5/6 - 1/3", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6 = 1/2"), "1/2"),
            new WorkedExample("Multiply: 3/4 x 2/5", Arrays.asList("3x2=6, 4x5=20, simplify: 3/10"), "3/10"),
            new WorkedExample("Divide: 2/3 / 4/5", Arrays.asList("Flip: 2/3 x 5/4 = 10/12 = 5/6"), "5/6"),
            new WorkedExample("Convert 2 3/8 to improper", Arrays.asList("2x8+3=19, keep 8"), "19/8")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-fractions", "Multiplying Fractions", "44", "Multiply fractions and simplify.", "Section 5: Lessons 41-50", 44,
            Arrays.asList(new Section("Worked Examples", "Multiply fractions and simplify.",
                Arrays.asList(
            new WorkedExample("Multiply: 2/3 x 3/4", Arrays.asList("Multiply numerators: 2x3=6", "Multiply denominators: 3x4=12", "Simplify: 6/12 = 1/2"), "1/2"),
            new WorkedExample("Find: 5/6 x 3/10", Arrays.asList("5x3=15, 6x10=60", "15/60 = 1/4"), "1/4"),
            new WorkedExample("Calculate: 2/3 x 12", Arrays.asList("2/3 x 12/1 = 24/3 = 8"), "8"),
            new WorkedExample("Multiply: 3/5 x 5/9", Arrays.asList("3x5=15, 5x9=45", "15/45 = 1/3"), "1/3"),
            new WorkedExample("Find: 4/7 x 7/8", Arrays.asList("4x7=28, 7x8=56", "28/56 = 1/2"), "1/2")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-fractions", "Dividing Fractions", "45", "Divide fractions using reciprocals.", "Section 5: Lessons 41-50", 45,
            Arrays.asList(new Section("Worked Examples", "Divide fractions using reciprocals.",
                Arrays.asList(
            new WorkedExample("Divide: 3/4 / 1/2", Arrays.asList("Flip the second: 3/4 x 2/1", "= 6/4 = 3/2 = 1 1/2"), "1 1/2"),
            new WorkedExample("Find: 5/6 / 2/3", Arrays.asList("Flip: 5/6 x 3/2 = 15/12 = 5/4"), "1 1/4"),
            new WorkedExample("Calculate: 8 / 1/4", Arrays.asList("8 x 4/1 = 32", "How many 1/4s in 8? = 32"), "32"),
            new WorkedExample("Divide: 2/5 / 4", Arrays.asList("2/5 x 1/4 = 2/20 = 1/10"), "1/10"),
            new WorkedExample("Find: 7/8 / 7/4", Arrays.asList("7/8 x 4/7 = 28/56 = 1/2"), "1/2")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fraction-decimal-percent", "Fraction-Decimal-Percent", "46", "Convert between representations.", "Section 5: Lessons 41-50", 46,
            Arrays.asList(new Section("Worked Examples", "Convert between representations.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("percent-of-a-number", "Percent of a Number", "47", "Calculate a percent of a number.", "Section 5: Lessons 41-50", 47,
            Arrays.asList(new Section("Worked Examples", "Calculate a percent of a number.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("probability", "Probability", "48", "Find probability of events.", "Section 5: Lessons 41-50", 48,
            Arrays.asList(new Section("Worked Examples", "Find probability of events.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("mean-median-mode-range", "Mean, Median, Mode, Range", "49", "Calculate measures of center.", "Section 5: Lessons 41-50", 49,
            Arrays.asList(new Section("Worked Examples", "Calculate measures of center.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("circle-graphs", "Circle Graphs", "50", "Read and interpret circle graphs.", "Section 5: Lessons 41-50", 50,
            Arrays.asList(new Section("Worked Examples", "Read and interpret circle graphs.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("order-of-operations", "Order of Operations", "51", "Apply PEMDAS.", "Section 6: Lessons 51-60", 51,
            Arrays.asList(new Section("Worked Examples", "Apply PEMDAS.",
                Arrays.asList(
            new WorkedExample("Evaluate: 3 + 4 x 5", Arrays.asList("Multiply first: 4x5=20", "Then add: 3+20=23"), "23"),
            new WorkedExample("Evaluate: (8+2) x 3 - 4", Arrays.asList("Parentheses: 10", "Multiply: 10x3=30", "Subtract: 30-4=26"), "26"),
            new WorkedExample("Evaluate: 24 / (8-2) + 5^2", Arrays.asList("Parentheses: 6", "Division: 24/6=4", "Exponent: 25", "Add: 4+25=29"), "29"),
            new WorkedExample("Evaluate: 2^3 + 4 x 3 - 1", Arrays.asList("Exponent: 8", "Multiply: 12", "Add/subtract: 8+12-1=19"), "19"),
            new WorkedExample("Insert parentheses to make true: 2+3x4=20", Arrays.asList("(2+3)x4 = 5x4 = 20"), "(2+3) x 4")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("divisibility-rules", "Divisibility Rules", "52", "Test divisibility.", "Section 6: Lessons 51-60", 52,
            Arrays.asList(new Section("Worked Examples", "Test divisibility.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("prime-and-composite", "Prime and Composite", "53", "Identify primes.", "Section 6: Lessons 51-60", 53,
            Arrays.asList(new Section("Worked Examples", "Identify primes.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("greatest-common-factor", "Greatest Common Factor", "54", "Find GCF.", "Section 6: Lessons 51-60", 54,
            Arrays.asList(new Section("Worked Examples", "Find GCF.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("least-common-multiple", "Least Common Multiple", "55", "Find LCM.", "Section 6: Lessons 51-60", 55,
            Arrays.asList(new Section("Worked Examples", "Find LCM.",
                Arrays.asList(
            new WorkedExample("Find the next 3 terms: 4, 8, 12, 16, ...", Arrays.asList("Add 4 each time", "16+4=20, 20+4=24, 24+4=28"), "20, 24, 28"),
            new WorkedExample("What is the rule: 100, 91, 82, 73, ...?", Arrays.asList("Subtract 9 each time", "100-9=91, 91-9=82"), "Subtract 9"),
            new WorkedExample("Find the 8th term: 3, 6, 9, 12, ...", Arrays.asList("Rule: position x 3", "8th = 8 x 3 = 24"), "24"),
            new WorkedExample("Pattern: 1, 4, 9, 16, 25, __", Arrays.asList("Perfect squares: 1^2, 2^2, 3^2...", "Next: 6^2 = 36"), "36"),
            new WorkedExample("Find missing: 5, __, 20, 40, 80", Arrays.asList("Each doubles: 5x2=10"), "10")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("ratio", "Ratio", "56", "Write and simplify ratios.", "Section 6: Lessons 51-60", 56,
            Arrays.asList(new Section("Worked Examples", "Write and simplify ratios.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("rate", "Rate", "57", "Calculate unit rates.", "Section 6: Lessons 51-60", 57,
            Arrays.asList(new Section("Worked Examples", "Calculate unit rates.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("proportions", "Proportions", "58", "Solve proportions.", "Section 6: Lessons 51-60", 58,
            Arrays.asList(new Section("Worked Examples", "Solve proportions.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("scale-drawings", "Scale Drawings", "59", "Use scales.", "Section 6: Lessons 51-60", 59,
            Arrays.asList(new Section("Worked Examples", "Use scales.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("choosing-measures", "Choosing Measures", "60", "Choose appropriate measures.", "Section 6: Lessons 51-60", 60,
            Arrays.asList(new Section("Worked Examples", "Choose appropriate measures.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("complementary-and-supplementary", "Complementary and Supplementary", "61", "Find missing angles.", "Section 7: Lessons 61-70", 61,
            Arrays.asList(new Section("Worked Examples", "Find missing angles.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("parallel-and-perpendicular", "Parallel and Perpendicular", "62", "Identify line relationships.", "Section 7: Lessons 61-70", 62,
            Arrays.asList(new Section("Worked Examples", "Identify line relationships.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("polygons", "Polygons", "63", "Classify polygons.", "Section 7: Lessons 61-70", 63,
            Arrays.asList(new Section("Worked Examples", "Classify polygons.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("circles", "Circles", "64", "Parts of a circle.", "Section 7: Lessons 61-70", 64,
            Arrays.asList(new Section("Worked Examples", "Parts of a circle.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("circumference", "Circumference", "65", "Calculate circumference.", "Section 7: Lessons 61-70", 65,
            Arrays.asList(new Section("Worked Examples", "Calculate circumference.",
                Arrays.asList(
            new WorkedExample("Find circumference: diameter = 10 (use pi=3.14)", Arrays.asList("C = pi x d", "C = 3.14 x 10"), "31.4 units"),
            new WorkedExample("Circle radius = 7. Circumference?", Arrays.asList("d = 2r = 14", "C = 3.14 x 14"), "43.96 units"),
            new WorkedExample("A wheel has diameter 2 feet. Distance in one rotation?", Arrays.asList("One rotation = circumference", "C = 3.14 x 2 = 6.28 ft"), "6.28 feet"),
            new WorkedExample("Find circumference: r = 5", Arrays.asList("d = 10", "C = 3.14 x 10 = 31.4"), "31.4"),
            new WorkedExample("Which is longer: circumference of r=3 or perimeter of 4x4 square?", Arrays.asList("C = 3.14 x 6 = 18.84", "P = 4x4 = 16", "Circumference is longer"), "Circumference (18.84 > 16)")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("area-of-triangles", "Area of Triangles", "66", "Use area formulas.", "Section 7: Lessons 61-70", 66,
            Arrays.asList(new Section("Worked Examples", "Use area formulas.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("area-of-circles", "Area of Circles", "67", "Calculate circle area.", "Section 7: Lessons 61-70", 67,
            Arrays.asList(new Section("Worked Examples", "Calculate circle area.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("volume", "Volume", "68", "Calculate volume.", "Section 7: Lessons 61-70", 68,
            Arrays.asList(new Section("Worked Examples", "Calculate volume.",
                Arrays.asList(
            new WorkedExample("Volume of box: 8 x 5 x 3", Arrays.asList("V = length x width x height", "V = 8 x 5 x 3 = 120"), "120 cubic units"),
            new WorkedExample("Cube with edge 6. Volume?", Arrays.asList("V = 6 x 6 x 6 = 216"), "216 cubic units"),
            new WorkedExample("Fish tank: 24 x 12 x 16 inches. Volume?", Arrays.asList("V = 24 x 12 x 16", "= 288 x 16 = 4,608"), "4,608 cubic inches"),
            new WorkedExample("Volume = 360, base = 10x9. Height?", Arrays.asList("V = l x w x h", "360 = 10 x 9 x h", "360 = 90h, h = 4"), "4 units"),
            new WorkedExample("Which holds more: 5x5x5 or 4x6x6?", Arrays.asList("5x5x5 = 125", "4x6x6 = 144", "Second is bigger"), "4x6x6 (144 > 125)")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("surface-area", "Surface Area", "69", "Find surface area.", "Section 7: Lessons 61-70", 69,
            Arrays.asList(new Section("Worked Examples", "Find surface area.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("geometric-solids", "Geometric Solids", "70", "Identify 3D shapes.", "Section 7: Lessons 61-70", 70,
            Arrays.asList(new Section("Worked Examples", "Identify 3D shapes.",
                Arrays.asList(
            new WorkedExample("Triangle angles: 45, 65, ?. Find missing.", Arrays.asList("180-45-65=70"), "70 degrees"),
            new WorkedExample("Perimeter of rectangle 12 x 8", Arrays.asList("P=2(12+8)=2(20)=40"), "40 units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A=(1/2)(10)(6)=30"), "30 sq units"),
            new WorkedExample("Volume of box 5 x 4 x 3", Arrays.asList("V=5x4x3=60"), "60 cubic units"),
            new WorkedExample("Circumference: diameter 10", Arrays.asList("C=3.14x10=31.4"), "31.4 units")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("integers-on-number-line", "Integers on Number Line", "71", "Locate integers.", "Section 8: Lessons 71-80", 71,
            Arrays.asList(new Section("Worked Examples", "Locate integers.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-integers", "Adding Integers", "72", "Add positive and negative.", "Section 8: Lessons 71-80", 72,
            Arrays.asList(new Section("Worked Examples", "Add positive and negative.",
                Arrays.asList(
            new WorkedExample("Find: 5 + (-3)", Arrays.asList("Start at 5, move left 3", "5 - 3 = 2"), "2"),
            new WorkedExample("Find: -4 + (-7)", Arrays.asList("Both negative: add values, keep negative", "4+7=11, so -11"), "-11"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: subtract, keep sign of larger", "12-8=4, positive wins"), "4"),
            new WorkedExample("Find: -6 + 6", Arrays.asList("Opposites add to zero"), "0"),
            new WorkedExample("Find: -15 + 8", Arrays.asList("15-8=7, negative is larger"), "-7")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtracting-integers", "Subtracting Integers", "73", "Subtract integers.", "Section 8: Lessons 71-80", 73,
            Arrays.asList(new Section("Worked Examples", "Subtract integers.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplyingdividing-integers", "Multiplying/Dividing Integers", "74", "Sign rules.", "Section 8: Lessons 71-80", 74,
            Arrays.asList(new Section("Worked Examples", "Sign rules.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("coordinate-plane", "Coordinate Plane", "75", "Plot ordered pairs.", "Section 8: Lessons 71-80", 75,
            Arrays.asList(new Section("Worked Examples", "Plot ordered pairs.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("translations", "Translations", "76", "Translate figures.", "Section 8: Lessons 71-80", 76,
            Arrays.asList(new Section("Worked Examples", "Translate figures.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("reflections", "Reflections", "77", "Reflect across axes.", "Section 8: Lessons 71-80", 77,
            Arrays.asList(new Section("Worked Examples", "Reflect across axes.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("rotations", "Rotations", "78", "Rotate figures.", "Section 8: Lessons 71-80", 78,
            Arrays.asList(new Section("Worked Examples", "Rotate figures.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("scientific-notation", "Scientific Notation", "79", "Write in scientific notation.", "Section 8: Lessons 71-80", 79,
            Arrays.asList(new Section("Worked Examples", "Write in scientific notation.",
                Arrays.asList(
            new WorkedExample("Find: -5 + (-3)", Arrays.asList("Same sign: add, keep negative: -8"), "-8"),
            new WorkedExample("Find: -8 + 12", Arrays.asList("Different signs: 12-8=4, positive wins"), "4"),
            new WorkedExample("Find: 7 - (-4)", Arrays.asList("Subtract negative=add: 7+4=11"), "11"),
            new WorkedExample("Find: (-6) x (-3)", Arrays.asList("Negative x negative = positive: 18"), "18"),
            new WorkedExample("Find: (-20) / 4", Arrays.asList("Negative / positive = negative: -5"), "-5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("square-roots", "Square Roots", "80", "Find square roots.", "Section 8: Lessons 71-80", 80,
            Arrays.asList(new Section("Worked Examples", "Find square roots.",
                Arrays.asList(
            new WorkedExample("Find: sqrt(64)", Arrays.asList("What number times itself = 64?", "8 x 8 = 64"), "8"),
            new WorkedExample("Find: sqrt(144)", Arrays.asList("12 x 12 = 144"), "12"),
            new WorkedExample("Estimate sqrt(50)", Arrays.asList("7x7=49, 8x8=64", "50 is between, closer to 49"), "About 7.1"),
            new WorkedExample("Find: sqrt(1)", Arrays.asList("1 x 1 = 1"), "1"),
            new WorkedExample("Is sqrt(20) rational or irrational?", Arrays.asList("20 is not a perfect square", "sqrt(20) = 4.472... (non-repeating)"), "Irrational")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("variables-and-expressions", "Variables and Expressions", "81", "Evaluate expressions.", "Section 9: Lessons 81-90", 81,
            Arrays.asList(new Section("Worked Examples", "Evaluate expressions.",
                Arrays.asList(
            new WorkedExample("Solve: x + 7 = 15", Arrays.asList("Subtract 7: x = 15-7 = 8", "Check: 8+7=15"), "x = 8"),
            new WorkedExample("Solve: 3x = 24", Arrays.asList("Divide by 3: x = 24/3 = 8", "Check: 3(8)=24"), "x = 8"),
            new WorkedExample("Solve: 2x + 5 = 17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6", "Check: 2(6)+5=17"), "x = 6"),
            new WorkedExample("Evaluate 4n-3 when n=5", Arrays.asList("4(5)-3 = 20-3 = 17"), "17"),
            new WorkedExample("Find slope: (1,2) to (4,11)", Arrays.asList("(11-2)/(4-1) = 9/3 = 3"), "3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("writing-expressions", "Writing Expressions", "82", "Translate words to algebra.", "Section 9: Lessons 81-90", 82,
            Arrays.asList(new Section("Worked Examples", "Translate words to algebra.",
                Arrays.asList(
            new WorkedExample("Solve: x + 7 = 15", Arrays.asList("Subtract 7: x = 15-7 = 8", "Check: 8+7=15"), "x = 8"),
            new WorkedExample("Solve: 3x = 24", Arrays.asList("Divide by 3: x = 24/3 = 8", "Check: 3(8)=24"), "x = 8"),
            new WorkedExample("Solve: 2x + 5 = 17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6", "Check: 2(6)+5=17"), "x = 6"),
            new WorkedExample("Evaluate 4n-3 when n=5", Arrays.asList("4(5)-3 = 20-3 = 17"), "17"),
            new WorkedExample("Find slope: (1,2) to (4,11)", Arrays.asList("(11-2)/(4-1) = 9/3 = 3"), "3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("one-step-equations-addsub", "One-Step Equations (Add/Sub)", "83", "Solve with inverse ops.", "Section 9: Lessons 81-90", 83,
            Arrays.asList(new Section("Worked Examples", "Solve with inverse ops.",
                Arrays.asList(
            new WorkedExample("Solve: x + 7 = 15", Arrays.asList("Subtract 7 from both sides", "x = 15 - 7 = 8", "Check: 8 + 7 = 15"), "x = 8"),
            new WorkedExample("Solve: y - 12 = 20", Arrays.asList("Add 12 to both sides", "y = 20 + 12 = 32", "Check: 32 - 12 = 20"), "y = 32"),
            new WorkedExample("Solve: n + 45 = 100", Arrays.asList("n = 100 - 45 = 55"), "n = 55"),
            new WorkedExample("Solve: x - 8 = -3", Arrays.asList("x = -3 + 8 = 5"), "x = 5"),
            new WorkedExample("Solve: a + 2.5 = 7", Arrays.asList("a = 7 - 2.5 = 4.5"), "a = 4.5")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("one-step-equations-multdiv", "One-Step Equations (Mult/Div)", "84", "Solve mult/div equations.", "Section 9: Lessons 81-90", 84,
            Arrays.asList(new Section("Worked Examples", "Solve mult/div equations.",
                Arrays.asList(
            new WorkedExample("Solve: 3x = 24", Arrays.asList("Divide both sides by 3", "x = 24/3 = 8"), "x = 8"),
            new WorkedExample("Solve: n/5 = 9", Arrays.asList("Multiply both sides by 5", "n = 9 x 5 = 45"), "n = 45"),
            new WorkedExample("Solve: 7y = 91", Arrays.asList("y = 91/7 = 13"), "y = 13"),
            new WorkedExample("Solve: x/4 = 12", Arrays.asList("x = 12 x 4 = 48"), "x = 48"),
            new WorkedExample("Solve: 2.5m = 10", Arrays.asList("m = 10/2.5 = 4"), "m = 4")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("two-step-equations", "Two-Step Equations", "85", "Solve two-step equations.", "Section 9: Lessons 81-90", 85,
            Arrays.asList(new Section("Worked Examples", "Solve two-step equations.",
                Arrays.asList(
            new WorkedExample("Solve: 2x + 5 = 17", Arrays.asList("Subtract 5: 2x = 12", "Divide by 2: x = 6", "Check: 2(6)+5 = 17"), "x = 6"),
            new WorkedExample("Solve: 3n - 7 = 20", Arrays.asList("Add 7: 3n = 27", "Divide by 3: n = 9"), "n = 9"),
            new WorkedExample("Solve: x/4 + 3 = 10", Arrays.asList("Subtract 3: x/4 = 7", "Multiply by 4: x = 28"), "x = 28"),
            new WorkedExample("Solve: 5y - 8 = 32", Arrays.asList("Add 8: 5y = 40", "Divide by 5: y = 8"), "y = 8"),
            new WorkedExample("Solve: 4a + 1 = 25", Arrays.asList("Subtract 1: 4a = 24", "Divide by 4: a = 6"), "a = 6")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("inequalities", "Inequalities", "86", "Solve and graph.", "Section 9: Lessons 81-90", 86,
            Arrays.asList(new Section("Worked Examples", "Solve and graph.",
                Arrays.asList(
            new WorkedExample("Solve: x + 7 = 15", Arrays.asList("Subtract 7: x = 15-7 = 8", "Check: 8+7=15"), "x = 8"),
            new WorkedExample("Solve: 3x = 24", Arrays.asList("Divide by 3: x = 24/3 = 8", "Check: 3(8)=24"), "x = 8"),
            new WorkedExample("Solve: 2x + 5 = 17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6", "Check: 2(6)+5=17"), "x = 6"),
            new WorkedExample("Evaluate 4n-3 when n=5", Arrays.asList("4(5)-3 = 20-3 = 17"), "17"),
            new WorkedExample("Find slope: (1,2) to (4,11)", Arrays.asList("(11-2)/(4-1) = 9/3 = 3"), "3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("functions", "Functions", "87", "Complete function tables.", "Section 9: Lessons 81-90", 87,
            Arrays.asList(new Section("Worked Examples", "Complete function tables.",
                Arrays.asList(
            new WorkedExample("Solve: x + 7 = 15", Arrays.asList("Subtract 7: x = 15-7 = 8", "Check: 8+7=15"), "x = 8"),
            new WorkedExample("Solve: 3x = 24", Arrays.asList("Divide by 3: x = 24/3 = 8", "Check: 3(8)=24"), "x = 8"),
            new WorkedExample("Solve: 2x + 5 = 17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6", "Check: 2(6)+5=17"), "x = 6"),
            new WorkedExample("Evaluate 4n-3 when n=5", Arrays.asList("4(5)-3 = 20-3 = 17"), "17"),
            new WorkedExample("Find slope: (1,2) to (4,11)", Arrays.asList("(11-2)/(4-1) = 9/3 = 3"), "3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("graphing-functions", "Graphing Functions", "88", "Graph on coordinate plane.", "Section 9: Lessons 81-90", 88,
            Arrays.asList(new Section("Worked Examples", "Graph on coordinate plane.",
                Arrays.asList(
            new WorkedExample("Solve: x + 7 = 15", Arrays.asList("Subtract 7: x = 15-7 = 8", "Check: 8+7=15"), "x = 8"),
            new WorkedExample("Solve: 3x = 24", Arrays.asList("Divide by 3: x = 24/3 = 8", "Check: 3(8)=24"), "x = 8"),
            new WorkedExample("Solve: 2x + 5 = 17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6", "Check: 2(6)+5=17"), "x = 6"),
            new WorkedExample("Evaluate 4n-3 when n=5", Arrays.asList("4(5)-3 = 20-3 = 17"), "17"),
            new WorkedExample("Find slope: (1,2) to (4,11)", Arrays.asList("(11-2)/(4-1) = 9/3 = 3"), "3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("slope", "Slope", "89", "Calculate slope.", "Section 9: Lessons 81-90", 89,
            Arrays.asList(new Section("Worked Examples", "Calculate slope.",
                Arrays.asList(
            new WorkedExample("Find slope between (1,2) and (4,8)", Arrays.asList("slope = (y2-y1)/(x2-x1)", "= (8-2)/(4-1) = 6/3"), "2"),
            new WorkedExample("Find slope: (0,5) and (3,5)", Arrays.asList("(5-5)/(3-0) = 0/3"), "0 (horizontal line)"),
            new WorkedExample("Find slope: (-1,3) and (2,-3)", Arrays.asList("(-3-3)/(2-(-1)) = -6/3"), "-2"),
            new WorkedExample("What does negative slope mean?", Arrays.asList("Line goes down from left to right", "As x increases, y decreases"), "Line falls from left to right"),
            new WorkedExample("Find slope: (0,0) and (4,6)", Arrays.asList("(6-0)/(4-0) = 6/4 = 3/2"), "3/2")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("equations-from-word-problems", "Equations from Word Problems", "90", "Write and solve.", "Section 9: Lessons 81-90", 90,
            Arrays.asList(new Section("Worked Examples", "Write and solve.",
                Arrays.asList(
            new WorkedExample("Solve: x + 7 = 15", Arrays.asList("Subtract 7: x = 15-7 = 8", "Check: 8+7=15"), "x = 8"),
            new WorkedExample("Solve: 3x = 24", Arrays.asList("Divide by 3: x = 24/3 = 8", "Check: 3(8)=24"), "x = 8"),
            new WorkedExample("Solve: 2x + 5 = 17", Arrays.asList("Subtract 5: 2x=12", "Divide by 2: x=6", "Check: 2(6)+5=17"), "x = 6"),
            new WorkedExample("Evaluate 4n-3 when n=5", Arrays.asList("4(5)-3 = 20-3 = 17"), "17"),
            new WorkedExample("Find slope: (1,2) to (4,11)", Arrays.asList("(11-2)/(4-1) = 9/3 = 3"), "3")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("proportional-relationships", "Proportional Relationships", "91", "Identify proportional tables.", "Section 10: Lessons 91-100", 91,
            Arrays.asList(new Section("Worked Examples", "Identify proportional tables.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("percent-increasedecrease", "Percent Increase/Decrease", "92", "Calculate percent change.", "Section 10: Lessons 91-100", 92,
            Arrays.asList(new Section("Worked Examples", "Calculate percent change.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("simple-interest", "Simple Interest", "93", "I=Prt.", "Section 10: Lessons 91-100", 93,
            Arrays.asList(new Section("Worked Examples", "I=Prt.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("discount-and-tax", "Discount and Tax", "94", "Calculate prices.", "Section 10: Lessons 91-100", 94,
            Arrays.asList(new Section("Worked Examples", "Calculate prices.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("similar-figures", "Similar Figures", "95", "Find missing measures.", "Section 10: Lessons 91-100", 95,
            Arrays.asList(new Section("Worked Examples", "Find missing measures.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("indirect-measurement", "Indirect Measurement", "96", "Use proportions.", "Section 10: Lessons 91-100", 96,
            Arrays.asList(new Section("Worked Examples", "Use proportions.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("compound-events", "Compound Events", "97", "Independent/dependent.", "Section 10: Lessons 91-100", 97,
            Arrays.asList(new Section("Worked Examples", "Independent/dependent.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("permutationscombinations", "Permutations/Combinations", "98", "Count arrangements.", "Section 10: Lessons 91-100", 98,
            Arrays.asList(new Section("Worked Examples", "Count arrangements.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("stem-and-leaf-plots", "Stem-and-Leaf Plots", "99", "Create displays.", "Section 10: Lessons 91-100", 99,
            Arrays.asList(new Section("Worked Examples", "Create displays.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("box-and-whisker-plots", "Box-and-Whisker Plots", "100", "Create box plots.", "Section 10: Lessons 91-100", 100,
            Arrays.asList(new Section("Worked Examples", "Create box plots.",
                Arrays.asList(
            new WorkedExample("Find 25% of 80", Arrays.asList("25/100 x 80 = 0.25 x 80 = 20"), "20"),
            new WorkedExample("What percent is 15 of 60?", Arrays.asList("15/60 = 0.25 = 25%"), "25%"),
            new WorkedExample("Convert 3/5 to percent", Arrays.asList("3/5 = 0.6 = 60%"), "60%"),
            new WorkedExample("Item costs $45, 20% off. Sale price?", Arrays.asList("20% of 45 = 9", "45-9=36"), "$36"),
            new WorkedExample("Tax 8% on $75. Total?", Arrays.asList("8% of 75 = 6", "75+6=81"), "$81")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("pythagorean-theorem", "Pythagorean Theorem", "101", "a^2+b^2=c^2.", "Section 11: Lessons 101-110", 101,
            Arrays.asList(new Section("Worked Examples", "a^2+b^2=c^2.",
                Arrays.asList(
            new WorkedExample("Right triangle: legs 3 and 4. Hypotenuse?", Arrays.asList("a^2 + b^2 = c^2", "9 + 16 = 25", "c = sqrt(25) = 5"), "5"),
            new WorkedExample("Right triangle: legs 5 and 12. Hypotenuse?", Arrays.asList("25 + 144 = 169", "c = sqrt(169) = 13"), "13"),
            new WorkedExample("Hypotenuse=10, one leg=6. Other leg?", Arrays.asList("6^2 + b^2 = 10^2", "36 + b^2 = 100", "b^2 = 64, b = 8"), "8"),
            new WorkedExample("Is a triangle with sides 7,24,25 a right triangle?", Arrays.asList("7^2 + 24^2 = 49 + 576 = 625", "25^2 = 625", "Yes! 625 = 625"), "Yes"),
            new WorkedExample("Legs are 8 and 15. Find hypotenuse.", Arrays.asList("64 + 225 = 289", "sqrt(289) = 17"), "17")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("distance-formula", "Distance Formula", "102", "Find distance.", "Section 11: Lessons 101-110", 102,
            Arrays.asList(new Section("Worked Examples", "Find distance.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("irrational-numbers", "Irrational Numbers", "103", "Identify irrationals.", "Section 11: Lessons 101-110", 103,
            Arrays.asList(new Section("Worked Examples", "Identify irrationals.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("exponent-rules", "Exponent Rules", "104", "Multiply/divide powers.", "Section 11: Lessons 101-110", 104,
            Arrays.asList(new Section("Worked Examples", "Multiply/divide powers.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("negative-exponents", "Negative Exponents", "105", "Evaluate neg exponents.", "Section 11: Lessons 101-110", 105,
            Arrays.asList(new Section("Worked Examples", "Evaluate neg exponents.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("scatter-plots", "Scatter Plots", "106", "Create and interpret.", "Section 11: Lessons 101-110", 106,
            Arrays.asList(new Section("Worked Examples", "Create and interpret.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("line-of-best-fit", "Line of Best Fit", "107", "Draw trend lines.", "Section 11: Lessons 101-110", 107,
            Arrays.asList(new Section("Worked Examples", "Draw trend lines.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("two-step-inequalities", "Two-Step Inequalities", "108", "Solve and graph.", "Section 11: Lessons 101-110", 108,
            Arrays.asList(new Section("Worked Examples", "Solve and graph.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("systems-introduction", "Systems Introduction", "109", "Two equations.", "Section 11: Lessons 101-110", 109,
            Arrays.asList(new Section("Worked Examples", "Two equations.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("geometric-probability", "Geometric Probability", "110", "Area-based probability.", "Section 11: Lessons 101-110", 110,
            Arrays.asList(new Section("Worked Examples", "Area-based probability.",
                Arrays.asList(
            new WorkedExample("Pythagorean: legs 6 and 8. Hypotenuse?", Arrays.asList("36+64=100, sqrt(100)=10"), "10"),
            new WorkedExample("sqrt(144) = ?", Arrays.asList("12x12=144"), "12"),
            new WorkedExample("Write 45,000 in scientific notation", Arrays.asList("4.5 x 10^4"), "4.5 x 10^4"),
            new WorkedExample("5^(-2) = ?", Arrays.asList("1/5^2 = 1/25"), "1/25"),
            new WorkedExample("Distance (0,0) to (5,12)?", Arrays.asList("sqrt(25+144)=sqrt(169)=13"), "13")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multi-step-word-problems", "Multi-Step Word Problems", "111", "Complex problems.", "Section 12: Lessons 111-120", 111,
            Arrays.asList(new Section("Worked Examples", "Complex problems.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("rates-of-change", "Rates of Change", "112", "Interpret rates.", "Section 12: Lessons 111-120", 112,
            Arrays.asList(new Section("Worked Examples", "Interpret rates.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("unit-conversions", "Unit Conversions", "113", "Dimensional analysis.", "Section 12: Lessons 111-120", 113,
            Arrays.asList(new Section("Worked Examples", "Dimensional analysis.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("unusual-percents", "Unusual Percents", "114", ">100% and <1%.", "Section 12: Lessons 111-120", 114,
            Arrays.asList(new Section("Worked Examples", ">100% and <1%.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("compound-interest", "Compound Interest", "115", "Compound vs simple.", "Section 12: Lessons 111-120", 115,
            Arrays.asList(new Section("Worked Examples", "Compound vs simple.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("tessellations", "Tessellations", "116", "Shapes that tile.", "Section 12: Lessons 111-120", 116,
            Arrays.asList(new Section("Worked Examples", "Shapes that tile.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("nets-and-surface-area", "Nets and Surface Area", "117", "Unfold 3D shapes.", "Section 12: Lessons 111-120", 117,
            Arrays.asList(new Section("Worked Examples", "Unfold 3D shapes.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("volume-of-cylinders", "Volume of Cylinders", "118", "V=pi*r^2*h.", "Section 12: Lessons 111-120", 118,
            Arrays.asList(new Section("Worked Examples", "V=pi*r^2*h.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("data-predictions", "Data Predictions", "119", "Predict from trends.", "Section 12: Lessons 111-120", 119,
            Arrays.asList(new Section("Worked Examples", "Predict from trends.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("problem-solving-review", "Problem Solving Review", "120", "All strategies.", "Section 12: Lessons 111-120", 120,
            Arrays.asList(new Section("Worked Examples", "All strategies.",
                Arrays.asList(
            new WorkedExample("Simplify ratio 24:16", Arrays.asList("GCF=8, divide both"), "3:2"),
            new WorkedExample("Solve: 3/5 = x/20", Arrays.asList("Cross multiply: 5x=60, x=12"), "12"),
            new WorkedExample("Unit rate: $12 for 4 pounds", Arrays.asList("12/4 = $3 per pound"), "$3/lb"),
            new WorkedExample("Scale 1cm=50km. Map shows 7cm.", Arrays.asList("7x50=350"), "350 km"),
            new WorkedExample("8 workers finish in 6 days. Workers for 4 days?", Arrays.asList("48 worker-days / 4 = 12"), "12 workers")
            ))),
            Arrays.asList("Practice daily for mastery", "Show all work", "Check your answer")
        ));
    }
}