import java.util.Scanner;
public class HOA10 {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        int res[] = new int[n];
	        for (int i = 0; i < n; i++){
	            a[i] = sc.nextInt();
	        }
	        int index = 0;
	        for (int i = 0; i < n; i++){
	            if (a[i] % 2 == 0){
	                res[index] = a[i];
	                index++;
	            }
	        }
	        for (int i = 0; i < n; i++){
	            if (a[i] % 2 != 0){
	                res[index] = a[i];
	                index++;
	            }
	        }
	        System.out.print("[");
	        for (int i = 0; i < n; i++){
	            System.out.print(res[i]);
	            if (i != n - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.print("]");
	        sc.close();
	    }
}