import java.util.Scanner;

public class Activity5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String2: ");
        String s2 = sc.nextLine();

        String reverse = "";

        for(int i=s2.length()-1;i>=0;i--) {
            reverse = reverse + s2.charAt(i);
        }

        String s3 = s1 + reverse;

        System.out.println("String3 = " + s3);

        sc.close();
    }
}