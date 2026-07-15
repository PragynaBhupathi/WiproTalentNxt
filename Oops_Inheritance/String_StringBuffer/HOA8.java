import java.util.Scanner;

public class HOA8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.next();

        int index = str.indexOf('*');

        if (index == -1) {
            System.out.println("'*' not found.");
        } else {
            String result = str.substring(0, index - 1)
                    + str.substring(index + 2);
            System.out.println("Output: " + result);
        }

        sc.close();
    }
}