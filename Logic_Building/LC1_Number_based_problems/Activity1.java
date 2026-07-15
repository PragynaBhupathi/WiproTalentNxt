public class Activity1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        int temp = a;

        a = c;
        c = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}