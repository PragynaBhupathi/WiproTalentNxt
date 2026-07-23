import java.util.*;

public class Identifypossiblewords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string of letters: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter Set Of Words");
        String input2 = scanner.nextLine();

        String[] frequency = input2.split(":");

        StringBuilder res = new StringBuilder();

        for (String word : frequency) {

            if (word.length() != input1.length()) {
                continue;
            }

            boolean match = true;

            for (int i = 0; i < input1.length(); i++) {
                if (input1.charAt(i) != '_' && input1.charAt(i) != word.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                if (res.length() > 0) {
                    res.append(":");
                }
                res.append(word);
            }
        }

        System.out.println("Possible words: " + res.toString());
        scanner.close();
    }
}