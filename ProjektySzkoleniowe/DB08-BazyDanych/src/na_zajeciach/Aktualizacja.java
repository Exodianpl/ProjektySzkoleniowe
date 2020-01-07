package na_zajeciach;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Aktualizacja {

    public static void main(String[] args) {
   	 String kogoSzukam = JOptionPane.showInputDialog("Podaj kod stanowiska");
   	 BigDecimal podwyzka = new BigDecimal(JOptionPane.showInputDialog("Podaj kwotę podwyżki"));
   	 
   	 String url = "jdbc:postgresql://localhost/hr";
   	 String user = "hr";
   	 String password = "abc123";
   	 String sql = "UPDATE employees SET salary = salary + ? WHERE job_id = ?";
   	 
   	 try(Connection c = DriverManager.getConnection(url, user, password);
   		 PreparedStatement stmt = c.prepareStatement(sql)) {
   		 
   		 stmt.setBigDecimal(1, podwyzka);
   		 stmt.setString(2, kogoSzukam);
   		 
   		 int ile = stmt.executeUpdate();
   		 System.out.println(ile + " rekordów zmodyfikowanych");
   		 
   	 } catch (SQLException e) {
   		 e.printStackTrace();
   	 }
    }

}



