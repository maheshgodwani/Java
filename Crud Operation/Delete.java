import java.sql.*;
import java.util.*;
class Delete
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
                Statement stmt=con.createStatement(); 

                System.out.println("Enter Update Record");
                int s_r=sc.nextInt(); 
                String q="Select * from c_b";
                ResultSet rs=stmt.executeQuery(q);  
                System.out.println("\t Student-ID \t Student-Name \t Student Stream");
                System.out.println("\t=================================================\n");  
                while(rs.next())
                {
                        System.out.println("\t\t"+rs.getInt(1)+"\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));         
                }
                String d_query="Delete from c_b where sid='"+s_r+"'";
                int r_affect=stmt.executeUpdate(d_query);
                System.out.println("Row Affected..."+r_affect);
                con.close();           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}