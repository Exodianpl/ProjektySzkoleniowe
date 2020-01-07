package pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Collator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Slowa6 {

    public static void main(String[] args) {
   	 System.out.println("Startujemy...");
   	 
   	 try {
   		 Path plik = Paths.get("pan-tadeusz.txt");
   		 
   		 Files.lines(plik)
   			 .flatMap(linia -> Stream.of(linia.split("[^\\p{L}\\d]+")))
   			 .filter(slowo -> !slowo.isBlank())
   			 .map(String::toLowerCase)
   			 .collect(Collectors.toMap(slowo -> slowo, slowo -> 1, (x,y) -> x+y))
   			 .entrySet()
   			 .stream()
   			 .sorted(Entry.comparingByValue())
   			 .forEach(entry -> {
   			 System.out.printf("%24s – %5d\n", entry.getKey(), entry.getValue());
   		 });
   			 
   	 } catch (IOException e) {
   		 e.printStackTrace();
   	 }
    }

}



