package gotowe.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;

public class P00_NawiazaniePolaczenia {

	public static void main(String[] args) {
		
		try {
			// Dla starszych sterowników (JDBC v3) i w niektórych środowiskach (np. na Tomcacie, jak wskazuje praktyka)
			// przed otwarciem połączenia trzeba załadować do pamięci klasę sterownika.
			//Class.forName("org.postgresql.Driver");
			
			// Class<?> k = Class.forName("org.postgresql.Driver");
			// daje efekt taki jak poniższe polecenie, ale działa dopiero w runtime, a poniższe wymaga obecności klasy już w czasie kompilacji
			// Class<?> k = org.postgresql.Driver.class;
			
//			Connection connection = DriverManager.getConnection(
//					"jdbc:postgresql://localhost:5432/hr", "hr", "abc123");

			Connection connection = DriverManager.getConnection(
					"jdbc:postgresql://vps497901.ovh.net:5432/hr", "hr", "vps497901_abc123");

			System.out.println("Udało się połączyć");
			System.out.println(connection);
			System.out.println(connection.getClientInfo());
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
