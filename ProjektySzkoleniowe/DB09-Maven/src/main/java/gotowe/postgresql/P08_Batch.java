package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class P08_Batch {

	public static void main(String[] args) {
		int ID = 9000;
		int ILE = 400;
		
		final String sql = "INSERT INTO locations(location_id, street_address, postal_code, city, country_id)"
				+ " VALUES(?,?,?,?,?)";
		
		try(Connection c = DriverManager.getConnection(Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD);
			PreparedStatement stmt = c.prepareStatement(sql)) {

			c.setAutoCommit(false);  // wyłączamy automatyczne commitowanie - przechodzimy w tryb traksakcji
			
			System.out.println("start");
			long poczatek = System.currentTimeMillis();
			
			for(int i=0; i<ILE; i++) {
				stmt.setInt(1, ID + i);
				stmt.setString(2, "Jasna 23 " + i);
				stmt.setString(3, "01-234");
				stmt.setString(4, "Warszawa");
				stmt.setString(5, "UK");
				
				stmt.addBatch();
				//stmt.executeUpdate();
				System.out.print(".");
				System.out.flush();
			}
			// Wykonanie wszystkich poleceń zapamiętanych w batchu
			stmt.executeBatch();
		
			//c.rollback();
			c.commit();
			long koniec = System.currentTimeMillis();
			System.out.println("\nGotowe, czas = " + (koniec - poczatek) + " ms");
		} catch (SQLException e) {
			System.err.println("Błąd podczas łączenia albo wykonywania SQL");
			e.printStackTrace();
		}
	}
}
