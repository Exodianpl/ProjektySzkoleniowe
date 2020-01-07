package pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Slowa4 {

    public static void main(String[] args) {
   	 System.out.println("Startujemy...");
   	 
   	 File plik = new File("pan-tadeusz.txt");
   	 try(Scanner sc = new Scanner(plik)) {
   		 sc.useDelimiter("[^\\p{L}\\d]+");
   		 
   		 Map<String, Integer> mapa = new HashMap<>();
   		 //Map<String, Integer> mapa = new LinkedHashMap<>();
   		 //Map<String, Integer> mapa = new TreeMap<>();
   		 //Map<String, Integer> mapa = new TreeMap<>(Collator.getInstance());
   		 
   		 int ilosc= 0;
   		 while(sc.hasNext()) {
   			 String slowo = sc.next();
   			 mapa.merge(slowo, 1, (ileBylo, arg) -> ileBylo+arg);
   			 
   			 ilosc++;
   		 }
   		 System.out.println("Wszystkich słów: " + ilosc);
   		 
   		 List<Entry<String, Integer>> lista = new ArrayList<>(mapa.entrySet());
   		 
   		 lista.sort((entry1, entry2) -> entry1.getValue() - entry2.getValue());
   		 
   		 for (Entry<String, Integer> entry : lista) {
   			 System.out.printf("%24s – %5d\n", entry.getKey(), entry.getValue());
   		 }
   		 
   		 
   	 } catch (FileNotFoundException e) {
   		 e.printStackTrace();
   	 }
   	 
   	 

    }

}



