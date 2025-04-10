import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter ID number: ");
            String id = scanner.nextLine();

            Student student = new Student(name, id);
            int[] scores = new int[5];

            for (int j = 0; j < 5; j++) {
                int score;
                while (true) {
                    System.out.print("Enter score for Subject " + (j + 1) + " (0 - 100): ");
                    try {
                        score = Integer.parseInt(scanner.nextLine());
                        if (score >= 0 && score <= 100) {
                            break;
                        } else {
                            System.out.println("Score must be between 0 and 100. Try again.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                }
                scores[j] = score;
            }

            student.setScores(scores);
            student.calculateAverageAndGrade();
            students[i] = student;
        }
        scanner.close();

        System.out.println("\n===== REPORT CARDS =====");
        for (Student s : students) {
            s.displayReport();
        }
    }
}
