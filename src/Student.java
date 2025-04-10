import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String name;
    String id;
    int[] scores = new int[5];
    double average;
    String grade;
    String recommendation;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void calculateAverageAndGrade() {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        average = total / 5.0;

        if (average >= 70) {
            grade = "A";
            recommendation = "Excellent";
        } else if (average >= 60) {
            grade = "B";
            recommendation = "Good";
        } else if (average >= 50) {
            grade = "C";
            recommendation = "Fair";
        } else if (average >= 40) {
            grade = "D";
            recommendation = "Poor";
        } else {
            grade = "F";
            recommendation = "Fail";
        }
    }

    public void displayReport() {
        System.out.println("\n--- REPORT CARD ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + scores[i]);
        }
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Recommendation: " + recommendation);
        System.out.println("Date Viewed: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        System.out.println("-----------------------");
    }
}
