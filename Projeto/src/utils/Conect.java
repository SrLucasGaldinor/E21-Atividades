package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
	private static Connection con = null;

	public static Connection getConexao() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mercado", "root", "290427");
		} catch (SQLException error) {
			error.printStackTrace();
		}
		return con;
	}
	public static void fecharConexao() {
		try {
			con.close();
		} catch (SQLException error) {
			error.printStackTrace();
		}
	}
}
