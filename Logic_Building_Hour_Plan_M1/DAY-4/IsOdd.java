import java.util.*;
public class IsOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isOdd(number)) {
            System.out.println(number + " is odd.");
        } else {
            System.out.println(number + " is not odd.");
        }
        
        scanner.close();
    }
    
    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }
}