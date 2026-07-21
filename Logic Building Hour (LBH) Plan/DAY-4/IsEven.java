import java.util.*;
public class IsEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is not even.");
        }
        
        scanner.close();
    }
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}