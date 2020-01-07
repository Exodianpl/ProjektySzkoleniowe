package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class P05_Aktualizacja_Transakcja {

	public static void main(String[] args) {
		
		zmienPensje("IT_PROG", 500, false);
	}
	
	private static void zmienPensje(String jobId, int zmiana, boolean czyZapisac) {
		double srednia;

		final String sql = "UPDATE employees SET salary = salary + ?"
				+ " WHERE job_id = ?";
		
		try(Connection c = DriverManager.getConnection(
				Ustawienia.URL, Ustawienia.USER, Ustawienia.PASSWD);
			PreparedStatement stmt = c.prepareStatement(sql)) {
			stmt.setInt(1, zmiana);
			stmt.setString(2, jobId);
			
			c.setAutoCommit(false); // przejście w tryb transakcji
			c.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
			// tutaj nie ma sensu, ale może mieć sens: c.setReadOnly(true);
			
			srednia = sredniaPensja(c, jobId);
			System.out.println("Średnia przed zmianą: " + srednia);

			int ile = stmt.executeUpdate();
			System.out.println("Zaktualizowano " + ile + " rekordów.");
			
			// oznaczamy punkt w czasie transakcji, aby ewentualnie dotego punktu wrócić
			Savepoint savepoint = c.setSavepoint();
			
			// w tym momencie zmienione dane widzi tylko ten klient, a inni ich nie widzą
			srednia = sredniaPensja(c, jobId);
			System.out.println("Średnia po zmianie: " + srednia);
			
			if(czyZapisac) {
				c.commit();
				System.out.println("commit - zmiany zatwierdzone");
			} else {
				// wycofuje wszystkie zmiany dokonane w traksakcji
				c.rollback();
				System.out.println("rollback - zmiany wycofane");
				
				// albo
				// c.rollback(savepoint);
				// aby wycofać zmiany tylko do punktu oznaczonego savepointem
				// jeśli zrobimy commit() albo pełny rollback(), to obiekt savepoint jest już nieważny
			}
			srednia = sredniaPensja(c, jobId);
			System.out.println("Średnia na koniec: " + srednia);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static double sredniaPensja(Connection c, String jobId) {
		final String sql2 = "SELECT avg(salary) FROM employees WHERE job_id = ?";
		try(PreparedStatement stmt2 = c.prepareStatement(sql2)) {
			stmt2.setString(1, jobId);
			try(ResultSet rs = stmt2.executeQuery()) {
				if(rs.next()) {
					return rs.getDouble(1);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return 0;
	}
}
