import java.util.*;
public class prg2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        isodd(number);
    }

    public static void isodd(int n) {
        if (n % 2 != 0) {
            System.out.println(n + " is odd.");
        } else {
            System.out.println(n + " is not odd.");
        }
    }
}