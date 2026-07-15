import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];

        System.out.println("Enter 10 elements:");

        for(int i=0;i<10;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<9;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("Descending Order:");

        for(int i=0;i<10;i++)
            System.out.print(a[i]+" ");

        sc.close();
    }
}