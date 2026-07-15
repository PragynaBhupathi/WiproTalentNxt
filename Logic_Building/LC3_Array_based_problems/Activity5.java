import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] range = new int[10];

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter mark: ");
            int mark = sc.nextInt();

            if (mark >= 0 && mark <= 10)
                range[0]++;
            else if (mark <= 20)
                range[1]++;
            else if (mark <= 30)
                range[2]++;
            else if (mark <= 40)
                range[3]++;
            else if (mark <= 50)
                range[4]++;
            else if (mark <= 60)
                range[5]++;
            else if (mark <= 70)
                range[6]++;
            else if (mark <= 80)
                range[7]++;
            else if (mark <= 90)
                range[8]++;
            else if (mark <= 100)
                range[9]++;
            else
                System.out.println("Invalid mark!");
        }

        System.out.println("\nStudents in each percentage range:");

        System.out.println("0-10   : " + range[0]);
        System.out.println("11-20  : " + range[1]);
        System.out.println("21-30  : " + range[2]);
        System.out.println("31-40  : " + range[3]);
        System.out.println("41-50  : " + range[4]);
        System.out.println("51-60  : " + range[5]);
        System.out.println("61-70  : " + range[6]);
        System.out.println("71-80  : " + range[7]);
        System.out.println("81-90  : " + range[8]);
        System.out.println("91-100 : " + range[9]);

        sc.close();
    }
}