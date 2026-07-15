import java.util.ArrayList;

public class HOA3 {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(101, "Akhil", 75));
        students.add(new Student(102, "Pragyna", 45));
        students.add(new Student(103, "Harsha", 90));
        students.add(new Student(104, "Lenin", 35));
        students.add(new Student(105, "Abhiram", 60));

        long count = students.stream()
                .filter(s -> s.getMark() >= 50)
                .count();

        System.out.println("Number of students passed: " + count);
    }
}