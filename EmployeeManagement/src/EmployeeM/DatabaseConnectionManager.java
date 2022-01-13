package EmployeeM;
import java.sql.*;
public class DatabaseConnectionManager {
	Connection con;
	public void connect() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","password");
		
		//Statement st = con.createStatement();
		//ResultSet rs= st.executeQuery("select * from employee");
		//rs.next();
		//System.out.println("connecting..");
		//st.close();
		//con.close();
	}
	public Connection getConncetionObject()
	{
		System.out.println("connection object..");
		return con;
	}
	public void disconnect() throws SQLException
	{
		con.close();
		System.out.println("disconnecting..");
	}
	

}
