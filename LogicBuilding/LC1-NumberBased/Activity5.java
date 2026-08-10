import java.util.*;
public class Activity5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.print("Enter 3 numbers: ");
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<3;i++){
            sum+=arr[i];
        }
        System.out.println("Resutant set of 3 numbers: "+sum);
    }
}