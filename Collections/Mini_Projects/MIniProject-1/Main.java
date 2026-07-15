import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> empList = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String firstName = sc.nextLine();

            System.out.println("Enter the Lastname");
            String lastName = sc.nextLine();

            System.out.println("Enter the Mobile");
            long mobile = Long.parseLong(sc.nextLine());

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            empList.add(new Employee(firstName, lastName,
                    mobile, email, address));
        }

        Collections.sort(empList,
                Comparator.comparing(Employee::getFirstName));

        System.out.println("\nEmployee List:");
        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "SecondName",
                "MobileNumber", "Email", "Address");

        for (Employee e : empList) {
            System.out.println(e);
        }

        sc.close();
    }
}