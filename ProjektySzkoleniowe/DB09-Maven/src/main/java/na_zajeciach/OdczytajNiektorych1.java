package na_zajeciach;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

import javax.swing.JOptionPane;

public class OdczytajNiektorych1 {
	public static void main(String[] args) {
		System.out.println("Początek programu");
		
		String kogoSzukam = JOptionPane.showInputDialog("Podaj kod stanowiska");
		
		String url = "jdbc:postgresql://localhost/hr";
		String user = "hr";
		String password = "abc123";
		String sql = "SELECT * FROM employees ORDER BY employee_id";
		
		try(Connection c = DriverManager.getConnection(url, user, password);
			PreparedStatement stmt = c.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery()) {
			
			while(rs.next()) {
				String job_id = rs.getString("job_id");
				if(Objects.equals(job_id, kogoSzukam)) {
					int id = rs.getInt("employee_id");
					String imie = rs.getString("first_name");
					String nazwisko = rs.getString("last_name");
					BigDecimal pensja = rs.getBigDecimal("salary");
					java.sql.Date data = rs.getDate("hire_date");
					int szef = rs.getInt("manager_id");
					
					System.out.printf("%d %16s %16s (%s), pensja: %s, data zatr.: %s, nr szefa: %d\n",
							id, imie, nazwisko, job_id, pensja, data, szef);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("Koniec programu");
	}

}
