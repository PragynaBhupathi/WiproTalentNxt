import java.util.Scanner;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        int [] studentscore = new int[100];
        for(int i=0;i<marks.length;i++)
        {
            studentscore[marks[i]]++;
        }
        System.out.println("Marks\tFrequency");
        for(int i=0;i<studentscore.length;i++)
            {
                System.out.println(i + "\t" + studentscore[i]);
            }
        
    }
}