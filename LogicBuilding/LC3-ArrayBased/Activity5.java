import java.util.Scanner;
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of Students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        System.out.println("Enter the range of marks to be displayed: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        int [] studentscore = new int[100];
        for(int i=0;i<marks.length;i++)
        {
            studentscore[marks[i]]++;
        }
        System.out.println("Marks\tFrequency");
        for(int i=start;i<=end;i++)
            {
                System.out.println(i + "\t" + studentscore[i]);
            }
            
        
    }
}