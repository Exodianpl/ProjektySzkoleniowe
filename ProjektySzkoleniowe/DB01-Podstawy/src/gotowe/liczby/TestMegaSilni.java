package gotowe.liczby;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class TestMegaSilni {

	public static void main(String[] args) {
		System.out.println("Wyliczam silnię od 100 tys.");
		BigInteger silnia100tys = SilniaNaRozneSposoby.silniaBig(100_000);
		String silnia100tysTXT = silnia100tys.toString();
		System.out.printf("Gotowe, wynik ma %d cyfr.", silnia100tysTXT.length());
		try {
			final String plik = "silnia_100_tys.txt";
			Files.write(Paths.get(plik), Collections.singleton(silnia100tysTXT), Charset.defaultCharset(), StandardOpenOption.CREATE);
			System.out.println("Zapisałem do pliku " + plik);
		} catch (IOException e) {
			System.out.println("Błąd zapisu do pliku");
		}
		System.out.println();
	}
}
