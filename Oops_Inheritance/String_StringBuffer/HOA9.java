import java.util.Scanner;

public class HOA9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First String: ");
		String a = sc.next();

		System.out.print("Enter Second String: ");
		String b = sc.next();

		String result = "";

		int min = Math.min(a.length(), b.length());

		for (int i = 0; i < min; i++) {
			result = result + a.charAt(i) + b.charAt(i);
		}

		if (a.length() > b.length())
			result = result + a.substring(min);

		else if (b.length() > a.length())
			result = result + b.substring(min);

		System.out.println(result);

		sc.close();
	}
}