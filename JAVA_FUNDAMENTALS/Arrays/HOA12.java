import java.util.Scanner;
public class HOA12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        for (int i = 0; i < 3; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){
            b[i] = sc.nextInt();
        }
        int result[] = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        System.out.print("[");
        System.out.print(result[0]+", "+result[1]);
        System.out.print("]");
        sc.close();
    }
}