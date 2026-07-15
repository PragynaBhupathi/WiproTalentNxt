import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a[]=new int[15];

        System.out.println("Enter 15 elements:");

        for(int i=0;i<15;i++)
            a[i]=sc.nextInt();

        System.out.print("Enter X: ");
        int x=sc.nextInt();

        boolean found=false;

        for(int i=0;i<15;i++)
        {
            if(a[i]==x)
            {
                System.out.println("Found at position "+i);
                found=true;
                break;
            }
        }

        if(!found)
            System.out.println("Not Found");

        sc.close();
    }
}