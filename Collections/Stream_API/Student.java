public class Student {

    private int rollNo;
    private String name;
    private int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}