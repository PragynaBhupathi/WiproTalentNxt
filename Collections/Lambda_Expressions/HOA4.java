public class HOA4 {

    public static void main(String[] args) {

        String str = "Java Lambda Expressions are easy to learn";

        WordCount wc = s -> s.trim().split("\\s+").length;

        System.out.println("String : " + str);
        System.out.println("Word Count : " + wc.count(str));
    }
}