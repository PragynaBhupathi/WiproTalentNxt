import java.util.Scanner;
public class HOA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int res[] = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++){
            if (a[i] != 10){
                res[index] = a[i];
                index++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < n; i++){
            System.out.print(res[i]);
            if (i != n - 1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        sc.close();
        
    }
}