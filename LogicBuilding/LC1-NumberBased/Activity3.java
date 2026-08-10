import java.util.*;
public class Activity3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("input1: ");
        int a=sc.nextInt();
        System.out.print("input2: ");   
        int b=sc.nextInt();
        System.out.print("input3: ");
        int c=sc.nextInt();
        System.out.print("input4: ");
        int d=sc.nextInt();
        System.out.print("input5: ");
        int e=sc.nextInt();
        int[] arr={a,b,c,d,e};
        int pos=0,neg=0;
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]>=0)
           {
               pos++;
           }
           else
           {
               neg++;
           }
        }
        System.out.println("Number of positive numbers: " + pos);
        System.out.println("Number of negative numbers: " + neg);
    }
}