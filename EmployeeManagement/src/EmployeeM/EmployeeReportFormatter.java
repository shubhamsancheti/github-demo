package EmployeeM;

public class EmployeeReportFormatter extends ReportFormatter {
	Employee anEmployee;
	String formatType;
	
	public EmployeeReportFormatter(Employee Emp, FormatType formatType)
	{
		super(Emp, formatType);
		
	}

	public String getFormattedEmployee()
	{
	 return getFormattedValue();	
	}
	
}
