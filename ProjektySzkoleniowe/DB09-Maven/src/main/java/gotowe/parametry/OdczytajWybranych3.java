package gotowe.parametry;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

// Rozwiązanie poprawne: używamy parametrów oznaczonych znakami zapytania ?
public class OdczytajWybranych3 {

	public static void main(String[] args) {
		// Program pyta użytkownika o kod stanowiska
		String kogoSzukam = JOptionPane.showInputDialog("Podaj kod stanowiska (np. IT_PROG");
		
		// Program odczytuje z bazy pracowników tylko z tego stanowiska
		String url = "jdbc:postgresql://localhost/hr";
		String sql = "SELECT * FROM employees WHERE job_id = ? ORDER BY employee_id";
		
		try(Connection c = DriverManager.getConnection(url, "hr", "abc123")) {
			try(PreparedStatement stmt = c.prepareStatement(sql)) {
				System.out.println("stmt = " + stmt);
				// na parametr nr 1 (numeracja od 1) wstaw podany String
				stmt.setString(1, kogoSzukam);
				System.out.println("stmt = " + stmt);
				
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt(1);
						String imie = rs.getString(2);
						String nazwisko = rs.getString(3);
						String job = rs.getString("job_id");
						BigDecimal pensja = rs.getBigDecimal("salary");
						
						System.out.printf("%3d %-12s %-14s %-10s %12s\n",
								id, imie, nazwisko, job, pensja);
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
