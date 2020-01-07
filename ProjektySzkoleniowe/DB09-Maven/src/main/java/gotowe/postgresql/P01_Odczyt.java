package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P01_Odczyt {

	public static void main(String[] args) {
		System.out.println("Url połaczenia to    " + Ustawienia.URL);
		
		try(Connection c = DriverManager.getConnection(Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD)) {
			System.out.println(c);
			// warto sprawdzic czy con != null
			if(c == null)
				return;
			
			// od Javy 7 mozna (i warto) uzywac try-with-resources
			try(Statement stmt = c.createStatement()) {
				String sql = "SELECT * FROM countries";
				// execute jest najbardziej ogolnym sposobem uruchomienia; wynik boolean mowi, czy sa zwracane jakies dane do odczytania ResultSetem
				boolean czySaDane = stmt.execute(sql);
				if(czySaDane) {
					try(ResultSet rs = stmt.getResultSet()) {
						while(rs.next()) {  // przechodzi do nast. rekordu
							System.out.print(rs.getString(1));
							System.out.print("  ");
							System.out.println(rs.getString("country_name"));
						}
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
