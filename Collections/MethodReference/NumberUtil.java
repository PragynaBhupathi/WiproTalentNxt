public class NumberUtil {

    public static int digitCount(int n) {

        int count = 0;

        while(n > 0) {
            count++;
            n = n / 10;
        }

        return count;
    }
}