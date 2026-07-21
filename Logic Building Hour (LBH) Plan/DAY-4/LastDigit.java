import java.util.*;
public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int lastDigit = getLastDigit(number);
        System.out.println("The last digit of " + number + " is: " + lastDigit);
        
        scanner.close();
    }
    
    public static int getLastDigit(int num) {
        return Math.abs(num % 10);
    }
}