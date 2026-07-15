import java.util.Scanner;

public class VideoLauncher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VideoStore store = new VideoStore();

		int choice;

		do {

			System.out.println("\n===== Video Rental Inventory =====");
			System.out.println("1. Add Video");
			System.out.println("2. Check Out Video");
			System.out.println("3. Return Video");
			System.out.println("4. Receive Rating");
			System.out.println("5. List Inventory");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1:
				System.out.print("Enter Video Name: ");
				String addName = sc.nextLine();
				store.addVideo(addName);
				break;

			case 2:
				System.out.print("Enter Video Name: ");
				String checkName = sc.nextLine();
				store.doCheckout(checkName);
				break;

			case 3:
				System.out.print("Enter Video Name: ");
				String returnName = sc.nextLine();
				store.doReturn(returnName);
				break;

			case 4:
				System.out.print("Enter Video Name: ");
				String rateName = sc.nextLine();
				System.out.print("Enter Rating: ");
				int rating = sc.nextInt();
				store.receiveRating(rateName, rating);
				break;

			case 5:
				store.listInventory();
				break;

			case 6:
				System.out.println("Thank You!");
				break;

			default:
				System.out.println("Invalid Choice");

			}

		} while (choice != 6);

		sc.close();
	}
}