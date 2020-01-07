package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P03_OdczytSparametryzowany {
	public static void wypiszPracownikow(int min, int max) {
		String sql = "SELECT first_name, last_name, salary "
				+ "FROM employees WHERE salary BETWEEN ? AND ?";
		
		try(Connection c = DriverManager.getConnection(Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD);
			PreparedStatement stmt = c.prepareStatement(sql)) {
			
			stmt.setInt(1, min);
			stmt.setInt(2, max);
			
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					System.out.printf("%s %s zarabia %s%n",
							rs.getString(1), rs.getString(2), rs.getBigDecimal(3));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		wypiszPracownikow(10000, 20000);
	}
}
