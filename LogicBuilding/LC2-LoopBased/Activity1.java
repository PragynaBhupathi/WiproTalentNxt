import java.util.*;
public class Activity1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int cnt=0;
       while(number>0){
           cnt++;
           number=number/10;

        }
        System.out.println("Number of digits in " + temp + " is: " + cnt);
    }
}