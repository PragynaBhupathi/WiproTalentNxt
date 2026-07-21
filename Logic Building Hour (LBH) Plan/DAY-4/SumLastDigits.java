import java.util.*;
public class SumLastDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sumLastDigits = getSumLastDigits(number);
        System.out.println("The sum of the last two digits of " + number + " is: " + sumLastDigits);
        
        scanner.close();
    }
    
    public static int getSumLastDigits(int num) {
        num = Math.abs(num); // Ensure the number is positive
        int lastDigit = num % 10;
        int secondLastDigit = (num / 10) % 10;
        return lastDigit + secondLastDigit;
    }
}