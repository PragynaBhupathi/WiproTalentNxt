import java.io.*;
import java.util.*;

public class HOA3 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input file name:");
        String inputFile = sc.nextLine();

        System.out.println("Enter output file name:");
        String outputFile = sc.nextLine();

        TreeMap<String, Integer> map = new TreeMap<>();

        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        String line;

        while ((line = br.readLine()) != null) {

            String[] words = line.split("\\s+");

            for (String word : words) {

                if (map.containsKey(word)) {
                    map.put(word, map.get(word) + 1);
                } else {
                    map.put(word, 1);
                }
            }
        }

        br.close();

        BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            bw.write(entry.getKey() + " : " + entry.getValue());
            bw.newLine();
        }

        bw.close();
        sc.close();

        System.out.println("Word count written to " + outputFile);
    }
}