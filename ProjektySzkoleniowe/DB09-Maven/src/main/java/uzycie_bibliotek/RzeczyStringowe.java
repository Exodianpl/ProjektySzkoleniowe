package uzycie_bibliotek;

import java.util.Objects;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;

public class RzeczyStringowe {

    public static void main(String[] args) {
   	 String a = JOptionPane.showInputDialog("Podaj pierwsze słowo");
   	 String b = JOptionPane.showInputDialog("Podaj drugie słowo");
   	 
   	 // Porównywanie za pomocą equals kłopotliwe, bo gdy pierwszy obiekt jest nullem, to NPE
//   	 if(a.equals(b)) {
//   		 System.out.println("są równe");
//   	 }
   	 
   	 // Dlatego konkretne napisy ze zmiennymi porównujmy w ten sposób:
   	 if("Ala".equals(b)) {
   		 System.out.println("Drugie słowo to Ala");
   	 }

   	 // Dla zmiennych bezpieczniej tak:
   	 if(a != null && a.equals(b)) {
   		 System.out.println("są nie null i równe");
   	 }
   	 
   	 // Mamy też od Javy 7 Objects.equals
   	 if(Objects.equals(a, b)) {
   		 System.out.println("równe Objects.equals");
   	 }
   	 
   	 // Ale nie ma wersji ignoreCase.
   	 
   	 // commons-lang takie rzeczy daje
   	 
   	 if(StringUtils.equalsIgnoreCase(a, b)) {
   		 System.out.println("równe ignore case");
   	 }

   	 System.out.println("[" + StringUtils.center(a, 10) + "]");
   	 
    }

}



