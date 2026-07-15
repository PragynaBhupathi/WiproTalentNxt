import java.io.*;
import java.util.Scanner;

public class HOA2 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input file name");
        String inputFile = sc.nextLine();

        System.out.println("Enter the output file name");
        String outputFile = sc.nextLine();

        FileReader fr = new FileReader(inputFile);
        FileWriter fw = new FileWriter(outputFile);

        int ch;

        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();
        sc.close();

        System.out.println("File is copied.");
    }
}