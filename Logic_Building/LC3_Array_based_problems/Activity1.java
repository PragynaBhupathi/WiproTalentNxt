import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter 10 elements:");

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}