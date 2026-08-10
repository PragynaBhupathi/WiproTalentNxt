import java.util.*;

public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.print("c: ");
        int c = sc.nextInt();

        b = c - b;
        c = c - a;
        a = b + c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        sc.close();
    }
}