import java.util.Scanner;
public class prg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum=num1+num2;
        if(sum%2==0){
            System.out.println("The sum of the numbers is: " + sum + " and it is Even.");
        } else {
            System.out.println("The sum of the numbers is: " + sum + " and it is Odd.");
        }
        sc.close();
    }
}