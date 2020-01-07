package na_zajeciach;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AktualizacjaWTransakcji {

    public static void main(String[] args) {
   	 String kogoSzukam = JOptionPane.showInputDialog("Podaj kod stanowiska");
   	 BigDecimal podwyzka = new BigDecimal(JOptionPane.showInputDialog("Podaj kwotę podwyżki"));
   	 
   	 String url = "jdbc:postgresql://localhost/hr";
   	 String user = "hr";
   	 String password = "abc123";
   	 String sql = "UPDATE employees SET salary = salary + ? WHERE job_id = ?";
   	 
   	 try(Connection c = DriverManager.getConnection(url, user, password)) {
   		 
   		 // c.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
   		 c.setAutoCommit(false);
   		 
   		 try(PreparedStatement stmt = c.prepareStatement(sql)) {
   			 
   			 stmt.setBigDecimal(1, podwyzka);
   			 stmt.setString(2, kogoSzukam);
   			 
   			 int ile = stmt.executeUpdate();
   			 System.out.println(ile + " rekordów zmodyfikowanych");
   		 }
   		 
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
   		 
   		 System.out.println("Koniec połączenia.");
   		 
   	 } catch (SQLException e) {
   		 e.printStackTrace();
   	 }
    }

}



