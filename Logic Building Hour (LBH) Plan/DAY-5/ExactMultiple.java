import java.util.*;
public class ExactMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n % m == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}