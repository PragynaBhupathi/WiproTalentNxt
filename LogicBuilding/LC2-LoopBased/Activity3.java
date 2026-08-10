import java.util.*;
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Decimal number: ");
        int number = sc.nextInt();
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary representation of " + number + " is: " + binary);
    }
}