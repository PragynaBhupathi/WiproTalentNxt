import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Box");
        int n = sc.nextInt();

        HashSet<Box> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double length = sc.nextDouble();

            System.out.println("Enter Width");
            double width = sc.nextDouble();

            System.out.println("Enter Height");
            double height = sc.nextDouble();

            set.add(new Box(length, width, height));
        }

        System.out.println("Unique Boxes in the Set are");

        for (Box b : set) {
            System.out.println(b);
        }

        sc.close();
    }
}