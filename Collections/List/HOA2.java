
public class HOA2 {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 =
            new Employee(101,
                         "Rupa",
                         "rupa@gmail.com",
                         "Female",
                         50000);

        db.addEmployee(e1);

        e1.getEmployeeDetails();

        System.out.println();

        System.out.println(db.showPaySlip(101));
    }
}