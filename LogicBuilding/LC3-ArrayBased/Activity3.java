import java.util.*;
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements into the array: ");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Reverse Of an array :");
        for(int j=9; j>=0; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
