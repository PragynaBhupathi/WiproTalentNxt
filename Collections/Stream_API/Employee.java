public class Employee {

    private int empNo;
    private String name;
    private int age;
    private String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return empNo + " " + name + " " + age + " " + location;
    }
}