import java.util.Scanner;

public class SumofPowersofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int res = sumOfPowers(num);
        System.out.println("Sum of powers of digits: " + res);
    }

    public static int sumOfPowers(int num) {
        String number = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int digit = number.charAt(i) - '0';
            int power;

            if (i == 0) {
                power = 8;
            } else if (i == 1) {
                power = 2;
            } else if (i == 2) {
                power = 1;
            }  else {
                power = 0;
            }

            sum += (int) Math.pow(digit, power);
        }

        return sum;
    }
}
