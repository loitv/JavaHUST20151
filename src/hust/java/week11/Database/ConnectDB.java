package hust.java.week11.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * @author CST the connectDB create connect with databases used when connect
 *         database
 */
public class ConnectDB {

	static Connection conn = null;
	static String conString = "jdbc:mysql://localhost:8888/southwind";
	static String driver = "com.mysql.jdbc.Driver";
	static String userName = "loitv";
	static String password = "loi123";

	/**
	 * the constructor default
	 */
	public ConnectDB() {

	}

	/**
	 * the method create a connection to connect with databases
	 * 
	 * @return connection to connect databases
	 */
	public static Connection getConnection() {
		try {

			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(conString, userName, password);
			JOptionPane.showMessageDialog(null, "Connect Successfully");

		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | SQLException e) {
			JOptionPane.showMessageDialog(null, "Khong the ket noi CSDL");
		}
		return conn;
	}
	public static void main(String[] args) {
		getConnection();
	}
}
