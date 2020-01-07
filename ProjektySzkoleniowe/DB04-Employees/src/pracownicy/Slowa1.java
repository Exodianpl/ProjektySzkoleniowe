package pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Slowa1 {

    public static void main(String[] args) {
   	 File plik = new File("pan-tadeusz.txt");
   	 try(Scanner sc = new Scanner(plik)) {
   		 
   		 int ilosc= 0;
   		 while(sc.hasNext()) {
   			 String slowo = sc.next();
   			 System.out.println(slowo);
   			 ilosc++;
   		 }
   		 System.out.println("Wszystkich słów: " + ilosc);
   		 
   	 } catch (FileNotFoundException e) {
   		 e.printStackTrace();
   	 }
   	 
   	 

    }

}
