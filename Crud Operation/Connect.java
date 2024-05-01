import java.sql.*;
class Connect
{
	public static void main(String[] args) 
	{
		try 
		{
			//load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/std";
			String unm="root";
			String pwd="";
			Connection con=DriverManager.getConnection(url,unm,pwd);
			if(con.isClosed())
			{
				System.out.println("Not Connected...");
			}
			else 
			{
				System.out.println("Connected....");
			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

		
	}
}