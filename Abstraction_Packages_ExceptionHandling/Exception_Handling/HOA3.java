
import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class HOA3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student " + i + " Name:");
                String name = sc.nextLine();

                int total = 0;

                for (int j = 1; j <= 3; j++) {

                    System.out.println("Enter Marks in Subject " + j + ":");
                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) {
                        throw new NegativeValueException("Negative marks are not allowed");
                    }

                    if (mark > 100) {
                        throw new OutOfRangeException("Marks should be between 0 and 100");
                    }

                    total += mark;
                }

                double average = total / 3.0;

                System.out.println("Student Name : " + name);
                System.out.println("Average Marks : " + average);
            }

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}