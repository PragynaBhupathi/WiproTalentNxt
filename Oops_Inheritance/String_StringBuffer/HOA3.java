import java.util.Scanner;
public class HOA3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String firstTwo;
        if (s.length() >= 2) {
            firstTwo = s.substring(0, 2);
        } else {
            firstTwo = s;
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            result = result + firstTwo;
        }
        System.out.println(result);
        sc.close();
    }
}