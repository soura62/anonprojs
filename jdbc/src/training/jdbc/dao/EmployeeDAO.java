package training.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import training.jdbc.beans.Employee;
import training.jdbc.connection.GetConnection;
import training.jdbc.standards.IEmployeeDAO;

public class EmployeeDAO implements IEmployeeDAO{
	public boolean insertEmployee(Employee employee) {
		String sql ="insert into employee values(?,?,?,?,?,?)";
		GetConnection gc = new GetConnection();
		try {
		gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
		gc.ps.setInt(1,employee.getEmpId());
		gc.ps.setString(2, employee.getEmpName());
		gc.ps.setString(3, employee.getEmpEmail());
		gc.ps.setString(4, employee.getEmpDob());
		gc.ps.setInt(5, employee.getDepartmentId());
		gc.ps.setDouble(6, employee.getEmpSalary());
		return gc.ps.executeUpdate()>0;
		}catch(SQLException e) {
			e.printStackTrace();
		};
		return false;
	}

	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(int empId, double newSalary) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Employee getEmployee(int empId) {
		String sql = "Select emp_id,emp_name,emp_email, emp_dob,"+"department_id,salary from where emp_id";
		
		GetConnection gc = new GetConnection();
		
		try {
			gc.ps = GetConnection.getMysqlConnection().prepareStatement(sql);
		

		gc.ps.setInt(1, empId);
		gc.rs = gc.ps.executeQuery();
		if(gc.rs.next()) {
			Employee employee = new Employee();
			
			employee.setEmpId(gc.rs.getInt("emp_ID"));
			employee.setEmpName(gc.rs.getString("emp_name"));
			employee.setEmpEmail(gc.rs.getString("emp_email"));
			employee.setEmpDob(gc.rs.getString("emp_dob"));
			employee.setDepartmentId(gc.rs.getInt("department_id"));
			employee.setEmpSalary(gc.rs.getDouble("salary"));
			
			return employee;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	};
	return null;

}
}
