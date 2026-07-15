
import java.util.ArrayList;
import java.util.function.Predicate;

public class HOA4 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Akhil", "Guntur", 8000));
        employees.add(new Employee(2, "Pragyna", "Hyderabad", 5000));
        employees.add(new Employee(3, "Lenin", "Chennai", 9000));
        employees.add(new Employee(4, "Harsha", "Bangalore", 20000));
        employees.add(new Employee(5, "Abhiram", "Mumbai", 70000));

        Predicate<Employee> p =
                emp -> emp.getSalary() < 10000;

        System.out.println("Employees with salary less than 10000:");

        for (Employee emp : employees) {

            if (p.test(emp)) {
                System.out.println(emp.getName());
            }
        }
    }
}