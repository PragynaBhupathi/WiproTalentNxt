import java.util.Scanner;
import java.util.StringJoiner;

public class HOA2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StringJoiner s1 = new StringJoiner("-");

		System.out.print("Enter number of cities for s1: ");
		int n1 = sc.nextInt();

		for (int i = 0; i < n1; i++) {
			System.out.print("Enter city: ");
			s1.add(sc.next());
		}

		StringJoiner s2 = new StringJoiner("-");

		System.out.print("Enter number of cities for s2: ");
		int n2 = sc.nextInt();

		for (int i = 0; i < n2; i++) {
			System.out.print("Enter city: ");
			s2.add(sc.next());
		}

		StringJoiner merge1 = new StringJoiner("-");
		merge1.merge(s1);
		merge1.merge(s2);

		System.out.println("s1 merged to s2 : " + merge1);

		StringJoiner merge2 = new StringJoiner("-");
		merge2.merge(s2);
		merge2.merge(s1);

		System.out.println("s2 merged to s1 : " + merge2);

		sc.close();
	}
}