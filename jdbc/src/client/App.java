package client;

import training.jdbc.beans.Employee;
import training.jdbc.dao.EmployeeDAO;
import training.jdbc.standards.IEmployeeDAO;

public class App {
	public static void main(String[] args) {
		Employee employee = new Employee(1000, "raj","raj@ps.com","1980-01-05",20,40000);
		IEmployeeDAO dao = new EmployeeDAO();
		System.out.println(dao.insertEmployee(employee)?"inserted":"not inserted");
	}
}
