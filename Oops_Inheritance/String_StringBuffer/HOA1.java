import java.util.Scanner;

public class HOA1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = sc.next();

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (str.equalsIgnoreCase(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

		sc.close();
	}
}