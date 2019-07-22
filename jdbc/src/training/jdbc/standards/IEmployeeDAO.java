package training.jdbc.standards;
import java.util.List;

import training.jdbc.beans.Employee;

public interface IEmployeeDAO {
	
	public boolean insertEmployee(Employee employee);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployee(int empId, double newSalary);
	//select
	
	public List<Employee> getAllEmployee();
}
