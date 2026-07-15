import java.io.*;

public class EmployeeService {

    String fileName = "employee.txt";

    public void addEmployee(Employee emp) {

        try {
            FileWriter fw = new FileWriter(fileName, true);

            fw.write(emp.id + "," + emp.name + "," +
                     emp.age + "," + emp.salary + "\n");

            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void displayEmployees() {

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader(fileName));

            String line;

            System.out.println("-----Report-----");

            while ((line = br.readLine()) != null) {

                String data[] = line.split(",");

                System.out.println(
                        data[0] + " " +
                        data[1] + " " +
                        data[2] + " " +
                        data[3]);
            }

            br.close();

            System.out.println("-----End of Report-----");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}