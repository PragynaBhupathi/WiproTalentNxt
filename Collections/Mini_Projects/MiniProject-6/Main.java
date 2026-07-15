import java.util.ArrayList;

public class Main {

    public static ArrayList<String> operation(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder str1 = new StringBuilder();
        int k = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 1 && k < s2.length()) {
                str1.append(s2.charAt(k++));
            } else {
                str1.append(s1.charAt(i));
            }
        }
        list.add(str1.toString());

        // Operation 2
        int lastIndex = s1.lastIndexOf(s2);

        if (lastIndex != -1) {
            String rev = new StringBuilder(s2).reverse().toString();

            String str2 = s1.substring(0, lastIndex)
                    + rev
                    + s1.substring(lastIndex + s2.length());

            list.add(str2);
        } else {
            list.add(s1 + s2);
        }

        // Operation 3
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != -1 && first != last) {
            String str3 = s1.substring(0, first)
                    + s1.substring(first + s2.length());

            list.add(str3);
        } else {
            list.add(s1);
        }

        // Operation 4
        int mid = s1.length() / 2;

        String str4;

        if (s1.length() % 2 == 0) {
            str4 = s1.substring(0, mid)
                    + s2
                    + s1.substring(mid);
        } else {
            str4 = s1.substring(0, mid + 1)
                    + s2
                    + s1.substring(mid + 1);
        }

        list.add(str4);

        // Operation 5
        StringBuilder str5 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {

            char ch = s1.charAt(i);

            if (s2.indexOf(ch) != -1) {
                str5.append("*");
            } else {
                str5.append(ch);
            }
        }

        list.add(str5.toString());

        return list;
    }

    public static void main(String[] args) {

        String s1 = "JAVAJAVA";
        String s2 = "VA";

        ArrayList<String> result = operation(s1, s2);

        System.out.println(result);
    }
}