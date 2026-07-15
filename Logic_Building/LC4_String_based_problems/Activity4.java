import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for(int i=0;i<str.length();i++) {

            char ch = str.charAt(i);
            int count = 1;

            if(ch==' ')
                continue;

            boolean visited = false;

            for(int k=0;k<i;k++) {
                if(str.charAt(k)==ch) {
                    visited = true;
                    break;
                }
            }

            if(visited)
                continue;

            for(int j=i+1;j<str.length();j++) {
                if(ch==str.charAt(j))
                    count++;
            }

            System.out.println(ch + " = " + count);
        }

        sc.close();
    }
}