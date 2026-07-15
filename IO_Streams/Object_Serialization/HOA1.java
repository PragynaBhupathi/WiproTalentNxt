import java.io.*;
import java.util.Date;

public class HOA1 {

    public static void main(String[] args) {

        try {

            Employee emp = new Employee(
                    "BHUPATHI PRAGYNA",
                    new Date(),
                    "Data Science ",
                    "Intern",
                    45000.0);

            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream("data"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("Object Serialized Successfully");

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("data"));

            Employee e = (Employee) ois.readObject();

            ois.close();

            System.out.println("\nEmployee Details");
            System.out.println("Name : " + e.getName());
            System.out.println("DOB : " + e.getDateOfBirth());
            System.out.println("Department : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary : " + e.getSalary());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}