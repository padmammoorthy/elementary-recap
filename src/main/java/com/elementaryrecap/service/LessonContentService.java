package com.elementaryrecap.service;
import com.elementaryrecap.model.LessonContent;
import com.elementaryrecap.model.LessonContent.Section;
import com.elementaryrecap.model.LessonContent.WorkedExample;
import org.springframework.stereotype.Service;
import java.util.*;
import java.util.stream.Collectors;
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
        lessons.add(new LessonContent("addition-subtraction-facts", "Addition and Subtraction Facts", "1", "Master basic addition and subtraction facts.", "Chapter 1: Number Sense", 1,
            Arrays.asList(new Section("Worked Examples", "Master basic addition and subtraction facts.",
                Arrays.asList(
            new WorkedExample("8 + 7 = ?", Arrays.asList("Start at 8, count up 7: 9,10,11,12,13,14,15"), "15"),
            new WorkedExample("15 - 9 = ?", Arrays.asList("Think: 9 + ? = 15", "9 + 6 = 15"), "6"),
            new WorkedExample("6 + 8 = ?", Arrays.asList("Make a ten: 6+4=10, then +4 more=14"), "14"),
            new WorkedExample("17 - 8 = ?", Arrays.asList("Start at 17, count back 8"), "9"),
            new WorkedExample("9 + 6 = ?", Arrays.asList("9+1=10, then +5=15"), "15")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("place-value", "Place Value", "2", "Understand place value through thousands.", "Chapter 1: Number Sense", 2,
            Arrays.asList(new Section("Worked Examples", "Understand place value through thousands.",
                Arrays.asList(
            new WorkedExample("What digit is in the hundreds place of 4,725?", Arrays.asList("From right: ones=5, tens=2, hundreds=7"), "7"),
            new WorkedExample("What is the value of 3 in 3,456?", Arrays.asList("3 is in the thousands place", "3 x 1,000 = 3,000"), "3,000"),
            new WorkedExample("Write in expanded form: 6,204", Arrays.asList("6,000 + 200 + 0 + 4", "No tens digit"), "6,000 + 200 + 4"),
            new WorkedExample("How many hundreds in 2,400?", Arrays.asList("2,400 / 100 = 24"), "24"),
            new WorkedExample("What is 100 more than 3,456?", Arrays.asList("Add 1 to the hundreds digit", "3,456 + 100 = 3,556"), "3,556")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-ordering", "Comparing and Ordering Numbers", "3", "Compare numbers using symbols.", "Chapter 1: Number Sense", 3,
            Arrays.asList(new Section("Worked Examples", "Compare numbers using symbols.",
                Arrays.asList(
            new WorkedExample("Compare: 456 and 465", Arrays.asList("Same hundreds (4)", "Compare tens: 5 < 6", "465 is greater"), "465 > 456"),
            new WorkedExample("Order least to greatest: 89, 78, 98", Arrays.asList("Compare: 78 < 89 < 98"), "78, 89, 98"),
            new WorkedExample("Fill in: 1,234 __ 1,243", Arrays.asList("Hundreds same, tens: 3 < 4"), "<"),
            new WorkedExample("Which is smallest: 234, 324, 243?", Arrays.asList("Compare hundreds: 2 < 3", "Compare 234 and 243: tens 3 < 4"), "234"),
            new WorkedExample("Is 999 greater or less than 1,000?", Arrays.asList("3 digits < 4 digits"), "Less than")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("rounding-estimating", "Rounding and Estimating", "4", "Round numbers and estimate answers.", "Chapter 1: Number Sense", 4,
            Arrays.asList(new Section("Worked Examples", "Round numbers and estimate answers.",
                Arrays.asList(
            new WorkedExample("Round 67 to the nearest ten", Arrays.asList("Look at ones digit: 7", "7 >= 5, so round up"), "70"),
            new WorkedExample("Round 345 to nearest hundred", Arrays.asList("Look at tens digit: 4", "4 < 5, so round down"), "300"),
            new WorkedExample("Estimate 48 + 33", Arrays.asList("Round: 50 + 30 = 80"), "About 80"),
            new WorkedExample("Round 2,750 to nearest thousand", Arrays.asList("Look at hundreds: 7", "7 >= 5, round up"), "3,000"),
            new WorkedExample("Estimate 89 - 42", Arrays.asList("Round: 90 - 40 = 50"), "About 50")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("addition-regrouping", "Addition with Regrouping", "5", "Add multi-digit numbers with carrying.", "Chapter 2: Addition and Subtraction", 5,
            Arrays.asList(new Section("Worked Examples", "Add multi-digit numbers with carrying.",
                Arrays.asList(
            new WorkedExample("456 + 278 = ?", Arrays.asList("6+8=14, write 4 carry 1", "5+7+1=13, write 3 carry 1", "4+2+1=7"), "734"),
            new WorkedExample("567 + 345 = ?", Arrays.asList("7+5=12, carry 1", "6+4+1=11, carry 1", "5+3+1=9"), "912"),
            new WorkedExample("1,245 + 3,678 = ?", Arrays.asList("Add each column right to left", "Carry when sum > 9"), "4,923"),
            new WorkedExample("789 + 456 = ?", Arrays.asList("9+6=15, carry", "8+5+1=14, carry", "7+4+1=12"), "1,245"),
            new WorkedExample("999 + 999 = ?", Arrays.asList("9+9=18, carry 1 each column"), "1,998")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtraction-regrouping", "Subtraction with Regrouping", "6", "Subtract with borrowing.", "Chapter 2: Addition and Subtraction", 6,
            Arrays.asList(new Section("Worked Examples", "Subtract with borrowing.",
                Arrays.asList(
            new WorkedExample("503 - 287 = ?", Arrays.asList("Can't subtract 7 from 3, borrow", "Can't borrow from 0, borrow from 5", "13-7=6, 9-8=1, 4-2=2"), "216"),
            new WorkedExample("1,000 - 456 = ?", Arrays.asList("Borrow through zeros", "10-6=4, 9-5=4, 9-4=5"), "544"),
            new WorkedExample("800 - 345 = ?", Arrays.asList("Borrow: 10-5=5, 9-4=5, 7-3=4"), "455"),
            new WorkedExample("4,002 - 1,567 = ?", Arrays.asList("Borrow through the zeros"), "2,435"),
            new WorkedExample("700 - 283 = ?", Arrays.asList("Borrow from 7: becomes 6", "10-3=7, 9-8=1, 6-2=4"), "417")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-add-sub", "Word Problems (Add/Subtract)", "7", "Solve addition and subtraction word problems.", "Chapter 2: Addition and Subtraction", 7,
            Arrays.asList(new Section("Worked Examples", "Solve addition and subtraction word problems.",
                Arrays.asList(
            new WorkedExample("Tom has 45 marbles and gets 28 more. How many total?", Arrays.asList("Addition: 45 + 28", "5+8=13, carry. 4+2+1=7"), "73 marbles"),
            new WorkedExample("Sara had 92 stickers, gave 37 away. How many left?", Arrays.asList("Subtraction: 92 - 37", "12-7=5, 8-3=5"), "55 stickers"),
            new WorkedExample("A store sold 156 apples Monday and 234 Tuesday. Total?", Arrays.asList("Add: 156 + 234"), "390 apples"),
            new WorkedExample("Jake had $500, spent $275. How much left?", Arrays.asList("Subtract: 500 - 275", "Borrow from 5"), "$225"),
            new WorkedExample("345 students + 278 students = ?", Arrays.asList("Add with regrouping"), "623 students")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplication-facts", "Multiplication Facts", "8", "Master multiplication tables through 12.", "Chapter 3: Multiplication", 8,
            Arrays.asList(new Section("Worked Examples", "Master multiplication tables through 12.",
                Arrays.asList(
            new WorkedExample("7 x 8 = ?", Arrays.asList("7 groups of 8", "or 8 groups of 7"), "56"),
            new WorkedExample("9 x 6 = ?", Arrays.asList("Think: 10x6=60, minus 6=54"), "54"),
            new WorkedExample("12 x 5 = ?", Arrays.asList("12x5 = 10x5 + 2x5 = 50+10"), "60"),
            new WorkedExample("8 x 9 = ?", Arrays.asList("8x9 = 8x10 - 8 = 72"), "72"),
            new WorkedExample("6 x 7 = ?", Arrays.asList("Count by 6s seven times", "or count by 7s six times"), "42")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multi-digit-multiplication", "Multi-Digit Multiplication", "9", "Multiply 2 and 3 digit numbers.", "Chapter 3: Multiplication", 9,
            Arrays.asList(new Section("Worked Examples", "Multiply 2 and 3 digit numbers.",
                Arrays.asList(
            new WorkedExample("23 x 4 = ?", Arrays.asList("20x4=80, 3x4=12", "80+12=92"), "92"),
            new WorkedExample("56 x 7 = ?", Arrays.asList("50x7=350, 6x7=42", "350+42=392"), "392"),
            new WorkedExample("145 x 3 = ?", Arrays.asList("100x3=300, 40x3=120, 5x3=15", "300+120+15=435"), "435"),
            new WorkedExample("234 x 5 = ?", Arrays.asList("200x5=1000, 30x5=150, 4x5=20", "1000+150+20=1170"), "1,170"),
            new WorkedExample("67 x 8 = ?", Arrays.asList("60x8=480, 7x8=56", "480+56=536"), "536")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("division-facts", "Division Facts", "10", "Master division facts through 12.", "Chapter 4: Division", 10,
            Arrays.asList(new Section("Worked Examples", "Master division facts through 12.",
                Arrays.asList(
            new WorkedExample("56 / 8 = ?", Arrays.asList("Think: 8 x ? = 56", "8 x 7 = 56"), "7"),
            new WorkedExample("72 / 9 = ?", Arrays.asList("9 x ? = 72", "9 x 8 = 72"), "8"),
            new WorkedExample("48 / 6 = ?", Arrays.asList("6 x 8 = 48"), "8"),
            new WorkedExample("63 / 7 = ?", Arrays.asList("7 x 9 = 63"), "9"),
            new WorkedExample("84 / 12 = ?", Arrays.asList("12 x 7 = 84"), "7")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("long-division", "Long Division", "11", "Divide multi-digit numbers using long division.", "Chapter 4: Division", 11,
            Arrays.asList(new Section("Worked Examples", "Divide multi-digit numbers using long division.",
                Arrays.asList(
            new WorkedExample("156 / 12 = ?", Arrays.asList("12 goes into 15 once (12), remainder 3", "Bring down 6: 36", "12 goes into 36 three times"), "13"),
            new WorkedExample("345 / 5 = ?", Arrays.asList("5 into 34 = 6 r4", "Bring down 5: 45", "5 into 45 = 9"), "69"),
            new WorkedExample("824 / 4 = ?", Arrays.asList("4 into 8=2, 4 into 2=0 r2, 4 into 24=6"), "206"),
            new WorkedExample("936 / 9 = ?", Arrays.asList("9 into 9=1, 9 into 3=0 r3, 9 into 36=4"), "104"),
            new WorkedExample("672 / 6 = ?", Arrays.asList("6 into 6=1, 6 into 7=1 r1, 6 into 12=2"), "112")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-mult-div", "Word Problems (Multiply/Divide)", "12", "Solve multiplication and division word problems.", "Chapter 4: Division", 12,
            Arrays.asList(new Section("Worked Examples", "Solve multiplication and division word problems.",
                Arrays.asList(
            new WorkedExample("5 boxes with 12 items each. Total?", Arrays.asList("Multiply: 5 x 12 = 60"), "60 items"),
            new WorkedExample("84 cookies shared among 7 friends. Each gets?", Arrays.asList("Divide: 84 / 7 = 12"), "12 cookies"),
            new WorkedExample("3 bags of 24 apples. Total apples?", Arrays.asList("3 x 24 = 72"), "72 apples"),
            new WorkedExample("144 stickers into boxes of 12. How many boxes?", Arrays.asList("144 / 12 = 12"), "12 boxes"),
            new WorkedExample("9 rows of 15 seats. Total seats?", Arrays.asList("9 x 15 = 135"), "135 seats")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("factors-multiples", "Factors and Multiples", "13", "Find factors, multiples, GCF, and LCM.", "Chapter 5: Number Theory", 13,
            Arrays.asList(new Section("Worked Examples", "Find factors, multiples, GCF, and LCM.",
                Arrays.asList(
            new WorkedExample("List all factors of 12", Arrays.asList("1x12=12, 2x6=12, 3x4=12"), "1, 2, 3, 4, 6, 12"),
            new WorkedExample("Find GCF of 8 and 12", Arrays.asList("Factors of 8: 1,2,4,8", "Factors of 12: 1,2,3,4,6,12", "Common: 1,2,4. Greatest=4"), "4"),
            new WorkedExample("Find LCM of 4 and 6", Arrays.asList("Multiples of 4: 4,8,12,16...", "Multiples of 6: 6,12,18...", "First common: 12"), "12"),
            new WorkedExample("First 5 multiples of 7", Arrays.asList("7x1=7, 7x2=14, 7x3=21, 7x4=28, 7x5=35"), "7, 14, 21, 28, 35"),
            new WorkedExample("GCF of 18 and 24", Arrays.asList("Factors of 18: 1,2,3,6,9,18", "Factors of 24: 1,2,3,4,6,8,12,24", "GCF=6"), "6")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("prime-composite", "Prime and Composite Numbers", "14", "Identify prime and composite numbers.", "Chapter 5: Number Theory", 14,
            Arrays.asList(new Section("Worked Examples", "Identify prime and composite numbers.",
                Arrays.asList(
            new WorkedExample("Is 7 prime or composite?", Arrays.asList("Factors of 7: only 1 and 7", "Only 2 factors = prime"), "Prime"),
            new WorkedExample("Is 12 prime or composite?", Arrays.asList("12 = 2x6 = 3x4", "More than 2 factors = composite"), "Composite"),
            new WorkedExample("List primes less than 20", Arrays.asList("Check each: 2,3,5,7,11,13,17,19"), "2,3,5,7,11,13,17,19"),
            new WorkedExample("Prime factorization of 12", Arrays.asList("12 = 2x6 = 2x2x3"), "2 x 2 x 3"),
            new WorkedExample("Is 1 prime?", Arrays.asList("1 has only ONE factor (itself)", "Need exactly 2 factors to be prime"), "Neither prime nor composite")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("divisibility-rules", "Divisibility Rules", "15", "Apply rules for 2, 3, 5, 9, and 10.", "Chapter 5: Number Theory", 15,
            Arrays.asList(new Section("Worked Examples", "Apply rules for 2, 3, 5, 9, and 10.",
                Arrays.asList(
            new WorkedExample("Is 234 divisible by 2?", Arrays.asList("Last digit is 4 (even)", "Even numbers are divisible by 2"), "Yes"),
            new WorkedExample("Is 345 divisible by 5?", Arrays.asList("Last digit is 5", "Ends in 0 or 5 = divisible by 5"), "Yes"),
            new WorkedExample("Is 123 divisible by 3?", Arrays.asList("Add digits: 1+2+3=6", "6 is divisible by 3"), "Yes"),
            new WorkedExample("Is 450 divisible by 9?", Arrays.asList("Add digits: 4+5+0=9", "9 is divisible by 9"), "Yes"),
            new WorkedExample("Is 370 divisible by 10?", Arrays.asList("Last digit is 0", "Ends in 0 = divisible by 10"), "Yes")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("fraction-basics", "Understanding Fractions", "16", "Identify parts of a fraction and represent on number line.", "Chapter 6: Fractions", 16,
            Arrays.asList(new Section("Worked Examples", "Identify parts of a fraction and represent on number line.",
                Arrays.asList(
            new WorkedExample("What fraction is shaded if 3 of 8 parts are colored?", Arrays.asList("Numerator = shaded parts = 3", "Denominator = total parts = 8"), "3/8"),
            new WorkedExample("Name the numerator in 5/7", Arrays.asList("Top number is the numerator"), "5"),
            new WorkedExample("Name the denominator in 2/9", Arrays.asList("Bottom number is the denominator"), "9"),
            new WorkedExample("What fraction of a pizza is 1 slice out of 6?", Arrays.asList("1 part out of 6 total"), "1/6"),
            new WorkedExample("Place 1/2 on a number line", Arrays.asList("Halfway between 0 and 1"), "At the 0.5 mark")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("equivalent-fractions", "Equivalent Fractions", "17", "Find equivalent fractions by multiplying or dividing.", "Chapter 6: Fractions", 17,
            Arrays.asList(new Section("Worked Examples", "Find equivalent fractions by multiplying or dividing.",
                Arrays.asList(
            new WorkedExample("Find a fraction equivalent to 1/2", Arrays.asList("Multiply top and bottom by 2", "1x2=2, 2x2=4"), "2/4"),
            new WorkedExample("Simplify 6/8", Arrays.asList("Divide both by 2", "6/2=3, 8/2=4"), "3/4"),
            new WorkedExample("Are 2/3 and 4/6 equivalent?", Arrays.asList("2x2=4, 3x2=6", "4/6 = 4/6. Yes!"), "Yes"),
            new WorkedExample("Find equivalent: 3/5 = ?/10", Arrays.asList("5x2=10, so 3x2=6"), "6/10"),
            new WorkedExample("Simplify 10/15", Arrays.asList("Divide both by 5"), "2/3")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-fractions", "Comparing Fractions", "18", "Compare fractions with like and unlike denominators.", "Chapter 6: Fractions", 18,
            Arrays.asList(new Section("Worked Examples", "Compare fractions with like and unlike denominators.",
                Arrays.asList(
            new WorkedExample("Compare 3/4 and 1/4", Arrays.asList("Same denominator", "Compare numerators: 3 > 1"), "3/4 > 1/4"),
            new WorkedExample("Compare 1/3 and 1/5", Arrays.asList("Same numerator", "Smaller denominator = larger fraction"), "1/3 > 1/5"),
            new WorkedExample("Compare 2/3 and 3/4", Arrays.asList("LCD=12: 8/12 vs 9/12"), "2/3 < 3/4"),
            new WorkedExample("Order: 1/2, 1/4, 3/4", Arrays.asList("Convert to fourths: 2/4, 1/4, 3/4"), "1/4, 1/2, 3/4"),
            new WorkedExample("Which is greater: 5/6 or 7/8?", Arrays.asList("LCD=24: 20/24 vs 21/24"), "7/8")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-fractions", "Adding Fractions", "19", "Add fractions with like and unlike denominators.", "Chapter 7: Fraction Operations", 19,
            Arrays.asList(new Section("Worked Examples", "Add fractions with like and unlike denominators.",
                Arrays.asList(
            new WorkedExample("1/4 + 2/4 = ?", Arrays.asList("Same denominator: add numerators", "1+2=3, keep denominator 4"), "3/4"),
            new WorkedExample("1/3 + 1/6 = ?", Arrays.asList("LCD=6: 2/6 + 1/6 = 3/6"), "3/6 = 1/2"),
            new WorkedExample("2/5 + 1/5 = ?", Arrays.asList("Same denom: 2+1=3"), "3/5"),
            new WorkedExample("1/2 + 1/3 = ?", Arrays.asList("LCD=6: 3/6 + 2/6 = 5/6"), "5/6"),
            new WorkedExample("3/8 + 1/4 = ?", Arrays.asList("LCD=8: 3/8 + 2/8 = 5/8"), "5/8")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtracting-fractions", "Subtracting Fractions", "20", "Subtract fractions with like and unlike denominators.", "Chapter 7: Fraction Operations", 20,
            Arrays.asList(new Section("Worked Examples", "Subtract fractions with like and unlike denominators.",
                Arrays.asList(
            new WorkedExample("3/4 - 1/4 = ?", Arrays.asList("Same denom: 3-1=2"), "2/4 = 1/2"),
            new WorkedExample("5/6 - 1/3 = ?", Arrays.asList("LCD=6: 5/6 - 2/6 = 3/6"), "3/6 = 1/2"),
            new WorkedExample("7/8 - 3/8 = ?", Arrays.asList("Same denom: 7-3=4"), "4/8 = 1/2"),
            new WorkedExample("2/3 - 1/6 = ?", Arrays.asList("LCD=6: 4/6 - 1/6 = 3/6"), "3/6 = 1/2"),
            new WorkedExample("1 - 2/5 = ?", Arrays.asList("1 = 5/5: 5/5 - 2/5 = 3/5"), "3/5")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-fractions", "Multiplying Fractions", "21", "Multiply fractions and mixed numbers.", "Chapter 7: Fraction Operations", 21,
            Arrays.asList(new Section("Worked Examples", "Multiply fractions and mixed numbers.",
                Arrays.asList(
            new WorkedExample("1/2 x 1/3 = ?", Arrays.asList("Multiply numerators: 1x1=1", "Multiply denominators: 2x3=6"), "1/6"),
            new WorkedExample("2/3 x 3/4 = ?", Arrays.asList("2x3=6, 3x4=12", "6/12 = 1/2"), "1/2"),
            new WorkedExample("3/5 x 2/7 = ?", Arrays.asList("3x2=6, 5x7=35"), "6/35"),
            new WorkedExample("1/4 x 8 = ?", Arrays.asList("1/4 x 8/1 = 8/4 = 2"), "2"),
            new WorkedExample("2/3 x 6 = ?", Arrays.asList("2/3 x 6/1 = 12/3 = 4"), "4")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-fractions", "Dividing Fractions", "22", "Divide fractions using reciprocals.", "Chapter 7: Fraction Operations", 22,
            Arrays.asList(new Section("Worked Examples", "Divide fractions using reciprocals.",
                Arrays.asList(
            new WorkedExample("1/2 / 1/4 = ?", Arrays.asList("Flip second: 1/2 x 4/1 = 4/2"), "2"),
            new WorkedExample("3/4 / 1/2 = ?", Arrays.asList("Flip: 3/4 x 2/1 = 6/4 = 3/2"), "1 1/2"),
            new WorkedExample("2/5 / 2 = ?", Arrays.asList("2/5 x 1/2 = 2/10 = 1/5"), "1/5"),
            new WorkedExample("6 / 1/3 = ?", Arrays.asList("6 x 3/1 = 18"), "18"),
            new WorkedExample("3/8 / 3/4 = ?", Arrays.asList("3/8 x 4/3 = 12/24 = 1/2"), "1/2")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("mixed-numbers", "Mixed Numbers", "23", "Convert between mixed numbers and improper fractions.", "Chapter 7: Fraction Operations", 23,
            Arrays.asList(new Section("Worked Examples", "Convert between mixed numbers and improper fractions.",
                Arrays.asList(
            new WorkedExample("Convert 7/4 to a mixed number", Arrays.asList("7 / 4 = 1 remainder 3", "Whole=1, fraction=3/4"), "1 3/4"),
            new WorkedExample("Convert 2 1/3 to improper", Arrays.asList("2x3+1=7, keep denom 3"), "7/3"),
            new WorkedExample("Convert 11/5 to mixed", Arrays.asList("11/5 = 2 remainder 1"), "2 1/5"),
            new WorkedExample("Convert 3 2/5 to improper", Arrays.asList("3x5+2=17, over 5"), "17/5"),
            new WorkedExample("Add: 1 1/2 + 2 1/4", Arrays.asList("Convert: 3/2+9/4=6/4+9/4=15/4"), "3 3/4")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("decimal-basics", "Understanding Decimals", "24", "Read, write, and represent decimals.", "Chapter 8: Decimals", 24,
            Arrays.asList(new Section("Worked Examples", "Read, write, and represent decimals.",
                Arrays.asList(
            new WorkedExample("Write 0.7 in words", Arrays.asList("7 is in the tenths place"), "Seven tenths"),
            new WorkedExample("Write 2.35 in words", Arrays.asList("2 ones, 3 tenths, 5 hundredths"), "Two and thirty-five hundredths"),
            new WorkedExample("What place is the 4 in 3.45?", Arrays.asList("After decimal: tenths, hundredths", "4 is in the tenths place"), "Tenths"),
            new WorkedExample("Write three and two tenths as decimal", Arrays.asList("3 + 2/10"), "3.2"),
            new WorkedExample("0.05 as a fraction", Arrays.asList("5 in hundredths place"), "5/100 = 1/20")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-decimals", "Comparing Decimals", "25", "Compare decimals using place value.", "Chapter 8: Decimals", 25,
            Arrays.asList(new Section("Worked Examples", "Compare decimals using place value.",
                Arrays.asList(
            new WorkedExample("Compare: 0.4 and 0.45", Arrays.asList("0.4 = 0.40", "0.40 < 0.45"), "0.4 < 0.45"),
            new WorkedExample("Order: 0.3, 0.31, 0.29", Arrays.asList("0.29 < 0.30 < 0.31"), "0.29, 0.3, 0.31"),
            new WorkedExample("Which is greater: 0.5 or 0.50?", Arrays.asList("They are the same value"), "Equal"),
            new WorkedExample("Compare: 1.2 and 1.19", Arrays.asList("1.20 vs 1.19", "1.20 > 1.19"), "1.2 > 1.19"),
            new WorkedExample("Order: 2.5, 2.05, 2.55", Arrays.asList("Compare tenths: 0<5=5", "Then hundredths"), "2.05, 2.5, 2.55")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-subtracting-decimals", "Adding/Subtracting Decimals", "26", "Add and subtract decimal numbers.", "Chapter 8: Decimals", 26,
            Arrays.asList(new Section("Worked Examples", "Add and subtract decimal numbers.",
                Arrays.asList(
            new WorkedExample("3.45 + 2.31 = ?", Arrays.asList("Line up decimals", "5+1=6, 4+3=7, 3+2=5"), "5.76"),
            new WorkedExample("5.8 - 2.3 = ?", Arrays.asList("Line up: 8-3=5, 5-2=3"), "3.5"),
            new WorkedExample("1.25 + 0.75 = ?", Arrays.asList("5+5=10 carry, 2+7+1=10 carry, 1+0+1=2"), "2.00"),
            new WorkedExample("10 - 3.45 = ?", Arrays.asList("10.00 - 3.45, borrow"), "6.55"),
            new WorkedExample("4.56 + 3.44 = ?", Arrays.asList("6+4=10 carry, 5+4+1=10 carry, 4+3+1=8"), "8.00")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-decimals", "Multiplying Decimals", "27", "Multiply decimals and count decimal places.", "Chapter 8: Decimals", 27,
            Arrays.asList(new Section("Worked Examples", "Multiply decimals and count decimal places.",
                Arrays.asList(
            new WorkedExample("0.3 x 4 = ?", Arrays.asList("3x4=12, one decimal place"), "1.2"),
            new WorkedExample("2.5 x 3 = ?", Arrays.asList("25x3=75, one decimal place"), "7.5"),
            new WorkedExample("0.6 x 0.2 = ?", Arrays.asList("6x2=12, two decimal places"), "0.12"),
            new WorkedExample("1.5 x 1.5 = ?", Arrays.asList("15x15=225, two decimal places"), "2.25"),
            new WorkedExample("0.4 x 5 = ?", Arrays.asList("4x5=20, one decimal place"), "2.0")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-decimals", "Dividing Decimals", "28", "Divide decimals by whole numbers and decimals.", "Chapter 8: Decimals", 28,
            Arrays.asList(new Section("Worked Examples", "Divide decimals by whole numbers and decimals.",
                Arrays.asList(
            new WorkedExample("6.4 / 2 = ?", Arrays.asList("64/2=32, one decimal place"), "3.2"),
            new WorkedExample("7.5 / 5 = ?", Arrays.asList("75/5=15, one decimal place"), "1.5"),
            new WorkedExample("0.36 / 4 = ?", Arrays.asList("36/4=9, two decimal places"), "0.09"),
            new WorkedExample("4.8 / 0.6 = ?", Arrays.asList("Move decimal: 48/6=8"), "8"),
            new WorkedExample("1.44 / 1.2 = ?", Arrays.asList("Move decimal: 14.4/12=1.2"), "1.2")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("percent-basics", "Understanding Percents", "29", "Convert between fractions, decimals, and percents.", "Chapter 9: Percents and Ratios", 29,
            Arrays.asList(new Section("Worked Examples", "Convert between fractions, decimals, and percents.",
                Arrays.asList(
            new WorkedExample("Write 50% as a fraction", Arrays.asList("50 per 100 = 50/100"), "1/2"),
            new WorkedExample("Write 0.75 as a percent", Arrays.asList("Move decimal 2 right"), "75%"),
            new WorkedExample("What is 25% of 80?", Arrays.asList("25/100 x 80 = 20", "or 80/4 = 20"), "20"),
            new WorkedExample("Write 1/5 as a percent", Arrays.asList("1/5 = 0.20 = 20%"), "20%"),
            new WorkedExample("10% of 250 = ?", Arrays.asList("Move decimal left: 25.0"), "25")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("ratios-rates", "Ratios and Rates", "30", "Write and simplify ratios. Calculate unit rates.", "Chapter 9: Percents and Ratios", 30,
            Arrays.asList(new Section("Worked Examples", "Write and simplify ratios. Calculate unit rates.",
                Arrays.asList(
            new WorkedExample("Write ratio of 3 cats to 5 dogs", Arrays.asList("cats:dogs = 3:5"), "3:5 or 3/5"),
            new WorkedExample("Simplify ratio 12:8", Arrays.asList("Divide both by 4"), "3:2"),
            new WorkedExample("Unit rate: 120 miles in 2 hours", Arrays.asList("120/2 = 60"), "60 miles per hour"),
            new WorkedExample("Ratio of 4 red to 6 blue. Simplify.", Arrays.asList("Divide by 2"), "2:3"),
            new WorkedExample("15 apples cost $3. Price per apple?", Arrays.asList("3/15 = $0.20"), "$0.20 each")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("proportions", "Proportions", "31", "Solve proportions using cross multiplication.", "Chapter 9: Percents and Ratios", 31,
            Arrays.asList(new Section("Worked Examples", "Solve proportions using cross multiplication.",
                Arrays.asList(
            new WorkedExample("Solve: 2/3 = x/12", Arrays.asList("Cross multiply: 2x12=3x", "24=3x, x=8"), "x = 8"),
            new WorkedExample("Solve: 4/5 = 8/x", Arrays.asList("Cross multiply: 4x=40", "x=10"), "x = 10"),
            new WorkedExample("Solve: x/6 = 5/3", Arrays.asList("Cross multiply: 3x=30", "x=10"), "x = 10"),
            new WorkedExample("If 3 pencils cost $1.50, how much for 7?", Arrays.asList("1.50/3 = 0.50 each", "0.50 x 7 = 3.50"), "$3.50"),
            new WorkedExample("Scale: 1 inch = 5 miles. 3 inches = ?", Arrays.asList("3 x 5 = 15"), "15 miles")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("geometry-lines-angles", "Lines and Angles", "32", "Identify types of lines and measure angles.", "Chapter 10: Geometry", 32,
            Arrays.asList(new Section("Worked Examples", "Identify types of lines and measure angles.",
                Arrays.asList(
            new WorkedExample("What type of angle is 90 degrees?", Arrays.asList("Exactly 90 = right angle"), "Right angle"),
            new WorkedExample("An angle of 45 degrees is:", Arrays.asList("Less than 90 = acute"), "Acute"),
            new WorkedExample("An angle of 120 degrees is:", Arrays.asList("Greater than 90 = obtuse"), "Obtuse"),
            new WorkedExample("Parallel lines:", Arrays.asList("Never cross, same direction"), "Never intersect"),
            new WorkedExample("Perpendicular lines form:", Arrays.asList("They cross at 90 degrees"), "Right angles")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("triangles", "Triangles", "33", "Classify triangles and find missing angles.", "Chapter 10: Geometry", 33,
            Arrays.asList(new Section("Worked Examples", "Classify triangles and find missing angles.",
                Arrays.asList(
            new WorkedExample("Angles of a triangle sum to:", Arrays.asList("Always true for any triangle"), "180 degrees"),
            new WorkedExample("A triangle with all sides equal is:", Arrays.asList("All equal = equilateral"), "Equilateral"),
            new WorkedExample("Find missing angle: 60, 80, ?", Arrays.asList("180 - 60 - 80 = 40"), "40 degrees"),
            new WorkedExample("A right triangle has one angle of:", Arrays.asList("Definition of right triangle"), "90 degrees"),
            new WorkedExample("Triangle with 2 equal sides:", Arrays.asList("Two equal = isosceles"), "Isosceles")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("quadrilaterals", "Quadrilaterals", "34", "Identify and classify quadrilaterals.", "Chapter 10: Geometry", 34,
            Arrays.asList(new Section("Worked Examples", "Identify and classify quadrilaterals.",
                Arrays.asList(
            new WorkedExample("How many sides does a rectangle have?", Arrays.asList("Rectangle is a quadrilateral"), "4 sides"),
            new WorkedExample("A square has all sides ___ and all angles ___", Arrays.asList("Equal sides, 90 degree angles"), "Equal, 90 degrees"),
            new WorkedExample("A parallelogram has:", Arrays.asList("Opposite sides parallel and equal"), "2 pairs of parallel sides"),
            new WorkedExample("How many right angles in a rectangle?", Arrays.asList("All corners are 90 degrees"), "4"),
            new WorkedExample("A rhombus has:", Arrays.asList("All 4 sides equal length"), "4 equal sides")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("perimeter", "Perimeter", "35", "Calculate perimeter of polygons.", "Chapter 11: Measurement", 35,
            Arrays.asList(new Section("Worked Examples", "Calculate perimeter of polygons.",
                Arrays.asList(
            new WorkedExample("Perimeter of rectangle 8 by 5", Arrays.asList("P = 2(length + width)", "P = 2(8+5) = 2(13)"), "26 units"),
            new WorkedExample("Perimeter of square with side 6", Arrays.asList("P = 4 x side = 4 x 6"), "24 units"),
            new WorkedExample("Perimeter of triangle: sides 3, 4, 5", Arrays.asList("Add all sides: 3+4+5"), "12 units"),
            new WorkedExample("Find perimeter: rectangle 10 by 3", Arrays.asList("2(10+3) = 2(13)"), "26 units"),
            new WorkedExample("Perimeter of regular hexagon side 5", Arrays.asList("6 sides x 5 = 30"), "30 units")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("area", "Area", "36", "Calculate area using formulas.", "Chapter 11: Measurement", 36,
            Arrays.asList(new Section("Worked Examples", "Calculate area using formulas.",
                Arrays.asList(
            new WorkedExample("Area of rectangle 6 by 4", Arrays.asList("Area = length x width", "6 x 4 = 24"), "24 square units"),
            new WorkedExample("Area of square with side 5", Arrays.asList("A = side x side = 5x5"), "25 square units"),
            new WorkedExample("Area of triangle: base 10, height 6", Arrays.asList("A = (1/2) x base x height", "(1/2)(10)(6) = 30"), "30 square units"),
            new WorkedExample("Area of rectangle 12 by 3", Arrays.asList("12 x 3 = 36"), "36 square units"),
            new WorkedExample("Area of triangle: base 8, height 5", Arrays.asList("(1/2)(8)(5) = 20"), "20 square units")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("volume", "Volume", "37", "Calculate volume using length x width x height.", "Chapter 11: Measurement", 37,
            Arrays.asList(new Section("Worked Examples", "Calculate volume using length x width x height.",
                Arrays.asList(
            new WorkedExample("Volume of box: 3 x 4 x 5", Arrays.asList("V = length x width x height", "3 x 4 x 5 = 60"), "60 cubic units"),
            new WorkedExample("Volume of cube with side 3", Arrays.asList("3 x 3 x 3 = 27"), "27 cubic units"),
            new WorkedExample("Volume: 10 x 2 x 4", Arrays.asList("10 x 2 = 20, 20 x 4 = 80"), "80 cubic units"),
            new WorkedExample("Volume of cube with side 5", Arrays.asList("5 x 5 x 5 = 125"), "125 cubic units"),
            new WorkedExample("Volume: 6 x 3 x 2", Arrays.asList("6 x 3 = 18, 18 x 2 = 36"), "36 cubic units")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("measurement-units", "Measurement Conversions", "38", "Convert between units of length, weight, capacity.", "Chapter 11: Measurement", 38,
            Arrays.asList(new Section("Worked Examples", "Convert between units of length, weight, capacity.",
                Arrays.asList(
            new WorkedExample("How many centimeters in 1 meter?", Arrays.asList("1 meter = 100 centimeters"), "100 cm"),
            new WorkedExample("How many inches in 1 foot?", Arrays.asList("1 foot = 12 inches"), "12 inches"),
            new WorkedExample("Convert 3 feet to inches", Arrays.asList("3 x 12 = 36"), "36 inches"),
            new WorkedExample("How many grams in 1 kilogram?", Arrays.asList("1 kg = 1,000 grams"), "1,000 grams"),
            new WorkedExample("Convert 2 meters to centimeters", Arrays.asList("2 x 100 = 200"), "200 cm")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("time-elapsed", "Time and Elapsed Time", "39", "Calculate elapsed time and read schedules.", "Chapter 11: Measurement", 39,
            Arrays.asList(new Section("Worked Examples", "Calculate elapsed time and read schedules.",
                Arrays.asList(
            new WorkedExample("Movie starts at 2:30, lasts 1 hour 45 min. Ends?", Arrays.asList("2:30 + 1:45", "Add minutes: 30+45=75=1hr15min", "2:30+1:45 = 4:15"), "4:15"),
            new WorkedExample("From 9:15 AM to 11:45 AM is how long?", Arrays.asList("9:15 to 11:15 = 2 hours", "11:15 to 11:45 = 30 min"), "2 hours 30 minutes"),
            new WorkedExample("School starts at 8:00, lunch at 11:30. How long?", Arrays.asList("8:00 to 11:00 = 3 hours", "11:00 to 11:30 = 30 min"), "3 hours 30 minutes"),
            new WorkedExample("How many minutes in 2 hours?", Arrays.asList("1 hour = 60 minutes", "2 x 60 = 120"), "120 minutes"),
            new WorkedExample("3:50 PM + 25 minutes = ?", Arrays.asList("50+25=75 minutes=1hr15min", "3:50+0:25=4:15"), "4:15 PM")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("data-graphs", "Data and Graphs", "40", "Read and create bar graphs, line graphs, pictographs.", "Chapter 12: Data and Probability", 40,
            Arrays.asList(new Section("Worked Examples", "Read and create bar graphs, line graphs, pictographs.",
                Arrays.asList(
            new WorkedExample("A bar graph shows 5 students like pizza, 3 like tacos. How many more like pizza?", Arrays.asList("5 - 3 = 2"), "2 more"),
            new WorkedExample("Read a pictograph where each symbol = 2. If 4 symbols shown:", Arrays.asList("4 x 2 = 8"), "8"),
            new WorkedExample("Which graph best shows change over time?", Arrays.asList("Line graph shows trends"), "Line graph"),
            new WorkedExample("A tally of IIII II means:", Arrays.asList("4 + 2 = 6"), "6"),
            new WorkedExample("How many total if bar graph shows: Mon=5, Tue=3, Wed=7?", Arrays.asList("5+3+7=15"), "15")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("mean-median-mode", "Mean, Median, Mode", "41", "Calculate measures of central tendency.", "Chapter 12: Data and Probability", 41,
            Arrays.asList(new Section("Worked Examples", "Calculate measures of central tendency.",
                Arrays.asList(
            new WorkedExample("Mean of 4, 6, 8, 10, 12", Arrays.asList("Sum: 4+6+8+10+12=40", "Count: 5", "40/5=8"), "8"),
            new WorkedExample("Median of 3, 7, 1, 9, 5", Arrays.asList("Order: 1,3,5,7,9", "Middle value: 5"), "5"),
            new WorkedExample("Mode of 2, 3, 3, 4, 5", Arrays.asList("3 appears most often"), "3"),
            new WorkedExample("Range of 10, 25, 15, 30", Arrays.asList("Highest - Lowest", "30 - 10 = 20"), "20"),
            new WorkedExample("Mean of 10, 20, 30", Arrays.asList("Sum=60, count=3", "60/3=20"), "20")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("probability", "Probability", "42", "Find probability of simple events.", "Chapter 12: Data and Probability", 42,
            Arrays.asList(new Section("Worked Examples", "Find probability of simple events.",
                Arrays.asList(
            new WorkedExample("Probability of heads on a coin flip", Arrays.asList("1 favorable out of 2 possible"), "1/2"),
            new WorkedExample("P(rolling a 3 on a die)", Arrays.asList("1 favorable out of 6 possible"), "1/6"),
            new WorkedExample("Bag: 3 red, 7 blue. P(red)?", Arrays.asList("3 red out of 10 total"), "3/10"),
            new WorkedExample("P(rolling even on a die)", Arrays.asList("Even: 2,4,6 = 3 outcomes", "3 out of 6"), "1/2"),
            new WorkedExample("Spinner with 4 equal sections. P(landing on blue)?", Arrays.asList("1 out of 4"), "1/4")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("patterns-sequences", "Patterns and Sequences", "43", "Identify and extend number patterns.", "Chapter 13: Pre-Algebra", 43,
            Arrays.asList(new Section("Worked Examples", "Identify and extend number patterns.",
                Arrays.asList(
            new WorkedExample("Next in pattern: 2, 4, 6, 8, __", Arrays.asList("Add 2 each time"), "10"),
            new WorkedExample("Next: 1, 4, 9, 16, __", Arrays.asList("Perfect squares: 1,4,9,16,25"), "25"),
            new WorkedExample("Next: 3, 6, 12, 24, __", Arrays.asList("Double each time"), "48"),
            new WorkedExample("Pattern rule: 5, 10, 15, 20", Arrays.asList("Add 5 each time", "Rule: multiply position by 5"), "Add 5"),
            new WorkedExample("Next: 1, 1, 2, 3, 5, 8, __", Arrays.asList("Add last two numbers", "5+8=13"), "13")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("order-of-operations", "Order of Operations", "44", "Apply PEMDAS to evaluate expressions.", "Chapter 13: Pre-Algebra", 44,
            Arrays.asList(new Section("Worked Examples", "Apply PEMDAS to evaluate expressions.",
                Arrays.asList(
            new WorkedExample("Evaluate: 3 + 2 x 4", Arrays.asList("Multiply first: 2x4=8", "Then add: 3+8=11"), "11 (not 20)"),
            new WorkedExample("Evaluate: (5+3) x 2", Arrays.asList("Parentheses first: 5+3=8", "Then multiply: 8x2=16"), "16"),
            new WorkedExample("Evaluate: 12 / 4 + 2", Arrays.asList("Divide first: 12/4=3", "Then add: 3+2=5"), "5"),
            new WorkedExample("Evaluate: 2 + 3^2", Arrays.asList("Exponent first: 3^2=9", "Then add: 2+9=11"), "11"),
            new WorkedExample("Evaluate: (8-2) x (4+1)", Arrays.asList("Parentheses: 6 x 5"), "30")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("variables-expressions", "Variables and Expressions", "45", "Evaluate algebraic expressions.", "Chapter 13: Pre-Algebra", 45,
            Arrays.asList(new Section("Worked Examples", "Evaluate algebraic expressions.",
                Arrays.asList(
            new WorkedExample("Evaluate 3x + 1 when x = 4", Arrays.asList("3(4) + 1 = 12 + 1"), "13"),
            new WorkedExample("Evaluate 2n - 3 when n = 5", Arrays.asList("2(5) - 3 = 10 - 3"), "7"),
            new WorkedExample("Evaluate x^2 + 2 when x = 3", Arrays.asList("3^2 + 2 = 9 + 2"), "11"),
            new WorkedExample("If a = 2 and b = 5, find a + b", Arrays.asList("2 + 5 = 7"), "7"),
            new WorkedExample("Evaluate 4y when y = 6", Arrays.asList("4 x 6 = 24"), "24")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("solving-equations", "Solving Equations", "46", "Solve one-step equations using inverse operations.", "Chapter 13: Pre-Algebra", 46,
            Arrays.asList(new Section("Worked Examples", "Solve one-step equations using inverse operations.",
                Arrays.asList(
            new WorkedExample("Solve: x + 5 = 12", Arrays.asList("Subtract 5 from both sides", "x = 12 - 5"), "x = 7"),
            new WorkedExample("Solve: x - 3 = 8", Arrays.asList("Add 3 to both sides", "x = 8 + 3"), "x = 11"),
            new WorkedExample("Solve: 3x = 15", Arrays.asList("Divide both sides by 3", "x = 15/3"), "x = 5"),
            new WorkedExample("Solve: x/4 = 3", Arrays.asList("Multiply both sides by 4", "x = 3 x 4"), "x = 12"),
            new WorkedExample("Solve: 2x + 1 = 9", Arrays.asList("Subtract 1: 2x=8", "Divide by 2: x=4"), "x = 4")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("integers", "Integers", "47", "Understand positive and negative integers.", "Chapter 14: Integers", 47,
            Arrays.asList(new Section("Worked Examples", "Understand positive and negative integers.",
                Arrays.asList(
            new WorkedExample("What is the opposite of 5?", Arrays.asList("Opposite = other side of 0"), " -5"),
            new WorkedExample("Order: -3, 0, 2, -1", Arrays.asList("Least to greatest on number line"), " -3, -1, 0, 2"),
            new WorkedExample("Which is greater: -4 or -1?", Arrays.asList("On number line: -1 is further right"), " -1"),
            new WorkedExample("Absolute value of -7", Arrays.asList("Distance from 0 (always positive)"), "7"),
            new WorkedExample("|-3| + |2| = ?", Arrays.asList("3 + 2 = 5"), "5")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-integers", "Adding Integers", "48", "Add and subtract positive and negative numbers.", "Chapter 14: Integers", 48,
            Arrays.asList(new Section("Worked Examples", "Add and subtract positive and negative numbers.",
                Arrays.asList(
            new WorkedExample("5 + (-3) = ?", Arrays.asList("Start at 5, move left 3"), "2"),
            new WorkedExample("-4 + (-2) = ?", Arrays.asList("Both negative: add, keep negative"), " -6"),
            new WorkedExample("-7 + 3 = ?", Arrays.asList("Start at -7, move right 3"), " -4"),
            new WorkedExample("8 - (-2) = ?", Arrays.asList("Subtracting negative = adding", "8 + 2 = 10"), "10"),
            new WorkedExample("-5 + 5 = ?", Arrays.asList("Opposites add to zero"), "0")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("coordinate-plane", "Coordinate Plane", "49", "Plot and identify points on a coordinate grid.", "Chapter 14: Integers", 49,
            Arrays.asList(new Section("Worked Examples", "Plot and identify points on a coordinate grid.",
                Arrays.asList(
            new WorkedExample("Plot (3, 2): how?", Arrays.asList("Right 3 on x-axis", "Up 2 on y-axis"), "Right 3, up 2"),
            new WorkedExample("What quadrant is (-2, 4) in?", Arrays.asList("Negative x, positive y"), "Quadrant II"),
            new WorkedExample("What are coordinates of the origin?", Arrays.asList("Center where axes cross"), "(0, 0)"),
            new WorkedExample("Point (4, -1) is in which quadrant?", Arrays.asList("Positive x, negative y"), "Quadrant IV"),
            new WorkedExample("Plot (-3, -2): how?", Arrays.asList("Left 3, down 2"), "Left 3, down 2")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("problem-solving-strategies", "Problem Solving Strategies", "50", "Apply multiple strategies to solve complex problems.", "Chapter 15: Problem Solving", 50,
            Arrays.asList(new Section("Worked Examples", "Apply multiple strategies to solve complex problems.",
                Arrays.asList(
            new WorkedExample("Find pattern: 1,1,2,3,5,8,__", Arrays.asList("Fibonacci: add last two", "5+8=13"), "13"),
            new WorkedExample("Work backwards: result is 20 after doubling and adding 4. Start?", Arrays.asList("20-4=16", "16/2=8"), "8"),
            new WorkedExample("3 shirts, 4 pants. How many outfits?", Arrays.asList("Multiply choices: 3x4"), "12 outfits"),
            new WorkedExample("Guess and check: x + x + 3 = 15", Arrays.asList("Try x=6: 6+6+3=15. Yes!"), "x = 6"),
            new WorkedExample("A train goes 60 mph for 2.5 hours. Distance?", Arrays.asList("60 x 2.5 = 150"), "150 miles")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
    }
}