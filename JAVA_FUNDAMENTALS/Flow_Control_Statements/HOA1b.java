

public class HOA1b {

    public static void main(String[] args) {

        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        if ((firstNumber % 10) == (secondNumber % 10)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}