package training.jdbc.standards;
import java.util.List;

import training.jdbc.beans.Employee;
import training.jdbc.connection.GetConnection;


public interface IEmployeeDAO {
	
	public boolean insertEmployee(Employee employee);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(int empId, double newSalary);
	//select
	
	public List<Employee> getAllEmployee();
		List<Employee> emps = new ArrayList<>();
		String sql = "Select emp_id,emp_name,emp_email, emp_dob,"+"department_id,salary from where emp_id";
		
		GetConnection gc = new GetConnection();
		gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
		
		gc.rs = gc.ps.executeQuery();
		
		while(gc.rs.next()) {
			Employee employee = new Employee();
			
			employee.setEmpId(gc.rs.getInt("emp_id"));
			employee.setEmpName(gc.rs.getString("emp_name"));
			employee.setEmpEmail(gc.rs.getString("emp_email"));
			employee.setEmpDob(gc.rs.getString("emp_dob"));
			employee.setDepartmentId(gc.rs.getInt("department_id"));
			employee.setEmpSalary(gc.rs.getDouble("salary"));
			
			return employee;
		}
		
}
