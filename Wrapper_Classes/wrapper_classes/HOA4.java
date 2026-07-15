
class Employee implements Cloneable {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    void display() {
        System.out.println("Employee Id : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }
}

public class HOA4 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee original = new Employee(101, "BHUPATHI PRAGYNA", 50000);

        Employee clone = (Employee) original.clone();

        original.empId = 102;
        original.empName = "AKHIL";
        original.salary = 60000;

        System.out.println("Original Employee");
        original.display();

        System.out.println();

        System.out.println("Cloned Employee");
        clone.display();
    }
}