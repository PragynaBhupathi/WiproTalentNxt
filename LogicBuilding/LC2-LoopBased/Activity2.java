import java.util.*;
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int cnt = 0;
        while (number > 0) {
            int digit = number % 10;
            cnt += digit;
            number /= 10;
        }
        System.out.println("Sum of digits in " + temp + " is: " + cnt);
        sc.close();
    }
}