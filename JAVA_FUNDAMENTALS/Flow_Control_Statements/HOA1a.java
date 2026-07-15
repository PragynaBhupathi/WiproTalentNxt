

public class HOA1a {

    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}