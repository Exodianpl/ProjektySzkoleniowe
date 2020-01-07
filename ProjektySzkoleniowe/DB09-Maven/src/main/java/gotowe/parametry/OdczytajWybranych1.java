package gotowe.parametry;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;
import javax.swing.JOptionPane;

/* To jest rozwiązanaie niewydajne.
 * (Typowy błąd początkującego programisty).
 * Baza odczytuje wszystkie dane z tabeli, przesyła do aplikacji wszystkie rekordy,
 * a dopiero aplikacja analizuje dane i wybiera insteresujące rekordy.
 *
 * A przecież bazy danych SQL są zoptymalizowane pod kątem wyszukiwania danych.
 * Dla kolumn, po których wyszukujemy definiuje się indeksy
 * baza danych znajdzie rekordy zgodne z warunkiem WHERE wielokrotnie szybciej niż aplikacja kliencka.
 * 
 * Nawet w przypadku braku indeksów w tym rozwiązaniu niepotrzebnie przesyłamy dane przez sieć i obciążamy klienta.
 */
public class OdczytajWybranych1 {

	public static void main(String[] args) {
		// Program pyta użytkownika o kod stanowiska
		String kogoSzukam = JOptionPane.showInputDialog("Podaj kod stanowiska (np. IT_PROG");
		
		// Program odczytuje z bazy pracowników tylko z tego stanowiska
		String url = "jdbc:postgresql://localhost/hr";
		String sql = "SELECT * FROM employees ORDER BY employee_id";
		
		try(Connection c = DriverManager.getConnection(url, "hr", "abc123")) {
			
			try(PreparedStatement stmt = c.prepareStatement(sql)) {
				
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						String job = rs.getString("job_id");
						if(Objects.equals(job, kogoSzukam)) {
							int id = rs.getInt(1);
							String imie = rs.getString(2);
							String nazwisko = rs.getString(3);
							BigDecimal pensja = rs.getBigDecimal("salary");
							
							System.out.printf("%3d %-12s %-14s %-10s %12s\n",
									id, imie, nazwisko, job, pensja);
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
