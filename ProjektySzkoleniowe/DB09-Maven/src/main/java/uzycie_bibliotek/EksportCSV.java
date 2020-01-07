package uzycie_bibliotek;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

public class EksportCSV {

    public static void main(String[] args) {
   	 try(Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/hr", "hr", "abc123")) {
   		 
   		 ResultSet rs = odczytajDane(c);
   		 
   		 zapiszWyniki(rs);
   		 
   		 
   		 rs.close();
   		 
   		 System.out.println("Gotowe");
   		 
   	 } catch (SQLException | IOException e) {
   		 e.printStackTrace();
   	 }
    }

    private static ResultSet odczytajDane(Connection c) throws SQLException {
   	 final String sql = "SELECT * FROM employees"
   			 + " LEFT JOIN jobs USING (job_id)"
   			 + " LEFT JOIN departments USING (department_id)"
   			 + " LEFT JOIN locations USING (location_id)"
   			 + " LEFT JOIN countries USING (country_id)"
   			 + " ORDER BY employee_id";
   	 
   	 PreparedStatement stmt = c.prepareStatement(sql);
   	 return stmt.executeQuery();
    }

    private static void zapiszWyniki(ResultSet rs) throws SQLException, IOException {
   	 CSVFormat format = CSVFormat.EXCEL.withDelimiter(';');
   	 try(PrintWriter out = new PrintWriter("dane.csv");
   		 CSVPrinter printer = new CSVPrinter(out, format)) {
   		 
   		 printer.printRecords(rs);
   	 }
   	 
    }
    
}









