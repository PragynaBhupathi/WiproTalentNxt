import java.util.*;
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements into the array: ");
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
       for(int i=0;i<20;i++){
        for(int j=i+1;j<20;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
       }
       for(int i=0;i<3;i++)
       {
        System.out.println("The smallest " + (i + 1) + " elements are: " + arr[i]);
        System.out.println("The largest " + (i + 1) + " elements are: " + arr[19 - i]);
       }
    }
}
