package gotowe.postgresql;

public class Ustawienia {
	public static final String HOST = "localhost";
	public static final String PASSWD = "abc123";
	
	// Jeśli nie macie lokalnej instalacji postgresa, można skorzystać z mojej
	// Tylko please, nie róbcie SQL injection :)
	
	// public static final String HOST = "vps497901.ovh.net:5432";
	// public static final String PASSWD = "vps497901_abc123";

	public static final String BAZA = "hr";
	public static final String URL = "jdbc:postgresql://" + HOST + "/" + BAZA;
	public static final String USER = "hr";

}
