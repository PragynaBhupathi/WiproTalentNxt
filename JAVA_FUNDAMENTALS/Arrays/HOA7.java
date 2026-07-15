import java.util.Scanner;
public class HOA7 {
	   public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of array: ");
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        System.out.println("Enter the array elements:");
	        for (int i = 0; i < n; i++){
	            a[i] = sc.nextInt();
	        }
	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < n; i++) {
	            boolean dup = false;
	            for (int j = 0; j < i; j++){
	                if (a[i] == a[j]){
	                    dup = true;
	                    break;
	                }
	            }
	            if (!dup){
	                System.out.print(a[i] + " ");
	            }
	        }
	        sc.close();
	    }
}