import java.util.Scanner;
public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int secondLastDigit = getSecondLastDigit(number);
        System.out.println("The second last digit of " + number + " is: " + secondLastDigit);
        
        scanner.close();
    }
    
    public static int getSecondLastDigit(int num) {
        num = Math.abs(num); // Ensure the number is positive
        if (num < 10) {
            return -1; // Return -1 if there is no second last digit
        }
        return (num / 10) % 10; // Get the second last digit
    }
}