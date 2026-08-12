import java.util.Scanner;
public class NonprimeIndexSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++) {
            int count=0;
            for(int j=1;j<=i;j++) { 
                if(i%j==0) {
                    count++;
                }
            }
            if(count!=2) {
                sum+=arr[i];
            }
        }
        System.out.println("The sum of elements at non-prime indices is: " + sum);
    }
}