import java.util.*;

public class Stringcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");
        String input1 = scanner.nextLine();

        String[] words = input1.split(" ");

        for (String word : words) {
            int len = word.length();
            int sum = 0;

            for (int i = 0; i < len / 2; i++) {
                char ch1 = Character.toLowerCase(word.charAt(i));
                char ch2 = Character.toLowerCase(word.charAt(len - 1 - i));

                int value1 = ch1 - 'a' + 1;
                int value2 = ch2 - 'a' + 1;

                sum += (value1 - value2);
            }
            if (len % 2 != 0) {
                char middle = Character.toLowerCase(word.charAt(len / 2));
                sum += (middle - 'a' + 1);
            }

           System.out.print(sum);
        }

        scanner.close();
    }
}