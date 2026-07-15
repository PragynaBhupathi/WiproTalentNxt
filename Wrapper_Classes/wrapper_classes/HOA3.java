import java.util.Scanner;

public class HOA3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        String result = String.format("%8s", binary).replace(' ', '0');
        System.out.println(result);
        sc.close();
    }
}