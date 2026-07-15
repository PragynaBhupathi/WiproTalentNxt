import java.util.ArrayList;
import java.util.function.Function;

public class HOA1 {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Akhil", "Guntur", 30000));
        employees.add(new Employee(2, "Pragyna", "Vijayawada", 25000));
        employees.add(new Employee(3, "Hasini", "Hyderabad", 40000));
        employees.add(new Employee(4, "Lenin", "Chennai", 35000));
        employees.add(new Employee(5, "Abhiram", "Bangalore", 45000));

        Function<Employee, String> getLocation =
                emp -> emp.getLocation();

        ArrayList<String> locations = new ArrayList<>();

        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }

        System.out.println("Locations:");
        locations.forEach(System.out::println);
    }
}