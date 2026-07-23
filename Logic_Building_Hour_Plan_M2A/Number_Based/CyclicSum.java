import java.util.*;

public class CyclicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = cyclicSum(num);
        System.out.println("Cyclic sum of digits: " + res);
    }

    public static int cyclicSum(int num) {

        String number = Integer.toString(num);
        int sum = 0;
        int length = number.length();

        for (int i = 0; i < length; i++) {
            for(int j=i;j<length;j++){
                int digit = number.charAt(j) - '0';
                sum += digit;
            }
        }

        return sum;
    }
}