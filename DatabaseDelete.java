import java.sql.*;


class DatabaseDelete{
public static void main(String args[])throws Exception{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/company";
String username="root";
String password="root";
Connection conn=DriverManager.getConnection(url,username,password);
if (conn!=null)
System.out.println("Connection Established");
Statement st=conn.createStatement();
int x=st.executeUpdate("delete from Apple where name= 'Sahit'");
if(x!=0)
System.out.println("Record Delete");
}
}
