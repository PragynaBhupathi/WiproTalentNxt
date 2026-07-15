import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] count = new int[101];

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            System.out.print("Enter mark: ");
            int mark = sc.nextInt();

            count[mark]++;
        }

        System.out.println("\nStudent Count:");

        for(int i = 0; i <= 100; i++) {

            if(count[i] > 0)
                System.out.println(i + " = " + count[i]);

        }

        sc.close();
    }
}