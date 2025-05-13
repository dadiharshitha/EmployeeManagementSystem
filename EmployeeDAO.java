import java.sql.*;
import java.util.*;

public class EmployeeDAO {
    private Connection conn;

    public EmployeeDAO() throws Exception {
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees_db", "root", "Admin@123");
    }

    public void addEmployee(Employee emp) throws SQLException {
        String sql = "INSERT INTO employees VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, emp.id);
        stmt.setString(2, emp.name);
        stmt.setString(3, emp.department);
        stmt.setDouble(4, emp.salary);
        stmt.executeUpdate();
    }

    public List<Employee> getAllEmployees() throws SQLException {
        List<Employee> list = new ArrayList<>();
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM employees");
        while (rs.next()) {
            list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        return list;
    }

    public List<Employee> searchByDepartment(String dept) throws SQLException {
        List<Employee> list = new ArrayList<>();
        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employees WHERE department = ?");
        stmt.setString(1, dept);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            list.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        return list;
    }

    public void updateSalary(int id, double salary) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("UPDATE employees SET salary = ? WHERE id = ?");
        stmt.setDouble(1, salary);
        stmt.setInt(2, id);
        stmt.executeUpdate();
    }

    public void deleteEmployee(int id) throws SQLException {
        PreparedStatement stmt = conn.prepareStatement("DELETE FROM employees WHERE id = ?");
        stmt.setInt(1, id);
        stmt.executeUpdate();
    }
}