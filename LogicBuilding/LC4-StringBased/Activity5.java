import java.util.*;
public class Activity5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String1: ");
        String str = sc.nextLine();
        System.out.print("Enter String2: ");
        String str2 = sc.nextLine();    
        String rev = new StringBuilder(str2).reverse().toString();
        String str3 = str + "  "+rev;   
        System.out.println("The concatenated string is: " + str3);
    }
}