import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String2: ");
        String s2 = sc.nextLine();

        String s3 = s1 + s2;

        System.out.println("String3 = " + s3);

        sc.close();
    }
}