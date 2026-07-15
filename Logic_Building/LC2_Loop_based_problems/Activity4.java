import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number: ");
        String binary = sc.next();

        int decimal = Integer.parseInt(binary, 2);

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}