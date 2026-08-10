import java.util.*;
public class Activity4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println(n+ " is Zero");
        }
        else if(n%2==0){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is Odd");
        }
    }
}