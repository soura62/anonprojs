package training.jdbc.beans;

public class Employee {
	private int empId;
	private String empName;
	private String empEmail;
	private String empDob;
	private int  departmentId;
	private double empSalary;
	public Employee(int empId, String empName, String empEmail, String empDob, int departmentId, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empDob = empDob;
		this.departmentId = departmentId;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName1() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public String getEmpDob1() {
		return empDob;
	}
	public void setEmpDob(String empDob) {
		this.empDob = empDob;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmpDob() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
