public class Project1 {

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter Employee Id");
            return;
        }

        Employee emp[] = new Employee[7];

        emp[0] = new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
        emp[1] = new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
        emp[2] = new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
        emp[3] = new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000);
        emp[4] = new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
        emp[5] = new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400);
        emp[6] = new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);

        int searchId = Integer.parseInt(args[0]);

        boolean found = false;

        System.out.printf("%-8s %-10s %-15s %-15s %-10s\n",
                "EmpNo", "EmpName", "Department", "Designation", "Salary");

        for (Employee e : emp) {

            if (e.empNo == searchId) {

                found = true;

                String designation = "";
                int da = 0;

                switch (e.desigCode) {

                case 'e':
                    designation = "Engineer";
                    da = 20000;
                    break;

                case 'c':
                    designation = "Consultant";
                    da = 32000;
                    break;

                case 'k':
                    designation = "Clerk";
                    da = 12000;
                    break;

                case 'r':
                    designation = "Receptionist";
                    da = 15000;
                    break;

                case 'm':
                    designation = "Manager";
                    da = 40000;
                    break;
                }

                int salary = e.basic + e.hra + da - e.it;

                System.out.printf("%-8d %-10s %-15s %-15s %-10d\n",
                        e.empNo,
                        e.empName,
                        e.department,
                        designation,
                        salary);

                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + searchId);
        }
    }
}