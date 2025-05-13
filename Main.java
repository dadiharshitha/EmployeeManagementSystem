import java.util.*;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n1. Add Employee\n2. View All\n3. Search by Department\n4. Update Salary\n5. Delete Employee\n6. Export to File\n7. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ID, Name, Dept, Salary: ");
                    Employee e = new Employee(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble());
                    dao.addEmployee(e);
                    break;
                case 2:
                    for (Employee emp : dao.getAllEmployees())
                        System.out.println(emp);
                    break;
                case 3:
                    System.out.print("Enter Dept: ");
                    for (Employee emp : dao.searchByDepartment(sc.next()))
                        System.out.println(emp);
                    break;
                case 4:
                    System.out.print("Enter ID & new Salary: ");
                    dao.updateSalary(sc.nextInt(), sc.nextDouble());
                    break;
                case 5:
                    System.out.print("Enter ID to delete: ");
                    dao.deleteEmployee(sc.nextInt());
                    break;
                case 6:
                    FileWriter writer = new FileWriter("employees.txt");
                    for (Employee emp : dao.getAllEmployees())
                        writer.write(emp.toString() + "\n");
                    writer.close();
                    System.out.println("Exported to employees.txt");
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}