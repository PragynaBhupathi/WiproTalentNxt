import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<Employee>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {

        for(Employee e : list) {

            if(e.empId == empId) {
                list.remove(e);
                return true;
            }
        }

        return false;
    }

    public String showPaySlip(int empId) {

        for(Employee e : list) {

            if(e.empId == empId) {
                return "Employee ID : "
                        + e.empId
                        + "\nEmployee Name : "
                        + e.empName
                        + "\nSalary : "
                        + e.salary;
            }
        }

        return "Employee Not Found";
    }
}