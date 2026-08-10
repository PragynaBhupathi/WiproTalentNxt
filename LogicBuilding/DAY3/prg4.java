import java.util.Scanner;
public class prg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        secoundlast(number);
        scanner.close();
    }
    public static void secoundlast(int n) {
        n=Math.abs(n);
        int secondLastDigit = (n / 10) % 10;
        System.out.println("Second last digit of " + n + " is: " + secondLastDigit);
    }
    
}