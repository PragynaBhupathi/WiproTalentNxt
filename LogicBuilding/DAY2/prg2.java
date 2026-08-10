import java.util.Scanner;
public class prg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The numbers you entered are: " + num1 + " and " + num2);
        if(num1 > num2) {
            System.out.println(num1 + " is greater ");
        } else if(num1 < num2) {
            System.out.println(num2 + " is grater");
        } else {
            System.out.println("Both are equal");
        }
        sc.close();
    }
}