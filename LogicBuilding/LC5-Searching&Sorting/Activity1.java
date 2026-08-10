import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a array elements: ");
        int [] arr = new int[10];
        for(int i=0;i<10;i++)
            arr[i] = scanner.nextInt();
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array in ascending order:");
        for(int i=0;i<10;i++)
        {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}