package EmployeeM;

import java.sql.SQLException;
public class ClientModule {
	public static void hireNewEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		EmployeeDAO employeedao = new EmployeeDAO();
		employeedao.saveEmployee(emp);
	}
	public static void terminateNewEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		EmployeeDAO employeedao = new EmployeeDAO();
		employeedao.deleteEmployee(emp);
	}
	public static void printNewEmployee(Employee emp)
	{
		System.out.println(emp.toString());
	}
	public static void printEmployeeReport(Employee emp)
	{
		FormatType format = new FormatType("CSV");
		EmployeeReportFormatter empreport = new EmployeeReportFormatter(emp,format);
		System.out.println(empreport.getFormattedEmployee());
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Employee emp = new Employee(1,"shubham","software","YES");
		//ClientModule.hireNewEmployee(emp);
		//ClientModule.printEmployeeReport(emp);
		terminateNewEmployee(emp);
	}
}
