import java.util.Scanner;

public class Activity2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 10 array elements: ");

        int[] arr = new int[10];

        // Read array
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array (Ascending Order)
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Display sorted array
        System.out.println("Ordered Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display distinct elements
        System.out.println("\nUnique Elements:");
        for (int i = 0; i < 9; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        // Print the last element
        System.out.print(arr[9]);

        scanner.close();
    }
}