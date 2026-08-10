import java.util.*;
public class Activity1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  elements in to the array: ");
        int  [] arr = new int[10];
        int sum=0;
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of array elements: " + sum);
    }
}