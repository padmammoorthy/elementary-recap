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
            Arrays.asList(new Section("Concepts and Examples", "Master basic addition and subtraction facts.",
                Arrays.asList(
            new WorkedExample("8+7=?", Arrays.asList("Count up from 8: 9,10,11,12,13,14,15"), "15"),
            new WorkedExample("15-9=?", Arrays.asList("Think: 9+?=15, answer is 6"), "6"),
            new WorkedExample("What is 6+8?", Arrays.asList("6+8=14"), "14"),
            new WorkedExample("Subtract: 17-8", Arrays.asList("Start at 17, count back 8"), "9"),
            new WorkedExample("Find: 9+6", Arrays.asList("9+1=10, then +5=15"), "15")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("place-value", "Place Value", "2", "Understand place value through thousands.", "Chapter 1: Number Sense", 2,
            Arrays.asList(new Section("Concepts and Examples", "Understand place value through thousands.",
                Arrays.asList(
            new WorkedExample("What digit is in hundreds place of 4725?", Arrays.asList("Count from right: ones(5), tens(2), hundreds(7)"), "7"),
            new WorkedExample("Value of 3 in 3456?", Arrays.asList("3 is in thousands place: 3x1000=3000"), "3,000"),
            new WorkedExample("Write 5000+200+30+1", Arrays.asList("Add each place value together"), "5,231"),
            new WorkedExample("How many hundreds in 2400?", Arrays.asList("2400 divided by 100 = 24"), "24"),
            new WorkedExample("Expanded form of 6204?", Arrays.asList("6000+200+0+4 (no tens)"), "6,000+200+4")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-ordering", "Comparing and Ordering Numbers", "3", "Compare numbers using symbols.", "Chapter 1: Number Sense", 3,
            Arrays.asList(new Section("Concepts and Examples", "Compare numbers using symbols.",
                Arrays.asList(
            new WorkedExample("Compare 456 and 465", Arrays.asList("Same hundreds(4), compare tens: 5<6"), "465 is greater"),
            new WorkedExample("Order: 78,98,89 least to greatest", Arrays.asList("Compare each pair"), "78, 89, 98"),
            new WorkedExample("Fill in: 452 __ 425", Arrays.asList("Compare hundreds same, tens 5>2"), "452 > 425"),
            new WorkedExample("Which is largest: 234,243,324?", Arrays.asList("Compare hundreds first: 3>2"), "324"),
            new WorkedExample("Is 999 less than 1000?", Arrays.asList("Three digits < four digits"), "Yes")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("rounding-estimating", "Rounding and Estimating", "4", "Round numbers and estimate answers.", "Chapter 1: Number Sense", 4,
            Arrays.asList(new Section("Concepts and Examples", "Round numbers and estimate answers.",
                Arrays.asList(
            new WorkedExample("Round 67 to nearest ten", Arrays.asList("Look at ones: 7>=5, round up"), "70"),
            new WorkedExample("Round 345 to nearest hundred", Arrays.asList("Look at tens: 4<5, round down"), "300"),
            new WorkedExample("Estimate 48+33", Arrays.asList("Round: 50+30=80"), "About 80"),
            new WorkedExample("Round 2750 to nearest thousand", Arrays.asList("Look at hundreds: 7>=5, round up"), "3,000"),
            new WorkedExample("Estimate 89-42", Arrays.asList("Round: 90-40=50"), "About 50")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("addition-regrouping", "Addition with Regrouping", "5", "Add multi-digit numbers with carrying.", "Chapter 2: Addition and Subtraction", 5,
            Arrays.asList(new Section("Concepts and Examples", "Add multi-digit numbers with carrying.",
                Arrays.asList(
            new WorkedExample("456+278=?", Arrays.asList("6+8=14, write 4 carry 1", "5+7+1=13, write 3 carry 1", "4+2+1=7"), "734"),
            new WorkedExample("567+345=?", Arrays.asList("7+5=12 carry 1", "6+4+1=11 carry 1", "5+3+1=9"), "912"),
            new WorkedExample("1245+3678=?", Arrays.asList("Add column by column with carrying"), "4,923"),
            new WorkedExample("789+456=?", Arrays.asList("9+6=15 carry", "8+5+1=14 carry", "7+4+1=12"), "1,245"),
            new WorkedExample("999+999=?", Arrays.asList("9+9=18 carry, repeat"), "1,998")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtraction-regrouping", "Subtraction with Regrouping", "6", "Subtract with borrowing.", "Chapter 2: Addition and Subtraction", 6,
            Arrays.asList(new Section("Concepts and Examples", "Subtract with borrowing.",
                Arrays.asList(
            new WorkedExample("Practice Subtraction with Regrouping", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Subtraction with Regrouping", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Subtraction with Regrouping", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Subtraction with Regrouping", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Subtraction with Regrouping", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-add-sub", "Word Problems (Add/Subtract)", "7", "Solve word problems.", "Chapter 2: Addition and Subtraction", 7,
            Arrays.asList(new Section("Concepts and Examples", "Solve word problems.",
                Arrays.asList(
            new WorkedExample("Practice Word Problems (Add/Subtract)", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Word Problems (Add/Subtract)", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Word Problems (Add/Subtract)", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Word Problems (Add/Subtract)", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Word Problems (Add/Subtract)", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplication-facts", "Multiplication Facts", "8", "Master times tables.", "Chapter 3: Multiplication", 8,
            Arrays.asList(new Section("Concepts and Examples", "Master times tables.",
                Arrays.asList(
            new WorkedExample("Practice Multiplication Facts", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Multiplication Facts", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Multiplication Facts", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Multiplication Facts", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Multiplication Facts", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multi-digit-multiplication", "Multi-Digit Multiplication", "9", "Multiply larger numbers.", "Chapter 3: Multiplication", 9,
            Arrays.asList(new Section("Concepts and Examples", "Multiply larger numbers.",
                Arrays.asList(
            new WorkedExample("Practice Multi-Digit Multiplication", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Multi-Digit Multiplication", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Multi-Digit Multiplication", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Multi-Digit Multiplication", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Multi-Digit Multiplication", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("division-facts", "Division Facts", "10", "Master division facts.", "Chapter 4: Division", 10,
            Arrays.asList(new Section("Concepts and Examples", "Master division facts.",
                Arrays.asList(
            new WorkedExample("Practice Division Facts", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Division Facts", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Division Facts", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Division Facts", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Division Facts", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("long-division", "Long Division", "11", "Divide multi-digit numbers.", "Chapter 4: Division", 11,
            Arrays.asList(new Section("Concepts and Examples", "Divide multi-digit numbers.",
                Arrays.asList(
            new WorkedExample("Practice Long Division", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Long Division", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Long Division", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Long Division", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Long Division", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-mult-div", "Word Problems (Multiply/Divide)", "12", "Solve word problems.", "Chapter 4: Division", 12,
            Arrays.asList(new Section("Concepts and Examples", "Solve word problems.",
                Arrays.asList(
            new WorkedExample("Practice Word Problems (Multiply/Divide)", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Word Problems (Multiply/Divide)", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Word Problems (Multiply/Divide)", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Word Problems (Multiply/Divide)", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Word Problems (Multiply/Divide)", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("factors-multiples", "Factors and Multiples", "13", "Find GCF and LCM.", "Chapter 5: Number Theory", 13,
            Arrays.asList(new Section("Concepts and Examples", "Find GCF and LCM.",
                Arrays.asList(
            new WorkedExample("Practice Factors and Multiples", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Factors and Multiples", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Factors and Multiples", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Factors and Multiples", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Factors and Multiples", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("prime-composite", "Prime and Composite Numbers", "14", "Identify primes.", "Chapter 5: Number Theory", 14,
            Arrays.asList(new Section("Concepts and Examples", "Identify primes.",
                Arrays.asList(
            new WorkedExample("Practice Prime and Composite Numbers", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Prime and Composite Numbers", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Prime and Composite Numbers", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Prime and Composite Numbers", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Prime and Composite Numbers", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("divisibility-rules", "Divisibility Rules", "15", "Test divisibility.", "Chapter 5: Number Theory", 15,
            Arrays.asList(new Section("Concepts and Examples", "Test divisibility.",
                Arrays.asList(
            new WorkedExample("Practice Divisibility Rules", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Divisibility Rules", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Divisibility Rules", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Divisibility Rules", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Divisibility Rules", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("fraction-basics", "Understanding Fractions", "16", "Parts of a whole.", "Chapter 6: Fractions", 16,
            Arrays.asList(new Section("Concepts and Examples", "Parts of a whole.",
                Arrays.asList(
            new WorkedExample("Practice Understanding Fractions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Understanding Fractions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Understanding Fractions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Understanding Fractions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Understanding Fractions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("equivalent-fractions", "Equivalent Fractions", "17", "Find equivalent fractions.", "Chapter 6: Fractions", 17,
            Arrays.asList(new Section("Concepts and Examples", "Find equivalent fractions.",
                Arrays.asList(
            new WorkedExample("Practice Equivalent Fractions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Equivalent Fractions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Equivalent Fractions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Equivalent Fractions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Equivalent Fractions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-fractions", "Comparing Fractions", "18", "Compare fractions.", "Chapter 6: Fractions", 18,
            Arrays.asList(new Section("Concepts and Examples", "Compare fractions.",
                Arrays.asList(
            new WorkedExample("Practice Comparing Fractions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Comparing Fractions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Comparing Fractions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Comparing Fractions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Comparing Fractions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-fractions", "Adding Fractions", "19", "Add with like/unlike denominators.", "Chapter 7: Fraction Operations", 19,
            Arrays.asList(new Section("Concepts and Examples", "Add with like/unlike denominators.",
                Arrays.asList(
            new WorkedExample("Practice Adding Fractions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Adding Fractions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Adding Fractions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Adding Fractions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Adding Fractions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtracting-fractions", "Subtracting Fractions", "20", "Subtract fractions.", "Chapter 7: Fraction Operations", 20,
            Arrays.asList(new Section("Concepts and Examples", "Subtract fractions.",
                Arrays.asList(
            new WorkedExample("Practice Subtracting Fractions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Subtracting Fractions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Subtracting Fractions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Subtracting Fractions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Subtracting Fractions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-fractions", "Multiplying Fractions", "21", "Multiply fractions.", "Chapter 7: Fraction Operations", 21,
            Arrays.asList(new Section("Concepts and Examples", "Multiply fractions.",
                Arrays.asList(
            new WorkedExample("Practice Multiplying Fractions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Multiplying Fractions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Multiplying Fractions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Multiplying Fractions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Multiplying Fractions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-fractions", "Dividing Fractions", "22", "Divide using reciprocals.", "Chapter 7: Fraction Operations", 22,
            Arrays.asList(new Section("Concepts and Examples", "Divide using reciprocals.",
                Arrays.asList(
            new WorkedExample("Practice Dividing Fractions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Dividing Fractions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Dividing Fractions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Dividing Fractions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Dividing Fractions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("mixed-numbers", "Mixed Numbers", "23", "Convert mixed and improper.", "Chapter 7: Fraction Operations", 23,
            Arrays.asList(new Section("Concepts and Examples", "Convert mixed and improper.",
                Arrays.asList(
            new WorkedExample("Practice Mixed Numbers", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Mixed Numbers", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Mixed Numbers", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Mixed Numbers", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Mixed Numbers", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("decimal-basics", "Understanding Decimals", "24", "Read and write decimals.", "Chapter 8: Decimals", 24,
            Arrays.asList(new Section("Concepts and Examples", "Read and write decimals.",
                Arrays.asList(
            new WorkedExample("Practice Understanding Decimals", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Understanding Decimals", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Understanding Decimals", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Understanding Decimals", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Understanding Decimals", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-decimals", "Comparing Decimals", "25", "Compare using place value.", "Chapter 8: Decimals", 25,
            Arrays.asList(new Section("Concepts and Examples", "Compare using place value.",
                Arrays.asList(
            new WorkedExample("Practice Comparing Decimals", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Comparing Decimals", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Comparing Decimals", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Comparing Decimals", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Comparing Decimals", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-subtracting-decimals", "Adding/Subtracting Decimals", "26", "Line up decimal points.", "Chapter 8: Decimals", 26,
            Arrays.asList(new Section("Concepts and Examples", "Line up decimal points.",
                Arrays.asList(
            new WorkedExample("Practice Adding/Subtracting Decimals", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Adding/Subtracting Decimals", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Adding/Subtracting Decimals", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Adding/Subtracting Decimals", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Adding/Subtracting Decimals", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-decimals", "Multiplying Decimals", "27", "Count decimal places.", "Chapter 8: Decimals", 27,
            Arrays.asList(new Section("Concepts and Examples", "Count decimal places.",
                Arrays.asList(
            new WorkedExample("Practice Multiplying Decimals", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Multiplying Decimals", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Multiplying Decimals", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Multiplying Decimals", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Multiplying Decimals", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-decimals", "Dividing Decimals", "28", "Move decimal in divisor.", "Chapter 8: Decimals", 28,
            Arrays.asList(new Section("Concepts and Examples", "Move decimal in divisor.",
                Arrays.asList(
            new WorkedExample("Practice Dividing Decimals", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Dividing Decimals", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Dividing Decimals", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Dividing Decimals", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Dividing Decimals", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("percent-basics", "Understanding Percents", "29", "Convert fractions/decimals/percents.", "Chapter 9: Percents and Ratios", 29,
            Arrays.asList(new Section("Concepts and Examples", "Convert fractions/decimals/percents.",
                Arrays.asList(
            new WorkedExample("Practice Understanding Percents", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Understanding Percents", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Understanding Percents", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Understanding Percents", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Understanding Percents", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("ratios-rates", "Ratios and Rates", "30", "Write and simplify ratios.", "Chapter 9: Percents and Ratios", 30,
            Arrays.asList(new Section("Concepts and Examples", "Write and simplify ratios.",
                Arrays.asList(
            new WorkedExample("Practice Ratios and Rates", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Ratios and Rates", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Ratios and Rates", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Ratios and Rates", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Ratios and Rates", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("proportions", "Proportions", "31", "Cross multiply to solve.", "Chapter 9: Percents and Ratios", 31,
            Arrays.asList(new Section("Concepts and Examples", "Cross multiply to solve.",
                Arrays.asList(
            new WorkedExample("Practice Proportions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Proportions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Proportions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Proportions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Proportions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("geometry-lines-angles", "Lines and Angles", "32", "Types of lines and angles.", "Chapter 10: Geometry", 32,
            Arrays.asList(new Section("Concepts and Examples", "Types of lines and angles.",
                Arrays.asList(
            new WorkedExample("Practice Lines and Angles", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Lines and Angles", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Lines and Angles", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Lines and Angles", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Lines and Angles", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("triangles", "Triangles", "33", "Classify and find angles.", "Chapter 10: Geometry", 33,
            Arrays.asList(new Section("Concepts and Examples", "Classify and find angles.",
                Arrays.asList(
            new WorkedExample("Practice Triangles", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Triangles", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Triangles", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Triangles", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Triangles", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("quadrilaterals", "Quadrilaterals", "34", "Identify shapes.", "Chapter 10: Geometry", 34,
            Arrays.asList(new Section("Concepts and Examples", "Identify shapes.",
                Arrays.asList(
            new WorkedExample("Practice Quadrilaterals", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Quadrilaterals", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Quadrilaterals", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Quadrilaterals", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Quadrilaterals", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("perimeter", "Perimeter", "35", "Add all sides.", "Chapter 11: Measurement", 35,
            Arrays.asList(new Section("Concepts and Examples", "Add all sides.",
                Arrays.asList(
            new WorkedExample("Practice Perimeter", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Perimeter", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Perimeter", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Perimeter", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Perimeter", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("area", "Area", "36", "Length times width.", "Chapter 11: Measurement", 36,
            Arrays.asList(new Section("Concepts and Examples", "Length times width.",
                Arrays.asList(
            new WorkedExample("Practice Area", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Area", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Area", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Area", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Area", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("volume", "Volume", "37", "L x W x H.", "Chapter 11: Measurement", 37,
            Arrays.asList(new Section("Concepts and Examples", "L x W x H.",
                Arrays.asList(
            new WorkedExample("Practice Volume", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Volume", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Volume", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Volume", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Volume", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("measurement-units", "Measurement Conversions", "38", "Convert units.", "Chapter 11: Measurement", 38,
            Arrays.asList(new Section("Concepts and Examples", "Convert units.",
                Arrays.asList(
            new WorkedExample("Practice Measurement Conversions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Measurement Conversions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Measurement Conversions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Measurement Conversions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Measurement Conversions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("time-elapsed", "Time and Elapsed Time", "39", "Calculate time differences.", "Chapter 11: Measurement", 39,
            Arrays.asList(new Section("Concepts and Examples", "Calculate time differences.",
                Arrays.asList(
            new WorkedExample("Practice Time and Elapsed Time", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Time and Elapsed Time", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Time and Elapsed Time", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Time and Elapsed Time", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Time and Elapsed Time", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("data-graphs", "Data and Graphs", "40", "Read graphs.", "Chapter 12: Data and Probability", 40,
            Arrays.asList(new Section("Concepts and Examples", "Read graphs.",
                Arrays.asList(
            new WorkedExample("Practice Data and Graphs", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Data and Graphs", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Data and Graphs", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Data and Graphs", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Data and Graphs", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("mean-median-mode", "Mean, Median, Mode", "41", "Measures of center.", "Chapter 12: Data and Probability", 41,
            Arrays.asList(new Section("Concepts and Examples", "Measures of center.",
                Arrays.asList(
            new WorkedExample("Practice Mean, Median, Mode", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Mean, Median, Mode", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Mean, Median, Mode", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Mean, Median, Mode", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Mean, Median, Mode", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("probability", "Probability", "42", "Likelihood of events.", "Chapter 12: Data and Probability", 42,
            Arrays.asList(new Section("Concepts and Examples", "Likelihood of events.",
                Arrays.asList(
            new WorkedExample("Practice Probability", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Probability", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Probability", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Probability", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Probability", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("patterns-sequences", "Patterns and Sequences", "43", "Find the pattern.", "Chapter 13: Pre-Algebra", 43,
            Arrays.asList(new Section("Concepts and Examples", "Find the pattern.",
                Arrays.asList(
            new WorkedExample("Practice Patterns and Sequences", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Patterns and Sequences", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Patterns and Sequences", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Patterns and Sequences", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Patterns and Sequences", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("order-of-operations", "Order of Operations", "44", "PEMDAS.", "Chapter 13: Pre-Algebra", 44,
            Arrays.asList(new Section("Concepts and Examples", "PEMDAS.",
                Arrays.asList(
            new WorkedExample("Practice Order of Operations", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Order of Operations", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Order of Operations", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Order of Operations", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Order of Operations", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("variables-expressions", "Variables and Expressions", "45", "Evaluate expressions.", "Chapter 13: Pre-Algebra", 45,
            Arrays.asList(new Section("Concepts and Examples", "Evaluate expressions.",
                Arrays.asList(
            new WorkedExample("Practice Variables and Expressions", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Variables and Expressions", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Variables and Expressions", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Variables and Expressions", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Variables and Expressions", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("solving-equations", "Solving Equations", "46", "Use inverse operations.", "Chapter 13: Pre-Algebra", 46,
            Arrays.asList(new Section("Concepts and Examples", "Use inverse operations.",
                Arrays.asList(
            new WorkedExample("Practice Solving Equations", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Solving Equations", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Solving Equations", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Solving Equations", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Solving Equations", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("integers", "Integers", "47", "Positive and negative numbers.", "Chapter 14: Integers", 47,
            Arrays.asList(new Section("Concepts and Examples", "Positive and negative numbers.",
                Arrays.asList(
            new WorkedExample("Practice Integers", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Integers", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Integers", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Integers", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Integers", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-integers", "Adding Integers", "48", "Rules for integer addition.", "Chapter 14: Integers", 48,
            Arrays.asList(new Section("Concepts and Examples", "Rules for integer addition.",
                Arrays.asList(
            new WorkedExample("Practice Adding Integers", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Adding Integers", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Adding Integers", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Adding Integers", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Adding Integers", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("coordinate-plane", "Coordinate Plane", "49", "Plot points (x,y).", "Chapter 14: Integers", 49,
            Arrays.asList(new Section("Concepts and Examples", "Plot points (x,y).",
                Arrays.asList(
            new WorkedExample("Practice Coordinate Plane", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Coordinate Plane", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Coordinate Plane", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Coordinate Plane", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Coordinate Plane", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
        lessons.add(new LessonContent("problem-solving-strategies", "Problem Solving Strategies", "50", "Multiple approaches.", "Chapter 15: Problem Solving", 50,
            Arrays.asList(new Section("Concepts and Examples", "Multiple approaches.",
                Arrays.asList(
            new WorkedExample("Practice Problem Solving Strategies", Arrays.asList("Step 1: Read the problem", "Step 2: Choose operation", "Step 3: Calculate", "Step 4: Check"), "Answer found"),
            new WorkedExample("Apply Problem Solving Strategies", Arrays.asList("Identify what is asked", "Set up the problem", "Solve step by step"), "Solution complete"),
            new WorkedExample("Word problem for Problem Solving Strategies", Arrays.asList("Understand the question", "Write a number sentence", "Solve and label"), "Answer with units"),
            new WorkedExample("Challenge: Problem Solving Strategies", Arrays.asList("Think about what you know", "Apply the skill", "Verify your answer"), "Verified answer"),
            new WorkedExample("Real world: Problem Solving Strategies", Arrays.asList("Connect to everyday life", "Use math to solve", "Explain your thinking"), "Real world answer")
            ))),
            Arrays.asList("Practice makes perfect", "Show your work", "Check your answer")
        ));
    }
}