import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[20];
        int[] temp = new int[20];

        System.out.println("Enter 20 elements:");

        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
            temp[i] = arr[i];
        }

        // Maximum 3 elements
        System.out.println("Maximum 3 elements:");

        for (int i = 1; i <= 3; i++) {

            int max = arr[0];
            int index = 0;

            for (int j = 1; j < 20; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    index = j;
                }
            }

            System.out.println(max);
            arr[index] = Integer.MIN_VALUE;
        }

        // Minimum 3 elements
        System.out.println("Minimum 3 elements:");

        for (int i = 1; i <= 3; i++) {

            int min = temp[0];
            int index = 0;

            for (int j = 1; j < 20; j++) {
                if (temp[j] < min) {
                    min = temp[j];
                    index = j;
                }
            }

            System.out.println(min);
            temp[index] = Integer.MAX_VALUE;
        }

        sc.close();
    }
}