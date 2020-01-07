package pracownicy;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class obslugaCSV {
    
    public static List<Employee> wczytaj(File plik) {
   	 List<Employee> lista = new ArrayList<>();
   	 
   	 try(Scanner sc = new Scanner(plik)) {
   		 while(sc.hasNextLine()) {
   			 String linia = sc.nextLine();
   			 String[] fragmenty = linia.split(";", 11);
   			 
   			 int id = Integer.parseInt(fragmenty[0]);
   			 int salary = Integer.parseInt(fragmenty[4]);
   			 LocalDate hireDate = LocalDate.parse(fragmenty[5]);
   			 
   			 Employee emp = new Employee(id, fragmenty[1], fragmenty[2], fragmenty[3], salary, hireDate,
   					 fragmenty[6], fragmenty[7], fragmenty[8], fragmenty[9], fragmenty[10]);
   			 
   			 lista.add(emp);
   		 }
   	 } catch (FileNotFoundException e) {
   		 // TODO Auto-generated catch block
   		 e.printStackTrace();
   	 }
   	 
   	 return lista;
    }

}



