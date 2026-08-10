import java.util.Scanner;
public class prg5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        sumoflasttwodigits(number1,number2);
        scanner.close();
    }

    public static void sumoflasttwodigits(int n1, int n2) {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        int lastDigit1 = n1 % 10;
        int lastDigit2 = n2 % 10;
        int sum = lastDigit1 + lastDigit2;
        System.out.println("Sum of last two digits is: " + sum);
    }
}
        