

public class HOA7 {

    public static void main(String[] args) {

        char ch = args[0].charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
    }
}