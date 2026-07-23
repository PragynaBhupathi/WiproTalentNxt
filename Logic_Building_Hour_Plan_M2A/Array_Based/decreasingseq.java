import java.util.Scanner;

public class decreasingseq {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Handle empty array
        if (n == 0) {
            System.out.println("Number of decreasing sequences: 0");
            System.out.println("Longest decreasing sequence length: 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int longest = 1;
        int current = 1;

        for (int i = 1; i < n; i++) {

            if (arr[i] < arr[i - 1]) {
                current++;
            } else {
                if (current > 1) {
                    count++;
                }
                longest = Math.max(longest, current);
                current = 1;
            }
        }

        // Check the last decreasing sequence
        if (current > 1) {
            count++;
        }
        longest = Math.max(longest, current);

        System.out.println("Number of decreasing sequences: " + count);
        System.out.println("Longest decreasing sequence length: " + longest);

        sc.close();
    }
}