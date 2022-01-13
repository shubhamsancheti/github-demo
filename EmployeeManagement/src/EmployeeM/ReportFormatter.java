package EmployeeM;

public class ReportFormatter {
	String formattedoutput;
	public ReportFormatter(Object object,FormatType formatType)
	{
		switch(formatType.value)
		{
		case "XML":
			formattedoutput=convertObjecttoXML(object);
			break;
		case "CSV":
			formattedoutput=convertObjecttoCSV(object);
		}
	}
	private String convertObjecttoXML(Object object)
	{
		return "XML : <title>" + object.toString() + "</title>";
	}
	private String convertObjecttoCSV(Object object)
	{
		return "CSV : ,,," + object.toString() + ",,,";
	}
	public String getFormattedValue()
	{
		return formattedoutput;
		
		
	}
	
}
