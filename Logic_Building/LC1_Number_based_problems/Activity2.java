import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pass = 0;

        for(int i = 1; i <= 3; i++) {

            System.out.print("Enter marks of student " + i + ": ");
            int marks = sc.nextInt();

            if(marks >= 35)
                pass++;
        }

        System.out.println("Students Passed = " + pass);

        sc.close();
    }
}