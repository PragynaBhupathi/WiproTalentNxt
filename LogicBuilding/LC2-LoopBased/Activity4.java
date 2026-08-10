import java.util.*;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary numberr: ");
        int number = sc.nextInt();
        int decimal = Integer.parseInt(String.valueOf(number), 2);
        System.out.println("Octal representation of " + number + " is: " + decimal);
    }
}