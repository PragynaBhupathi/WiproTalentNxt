import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        for(int i = 2; i <= n; i++) {

            if(n % i == 0) {
                System.out.println("Smallest Exact Divisor = " + i);
                break;
            }

        }

        sc.close();
    }
}