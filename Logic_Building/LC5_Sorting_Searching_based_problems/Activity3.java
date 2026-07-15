import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int a[]=new int[25];

        System.out.println("Enter 25 elements:");

        for(int i=0;i<25;i++)
            a[i]=sc.nextInt();

        int max=a[0];

        for(int i=1;i<25;i++)
        {
            if(a[i]>max)
                max=a[i];
        }

        int first=-1,last=-1;

        for(int i=0;i<25;i++)
        {
            if(a[i]==max)
            {
                if(first==-1)
                    first=i;

                last=i;
            }
        }

        System.out.println("Maximum = "+max);
        System.out.println("First Position = "+first);
        System.out.println("Last Position = "+last);

        sc.close();
    }
}