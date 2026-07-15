import java.util.Scanner;
public class HOA8 {
    public static void main(String[] args){
    	 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of array: ");
         int n = sc.nextInt();
         int[] a = new int[n];
         System.out.println("Enter the array elements:");
         for (int i = 0; i < n; i++){
             a[i] = sc.nextInt();
         }
         int sum = 0;
         boolean ignore = false;
         for (int i = 0; i < n; i++){
             if (a[i] == 6){
                 boolean found7 = false;
                 for (int j = i + 1; j < n; j++){
                     if (a[j] == 7){
                         found7 = true;
                         break;
                     }
                 }
                 if (found7){
                     ignore = true;
                 }
             }
             if (!ignore){
                 sum = sum + a[i];
             }
             if (a[i] == 7 && ignore){
                 ignore = false;
             }
         }
         System.out.println("Sum = " + sum);
         sc.close();
    }
}