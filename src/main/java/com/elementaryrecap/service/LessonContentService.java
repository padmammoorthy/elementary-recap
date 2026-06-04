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
        lessons.add(new LessonContent("number-sense-and-sequences", "Number Sense and Sequences", "1", "Identify patterns in sequences and use number sense.", "Section 1: Lessons 1-10", 1,
            Arrays.asList(new Section("Worked Examples", "Identify patterns in sequences and use number sense.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 1", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 1"),
            new WorkedExample("Practice problem for Lesson 1", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 1"),
            new WorkedExample("Practice problem for Lesson 1", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 1"),
            new WorkedExample("Practice problem for Lesson 1", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 1"),
            new WorkedExample("Practice problem for Lesson 1", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 1")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("addition-and-subtraction-facts", "Addition and Subtraction Facts", "2", "Review basic addition and subtraction facts.", "Section 1: Lessons 1-10", 2,
            Arrays.asList(new Section("Worked Examples", "Review basic addition and subtraction facts.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 2", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 2"),
            new WorkedExample("Practice problem for Lesson 2", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 2"),
            new WorkedExample("Practice problem for Lesson 2", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 2"),
            new WorkedExample("Practice problem for Lesson 2", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 2"),
            new WorkedExample("Practice problem for Lesson 2", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 2")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("place-value-through-millions", "Place Value Through Millions", "3", "Read and write numbers through millions.", "Section 1: Lessons 1-10", 3,
            Arrays.asList(new Section("Worked Examples", "Read and write numbers through millions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 3", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 3"),
            new WorkedExample("Practice problem for Lesson 3", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 3"),
            new WorkedExample("Practice problem for Lesson 3", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 3"),
            new WorkedExample("Practice problem for Lesson 3", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 3"),
            new WorkedExample("Practice problem for Lesson 3", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 3")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-and-ordering-whole-numbers", "Comparing and Ordering Whole Numbers", "4", "Use inequality symbols to compare numbers.", "Section 1: Lessons 1-10", 4,
            Arrays.asList(new Section("Worked Examples", "Use inequality symbols to compare numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 4", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 4"),
            new WorkedExample("Practice problem for Lesson 4", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 4"),
            new WorkedExample("Practice problem for Lesson 4", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 4"),
            new WorkedExample("Practice problem for Lesson 4", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 4"),
            new WorkedExample("Practice problem for Lesson 4", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 4")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("rounding-whole-numbers", "Rounding Whole Numbers", "5", "Round numbers to any place value.", "Section 1: Lessons 1-10", 5,
            Arrays.asList(new Section("Worked Examples", "Round numbers to any place value.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 5", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 5"),
            new WorkedExample("Practice problem for Lesson 5", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 5"),
            new WorkedExample("Practice problem for Lesson 5", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 5"),
            new WorkedExample("Practice problem for Lesson 5", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 5"),
            new WorkedExample("Practice problem for Lesson 5", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 5")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-whole-numbers", "Adding Whole Numbers", "6", "Add multi-digit numbers with regrouping.", "Section 1: Lessons 1-10", 6,
            Arrays.asList(new Section("Worked Examples", "Add multi-digit numbers with regrouping.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 6", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 6"),
            new WorkedExample("Practice problem for Lesson 6", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 6"),
            new WorkedExample("Practice problem for Lesson 6", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 6"),
            new WorkedExample("Practice problem for Lesson 6", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 6"),
            new WorkedExample("Practice problem for Lesson 6", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 6")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtracting-whole-numbers", "Subtracting Whole Numbers", "7", "Subtract multi-digit numbers with borrowing.", "Section 1: Lessons 1-10", 7,
            Arrays.asList(new Section("Worked Examples", "Subtract multi-digit numbers with borrowing.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 7", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 7"),
            new WorkedExample("Practice problem for Lesson 7", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 7"),
            new WorkedExample("Practice problem for Lesson 7", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 7"),
            new WorkedExample("Practice problem for Lesson 7", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 7"),
            new WorkedExample("Practice problem for Lesson 7", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 7")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplication-facts", "Multiplication Facts", "8", "Review multiplication facts through 12.", "Section 1: Lessons 1-10", 8,
            Arrays.asList(new Section("Worked Examples", "Review multiplication facts through 12.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 8", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 8"),
            new WorkedExample("Practice problem for Lesson 8", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 8"),
            new WorkedExample("Practice problem for Lesson 8", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 8"),
            new WorkedExample("Practice problem for Lesson 8", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 8"),
            new WorkedExample("Practice problem for Lesson 8", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 8")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("properties-of-addition-and-multiplicatio", "Properties of Addition and Multiplication", "9", "Apply commutative, associative, and identity properties.", "Section 1: Lessons 1-10", 9,
            Arrays.asList(new Section("Worked Examples", "Apply commutative, associative, and identity properties.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 9", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 9"),
            new WorkedExample("Practice problem for Lesson 9", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 9"),
            new WorkedExample("Practice problem for Lesson 9", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 9"),
            new WorkedExample("Practice problem for Lesson 9", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 9"),
            new WorkedExample("Practice problem for Lesson 9", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 9")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-about-combining-and-separa", "Word Problems About Combining and Separating", "10", "Solve one-step word problems.", "Section 1: Lessons 1-10", 10,
            Arrays.asList(new Section("Worked Examples", "Solve one-step word problems.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 10", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 10"),
            new WorkedExample("Practice problem for Lesson 10", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 10"),
            new WorkedExample("Practice problem for Lesson 10", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 10"),
            new WorkedExample("Practice problem for Lesson 10", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 10"),
            new WorkedExample("Practice problem for Lesson 10", Arrays.asList("Step 1: Read the problem carefully", "Step 2: Identify the operation needed", "Step 3: Calculate the answer", "Step 4: Check by estimating"), "Answer for Lesson 10")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("division-facts", "Division Facts", "11", "Review division facts and relate to multiplication.", "Section 2: Lessons 11-20", 11,
            Arrays.asList(new Section("Worked Examples", "Review division facts and relate to multiplication.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 11", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 11", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 11", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 11", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 11", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lines-segments-and-rays", "Lines, Segments, and Rays", "12", "Identify and classify lines, segments, and rays.", "Section 2: Lessons 11-20", 12,
            Arrays.asList(new Section("Worked Examples", "Identify and classify lines, segments, and rays.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 12", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 12", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 12", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 12", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 12", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("angles", "Angles", "13", "Classify and measure angles.", "Section 2: Lessons 11-20", 13,
            Arrays.asList(new Section("Worked Examples", "Classify and measure angles.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 13", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 13", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 13", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 13", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 13", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplication-multi-digit-by-one-digit", "Multiplication: Multi-Digit by One-Digit", "14", "Multiply by a single digit with regrouping.", "Section 2: Lessons 11-20", 14,
            Arrays.asList(new Section("Worked Examples", "Multiply by a single digit with regrouping.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 14", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 14", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 14", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 14", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 14", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("division-with-remainders", "Division with Remainders", "15", "Divide with remainders and interpret them.", "Section 2: Lessons 11-20", 15,
            Arrays.asList(new Section("Worked Examples", "Divide with remainders and interpret them.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 15", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 15", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 15", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 15", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 15", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("even-and-odd-numbers", "Even and Odd Numbers", "16", "Identify even and odd numbers and their properties.", "Section 2: Lessons 11-20", 16,
            Arrays.asList(new Section("Worked Examples", "Identify even and odd numbers and their properties.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 16", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 16", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 16", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 16", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 16", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("factors", "Factors", "17", "Find all factor pairs of a number.", "Section 2: Lessons 11-20", 17,
            Arrays.asList(new Section("Worked Examples", "Find all factor pairs of a number.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 17", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 17", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 17", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 17", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 17", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-about-equal-groups", "Word Problems About Equal Groups", "18", "Solve multiplication and division word problems.", "Section 2: Lessons 11-20", 18,
            Arrays.asList(new Section("Worked Examples", "Solve multiplication and division word problems.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 18", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 18", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 18", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 18", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 18", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fractions-parts-of-a-whole", "Fractions: Parts of a Whole", "19", "Represent and identify fractions.", "Section 2: Lessons 11-20", 19,
            Arrays.asList(new Section("Worked Examples", "Represent and identify fractions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 19", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 19", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 19", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 19", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 19", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fractions-parts-of-a-set", "Fractions: Parts of a Set", "20", "Find a fraction of a group of objects.", "Section 2: Lessons 11-20", 20,
            Arrays.asList(new Section("Worked Examples", "Find a fraction of a group of objects.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 20", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 20", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 20", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 20", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 20", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fractions-on-a-number-line", "Fractions on a Number Line", "21", "Locate fractions on a number line.", "Section 3: Lessons 21-30", 21,
            Arrays.asList(new Section("Worked Examples", "Locate fractions on a number line.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 21", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 21", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 21", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 21", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 21", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("equivalent-fractions", "Equivalent Fractions", "22", "Generate equivalent fractions.", "Section 3: Lessons 21-30", 22,
            Arrays.asList(new Section("Worked Examples", "Generate equivalent fractions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 22", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 22", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 22", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 22", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 22", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("reducing-fractions", "Reducing Fractions", "23", "Simplify fractions to lowest terms.", "Section 3: Lessons 21-30", 23,
            Arrays.asList(new Section("Worked Examples", "Simplify fractions to lowest terms.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 23", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 23", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 23", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 23", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 23", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-fractions", "Comparing Fractions", "24", "Compare fractions with unlike denominators.", "Section 3: Lessons 21-30", 24,
            Arrays.asList(new Section("Worked Examples", "Compare fractions with unlike denominators.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 24", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 24", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 24", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 24", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 24", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("mixed-numbers-and-improper-fractions", "Mixed Numbers and Improper Fractions", "25", "Convert between mixed numbers and improper fractions.", "Section 3: Lessons 21-30", 25,
            Arrays.asList(new Section("Worked Examples", "Convert between mixed numbers and improper fractions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 25", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 25", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 25", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 25", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 25", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("elapsed-time", "Elapsed Time", "26", "Calculate elapsed time between events.", "Section 3: Lessons 21-30", 26,
            Arrays.asList(new Section("Worked Examples", "Calculate elapsed time between events.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 26", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 26", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 26", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 26", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 26", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-by-multiples-of-10-and-100", "Multiplying by Multiples of 10 and 100", "27", "Use patterns to multiply by 10, 100, 1000.", "Section 3: Lessons 21-30", 27,
            Arrays.asList(new Section("Worked Examples", "Use patterns to multiply by 10, 100, 1000.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 27", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 27", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 27", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 27", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 27", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("two-digit-multiplication", "Two-Digit Multiplication", "28", "Multiply two 2-digit numbers.", "Section 3: Lessons 21-30", 28,
            Arrays.asList(new Section("Worked Examples", "Multiply two 2-digit numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 28", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 28", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 28", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 28", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 28", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("area-of-rectangles", "Area of Rectangles", "29", "Calculate area using length times width.", "Section 3: Lessons 21-30", 29,
            Arrays.asList(new Section("Worked Examples", "Calculate area using length times width.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 29", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 29", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 29", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 29", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 29", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-about-comparison", "Word Problems About Comparison", "30", "Solve comparison word problems.", "Section 3: Lessons 21-30", 30,
            Arrays.asList(new Section("Worked Examples", "Solve comparison word problems.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 30", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 30", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 30", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 30", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 30", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("long-division-one-digit-divisors", "Long Division: One-Digit Divisors", "31", "Divide multi-digit numbers by one digit.", "Section 4: Lessons 31-40", 31,
            Arrays.asList(new Section("Worked Examples", "Divide multi-digit numbers by one digit.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 31", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 31", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 31", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 31", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 31", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("perimeter", "Perimeter", "32", "Calculate perimeter of polygons.", "Section 4: Lessons 31-40", 32,
            Arrays.asList(new Section("Worked Examples", "Calculate perimeter of polygons.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 32", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 32", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 32", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 32", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 32", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("decimal-place-value", "Decimal Place Value", "33", "Read and write decimals through thousandths.", "Section 4: Lessons 31-40", 33,
            Arrays.asList(new Section("Worked Examples", "Read and write decimals through thousandths.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 33", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 33", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 33", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 33", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 33", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("comparing-decimals", "Comparing Decimals", "34", "Compare and order decimal numbers.", "Section 4: Lessons 31-40", 34,
            Arrays.asList(new Section("Worked Examples", "Compare and order decimal numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 34", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 34", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 34", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 34", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 34", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-and-subtracting-decimals", "Adding and Subtracting Decimals", "35", "Add and subtract decimals by lining up points.", "Section 4: Lessons 31-40", 35,
            Arrays.asList(new Section("Worked Examples", "Add and subtract decimals by lining up points.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 35", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 35", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 35", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 35", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 35", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-decimals", "Multiplying Decimals", "36", "Multiply decimals and count decimal places.", "Section 4: Lessons 31-40", 36,
            Arrays.asList(new Section("Worked Examples", "Multiply decimals and count decimal places.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 36", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 36", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 36", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 36", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 36", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-decimals", "Dividing Decimals", "37", "Divide decimals by whole numbers.", "Section 4: Lessons 31-40", 37,
            Arrays.asList(new Section("Worked Examples", "Divide decimals by whole numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 37", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 37", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 37", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 37", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 37", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("triangles", "Triangles", "38", "Classify triangles by sides and angles.", "Section 4: Lessons 31-40", 38,
            Arrays.asList(new Section("Worked Examples", "Classify triangles by sides and angles.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 38", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 38", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 38", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 38", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 38", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("quadrilaterals", "Quadrilaterals", "39", "Identify and classify quadrilaterals.", "Section 4: Lessons 31-40", 39,
            Arrays.asList(new Section("Worked Examples", "Identify and classify quadrilaterals.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 39", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 39", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 39", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 39", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 39", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("powers-and-exponents", "Powers and Exponents", "40", "Write and evaluate numbers with exponents.", "Section 4: Lessons 31-40", 40,
            Arrays.asList(new Section("Worked Examples", "Write and evaluate numbers with exponents.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 40", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 40", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 40", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 40", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 40", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-and-subtracting-fractions-like-de", "Adding and Subtracting Fractions (Like Denominators)", "41", "Add and subtract fractions with same denominator.", "Section 5: Lessons 41-50", 41,
            Arrays.asList(new Section("Worked Examples", "Add and subtract fractions with same denominator.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 41", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 41", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 41", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 41", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 41", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-and-subtracting-fractions-unlike-", "Adding and Subtracting Fractions (Unlike Denominators)", "42", "Find LCD and add/subtract fractions.", "Section 5: Lessons 41-50", 42,
            Arrays.asList(new Section("Worked Examples", "Find LCD and add/subtract fractions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 42", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 42", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 42", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 42", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 42", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-and-subtracting-mixed-numbers", "Adding and Subtracting Mixed Numbers", "43", "Work with mixed numbers in addition and subtraction.", "Section 5: Lessons 41-50", 43,
            Arrays.asList(new Section("Worked Examples", "Work with mixed numbers in addition and subtraction.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 43", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 43", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 43", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 43", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 43", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-fractions", "Multiplying Fractions", "44", "Multiply fractions and simplify.", "Section 5: Lessons 41-50", 44,
            Arrays.asList(new Section("Worked Examples", "Multiply fractions and simplify.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 44", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 44", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 44", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 44", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 44", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("dividing-fractions", "Dividing Fractions", "45", "Divide fractions using reciprocals.", "Section 5: Lessons 41-50", 45,
            Arrays.asList(new Section("Worked Examples", "Divide fractions using reciprocals.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 45", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 45", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 45", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 45", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 45", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("fraction-decimal-percent-conversions", "Fraction-Decimal-Percent Conversions", "46", "Convert between fractions, decimals, and percents.", "Section 5: Lessons 41-50", 46,
            Arrays.asList(new Section("Worked Examples", "Convert between fractions, decimals, and percents.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 46", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 46", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 46", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 46", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 46", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("percent-of-a-number", "Percent of a Number", "47", "Calculate a percent of a given number.", "Section 5: Lessons 41-50", 47,
            Arrays.asList(new Section("Worked Examples", "Calculate a percent of a given number.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 47", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 47", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 47", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 47", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 47", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("probability", "Probability", "48", "Find probability of simple and compound events.", "Section 5: Lessons 41-50", 48,
            Arrays.asList(new Section("Worked Examples", "Find probability of simple and compound events.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 48", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 48", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 48", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 48", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 48", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("mean-median-mode-and-range", "Mean, Median, Mode, and Range", "49", "Calculate measures of central tendency.", "Section 5: Lessons 41-50", 49,
            Arrays.asList(new Section("Worked Examples", "Calculate measures of central tendency.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 49", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 49", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 49", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 49", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 49", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("circle-graphs", "Circle Graphs", "50", "Read and interpret circle graphs.", "Section 5: Lessons 41-50", 50,
            Arrays.asList(new Section("Worked Examples", "Read and interpret circle graphs.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 50", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 50", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 50", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 50", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 50", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("order-of-operations", "Order of Operations", "51", "Apply PEMDAS to evaluate expressions.", "Section 6: Lessons 51-60", 51,
            Arrays.asList(new Section("Worked Examples", "Apply PEMDAS to evaluate expressions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 51", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 51", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 51", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 51", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 51", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("divisibility-rules", "Divisibility Rules", "52", "Test divisibility by 2, 3, 5, 6, 9, and 10.", "Section 6: Lessons 51-60", 52,
            Arrays.asList(new Section("Worked Examples", "Test divisibility by 2, 3, 5, 6, 9, and 10.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 52", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 52", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 52", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 52", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 52", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("prime-and-composite-numbers", "Prime and Composite Numbers", "53", "Identify primes and find prime factorization.", "Section 6: Lessons 51-60", 53,
            Arrays.asList(new Section("Worked Examples", "Identify primes and find prime factorization.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 53", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 53", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 53", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 53", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 53", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("greatest-common-factor", "Greatest Common Factor", "54", "Find GCF of two or more numbers.", "Section 6: Lessons 51-60", 54,
            Arrays.asList(new Section("Worked Examples", "Find GCF of two or more numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 54", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 54", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 54", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 54", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 54", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("least-common-multiple", "Least Common Multiple", "55", "Find LCM of two or more numbers.", "Section 6: Lessons 51-60", 55,
            Arrays.asList(new Section("Worked Examples", "Find LCM of two or more numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 55", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 55", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 55", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 55", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 55", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("ratio", "Ratio", "56", "Write and simplify ratios.", "Section 6: Lessons 51-60", 56,
            Arrays.asList(new Section("Worked Examples", "Write and simplify ratios.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 56", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 56", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 56", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 56", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 56", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("rate", "Rate", "57", "Calculate unit rates and compare rates.", "Section 6: Lessons 51-60", 57,
            Arrays.asList(new Section("Worked Examples", "Calculate unit rates and compare rates.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 57", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 57", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 57", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 57", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 57", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("proportions", "Proportions", "58", "Solve proportions using cross-multiplication.", "Section 6: Lessons 51-60", 58,
            Arrays.asList(new Section("Worked Examples", "Solve proportions using cross-multiplication.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 58", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 58", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 58", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 58", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 58", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("scale-drawings-and-maps", "Scale Drawings and Maps", "59", "Use scales to find actual distances.", "Section 6: Lessons 51-60", 59,
            Arrays.asList(new Section("Worked Examples", "Use scales to find actual distances.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 59", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 59", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 59", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 59", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 59", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("measures-of-central-tendency", "Measures of Central Tendency", "60", "Choose appropriate measures for data sets.", "Section 6: Lessons 51-60", 60,
            Arrays.asList(new Section("Worked Examples", "Choose appropriate measures for data sets.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 60", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 60", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 60", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 60", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 60", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("angles-complementary-and-supplementary", "Angles: Complementary and Supplementary", "61", "Find missing angle measures.", "Section 7: Lessons 61-70", 61,
            Arrays.asList(new Section("Worked Examples", "Find missing angle measures.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 61", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 61", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 61", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 61", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 61", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("parallel-and-perpendicular-lines", "Parallel and Perpendicular Lines", "62", "Identify parallel and perpendicular relationships.", "Section 7: Lessons 61-70", 62,
            Arrays.asList(new Section("Worked Examples", "Identify parallel and perpendicular relationships.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 62", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 62", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 62", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 62", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 62", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("polygons", "Polygons", "63", "Classify and find angle sums of polygons.", "Section 7: Lessons 61-70", 63,
            Arrays.asList(new Section("Worked Examples", "Classify and find angle sums of polygons.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 63", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 63", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 63", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 63", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 63", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("circles", "Circles", "64", "Identify radius, diameter, chord, circumference.", "Section 7: Lessons 61-70", 64,
            Arrays.asList(new Section("Worked Examples", "Identify radius, diameter, chord, circumference.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 64", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 64", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 64", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 64", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 64", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("circumference-of-circles", "Circumference of Circles", "65", "Calculate circumference using C=pi*d.", "Section 7: Lessons 61-70", 65,
            Arrays.asList(new Section("Worked Examples", "Calculate circumference using C=pi*d.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 65", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 65", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 65", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 65", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 65", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("area-of-triangles-and-parallelograms", "Area of Triangles and Parallelograms", "66", "Use formulas for triangle and parallelogram area.", "Section 7: Lessons 61-70", 66,
            Arrays.asList(new Section("Worked Examples", "Use formulas for triangle and parallelogram area.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 66", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 66", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 66", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 66", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 66", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("area-of-circles", "Area of Circles", "67", "Calculate area using A=pi*r^2.", "Section 7: Lessons 61-70", 67,
            Arrays.asList(new Section("Worked Examples", "Calculate area using A=pi*r^2.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 67", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 67", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 67", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 67", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 67", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("volume-of-rectangular-prisms", "Volume of Rectangular Prisms", "68", "Calculate volume using l*w*h.", "Section 7: Lessons 61-70", 68,
            Arrays.asList(new Section("Worked Examples", "Calculate volume using l*w*h.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 68", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 68", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 68", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 68", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 68", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("surface-area", "Surface Area", "69", "Calculate surface area of rectangular prisms.", "Section 7: Lessons 61-70", 69,
            Arrays.asList(new Section("Worked Examples", "Calculate surface area of rectangular prisms.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 69", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 69", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 69", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 69", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 69", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("geometric-solids", "Geometric Solids", "70", "Identify prisms, pyramids, cylinders, cones, spheres.", "Section 7: Lessons 61-70", 70,
            Arrays.asList(new Section("Worked Examples", "Identify prisms, pyramids, cylinders, cones, spheres.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 70", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 70", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 70", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 70", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 70", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("integers-on-a-number-line", "Integers on a Number Line", "71", "Locate and compare integers.", "Section 8: Lessons 71-80", 71,
            Arrays.asList(new Section("Worked Examples", "Locate and compare integers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 71", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 71", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 71", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 71", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 71", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("adding-integers", "Adding Integers", "72", "Add positive and negative numbers.", "Section 8: Lessons 71-80", 72,
            Arrays.asList(new Section("Worked Examples", "Add positive and negative numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 72", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 72", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 72", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 72", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 72", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("subtracting-integers", "Subtracting Integers", "73", "Subtract integers using rules.", "Section 8: Lessons 71-80", 73,
            Arrays.asList(new Section("Worked Examples", "Subtract integers using rules.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 73", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 73", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 73", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 73", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 73", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multiplying-and-dividing-integers", "Multiplying and Dividing Integers", "74", "Apply sign rules for multiplication and division.", "Section 8: Lessons 71-80", 74,
            Arrays.asList(new Section("Worked Examples", "Apply sign rules for multiplication and division.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 74", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 74", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 74", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 74", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 74", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("the-coordinate-plane", "The Coordinate Plane", "75", "Plot and identify ordered pairs.", "Section 8: Lessons 71-80", 75,
            Arrays.asList(new Section("Worked Examples", "Plot and identify ordered pairs.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 75", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 75", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 75", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 75", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 75", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("transformations-translations", "Transformations: Translations", "76", "Translate figures on a coordinate plane.", "Section 8: Lessons 71-80", 76,
            Arrays.asList(new Section("Worked Examples", "Translate figures on a coordinate plane.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 76", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 76", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 76", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 76", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 76", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("transformations-reflections", "Transformations: Reflections", "77", "Reflect figures across axes.", "Section 8: Lessons 71-80", 77,
            Arrays.asList(new Section("Worked Examples", "Reflect figures across axes.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 77", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 77", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 77", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 77", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 77", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("transformations-rotations", "Transformations: Rotations", "78", "Rotate figures about a point.", "Section 8: Lessons 71-80", 78,
            Arrays.asList(new Section("Worked Examples", "Rotate figures about a point.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 78", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 78", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 78", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 78", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 78", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("scientific-notation", "Scientific Notation", "79", "Write numbers in scientific notation.", "Section 8: Lessons 71-80", 79,
            Arrays.asList(new Section("Worked Examples", "Write numbers in scientific notation.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 79", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 79", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 79", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 79", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 79", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("square-roots", "Square Roots", "80", "Find square roots of perfect squares.", "Section 8: Lessons 71-80", 80,
            Arrays.asList(new Section("Worked Examples", "Find square roots of perfect squares.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 80", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 80", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 80", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 80", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 80", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("variables-and-expressions", "Variables and Expressions", "81", "Evaluate algebraic expressions.", "Section 9: Lessons 81-90", 81,
            Arrays.asList(new Section("Worked Examples", "Evaluate algebraic expressions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 81", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 81", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 81", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 81", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 81", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("writing-expressions", "Writing Expressions", "82", "Translate words into algebraic expressions.", "Section 9: Lessons 81-90", 82,
            Arrays.asList(new Section("Worked Examples", "Translate words into algebraic expressions.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 82", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 82", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 82", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 82", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 82", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("solving-one-step-equations-addsubtract", "Solving One-Step Equations (Add/Subtract)", "83", "Solve equations using inverse operations.", "Section 9: Lessons 81-90", 83,
            Arrays.asList(new Section("Worked Examples", "Solve equations using inverse operations.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 83", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 83", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 83", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 83", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 83", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("solving-one-step-equations-multiplydivid", "Solving One-Step Equations (Multiply/Divide)", "84", "Solve multiplication and division equations.", "Section 9: Lessons 81-90", 84,
            Arrays.asList(new Section("Worked Examples", "Solve multiplication and division equations.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 84", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 84", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 84", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 84", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 84", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("solving-two-step-equations", "Solving Two-Step Equations", "85", "Solve equations with two operations.", "Section 9: Lessons 81-90", 85,
            Arrays.asList(new Section("Worked Examples", "Solve equations with two operations.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 85", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 85", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 85", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 85", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 85", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("inequalities", "Inequalities", "86", "Write, solve, and graph inequalities.", "Section 9: Lessons 81-90", 86,
            Arrays.asList(new Section("Worked Examples", "Write, solve, and graph inequalities.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 86", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 86", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 86", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 86", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 86", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("functions-and-function-tables", "Functions and Function Tables", "87", "Complete function tables and identify rules.", "Section 9: Lessons 81-90", 87,
            Arrays.asList(new Section("Worked Examples", "Complete function tables and identify rules.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 87", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 87", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 87", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 87", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 87", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("graphing-linear-functions", "Graphing Linear Functions", "88", "Graph functions on a coordinate plane.", "Section 9: Lessons 81-90", 88,
            Arrays.asList(new Section("Worked Examples", "Graph functions on a coordinate plane.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 88", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 88", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 88", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 88", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 88", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("slope", "Slope", "89", "Calculate slope from two points or a graph.", "Section 9: Lessons 81-90", 89,
            Arrays.asList(new Section("Worked Examples", "Calculate slope from two points or a graph.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 89", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 89", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 89", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 89", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 89", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("word-problems-with-equations", "Word Problems with Equations", "90", "Write and solve equations from word problems.", "Section 9: Lessons 81-90", 90,
            Arrays.asList(new Section("Worked Examples", "Write and solve equations from word problems.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 90", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 90", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 90", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 90", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 90", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("ratios-and-proportional-relationships", "Ratios and Proportional Relationships", "91", "Identify proportional relationships in tables.", "Section 10: Lessons 91-100", 91,
            Arrays.asList(new Section("Worked Examples", "Identify proportional relationships in tables.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 91", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 91", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 91", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 91", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 91", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("percent-increase-and-decrease", "Percent Increase and Decrease", "92", "Calculate percent change.", "Section 10: Lessons 91-100", 92,
            Arrays.asList(new Section("Worked Examples", "Calculate percent change.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 92", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 92", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 92", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 92", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 92", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("simple-interest", "Simple Interest", "93", "Calculate simple interest using I=Prt.", "Section 10: Lessons 91-100", 93,
            Arrays.asList(new Section("Worked Examples", "Calculate simple interest using I=Prt.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 93", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 93", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 93", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 93", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 93", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("discount-and-sales-tax", "Discount and Sales Tax", "94", "Calculate sale prices and tax amounts.", "Section 10: Lessons 91-100", 94,
            Arrays.asList(new Section("Worked Examples", "Calculate sale prices and tax amounts.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 94", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 94", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 94", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 94", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 94", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("similar-figures", "Similar Figures", "95", "Identify similar figures and find missing measures.", "Section 10: Lessons 91-100", 95,
            Arrays.asList(new Section("Worked Examples", "Identify similar figures and find missing measures.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 95", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 95", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 95", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 95", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 95", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("indirect-measurement", "Indirect Measurement", "96", "Use proportions for indirect measurement.", "Section 10: Lessons 91-100", 96,
            Arrays.asList(new Section("Worked Examples", "Use proportions for indirect measurement.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 96", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 96", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 96", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 96", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 96", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("probability-compound-events", "Probability: Compound Events", "97", "Find probability of independent and dependent events.", "Section 10: Lessons 91-100", 97,
            Arrays.asList(new Section("Worked Examples", "Find probability of independent and dependent events.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 97", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 97", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 97", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 97", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 97", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("permutations-and-combinations", "Permutations and Combinations", "98", "Count arrangements and selections.", "Section 10: Lessons 91-100", 98,
            Arrays.asList(new Section("Worked Examples", "Count arrangements and selections.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 98", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 98", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 98", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 98", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 98", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("stem-and-leaf-plots", "Stem-and-Leaf Plots", "99", "Create and read stem-and-leaf displays.", "Section 10: Lessons 91-100", 99,
            Arrays.asList(new Section("Worked Examples", "Create and read stem-and-leaf displays.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 99", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 99", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 99", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 99", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 99", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("box-and-whisker-plots", "Box-and-Whisker Plots", "100", "Create and interpret box plots.", "Section 10: Lessons 91-100", 100,
            Arrays.asList(new Section("Worked Examples", "Create and interpret box plots.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 100", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 100", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 100", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 100", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 100", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("the-pythagorean-theorem", "The Pythagorean Theorem", "101", "Apply a^2+b^2=c^2 to right triangles.", "Section 11: Lessons 101-110", 101,
            Arrays.asList(new Section("Worked Examples", "Apply a^2+b^2=c^2 to right triangles.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 101", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 101", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 101", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 101", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 101", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("distance-on-a-coordinate-plane", "Distance on a Coordinate Plane", "102", "Use distance formula between points.", "Section 11: Lessons 101-110", 102,
            Arrays.asList(new Section("Worked Examples", "Use distance formula between points.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 102", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 102", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 102", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 102", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 102", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("irrational-numbers", "Irrational Numbers", "103", "Identify and approximate irrational numbers.", "Section 11: Lessons 101-110", 103,
            Arrays.asList(new Section("Worked Examples", "Identify and approximate irrational numbers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 103", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 103", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 103", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 103", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 103", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("exponent-rules", "Exponent Rules", "104", "Apply rules for multiplying and dividing powers.", "Section 11: Lessons 101-110", 104,
            Arrays.asList(new Section("Worked Examples", "Apply rules for multiplying and dividing powers.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 104", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 104", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 104", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 104", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 104", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("negative-exponents", "Negative Exponents", "105", "Evaluate expressions with negative exponents.", "Section 11: Lessons 101-110", 105,
            Arrays.asList(new Section("Worked Examples", "Evaluate expressions with negative exponents.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 105", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 105", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 105", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 105", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 105", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("scatter-plots", "Scatter Plots", "106", "Create scatter plots and describe correlations.", "Section 11: Lessons 101-110", 106,
            Arrays.asList(new Section("Worked Examples", "Create scatter plots and describe correlations.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 106", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 106", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 106", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 106", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 106", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("line-of-best-fit", "Line of Best Fit", "107", "Draw and use lines of best fit.", "Section 11: Lessons 101-110", 107,
            Arrays.asList(new Section("Worked Examples", "Draw and use lines of best fit.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 107", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 107", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 107", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 107", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 107", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("two-step-inequalities", "Two-Step Inequalities", "108", "Solve and graph two-step inequalities.", "Section 11: Lessons 101-110", 108,
            Arrays.asList(new Section("Worked Examples", "Solve and graph two-step inequalities.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 108", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 108", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 108", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 108", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 108", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("systems-of-equations-introduction", "Systems of Equations (Introduction)", "109", "Understand systems with two equations.", "Section 11: Lessons 101-110", 109,
            Arrays.asList(new Section("Worked Examples", "Understand systems with two equations.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 109", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 109", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 109", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 109", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 109", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("geometric-probability", "Geometric Probability", "110", "Find probability using areas and lengths.", "Section 11: Lessons 101-110", 110,
            Arrays.asList(new Section("Worked Examples", "Find probability using areas and lengths.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 110", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 110", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 110", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 110", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 110", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("multi-step-word-problems", "Multi-Step Word Problems", "111", "Solve complex multi-step word problems.", "Section 12: Lessons 111-120", 111,
            Arrays.asList(new Section("Worked Examples", "Solve complex multi-step word problems.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 111", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 111", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 111", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 111", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 111", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("rates-of-change", "Rates of Change", "112", "Calculate and interpret rates of change.", "Section 12: Lessons 111-120", 112,
            Arrays.asList(new Section("Worked Examples", "Calculate and interpret rates of change.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 112", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 112", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 112", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 112", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 112", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("unit-conversions-with-ratios", "Unit Conversions with Ratios", "113", "Convert units using dimensional analysis.", "Section 12: Lessons 111-120", 113,
            Arrays.asList(new Section("Worked Examples", "Convert units using dimensional analysis.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 113", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 113", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 113", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 113", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 113", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("percents-greater-than-100-and-less-than-", "Percents Greater Than 100 and Less Than 1", "114", "Work with unusual percent values.", "Section 12: Lessons 111-120", 114,
            Arrays.asList(new Section("Worked Examples", "Work with unusual percent values.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 114", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 114", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 114", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 114", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 114", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("compound-interest-introduction", "Compound Interest (Introduction)", "115", "Understand compound vs simple interest.", "Section 12: Lessons 111-120", 115,
            Arrays.asList(new Section("Worked Examples", "Understand compound vs simple interest.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 115", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 115", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 115", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 115", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 115", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("tessellations", "Tessellations", "116", "Identify shapes that tessellate.", "Section 12: Lessons 111-120", 116,
            Arrays.asList(new Section("Worked Examples", "Identify shapes that tessellate.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 116", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 116", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 116", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 116", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 116", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("nets-and-surface-area", "Nets and Surface Area", "117", "Unfold 3D shapes into nets.", "Section 12: Lessons 111-120", 117,
            Arrays.asList(new Section("Worked Examples", "Unfold 3D shapes into nets.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 117", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 117", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 117", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 117", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 117", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("volume-of-cylinders", "Volume of Cylinders", "118", "Calculate volume using V=pi*r^2*h.", "Section 12: Lessons 111-120", 118,
            Arrays.asList(new Section("Worked Examples", "Calculate volume using V=pi*r^2*h.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 118", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 118", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 118", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 118", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 118", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("data-analysis-and-predictions", "Data Analysis and Predictions", "119", "Make predictions from data trends.", "Section 12: Lessons 111-120", 119,
            Arrays.asList(new Section("Worked Examples", "Make predictions from data trends.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 119", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 119", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 119", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 119", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 119", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("problem-solving-strategies-review", "Problem Solving Strategies Review", "120", "Apply all strategies to complex problems.", "Section 12: Lessons 111-120", 120,
            Arrays.asList(new Section("Worked Examples", "Apply all strategies to complex problems.",
                Arrays.asList(
            new WorkedExample("Practice problem for Lesson 120", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 120", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 120", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 120", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution"),
            new WorkedExample("Practice problem for Lesson 120", Arrays.asList("Step 1: Identify given information", "Step 2: Choose the right method", "Step 3: Solve step by step", "Step 4: Verify the answer"), "Solution")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
    }
}