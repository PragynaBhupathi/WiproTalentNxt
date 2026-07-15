import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        for(int i = 1; i <= 5; i++) {

            System.out.print("Enter number : ");
            int num = sc.nextInt();

            if(num >= 0)
                positive++;
            else
                negative++;
        }

        System.out.println("Positive Numbers = " + positive);
        System.out.println("Negative Numbers = " + negative);

        sc.close();
    }
}