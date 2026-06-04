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
            new WorkedExample("Practice Problem 1 for Lesson 1", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 1", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 1", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 1", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 1", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-2", "Properties of Operations", "2", "Properties of Operations", "Section 1: Lessons 1-10", 2,
            Arrays.asList(new Section("Worked Examples", "Properties of Operations",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 2", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 2", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 2", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 2", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 2", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-3", "Missing Numbers", "3", "Missing Numbers", "Section 1: Lessons 1-10", 3,
            Arrays.asList(new Section("Worked Examples", "Missing Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 3", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 3", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 3", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 3", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 3", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-4", "Number Line, Sequences", "4", "Number Line, Sequences", "Section 1: Lessons 1-10", 4,
            Arrays.asList(new Section("Worked Examples", "Number Line, Sequences",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 4", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 4", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 4", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 4", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 4", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-5", "Place Value Through Trillions, Reading and Writing Numbers", "5", "Place Value Through Trillions, Reading and Writing Numbers", "Section 1: Lessons 1-10", 5,
            Arrays.asList(new Section("Worked Examples", "Place Value Through Trillions, Reading and Writing Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 5", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 5", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 5", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 5", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 5", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-6", "Factors, Divisibility", "6", "Factors, Divisibility", "Section 1: Lessons 1-10", 6,
            Arrays.asList(new Section("Worked Examples", "Factors, Divisibility",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 6", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 6", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 6", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 6", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 6", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-7", "Lines and Angles", "7", "Lines and Angles", "Section 1: Lessons 1-10", 7,
            Arrays.asList(new Section("Worked Examples", "Lines and Angles",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 7", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 7", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 7", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 7", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 7", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-8", "Fractions and Percents, Inch Ruler", "8", "Fractions and Percents, Inch Ruler", "Section 1: Lessons 1-10", 8,
            Arrays.asList(new Section("Worked Examples", "Fractions and Percents, Inch Ruler",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 8", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 8", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 8", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 8", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 8", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-9", "Fraction Operations, Reciprocals", "9", "Fraction Operations, Reciprocals", "Section 1: Lessons 1-10", 9,
            Arrays.asList(new Section("Worked Examples", "Fraction Operations, Reciprocals",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 9", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 9", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 9", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 9", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 9", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-10", "Writing Division Answers as Mixed Numbers, Improper Fractions", "10", "Writing Division Answers as Mixed Numbers, Improper Fractions", "Section 1: Lessons 1-10", 10,
            Arrays.asList(new Section("Worked Examples", "Writing Division Answers as Mixed Numbers, Improper Fractions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 10", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 10", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 10", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 10", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 10", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-11", "Problems About Combining, Problems About Separating", "11", "Problems About Combining, Problems About Separating", "Section 2: Lessons 11-20", 11,
            Arrays.asList(new Section("Worked Examples", "Problems About Combining, Problems About Separating",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 11", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 11", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 11", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 11", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 11", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-12", "Problems About Comparing, Elapsed-Time Problems", "12", "Problems About Comparing, Elapsed-Time Problems", "Section 2: Lessons 11-20", 12,
            Arrays.asList(new Section("Worked Examples", "Problems About Comparing, Elapsed-Time Problems",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 12", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 12", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 12", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 12", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 12", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-13", "Problems About Equal Groups", "13", "Problems About Equal Groups", "Section 2: Lessons 11-20", 13,
            Arrays.asList(new Section("Worked Examples", "Problems About Equal Groups",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 13", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 13", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 13", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 13", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 13", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-14", "Problems About Parts of a Whole", "14", "Problems About Parts of a Whole", "Section 2: Lessons 11-20", 14,
            Arrays.asList(new Section("Worked Examples", "Problems About Parts of a Whole",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 14", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 14", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 14", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 14", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 14", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-15", "Equivalent Fractions, Reducing Fractions Part 1", "15", "Equivalent Fractions, Reducing Fractions Part 1", "Section 2: Lessons 11-20", 15,
            Arrays.asList(new Section("Worked Examples", "Equivalent Fractions, Reducing Fractions Part 1",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 15", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 15", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 15", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 15", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 15", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-16", "US Customary System, Functions", "16", "US Customary System, Functions", "Section 2: Lessons 11-20", 16,
            Arrays.asList(new Section("Worked Examples", "US Customary System, Functions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 16", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 16", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 16", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 16", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 16", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-17", "Measuring Angles with a Protractor", "17", "Measuring Angles with a Protractor", "Section 2: Lessons 11-20", 17,
            Arrays.asList(new Section("Worked Examples", "Measuring Angles with a Protractor",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 17", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 17", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 17", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 17", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 17", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-18", "Polygons, Similar and Congruent", "18", "Polygons, Similar and Congruent", "Section 2: Lessons 11-20", 18,
            Arrays.asList(new Section("Worked Examples", "Polygons, Similar and Congruent",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 18", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 18", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 18", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 18", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 18", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-19", "Perimeter", "19", "Perimeter", "Section 2: Lessons 11-20", 19,
            Arrays.asList(new Section("Worked Examples", "Perimeter",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 19", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 19", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 19", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 19", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 19", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-20", "Exponents, Rectangular Area Part 1, Square Root", "20", "Exponents, Rectangular Area Part 1, Square Root", "Section 2: Lessons 11-20", 20,
            Arrays.asList(new Section("Worked Examples", "Exponents, Rectangular Area Part 1, Square Root",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 20", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 20", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 20", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 20", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 20", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-21", "Prime and Composite Numbers, Prime Factorization", "21", "Prime and Composite Numbers, Prime Factorization", "Section 3: Lessons 21-30", 21,
            Arrays.asList(new Section("Worked Examples", "Prime and Composite Numbers, Prime Factorization",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 21", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 21", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 21", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 21", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 21", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-22", "Problems About a Fraction of a Group", "22", "Problems About a Fraction of a Group", "Section 3: Lessons 21-30", 22,
            Arrays.asList(new Section("Worked Examples", "Problems About a Fraction of a Group",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 22", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 22", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 22", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 22", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 22", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-23", "Subtracting Mixed Numbers with Regrouping", "23", "Subtracting Mixed Numbers with Regrouping", "Section 3: Lessons 21-30", 23,
            Arrays.asList(new Section("Worked Examples", "Subtracting Mixed Numbers with Regrouping",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 23", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 23", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 23", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 23", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 23", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-24", "Reducing Fractions Part 2", "24", "Reducing Fractions Part 2", "Section 3: Lessons 21-30", 24,
            Arrays.asList(new Section("Worked Examples", "Reducing Fractions Part 2",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 24", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 24", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 24", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 24", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 24", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-25", "Dividing Fractions", "25", "Dividing Fractions", "Section 3: Lessons 21-30", 25,
            Arrays.asList(new Section("Worked Examples", "Dividing Fractions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 25", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 25", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 25", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 25", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 25", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-26", "Multiplying and Dividing Mixed Numbers", "26", "Multiplying and Dividing Mixed Numbers", "Section 3: Lessons 21-30", 26,
            Arrays.asList(new Section("Worked Examples", "Multiplying and Dividing Mixed Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 26", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 26", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 26", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 26", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 26", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-27", "Multiples, Least Common Multiple, Equivalent Division", "27", "Multiples, Least Common Multiple, Equivalent Division", "Section 3: Lessons 21-30", 27,
            Arrays.asList(new Section("Worked Examples", "Multiples, Least Common Multiple, Equivalent Division",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 27", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 27", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 27", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 27", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 27", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-28", "Two-Step Word Problems, Average Part 1", "28", "Two-Step Word Problems, Average Part 1", "Section 3: Lessons 21-30", 28,
            Arrays.asList(new Section("Worked Examples", "Two-Step Word Problems, Average Part 1",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 28", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 28", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 28", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 28", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 28", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-29", "Rounding Whole Numbers, Rounding Mixed Numbers, Estimating", "29", "Rounding Whole Numbers, Rounding Mixed Numbers, Estimating", "Section 3: Lessons 21-30", 29,
            Arrays.asList(new Section("Worked Examples", "Rounding Whole Numbers, Rounding Mixed Numbers, Estimating",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 29", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 29", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 29", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 29", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 29", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-30", "Common Denominators, Adding and Subtracting Fractions", "30", "Common Denominators, Adding and Subtracting Fractions", "Section 3: Lessons 21-30", 30,
            Arrays.asList(new Section("Worked Examples", "Common Denominators, Adding and Subtracting Fractions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 30", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 30", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 30", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 30", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 30", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-31", "Reading and Writing Decimal Numbers", "31", "Reading and Writing Decimal Numbers", "Section 4: Lessons 31-40", 31,
            Arrays.asList(new Section("Worked Examples", "Reading and Writing Decimal Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 31", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 31", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 31", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 31", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 31", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-32", "Metric System", "32", "Metric System", "Section 4: Lessons 31-40", 32,
            Arrays.asList(new Section("Worked Examples", "Metric System",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 32", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 32", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 32", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 32", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 32", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-33", "Comparing Decimals, Rounding Decimals", "33", "Comparing Decimals, Rounding Decimals", "Section 4: Lessons 31-40", 33,
            Arrays.asList(new Section("Worked Examples", "Comparing Decimals, Rounding Decimals",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 33", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 33", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 33", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 33", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 33", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-34", "Decimal Numbers on the Number Line", "34", "Decimal Numbers on the Number Line", "Section 4: Lessons 31-40", 34,
            Arrays.asList(new Section("Worked Examples", "Decimal Numbers on the Number Line",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 34", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 34", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 34", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 34", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 34", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-35", "Adding, Subtracting, Multiplying, Dividing Decimals", "35", "Adding, Subtracting, Multiplying, Dividing Decimals", "Section 4: Lessons 31-40", 35,
            Arrays.asList(new Section("Worked Examples", "Adding, Subtracting, Multiplying, Dividing Decimals",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 35", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 35", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 35", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 35", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 35", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-36", "Ratio, Sample Space", "36", "Ratio, Sample Space", "Section 4: Lessons 31-40", 36,
            Arrays.asList(new Section("Worked Examples", "Ratio, Sample Space",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 36", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 36", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 36", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 36", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 36", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-37", "Area of a Triangle, Rectangular Area Part 2", "37", "Area of a Triangle, Rectangular Area Part 2", "Section 4: Lessons 31-40", 37,
            Arrays.asList(new Section("Worked Examples", "Area of a Triangle, Rectangular Area Part 2",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 37", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 37", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 37", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 37", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 37", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-38", "Interpreting Graphs", "38", "Interpreting Graphs", "Section 4: Lessons 31-40", 38,
            Arrays.asList(new Section("Worked Examples", "Interpreting Graphs",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 38", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 38", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 38", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 38", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 38", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-39", "Proportions", "39", "Proportions", "Section 4: Lessons 31-40", 39,
            Arrays.asList(new Section("Worked Examples", "Proportions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 39", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 39", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 39", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 39", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 39", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-40", "Sum of Angle Measures of a Triangle, Angle Pairs", "40", "Sum of Angle Measures of a Triangle, Angle Pairs", "Section 4: Lessons 31-40", 40,
            Arrays.asList(new Section("Worked Examples", "Sum of Angle Measures of a Triangle, Angle Pairs",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 40", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 40", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 40", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 40", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 40", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-41", "Using Formulas, Distributive Property", "41", "Using Formulas, Distributive Property", "Section 5: Lessons 41-50", 41,
            Arrays.asList(new Section("Worked Examples", "Using Formulas, Distributive Property",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 41", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 41", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 41", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 41", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 41", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-42", "Repeating Decimals", "42", "Repeating Decimals", "Section 5: Lessons 41-50", 42,
            Arrays.asList(new Section("Worked Examples", "Repeating Decimals",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 42", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 42", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 42", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 42", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 42", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-43", "Converting Decimals to Fractions, Fractions to Decimals, Percents", "43", "Converting Decimals to Fractions, Fractions to Decimals, Percents", "Section 5: Lessons 41-50", 43,
            Arrays.asList(new Section("Worked Examples", "Converting Decimals to Fractions, Fractions to Decimals, Percents",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 43", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 43", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 43", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 43", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 43", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-44", "Division Answers", "44", "Division Answers", "Section 5: Lessons 41-50", 44,
            Arrays.asList(new Section("Worked Examples", "Division Answers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 44", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 44", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 44", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 44", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 44", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-45", "Dividing by a Decimal Number", "45", "Dividing by a Decimal Number", "Section 5: Lessons 41-50", 45,
            Arrays.asList(new Section("Worked Examples", "Dividing by a Decimal Number",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 45", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 45", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 45", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 45", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 45", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-46", "Unit Price, Rates, Sales Tax", "46", "Unit Price, Rates, Sales Tax", "Section 5: Lessons 41-50", 46,
            Arrays.asList(new Section("Worked Examples", "Unit Price, Rates, Sales Tax",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 46", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 46", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 46", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 46", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 46", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-47", "Powers of 10", "47", "Powers of 10", "Section 5: Lessons 41-50", 47,
            Arrays.asList(new Section("Worked Examples", "Powers of 10",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 47", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 47", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 47", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 47", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 47", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-48", "Fraction-Decimal-Percent Equivalents", "48", "Fraction-Decimal-Percent Equivalents", "Section 5: Lessons 41-50", 48,
            Arrays.asList(new Section("Worked Examples", "Fraction-Decimal-Percent Equivalents",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 48", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 48", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 48", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 48", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 48", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-49", "Adding Mixed Measures", "49", "Adding Mixed Measures", "Section 5: Lessons 41-50", 49,
            Arrays.asList(new Section("Worked Examples", "Adding Mixed Measures",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 49", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 49", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 49", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 49", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 49", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-50", "Unit Multipliers and Unit Conversion", "50", "Unit Multipliers and Unit Conversion", "Section 5: Lessons 41-50", 50,
            Arrays.asList(new Section("Worked Examples", "Unit Multipliers and Unit Conversion",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 50", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 50", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 50", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 50", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 50", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-51", "Scientific Notation for Large Numbers", "51", "Scientific Notation for Large Numbers", "Section 6: Lessons 51-60", 51,
            Arrays.asList(new Section("Worked Examples", "Scientific Notation for Large Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 51", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 51", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 51", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 51", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 51", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-52", "Order of Operations", "52", "Order of Operations", "Section 6: Lessons 51-60", 52,
            Arrays.asList(new Section("Worked Examples", "Order of Operations",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 52", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 52", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 52", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 52", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 52", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-53", "Ratio Word Problems", "53", "Ratio Word Problems", "Section 6: Lessons 51-60", 53,
            Arrays.asList(new Section("Worked Examples", "Ratio Word Problems",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 53", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 53", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 53", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 53", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 53", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-54", "Multiplying Rates", "54", "Multiplying Rates", "Section 6: Lessons 51-60", 54,
            Arrays.asList(new Section("Worked Examples", "Multiplying Rates",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 54", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 54", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 54", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 54", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 54", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-55", "Average and Rate Problems with Multiple Steps", "55", "Average and Rate Problems with Multiple Steps", "Section 6: Lessons 51-60", 55,
            Arrays.asList(new Section("Worked Examples", "Average and Rate Problems with Multiple Steps",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 55", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 55", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 55", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 55", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 55", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-56", "Plotting Functions", "56", "Plotting Functions", "Section 6: Lessons 51-60", 56,
            Arrays.asList(new Section("Worked Examples", "Plotting Functions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 56", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 56", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 56", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 56", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 56", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-57", "Negative Exponents, Scientific Notation for Small Numbers", "57", "Negative Exponents, Scientific Notation for Small Numbers", "Section 6: Lessons 51-60", 57,
            Arrays.asList(new Section("Worked Examples", "Negative Exponents, Scientific Notation for Small Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 57", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 57", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 57", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 57", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 57", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-58", "Line Symmetry, Functions Part 1", "58", "Line Symmetry, Functions Part 1", "Section 6: Lessons 51-60", 58,
            Arrays.asList(new Section("Worked Examples", "Line Symmetry, Functions Part 1",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 58", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 58", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 58", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 58", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 58", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-59", "Adding Integers on the Number Line", "59", "Adding Integers on the Number Line", "Section 6: Lessons 51-60", 59,
            Arrays.asList(new Section("Worked Examples", "Adding Integers on the Number Line",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 59", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 59", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 59", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 59", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 59", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-60", "Fractional Part of a Number, Percent of a Number Part 1", "60", "Fractional Part of a Number, Percent of a Number Part 1", "Section 6: Lessons 51-60", 60,
            Arrays.asList(new Section("Worked Examples", "Fractional Part of a Number, Percent of a Number Part 1",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 60", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 60", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 60", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 60", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 60", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-61", "Area of a Parallelogram, Angles of a Parallelogram", "61", "Area of a Parallelogram, Angles of a Parallelogram", "Section 7: Lessons 61-70", 61,
            Arrays.asList(new Section("Worked Examples", "Area of a Parallelogram, Angles of a Parallelogram",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 61", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 61", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 61", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 61", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 61", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-62", "Classifying Triangles", "62", "Classifying Triangles", "Section 7: Lessons 61-70", 62,
            Arrays.asList(new Section("Worked Examples", "Classifying Triangles",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 62", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 62", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 62", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 62", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 62", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-63", "Symbols of Inclusion", "63", "Symbols of Inclusion", "Section 7: Lessons 61-70", 63,
            Arrays.asList(new Section("Worked Examples", "Symbols of Inclusion",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 63", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 63", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 63", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 63", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 63", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-64", "Adding Signed Numbers", "64", "Adding Signed Numbers", "Section 7: Lessons 61-70", 64,
            Arrays.asList(new Section("Worked Examples", "Adding Signed Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 64", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 64", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 64", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 64", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 64", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-65", "Circumference, Pi", "65", "Circumference, Pi", "Section 7: Lessons 61-70", 65,
            Arrays.asList(new Section("Worked Examples", "Circumference, Pi",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 65", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 65", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 65", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 65", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 65", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-66", "Ratio Problems Involving Totals", "66", "Ratio Problems Involving Totals", "Section 7: Lessons 61-70", 66,
            Arrays.asList(new Section("Worked Examples", "Ratio Problems Involving Totals",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 66", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 66", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 66", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 66", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 66", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-67", "Geometric Solids", "67", "Geometric Solids", "Section 7: Lessons 61-70", 67,
            Arrays.asList(new Section("Worked Examples", "Geometric Solids",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 67", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 67", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 67", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 67", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 67", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-68", "Algebraic Addition", "68", "Algebraic Addition", "Section 7: Lessons 61-70", 68,
            Arrays.asList(new Section("Worked Examples", "Algebraic Addition",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 68", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 68", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 68", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 68", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 68", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-69", "More on Scientific Notation", "69", "More on Scientific Notation", "Section 7: Lessons 61-70", 69,
            Arrays.asList(new Section("Worked Examples", "More on Scientific Notation",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 69", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 69", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 69", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 69", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 69", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-70", "Volume", "70", "Volume", "Section 7: Lessons 61-70", 70,
            Arrays.asList(new Section("Worked Examples", "Volume",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 70", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 70", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 70", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 70", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 70", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-71", "Finding the Whole Group When a Fraction Is Known", "71", "Finding the Whole Group When a Fraction Is Known", "Section 8: Lessons 71-80", 71,
            Arrays.asList(new Section("Worked Examples", "Finding the Whole Group When a Fraction Is Known",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 71", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 71", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 71", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 71", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 71", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-72", "Implied Ratios", "72", "Implied Ratios", "Section 8: Lessons 71-80", 72,
            Arrays.asList(new Section("Worked Examples", "Implied Ratios",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 72", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 72", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 72", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 72", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 72", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-73", "Multiplying and Dividing Signed Numbers", "73", "Multiplying and Dividing Signed Numbers", "Section 8: Lessons 71-80", 73,
            Arrays.asList(new Section("Worked Examples", "Multiplying and Dividing Signed Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 73", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 73", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 73", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 73", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 73", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-74", "Fractional Part of a Number Part 2", "74", "Fractional Part of a Number Part 2", "Section 8: Lessons 71-80", 74,
            Arrays.asList(new Section("Worked Examples", "Fractional Part of a Number Part 2",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 74", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 74", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 74", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 74", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 74", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-75", "Area of a Complex Figure, Area of a Trapezoid", "75", "Area of a Complex Figure, Area of a Trapezoid", "Section 8: Lessons 71-80", 75,
            Arrays.asList(new Section("Worked Examples", "Area of a Complex Figure, Area of a Trapezoid",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 75", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 75", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 75", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 75", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 75", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-76", "Complex Fractions", "76", "Complex Fractions", "Section 8: Lessons 71-80", 76,
            Arrays.asList(new Section("Worked Examples", "Complex Fractions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 76", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 76", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 76", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 76", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 76", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-77", "Percent of a Number Part 2", "77", "Percent of a Number Part 2", "Section 8: Lessons 71-80", 77,
            Arrays.asList(new Section("Worked Examples", "Percent of a Number Part 2",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 77", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 77", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 77", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 77", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 77", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-78", "Graphing Inequalities", "78", "Graphing Inequalities", "Section 8: Lessons 71-80", 78,
            Arrays.asList(new Section("Worked Examples", "Graphing Inequalities",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 78", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 78", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 78", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 78", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 78", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-79", "Estimating Area", "79", "Estimating Area", "Section 8: Lessons 71-80", 79,
            Arrays.asList(new Section("Worked Examples", "Estimating Area",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 79", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 79", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 79", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 79", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 79", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-80", "Transformations", "80", "Transformations", "Section 8: Lessons 71-80", 80,
            Arrays.asList(new Section("Worked Examples", "Transformations",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 80", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 80", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 80", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 80", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 80", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-81", "Using Proportions to Solve Percent Problems", "81", "Using Proportions to Solve Percent Problems", "Section 9: Lessons 81-90", 81,
            Arrays.asList(new Section("Worked Examples", "Using Proportions to Solve Percent Problems",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 81", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 81", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 81", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 81", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 81", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-82", "Area of a Circle", "82", "Area of a Circle", "Section 9: Lessons 81-90", 82,
            Arrays.asList(new Section("Worked Examples", "Area of a Circle",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 82", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 82", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 82", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 82", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 82", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-83", "Multiplying Powers of 10, Scientific Notation Multiplication", "83", "Multiplying Powers of 10, Scientific Notation Multiplication", "Section 9: Lessons 81-90", 83,
            Arrays.asList(new Section("Worked Examples", "Multiplying Powers of 10, Scientific Notation Multiplication",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 83", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 83", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 83", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 83", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 83", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-84", "Algebraic Terms", "84", "Algebraic Terms", "Section 9: Lessons 81-90", 84,
            Arrays.asList(new Section("Worked Examples", "Algebraic Terms",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 84", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 84", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 84", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 84", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 84", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-85", "Order of Operations with Signed Numbers, Functions Part 2", "85", "Order of Operations with Signed Numbers, Functions Part 2", "Section 9: Lessons 81-90", 85,
            Arrays.asList(new Section("Worked Examples", "Order of Operations with Signed Numbers, Functions Part 2",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 85", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 85", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 85", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 85", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 85", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-86", "Number Families", "86", "Number Families", "Section 9: Lessons 81-90", 86,
            Arrays.asList(new Section("Worked Examples", "Number Families",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 86", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 86", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 86", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 86", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 86", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-87", "Multiplying Algebraic Terms", "87", "Multiplying Algebraic Terms", "Section 9: Lessons 81-90", 87,
            Arrays.asList(new Section("Worked Examples", "Multiplying Algebraic Terms",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 87", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 87", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 87", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 87", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 87", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-88", "Multiple Unit Multipliers, Converting Units of Area", "88", "Multiple Unit Multipliers, Converting Units of Area", "Section 9: Lessons 81-90", 88,
            Arrays.asList(new Section("Worked Examples", "Multiple Unit Multipliers, Converting Units of Area",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 88", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 88", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 88", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 88", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 88", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-89", "Diagonals, Interior Angles, Exterior Angles", "89", "Diagonals, Interior Angles, Exterior Angles", "Section 9: Lessons 81-90", 89,
            Arrays.asList(new Section("Worked Examples", "Diagonals, Interior Angles, Exterior Angles",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 89", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 89", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 89", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 89", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 89", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-90", "Mixed Number and Negative Coefficients", "90", "Mixed Number and Negative Coefficients", "Section 9: Lessons 81-90", 90,
            Arrays.asList(new Section("Worked Examples", "Mixed Number and Negative Coefficients",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 90", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 90", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 90", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 90", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 90", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-91", "Evaluations with Signed Numbers", "91", "Evaluations with Signed Numbers", "Section 10: Lessons 91-100", 91,
            Arrays.asList(new Section("Worked Examples", "Evaluations with Signed Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 91", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 91", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 91", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 91", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 91", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-92", "Percent of Change", "92", "Percent of Change", "Section 10: Lessons 91-100", 92,
            Arrays.asList(new Section("Worked Examples", "Percent of Change",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 92", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 92", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 92", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 92", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 92", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-93", "Two-Step Equations and Inequalities", "93", "Two-Step Equations and Inequalities", "Section 10: Lessons 91-100", 93,
            Arrays.asList(new Section("Worked Examples", "Two-Step Equations and Inequalities",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 93", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 93", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 93", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 93", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 93", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-94", "Compound Probability, Independent Events", "94", "Compound Probability, Independent Events", "Section 10: Lessons 91-100", 94,
            Arrays.asList(new Section("Worked Examples", "Compound Probability, Independent Events",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 94", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 94", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 94", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 94", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 94", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-95", "Volume of a Right Solid", "95", "Volume of a Right Solid", "Section 10: Lessons 91-100", 95,
            Arrays.asList(new Section("Worked Examples", "Volume of a Right Solid",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 95", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 95", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 95", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 95", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 95", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-96", "Estimating Angle Measures, Distributive Property with Algebra", "96", "Estimating Angle Measures, Distributive Property with Algebra", "Section 10: Lessons 91-100", 96,
            Arrays.asList(new Section("Worked Examples", "Estimating Angle Measures, Distributive Property with Algebra",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 96", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 96", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 96", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 96", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 96", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-97", "Similar Triangles, Indirect Measures", "97", "Similar Triangles, Indirect Measures", "Section 10: Lessons 91-100", 97,
            Arrays.asList(new Section("Worked Examples", "Similar Triangles, Indirect Measures",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 97", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 97", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 97", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 97", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 97", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-98", "Scale, Scale Factor", "98", "Scale, Scale Factor", "Section 10: Lessons 91-100", 98,
            Arrays.asList(new Section("Worked Examples", "Scale, Scale Factor",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 98", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 98", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 98", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 98", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 98", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-99", "Pythagorean Theorem", "99", "Pythagorean Theorem", "Section 10: Lessons 91-100", 99,
            Arrays.asList(new Section("Worked Examples", "Pythagorean Theorem",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 99", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 99", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 99", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 99", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 99", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-100", "Estimating Square Roots, Irrational Numbers", "100", "Estimating Square Roots, Irrational Numbers", "Section 10: Lessons 91-100", 100,
            Arrays.asList(new Section("Worked Examples", "Estimating Square Roots, Irrational Numbers",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 100", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 100", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 100", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 100", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 100", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-101", "Translating Expressions into Equations", "101", "Translating Expressions into Equations", "Section 11: Lessons 101-110", 101,
            Arrays.asList(new Section("Worked Examples", "Translating Expressions into Equations",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 101", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 101", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 101", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 101", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 101", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-102", "Transversals, Simplifying Equations", "102", "Transversals, Simplifying Equations", "Section 11: Lessons 101-110", 102,
            Arrays.asList(new Section("Worked Examples", "Transversals, Simplifying Equations",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 102", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 102", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 102", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 102", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 102", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-103", "Powers of Negative Numbers, Dividing Terms", "103", "Powers of Negative Numbers, Dividing Terms", "Section 11: Lessons 101-110", 103,
            Arrays.asList(new Section("Worked Examples", "Powers of Negative Numbers, Dividing Terms",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 103", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 103", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 103", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 103", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 103", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-104", "Semicircles, Arcs, and Sectors", "104", "Semicircles, Arcs, and Sectors", "Section 11: Lessons 101-110", 104,
            Arrays.asList(new Section("Worked Examples", "Semicircles, Arcs, and Sectors",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 104", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 104", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 104", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 104", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 104", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-105", "Surface Area of a Right Solid and Sphere, More on Roots", "105", "Surface Area of a Right Solid and Sphere, More on Roots", "Section 11: Lessons 101-110", 105,
            Arrays.asList(new Section("Worked Examples", "Surface Area of a Right Solid and Sphere, More on Roots",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 105", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 105", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 105", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 105", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 105", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-106", "Solving Literal Equations, Transforming Formulas", "106", "Solving Literal Equations, Transforming Formulas", "Section 11: Lessons 101-110", 106,
            Arrays.asList(new Section("Worked Examples", "Solving Literal Equations, Transforming Formulas",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 106", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 106", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 106", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 106", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 106", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-107", "Slope", "107", "Slope", "Section 11: Lessons 101-110", 107,
            Arrays.asList(new Section("Worked Examples", "Slope",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 107", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 107", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 107", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 107", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 107", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-108", "Formulas and Substitution", "108", "Formulas and Substitution", "Section 11: Lessons 101-110", 108,
            Arrays.asList(new Section("Worked Examples", "Formulas and Substitution",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 108", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 108", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 108", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 108", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 108", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-109", "Equations with Exponents", "109", "Equations with Exponents", "Section 11: Lessons 101-110", 109,
            Arrays.asList(new Section("Worked Examples", "Equations with Exponents",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 109", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 109", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 109", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 109", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 109", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-110", "Simple Interest and Compound Interest, Successive Discounts", "110", "Simple Interest and Compound Interest, Successive Discounts", "Section 11: Lessons 101-110", 110,
            Arrays.asList(new Section("Worked Examples", "Simple Interest and Compound Interest, Successive Discounts",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 110", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 110", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 110", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 110", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 110", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-111", "Dividing in Scientific Notation", "111", "Dividing in Scientific Notation", "Section 12: Lessons 111-120", 111,
            Arrays.asList(new Section("Worked Examples", "Dividing in Scientific Notation",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 111", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 111", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 111", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 111", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 111", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-112", "Applications of the Pythagorean Theorem", "112", "Applications of the Pythagorean Theorem", "Section 12: Lessons 111-120", 112,
            Arrays.asList(new Section("Worked Examples", "Applications of the Pythagorean Theorem",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 112", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 112", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 112", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 112", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 112", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-113", "Volume of Pyramids, Cones, and Spheres", "113", "Volume of Pyramids, Cones, and Spheres", "Section 12: Lessons 111-120", 113,
            Arrays.asList(new Section("Worked Examples", "Volume of Pyramids, Cones, and Spheres",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 113", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 113", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 113", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 113", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 113", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-114", "Volume, Capacity, and Mass in the Metric System", "114", "Volume, Capacity, and Mass in the Metric System", "Section 12: Lessons 111-120", 114,
            Arrays.asList(new Section("Worked Examples", "Volume, Capacity, and Mass in the Metric System",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 114", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 114", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 114", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 114", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 114", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-115", "Factoring Algebraic Expressions", "115", "Factoring Algebraic Expressions", "Section 12: Lessons 111-120", 115,
            Arrays.asList(new Section("Worked Examples", "Factoring Algebraic Expressions",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 115", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 115", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 115", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 115", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 115", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-116", "Slope-Intercept Form of Linear Equations", "116", "Slope-Intercept Form of Linear Equations", "Section 12: Lessons 111-120", 116,
            Arrays.asList(new Section("Worked Examples", "Slope-Intercept Form of Linear Equations",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 116", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 116", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 116", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 116", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 116", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-117", "Copying Angles and Triangles", "117", "Copying Angles and Triangles", "Section 12: Lessons 111-120", 117,
            Arrays.asList(new Section("Worked Examples", "Copying Angles and Triangles",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 117", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 117", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 117", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 117", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 117", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-118", "Division by Zero", "118", "Division by Zero", "Section 12: Lessons 111-120", 118,
            Arrays.asList(new Section("Worked Examples", "Division by Zero",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 118", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 118", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 118", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 118", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 118", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-119", "Graphing Area and Volume Formulas", "119", "Graphing Area and Volume Formulas", "Section 12: Lessons 111-120", 119,
            Arrays.asList(new Section("Worked Examples", "Graphing Area and Volume Formulas",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 119", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 119", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 119", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 119", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 119", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
        lessons.add(new LessonContent("lesson-120", "Graphing Nonlinear Equations", "120", "Graphing Nonlinear Equations", "Section 12: Lessons 111-120", 120,
            Arrays.asList(new Section("Worked Examples", "Graphing Nonlinear Equations",
                Arrays.asList(
            new WorkedExample("Practice Problem 1 for Lesson 120", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 2 for Lesson 120", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 3 for Lesson 120", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 4 for Lesson 120", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown"),
            new WorkedExample("Practice Problem 5 for Lesson 120", Arrays.asList("Step 1: Read the problem", "Step 2: Apply the concept from this lesson", "Step 3: Calculate", "Step 4: Check your answer"), "Solution shown")
            ))),
            Arrays.asList("Practice daily", "Show all work", "Check your answer")
        ));
    }
}