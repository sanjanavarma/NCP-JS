package jdbcconnection;
import java.sql.*;
public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ncp","root","password");
			Statement myst=myConn.createStatement();
			ResultSet res1=myst.executeQuery("select * from studentinfo where cgpa > 8");
			while(res1.next())
			{
				System.out.println(res1.getString("student_name")+","+res1.getString("student_rollnum"));
			}
			System.out.println("-----------------------------------------------------------------------------");
			ResultSet res2=myst.executeQuery("select * from studentinfo where cmp_placed ='INFOSYS'");
			while(res2.next())
			{
				System.out.println(res2.getString("student_name")+","+res2.getString("student_rollnum"));
			}
			System.out.println("-----------------------------------------------------------------------------");
			ResultSet res3=myst.executeQuery("select * from studentinfo order by(student_rollnum) ");
			while(res3.next())
			{
				System.out.println(res3.getString("student_name")+","+res3.getString("student_rollnum")+res3.getString("age")+","+res3.getString("cgpa")+","+res3.getString("cmp_placed"));
			}
			System.out.println("-----------------------------------------------------------------------------");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
