package na_zajeciach;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Odczyt1 {
	// JDBC - Java Database Connectivity
	public static void main(String[] args) {
		System.out.println("Początek programu");
				
		String url = "jdbc:postgresql://localhost:5432/hr";
		String user = "hr";
		String password = "abc123";
		
		try {
			Connection c = DriverManager.getConnection(url, user, password);
			// koncepcyjnie rzecz biorąc robimy taką rzecz, ale w sposób bardziej przenośny
			// Connection c = new PostgreSQLConnection();
			
			
			System.out.println("udało się połączyć, c = " + c);
			
			String sql = "SELECT * FROM employees";
			PreparedStatement stmt = c.prepareStatement(sql);
			
			// stmt.setFetchSize(500);
			
			ResultSet rs = stmt.executeQuery();
			System.out.println("rs: " + rs);
			System.out.println();
			
			// rs.next() przesuwa do następnego rekordu
			while(rs.next()) {
				// bedąc w rekodzie możemy odczytać wartości kolumn podając numer kolumny (licząc od 1)
				int id = rs.getInt(1);
				String imie = rs.getString(2);
				String nazwisko = rs.getString(3);
				
				// można też podać nazwę kolumny
				String job_id = rs.getString("job_id");
				BigDecimal pensja = rs.getBigDecimal("salary");
				java.sql.Date data = rs.getDate("hire_date");
				int szef = rs.getInt("manager_id");
				
				System.out.printf("%d %16s %16s (%s), pensja: %s, data zatr.: %s, nr szefa: %d\n",
						id, imie, nazwisko, job_id, pensja, data, szef);
			}
			
			rs.close();
			stmt.close();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Koniec programu");
	}

}
