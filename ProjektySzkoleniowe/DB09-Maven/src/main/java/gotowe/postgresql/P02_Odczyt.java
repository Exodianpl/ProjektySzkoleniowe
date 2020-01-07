package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P02_Odczyt {

	public static void main(String[] args) {
		try(Connection c = DriverManager.getConnection(Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD)) {
			// od Javy 7 mozna (i warto) uzywac try-with-resources
			try(Statement stmt = c.createStatement()) {
				final String sql = "SELECT * FROM countries";
				// executeQuery od razu zwraca ResultSet; powinien byc stosowany do zapytan (SELECT)
				// ResultSet to jest "kursor", za pomocą którego przechodzimy przez wyniki zapytania.
				try(ResultSet rs = stmt.executeQuery(sql)) {
					while(rs.next()) {  // przechodzi do nast. rekordu
						// wartosci z kolumn mozna odczytywac wg numeru kolumny (od 1)
						System.out.print(rs.getString(1));
						
						//Object o = rs.getObject(1);
						//System.out.println(o.getClass());
						
						System.out.print("  ");
						// albo wg nazwy kolumny
						System.out.println(rs.getString("country_name"));
					}
				}
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
