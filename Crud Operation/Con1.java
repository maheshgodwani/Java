import java.sql.*;
class Con1
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

			if(con.isClosed())
			{
				System.out.println("Connection not created");
			}
			else 
			{
				System.out.println("Connection is Created...");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}