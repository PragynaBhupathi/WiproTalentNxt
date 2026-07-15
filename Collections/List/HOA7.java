import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class HOA7 {

    public static void main(String[] args) {

        Vector<Employee> v = new Vector<Employee>();

        v.add(new Employee(101, "Akhil",
                "akhil@gmail.com", "Male", 50000));

        v.add(new Employee(102, "Pragyna",
                "pragyna@gmail.com", "Female", 60000));

        v.add(new Employee(103, "Hasini",
                "hasini@gmail.com", "Female", 70000));

        System.out.println("Using Iterator");

        Iterator<Employee> itr = v.iterator();

        while(itr.hasNext()) {

            Employee e = itr.next();

            e.getEmployeeDetails();

            System.out.println();
        }

        System.out.println("Using Enumeration");

        Enumeration<Employee> en = v.elements();

        while(en.hasMoreElements()) {

            Employee e = en.nextElement();

            e.getEmployeeDetails();

            System.out.println();
        }
    }
}