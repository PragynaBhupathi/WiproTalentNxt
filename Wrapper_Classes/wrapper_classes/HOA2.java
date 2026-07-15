public class HOA2 {
    public static void main(String[] args) {

        int number = Integer.valueOf(args[0]);
        System.out.println("Given Number : " + number);
        System.out.println("Binary equivalent : " + Integer.toBinaryString(number));
        System.out.println("Octal equivalent : " + Integer.toOctalString(number));
        System.out.println("Hex equivalent : " + Integer.toHexString(number));
    }
}