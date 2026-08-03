import java.util.*;
public class AlternateAddSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        System.out.println("Option (Choose 1 or 2):");
        int option = sc.nextInt();
        int sum = 0;
       if(option == 1) {
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    sum += n-i;
                } else {
                    sum -=n- i;
                }
            }
        } else if(option == 2) {
            sum=n;
            boolean add=true;
            for(int i = 1; i < n; i++) {

                if(add) {
                    sum += n-i;
                } else {
                    sum -= n-i;
                }
                add = !add;
            }
        } else {
            System.out.println("Invalid option selected.");
            return;
        }
        System.out.println("The result of the alternate addition and subtraction is: " + sum);
    }
}