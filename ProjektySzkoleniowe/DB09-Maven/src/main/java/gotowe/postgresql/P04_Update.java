package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class P04_Update {
	
	public static void podwyzka(double zmiana, int min, int max) {
		String sql = "UPDATE employees SET salary = salary * (1 + ?) "
				+ "WHERE salary BETWEEN ? AND ?" ;
		
		try(Connection c = DriverManager.getConnection(Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD);
			PreparedStatement stmt = c.prepareStatement(sql)) {
			
			stmt.setDouble(1, zmiana);
			stmt.setInt(2, min);
			stmt.setInt(3, max);
			
			int ile = stmt.executeUpdate(); // uwaga, tego uzywamy takze dla insert czy delete
			
			System.out.println("Zaktualizowano " + ile + " wierszy");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		podwyzka(0.0, 10000, 20000);
	}
}
