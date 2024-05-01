import java.sql.*;
import java.util.*;
class Ins
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        try 
        {
        //load Driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Create Connection
                String url="jdbc:mysql://localhost:3306/std";
                String unm="root";
                String pwd="";
                Connection con=DriverManager.getConnection(url,unm,pwd);
                
                System.out.println("Enter Student Name:");
                String snm=sc.nextLine();

                System.out.println("Enter Student Stream:");
                String stream=sc.nextLine();

                String q="Insert into c_b (s_name,s_stream) values('"+snm+"','"+stream+"')";

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