import java.util.*;
public class encodedarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] enarr = new int[n];
        System.out.println("Enter encoded array elements:");
        for (int i = 0; i < n; i++) {
            enarr[i] = sc.nextInt();
        }
        int orgarr []= new int[n];
        orgarr[n-1] = enarr[n-1];
        for(int i=n-2;i>=0;i--){
            orgarr[i]=enarr[i]-orgarr[i+1];
        }
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            cnt=cnt+orgarr[i];
        }
        System.out.println("First element of original array : "+orgarr[0]);
        System.out.println("Sum of original array elements : "+cnt);
        sc.close();
    }
}