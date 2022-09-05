package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class jdbc1 {
	public static void main(String[] args) throws Exception
	{  //rdbms
		//helps us to connect with a specific database instance:mySQL: mysqlWorkbench
		String url
			= "jdbc:mysql://localhost:3306/table_name"; // table details
		String username = "rootgfg"; // MySQL credentials
		String password = "gfg123";
		String query
			= "select *from students"; // query to be run:SQL:Structured Query Language
		Class.forName(
			"com.mysql.cj.jdbc.Driver"); // Driver name:driving the connection with the db
		Connection con = DriverManager.getConnection(
			url, username, password);
		System.out.println(
			"Connection Established successfully");
		Statement st = con.createStatement();//creating a blank statement memory
		ResultSet rs
			= st.executeQuery(query); // Execute query
		rs.next();//iterate over the result set: the result stored after query execution
		//passing column names to the result set for filtering purpose
		String name
			= rs.getString("name"); // Retrieve name:column from db

		System.out.println(name); // Print result on console
		st.close(); // close statement-query stops execution because the statement blank memory is again made blank and non usable
		con.close(); // close connection: the driver is dead
		System.out.println("Connection Closed....");
	}
}
