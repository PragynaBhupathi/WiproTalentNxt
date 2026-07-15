import java.util.Scanner;
public class HOA11 {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int a[] = new int[n];
	        for (int i = 0; i < n; i++){
	            a[i] = sc.nextInt();
	        }
	        boolean flag = true;
	        for (int i = 0; i < n; i++){
	            if (a[i] != 1 && a[i] != 4){
	                flag = false;
	                break;
	            }
	        }
	        System.out.println(flag);
	        sc.close();
	    }
}