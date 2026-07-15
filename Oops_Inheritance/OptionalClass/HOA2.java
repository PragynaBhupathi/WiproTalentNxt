
import java.util.Optional;
import java.util.Scanner;

public class HOA2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Address: ");
		String address = sc.nextLine();

		String result = Optional.ofNullable(address)
				.filter(s -> !s.isEmpty())
				.orElse("India");

		System.out.println(result);

		sc.close();
	}
}