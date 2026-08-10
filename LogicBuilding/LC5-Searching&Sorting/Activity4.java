import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        System.out.println("Enter 15 elements:");
        for (int i = 0; i < 15; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number to search: ");
        int x = sc.nextInt();
        int flag=0;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == x) {
                System.out.println("Found at position " + (i + 1));
                flag=1;
            }
        }
        if (flag==0) {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}