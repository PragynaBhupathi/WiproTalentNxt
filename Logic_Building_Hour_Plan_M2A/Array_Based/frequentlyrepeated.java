import java.util.*;
public class frequentlyrepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int [] freq=new int[10];
        for(int i=0;i<n;i++)
        {
            int num=arr[i];
            while(num>0)
            {
                int digit=num%10;
                freq[digit]++;
                num=num/10;
            }
        }
        int maxfreq=0;
        for(int i=1;i<10;i++)
        {
            if(freq[maxfreq]<freq[i])
            {
                maxfreq=i;
            }
        }
        System.out.println("Most frequently repeated digit: " + maxfreq);
        sc.close();
    }
}