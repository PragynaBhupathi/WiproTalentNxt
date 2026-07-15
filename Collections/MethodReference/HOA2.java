public class HOA2 {

    public static void main(String[] args) {

        DigitCounter dc = NumberUtil::digitCount;

        int result = dc.count(12345);

        System.out.println("Number of Digits = " + result);
    }
}