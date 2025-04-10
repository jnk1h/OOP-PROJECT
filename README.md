# OOP 1 Project - Student Report Card System

## Summary

This project is designed to collect and manage the details of 10 students, including their names, IDs, and scores for 5 subjects. It then calculates each student's average score, assigns a grade, and provides a recommendation based on their performance. The results are displayed in a student report card format.

### How it will work
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
   - The program tells the user to enter the student's name and ID.
   - Scores for 5 subjects are collected and evaluated to ensure they are between 0 and 100.

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

## Explaining the code

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
- `setScores(int[] scores)`: This is used to assign scores to a student in a patrticular subject.
- `calculateAverageAndGrade()`: Calculates the average score and assigns a grade and recommendation depending on the score.
- `displayReport()`: Displays the student's details, including their scores, grade, and recommendation.

---

## Results

Here’s how it looked when i ran it:

# Student Report Example

## Student 1

**Enter name**: JOE  
**Enter ID**: J45  
**Enter marks for 5 subjects**:  
- Subject 1: 87  
- Subject 2: 87  
- Subject 3: 87  
- Subject 4: 90  
- Subject 5: 68  

---

### Report Card

**Name**: JOE  
**ID**: J45

**Subject Scores**:  
- Subject 1: 87  
- Subject 2: 87  
- Subject 3: 87  
- Subject 4: 90  
- Subject 5: 68

**Average**: 83.8  
**Grade**: A  
**Recommendation**: Excellent  
**Date Viewed**: 10/04/2025

---

Conclusion

This project provides a simpleway to input, process, and display student data. It's a good example of how OOP concepts like classes, objects, and methods can be used to solve  and simplify real-world problems, such as generating student report cards.

