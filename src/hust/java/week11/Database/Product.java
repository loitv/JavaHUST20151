package hust.java.week11.Database;

import java.sql.*;

public class Product {

	public Product() {

	}

	private static void queryProduct(Statement stmt) throws SQLException {
		System.out.println("Products in store:");
		String queryStr = "SELECT * FROM tbl_product;";
		ResultSet rs = stmt.executeQuery(queryStr);
		// Check empty result
		if (!rs.first())
			System.out.println("Have no record!");
		else {
			// display result if not empty
			do {
				String id = rs.getString("productID");
				String name = rs.getString("productName");
				String category = rs.getString("category");
				String supplier = rs.getString("supplier");
				int price = rs.getInt("price");
				System.out.println(id + ", " + name + ", " + category + ", " + supplier + "," + price);
			} while (rs.next());
		}
	}

	private static void addProduct(Connection conn) {
		System.out.println("Added some products into store");
		String queryStr = "INSERT IGNORE INTO tbl_product VALUES(?,?,?,?,?);";
		try (PreparedStatement addStmt = conn.prepareStatement(queryStr)) {
			addStmt.setString(1, "LAP003");
			addStmt.setString(2, "Macbook Pro 2014");
			addStmt.setString(3, "Laptop");
			addStmt.setString(4, "FPT");
			addStmt.setInt(5, 1300);
			addStmt.addBatch(); // add the statement for batch
			addStmt.setString(1, "LAP004");
			addStmt.setString(2, "Dell Vostro 3650");
			addStmt.setInt(5, 560);
			addStmt.addBatch();
			addStmt.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void delProduct(Statement stmt) throws SQLException {
		System.out.println("Delete all laptop from FPT!");
		String delStr = "DELETE FROM tbl_product WHERE supplier = 'FPT' AND category = 'Laptop';";
		int rtCode = stmt.executeUpdate(delStr);
		System.out.println("Number of deleted products: " + rtCode);
	}

	public static void main(String[] args) {
		// try-with-resource to create connection to MySQL
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8888/products", "loitv", "loi123");
				Statement stmt = conn.createStatement();) {
			queryProduct(stmt);
			delProduct(stmt);
			queryProduct(stmt);
			addProduct(conn);
			queryProduct(stmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
