import java.util.Scanner;
public class prg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        lastDigit(number);
        scanner.close();
    }

    public static void lastDigit(int n) {
        n=Math.abs(n);
        int lastDigit = n % 10;
        System.out.println("Last digit of " + n + " is: " + lastDigit);
    }
}