import java.util.Scanner;
public class prg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
       iseven(number);
    }

    public static void iseven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is not even.");
        }
    }
}