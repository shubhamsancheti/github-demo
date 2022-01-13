package EmployeeM;

public class Employee {
	 long id;
	 String name;
	 String department;
	 String working;
	public Employee(long id, String name, String department, String working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working + "]";
	}
	
}
