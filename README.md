OOP 1 Project - Student ReportCard System

Summary

This project is designed to collect and manage the details of 10 students, including their names, IDs, and scores for 5 subjects. It then calculates each student's average score, assigns a grade, and provides a recommendation based on their performance. The results are displayed in a student report card format.

## Project Details

### Purpose
- **Input Student Details:** Collects the student's name, ID, and scores for 5 subjects.
- **Calculates Grade:** Calculates the average score and assigns a grade (A, B, C, D, or F) based on predefined criteria.
- **Displays Report:** Generates a report card with the student's details, subject scores, average score, grade, and a recommendation.

### Group Members:
- **Joe Karogo** - ID: 167141
- **Tressy Kongo** - ID: 168869
- **Jesse Mbugua** - ID: 149540

---

## Features

1. **Student Information Collection:**
   - The program prompts the user to enter the student's name and ID.
   - Scores for 5 subjects are collected and validated to ensure they fall between 0 and 100.

2. **Grade Calculation:**
   - The program calculates the average score for each student.
   - It then assigns a grade based on the following scale:
     - `A`: Average >= 70
     - `B`: Average >= 60
     - `C`: Average >= 50
     - `D`: Average >= 40
     - `F`: Average < 40
   - A recommendation is also provided based on the grade.

3. **Report Card:**
   - Once the data is entered, a report card is generated for each student, displaying:
     - Name
     - ID number
     - Scores for each subject
     - Average score
     - Grade
     - Recommendation
     - The date when the report was generated

---

## How to Use

1. **Clone or Download the Repository:**
   - To get started, you can clone this repository using:
     ```
     git clone https://github.com/jnk1h/OOP-PROJECT.git
     ```
   - Alternatively, download the ZIP file and extract it.

2. **Run the Program:**
   - Open the project in your Java IDE (like IntelliJ IDEA or Eclipse).
   - Run the `Main.java` file, which contains the `main` method.
   - The program will prompt you to input data for 10 students, one by one.
   - For each student, enter:
     - Name
     - ID number
     - Scores for 5 subjects (between 0 and 100)
   - Once all data is entered, the program will output the report cards for all 10 students.

---

## Code Explanation

### 1. **Student Class:**
- This class holds the student's name, ID, and scores for 5 subjects.
- It includes methods to set the scores for a student.

### 2. **Main Class:**
- This is where the program execution begins.
- It initializes an array of 10 `Student` objects.
- The program collects the student details and their scores.
- After collecting the data, it calculates each student's average score, grade, and recommendation.
- Finally, the program displays the report cards for all the students.

### Key Methods:
- `setScores(int[] scores)`: Assigns scores to a student.
- `calculateAverageAndGrade()`: Calculates the average score and assigns a grade and recommendation based on the score.
- `displayReport()`: Displays the student's details, including their scores, grade, and recommendation.

---

## Example Output

Here’s an example of what the report might look like for a single student:

```
--- REPORT CARD ---
Name: Joe Karogo
ID: 167141
Subject Scores:
  Subject 1: 85
  Subject 2: 90
  Subject 3: 78
  Subject 4: 92
  Subject 5: 88
Average: 86.6
Grade: A
Recommendation: Excellent
Date Viewed: 10/04/2025
--------------------
```

Conclusion

This project provides a simple but effective way to input, process, and display student data. It's a good example of how Object-Oriented Programming (OOP) concepts like classes, objects, and methods can be used to solve real-world problems, such as generating student report cards.

Feel free to explore the code, contribute, or use it as a base for further projects!

---

I hope this helps! Let me know if you need any further adjustments.
