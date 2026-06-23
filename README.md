# Elementary Math Recap

An interactive Saxon Math Course 2 quiz and test application built for Grade 7–8 students. Practice problems, timed tests, badges, and an Olympiad challenge section — all in one app.

## Features

- **Practice Test** — 500 questions across all Saxon Course 2 topics with instant feedback and step-by-step solutions
- **Lesson-Based Tests** — 13 focused tests covering specific strands (probability, fractions, geometry, algebra, etc.)
- **Standard Tests** — Easy, Medium, and Hard difficulty tiers (9 tests)
- **Geometry Tests** — Dedicated geometry strand (6 tests)
- **Olympiad** — Math competition-style challenge problems (8 tests)
- **Badges** — Gamified achievement system awarded on test completion
- **Pagination** — 5 questions per page with numbered page links
- **Answer Shuffling** — Multiple choice options randomized on each attempt
- **Score Tracking** — Running score displayed across pages; final results with percentage
- **Review Incorrect Answers** — Post-test review showing correct answer and solution explanation
- **Parent Dashboard** — Separate login for parents to monitor progress
- **Student Profiles** — Avatar selection and display name customization

## Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend | Spring Boot 3.2.5 (Java 17) |
| Frontend | Thymeleaf + vanilla JavaScript |
| Database | H2 (dev) / PostgreSQL (prod) |
| Auth | Spring Security (session-based) |
| ORM | Spring Data JPA (Hibernate) |
| Build | Maven |

## Running Locally

```bash
cd /path/to/elementaryrecap
rm -rf data
mvn spring-boot:run
```

The app starts at `http://localhost:8080`. The H2 database is auto-created on first run and seeded with all questions.

## Project Structure

```
src/main/java/com/elementaryrecap/
├── config/          Data loaders, security config
├── controller/      MVC controllers (Quiz, Test, Lesson, Olympiad, Badge)
├── dto/             Response DTOs (AnswerResult)
├── model/           JPA entities (Question, Test, TestQuestion, AppUser, Badge)
├── repository/      Spring Data repositories
└── service/         Business logic (QuizService, TestService, BadgeService)

src/main/resources/
├── data/            JSON question banks
│   ├── questions.json                (500 practice questions)
│   ├── test_questions.json           (easy tests)
│   ├── hard_test_questions.json      (hard tests)
│   ├── olympiad_questions.json       (competition problems)
│   └── lesson_based_questions.json   (strand-focused tests)
├── static/css/      Stylesheets
└── templates/       Thymeleaf HTML pages
```

## Lesson-Based Tests

| # | Test Name | Topic |
|---|-----------|-------|
| 1 | Advanced Notation | Exponents, square roots, scientific notation |
| 2 | Algebra & Linear Concepts | Variables, equations, inequalities, graphing |
| 3 | Data Analysis | Graphs, coordinates, Venn diagrams, statistics |
| 4 | Equations & Inequalities | One-step and two-step equations |
| 5 | Applied Problem Solving | Real-world word problems |
| 6 | Equations & Inequalities — Set A | Equations and inequalities with word problems |
| 7 | Fractions & Decimals — Set A | Operations with fractions/mixed numbers, decimals |
| 8 | Functions & Graphing | Coordinate planes, sequences, linear functions |
| 9 | Geometry & Measurement — Set A | Angles, perimeter, area, volume, similarity |
| 10 | Geometry & Measurement — Set B | Geometric figures, measurement, scale |
| 11 | Percents & Ratios — Set A | Conversions, proportions, percent of change |
| 12 | Percents & Ratios — Set B | Proportions and real-world percent problems |
| 13 | Probability | Independent/dependent events, sample spaces |

## Deployment

The app is configured for deployment on AWS Elastic Beanstalk or Render.

```bash
mvn package -DskipTests
```

**Procfile:**
```
web: java -Dserver.port=$PORT -jar target/elementary-recap-0.0.1-SNAPSHOT.jar
```

**Environment variables (production):**
- `DB_HOST` — PostgreSQL host
- `DB_PORT` — PostgreSQL port (default 5432)
- `DB_NAME` — Database name
- `DB_USERNAME` — Database user
- `DB_PASSWORD` — Database password

## License

Private — for educational use.
