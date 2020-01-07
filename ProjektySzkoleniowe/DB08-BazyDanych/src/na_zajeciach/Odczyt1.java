package na_zajeciach;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Odczyt1 {

	//JDBC - Java DataBase Connectivity
	public static void main(String[] args) {
	
		String url = "jdbc:postgresql://localhost/hr";
		String user = "hr";
		String password = "abc123";
				
		try {
			Connection c = DriverManager.getConnection(url, user, password);
			System.out.println("Udało się połączyć! : c = " + c);
			
			String sql = "SELECT * FROM employees";
			PreparedStatement stmt = c.prepareCall(sql);
			
			stmt.setFetchSize(500);
			
			ResultSet rs = stmt.executeQuery();
			System.out.println("Wyniki: " + rs);
			
			
			//rs.next() przesówa do następnego rekordu
			while(rs.next()) {
				// będąc w rekordzie możemy odczytać wartość kolumn podając numer kolumn (licząc od 1)
				int id = rs.getInt(1);
				String imie = rs.getString(2);
				String nazwisko = rs.getString(3);
				
				//można też podać nazwe kolumny
				String job_id = rs.getString("job_id");
				BigDecimal pensja = rs.getBigDecimal("salary");
				java.sql.Date data = rs.getDate("hire_date");
				int szef = rs.getInt("manager_id");
				
				System.out.printf("%d %s %s (%s), pensja: %s, data zatr.: %s, nr szefa: %d\n",
						id, imie, nazwisko, job_id, pensja, data, szef);
			}
			
			rs.close();
			stmt.close();
			c.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
