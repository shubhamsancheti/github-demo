package EmployeeM;

import java.sql.SQLException;
import java.sql.*;
public class EmployeeDAO {
	public void saveEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
	DatabaseConnectionManager connectionManager=new DatabaseConnectionManager();
	connectionManager.connect();
	Connection con = connectionManager.getConncetionObject();
	
	 // the mysql insert statement
    String query = " insert into employee(id,name,department,working)"
      + " values (?, ?, ?, ?)";

    // create the mysql insert preparedstatement
    PreparedStatement preparedStmt = con.prepareStatement(query);
    preparedStmt.setLong(1,emp.id);
    preparedStmt.setString(2, emp.name);
    preparedStmt.setString(3,emp.department);
    preparedStmt.setString(4,emp.working);

    // execute the preparedstatement
    preparedStmt.execute();
	//ResultSet rs=st.executeQuery("Insert into employee(id,name,department,working) values(2,'raju','gaming','YES');");
	//ResultSet rs=st.executeQuery("select * from employee");
	
	//while(rs.next()) {
	 //   System.out.println(rs.getString ("name"));
	    
	//}
	System.out.println("saved employee to the database"+emp);
	connectionManager.disconnect();
	}
	public void deleteEmployee(Employee emp) throws ClassNotFoundException, SQLException
	{
		DatabaseConnectionManager connectionManager=new DatabaseConnectionManager();
		connectionManager.connect();
		Connection con = connectionManager.getConncetionObject();
		Statement st = con.createStatement();
	    String sql = "delete from employee where id="+emp.id;
	      st.executeUpdate(sql);
	      st.close();
	      connectionManager.disconnect();
		System.out.println("deleted employee from the database"+emp);
	}
	
}
