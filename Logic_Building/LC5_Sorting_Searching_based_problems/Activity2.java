import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter sorted elements:");

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        System.out.print("Output Array: ");

        System.out.print(a[0]+" ");

        for(int i=1;i<n;i++)
        {
            if(a[i]!=a[i-1])
                System.out.print(a[i]+" ");
        }

        sc.close();
    }
}