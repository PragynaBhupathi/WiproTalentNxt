package test;

public class HOA1 {

    public static void main(String[] args) {

        foundation obj = new foundation();

        // System.out.println(obj.var1); // Private - Not Accessible

        System.out.println("Default   : " + obj.var2);
        System.out.println("Protected : " + obj.var3);
        System.out.println("Public    : " + obj.var4);
    }
}