package uzycie_bibliotek;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class SkopiujKatalog {

	public static void main(String[] args) {
		File skad = new File("src/main/java");
		File dokad = new File("C:\\Users\\kurs\\Desktop");
	
		try {
			FileUtils.copyDirectory(skad, dokad);
			System.out.println("Gotowe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
