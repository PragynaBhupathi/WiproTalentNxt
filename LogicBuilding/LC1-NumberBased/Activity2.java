import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student A Marks (0-100): ");
        int a = sc.nextInt();
        if (a < 0 || a > 100) {
            System.out.println("Invalid input. Please enter marks between 0 and 100.");
            return;
        }

        System.out.print("Student B Marks (0-100): ");
        int b = sc.nextInt();
        if (b < 0 || b > 100) {
            System.out.println("Invalid input. Please enter marks between 0 and 100.");
            return;
        }

        System.out.print("Student C Marks (0-100): ");
        int c = sc.nextInt();
        if (c < 0 || c > 100) {
            System.out.println("Invalid input. Please enter marks between 0 and 100.");
            return;
        }

        int[] student_marks = {a, b, c};
        int pass = 0;

        for (int i = 0; i < student_marks.length; i++) {
            if (student_marks[i] >= 35) {
                pass++;
            }
        }

        System.out.println("Number of students passed: " + pass);
        System.out.println("Number of students failed: " + (student_marks.length - pass));

        sc.close();
    }
}