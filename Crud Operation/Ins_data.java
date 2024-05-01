import java.sql.*;
class Ins_data
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
				

				String q="Insert into c_b (s_name,s_stream) values('Rahul','MCA')";

				//get the PreparedStatement Object

				PreparedStatement pstmt=con.prepareStatement(q);

				pstmt.executeUpdate();

				System.out.println("Your Data is Inserted....");
				con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}