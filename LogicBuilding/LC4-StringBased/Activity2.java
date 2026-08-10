import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter String: ");
        String input = scanner.nextLine().toLowerCase();

        char[] arr = input.toCharArray();
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' ||
                arr[i] == 'o' || arr[i] == 'u') {
                arr[i] = 'z';
                flag++;
            }
        }

        if (flag == 0) {
            System.out.println("No vowels found");
        } else {
            System.out.println("Modified String: " + new String(arr));
        }
    }
}