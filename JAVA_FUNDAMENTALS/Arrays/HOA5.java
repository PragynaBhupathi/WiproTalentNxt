import java.util.Arrays;

public class HOA5 {

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 89, 45, 3};

        Arrays.sort(arr);

        System.out.println("Smallest Numbers: " + arr[0] + " " + arr[1]);

        System.out.println("Largest Numbers: " + arr[arr.length - 2] + " " + arr[arr.length - 1]);
    }
}