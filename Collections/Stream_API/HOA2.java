import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HOA2 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Akhil", 20, "Pune"));
        employees.add(new Employee(102, "Pragyna", 21, "Hyderabad"));
        employees.add(new Employee(103, "Harsha", 22, "Pune"));
        employees.add(new Employee(104, "Lenin", 23, "Chennai"));
        employees.add(new Employee(105, "Abhiram", 24, "Pune"));

        List<Employee> puneEmployees = employees.stream()
                .filter(emp -> emp.getLocation().equals("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        puneEmployees.forEach(System.out::println);
    }
}