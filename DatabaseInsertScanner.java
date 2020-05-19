import java.sql.*;
import java.util.Scanner;

class DatabaseInsertScanner{
public static void main(String args[])throws Exception{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/company";
String username="root";
String password="root";
Connection conn=DriverManager.getConnection(url,username,password);
if (conn!=null)
{System.out.println("Connection Established");}
Statement st=conn.createStatement();
Scanner s= new Scanner(System.in);
System.out.println("Enter details");
String name;
int x=0,i=1,id,salary;

while(i<=4)
{ 
id=s.nextInt();
name=s.next();
salary=s.nextInt();
x=st.executeUpdate("insert into Apple values("+id+",'"+name+"',"+salary+")");
i++;
if(x!=0)
System.out.println("Record inserted");}
}
}
