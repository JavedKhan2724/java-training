package infinite.JDBC_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployInsertMain {

	public static void main(String[] args) throws SQLException {
		String name,dept,design;
		int basic;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter Department");
		dept = sc.next();
		System.out.println("Enter Designation");
		design = sc.next();
		System.out.println("Enter Basic");
		basic = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinite","root","india@123");
			String cmd = "insert into Employ(name,dept,desig,basic)"+"values (?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(cmd);
			pst.setString(1,  name);
			pst.setString(2,  dept);
			pst.setString(3,  design);
			pst.setInt(4, basic);
			pst.executeUpdate();
			System.out.println("Employ Record Inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
