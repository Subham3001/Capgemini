import java.sql.*;
import java.util.Scanner;

interface EmployeeManager{
     void insert();
     void update();
     void delete();
     void display();
}
class Employee implements EmployeeManager {
    public static String url="jdbc:Mysql://localhost:3306/learn";
    public static String password="Shubham1234#";
    public static String username="root";
    Scanner sc=new Scanner(System.in);
@Override
    public void insert(){
    System.out.println("Enter employee id");
        int id=sc.nextInt();
    System.out.println("Enter your first name");
        String firstName=sc.next();
    System.out.println("Enter your lastName");
       String  lastName=sc.next();
    System.out.println("Enter your age");
    int age=sc.nextInt();
    System.out.println("Enter your salary");
    int salary=sc.nextInt();
        try {
            Connection con=DriverManager.getConnection(url,username,password);
           PreparedStatement st= con.prepareStatement("insert into employee values(?,?,?,?,?)");
           st.setInt(1,id);
           st.setString(2,firstName);
           st.setString(3,lastName);
           st.setInt(4,age);
           st.setInt(5,salary);
           st.executeUpdate();
            System.out.println("Data inserted successfully");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    @Override
    public void update(){
        System.out.println("What do you want to update");
        System.out.println("Press 1 for id");
        System.out.println("Press 2 for first name");
        System.out.println("Press 3 for last name");
        System.out.println("Press 4 for age");
        System.out.println("Press 5 for salary");
        String s= sc.next();
        try {
            if(s.contains("1")){
                System.out.println("Enter new  id");
                int id1= sc.nextInt();
                System.out.println("Enter previous id");
                int id= sc.nextInt();
                Connection con=DriverManager.getConnection(url,username,password);
                PreparedStatement st= con.prepareStatement("update employee set Id=? where Id=?");
                st.setInt(1,id1);
                st.setInt(2,id);
                st.executeUpdate();
                System.out.println("Id updated successfully");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            if(s.contains("2")){
                System.out.println("Enter first name");
                String name= sc.next();
                System.out.println("Enter employee id");
                int id= sc.nextInt();
                Connection con=DriverManager.getConnection(url,username,password);
                PreparedStatement st= con.prepareStatement("update employee set First_Name=? where Id=?");
                st.setString(1,name);
                st.setInt(2,id);

                st.executeUpdate();
                System.out.println("First name updated successfully");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            if(s.contains("3")){
                System.out.println("Enter last name");
                String name= sc.next();
                System.out.println("Enter employee id");
                int id= sc.nextInt();
                Connection con=DriverManager.getConnection(url,username,password);
                PreparedStatement st= con.prepareStatement("update employee set Last_Name=? where Id=?");
                st.setString(1,name);
                st.setInt(2,id);

                st.executeUpdate();
                System.out.println("Last name updated successfully");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            if(s.contains("4")){
                System.out.println("Enter age");
                int age= sc.nextInt();
                System.out.println("Enter employee id");
                int id= sc.nextInt();
                Connection con=DriverManager.getConnection(url,username,password);
                PreparedStatement st= con.prepareStatement("update employee set Age=? where Id=?");
                st.setInt(1,age);
                st.setInt(2,id);

                st.executeUpdate();
                System.out.println("Age updated successfully");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
        try {
            if(s.contains("5")){
                System.out.println("Enter salary");
                int salary= sc.nextInt();
                System.out.println("Enter employee id");
                int id= sc.nextInt();
                Connection con=DriverManager.getConnection(url,username,password);
                PreparedStatement st= con.prepareStatement("update employee set Salary=? where Id=?");
                st.setInt(1,salary);
                st.setInt(2,id);

                st.executeUpdate();
                System.out.println("Salary updated successfully");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public void delete(){
        System.out.println("Enter Id no");

    try {
        int id =sc.nextInt();
        Connection con =DriverManager.getConnection(url,username,password);
        PreparedStatement st= con.prepareStatement("delete from employee where Id=?");
        st.setInt(1,id);
        st.executeUpdate();
        System.out.println("Data deleted successfully");
    }
    catch (Exception e){
        System.out.println(e);
    }
    }
    public void display(){
        try
        {
            Connection conn=DriverManager.getConnection(url, username, password);
            Statement stmt=conn.createStatement();
            stmt.execute("select * from employee");
            ResultSet rs=stmt.getResultSet();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getInt(4)+"  "+rs.getInt(5));
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
        }
public class Db {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter User");
        String user=sc.next();
        System.out.println("Enter Password");
        String password=sc.next();
        if(!user.equals("Shubham") || !password.equals("Password")){
            System.out.println("User or Password mismatch");
            return;
        }
        System.out.println("What do you want to do");
        System.out.println("Press 1 to insert data");
        System.out.println("Press 2 to update data");
        System.out.println("Press 3 to delete data");
        System.out.println("Press 4 to display data");
        System.out.println("Press 5 to exit");
        String s= sc.next();
EmployeeManager e=new Employee();
if(s.contains("1")) {
    e.insert();
}
        if(s.contains("2")) {
            e.update();
        }
        if(s.contains("3")) {
            e.delete();
        }
        if(s.contains("4")){
            e.display();
        }
        if(s.contains("5")){
            return;
        }

    }
}
