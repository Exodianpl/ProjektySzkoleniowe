package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P05_Aktualizacja_BezTransakcji {

	public static void main(String[] args) {
		
		zmienPensje("IT_PROG", 1, false);
	}
	
	private static void zmienPensje(String jobId, int zmiana, boolean czyZapisac) {
		final String sql = "UPDATE employees SET salary = salary + ?"
				+ " WHERE job_id = ?";
		
		try(Connection c = DriverManager.getConnection(
				Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD);
			PreparedStatement stmt = c.prepareStatement(sql)) {

			stmt.setInt(1, zmiana);
			stmt.setString(2, jobId);
			
			int ile = stmt.executeUpdate();
			System.out.println("Zaktualizowano " + ile + " rekordów.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
