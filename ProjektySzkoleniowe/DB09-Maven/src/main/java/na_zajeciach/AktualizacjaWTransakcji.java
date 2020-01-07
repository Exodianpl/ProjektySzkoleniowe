package na_zajeciach;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AktualizacjaWTransakcji {

	public static void main(String[] args) {
		String kogoSzukam = JOptionPane.showInputDialog("Podaj kod stanowiska");
		
		String url = "jdbc:postgresql://localhost/hr";
		String user = "hr";
		String password = "abc123";
		String sql = "UPDATE employees SET salary = salary + ? WHERE job_id = ?";
		
		try(Connection c = DriverManager.getConnection(url, user, password)) {
			
			// c.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
			c.setAutoCommit(false);
			
			System.out.println("Średnia pensja na początku: " + sredniaPensja(c, kogoSzukam));			

			BigDecimal podwyzka = new BigDecimal(JOptionPane.showInputDialog("Podaj kwotę podwyżki"));
			
			try(PreparedStatement stmt = c.prepareStatement(sql)) {
				
				stmt.setBigDecimal(1, podwyzka);
				stmt.setString(2, kogoSzukam);
				
				int ile = stmt.executeUpdate();
				System.out.println(ile + " rekordów zmodyfikowanych");
			}
			
			System.out.println("Średnia pensja po update: " + sredniaPensja(c, kogoSzukam));
			
			int wybor = JOptionPane.showConfirmDialog(null, "Czy zakomitować?");
			switch(wybor) {
			case JOptionPane.YES_OPTION:
				System.out.println("commit");
				c.commit();
				break;
			case JOptionPane.NO_OPTION:
				System.out.println("rollback");
				c.rollback();
				break;
			case JOptionPane.CANCEL_OPTION:
				System.out.println("nie robię nic");
				break;
			}
			
			System.out.println("Średnia pensja na końcu: " + sredniaPensja(c, kogoSzukam));
			System.out.println("Koniec połączenia.");
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
