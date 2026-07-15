

public class HOA17 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        if (original == rev) {
            System.out.println(original + " is a palindrome.");
        }
        else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}