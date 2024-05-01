import java.sql.*;
class Create_table
{
	public static void main(String[] args)
	{
			try 
			{
				//load Driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				//Create Connection
				String url="jdbc:mysql://localhost:3306/std";
				String unm="root";
				String pwd="";
				Connection con=DriverManager.getConnection(url,unm,pwd);

				String q="create table c_b(sid int(20) primary key auto_increment, s_name varchar(100) not null,s_stream varchar(100) not null)";

				//Create Statement 
				Statement stmt=con.createStatement();
				stmt.executeUpdate(q);

				System.out.println("Table Created In Data-Base...");
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	}
}