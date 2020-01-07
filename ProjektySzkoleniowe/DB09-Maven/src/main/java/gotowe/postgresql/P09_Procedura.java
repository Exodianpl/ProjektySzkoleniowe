package gotowe.postgresql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class P09_Procedura {
	
	public static void main(String[] args) {
		try(Connection c = DriverManager.getConnection(Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD);
			CallableStatement stmt = c.prepareCall("{call przenies_pracownika(?,?,?)}")) {
			stmt.setInt(1, 112);
			stmt.setInt(2, 60);
			stmt.setString(3, "IT_PROG");
			
			// gdyby byl parametr INOUT albo OUT
			//call.registerOutParameter(1, Types.VARCHAR);
			
			// a jeśli funkcja zwraca wynik (wartość skalarną, a nie tabelę), to piszemy tak:
			// {call ? = funkcja(?,?,?)}
			// call.registerOutParameter(1, Types.VARCHAR);
			
			stmt.executeUpdate();

			// i po execute zrobic call.getString(1);

			System.out.println("Wykonane");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
