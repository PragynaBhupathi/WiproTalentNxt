import java.util.*;
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        int number = sc.nextInt();
        for(int i=2;i<=number;i++)
        {
            if(number%i==0 )
            {
                System.out.println("The smallest divisor of " + number + " is: " + i);
                break;
            }
        }
    }
}