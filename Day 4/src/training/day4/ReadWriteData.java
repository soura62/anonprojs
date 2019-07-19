package training.day4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteData {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter Employee ID");
		int empId = Integer.parseInt(br.readLine());

		System.out.println("enter name");
		String empName = br.readLine();

		System.out.println("enter salary:");
		double salary = Double.parseDouble(br.readLine());
		display(empId, empName, salary);
		
		//read content from file
		
		BufferedReader brFile = new BufferedReader(new FileReader("Emp.txt"));
		String line = null; 
		
		while((line = brFile.readLine())!=null) {
			System.out.println(line);
		}
		
		
		
		BufferedWriter bw = null;
		// write data to file
		try {
			bw = new BufferedWriter(new FileWriter("emp.txt"));
			bw.write("EmpId:" + empId);
			bw.write("EmpName:" + empName);
			bw.write("Salary" + salary);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			bw.close();
		}

		System.out.println("Data written..");
	}

	private static void display(int empId, String empName, double salary) {
		System.out.println("empID:" + empId);
		System.out.println("empName" + empName);
		System.out.println("Salary:" + salary);
	}

}
