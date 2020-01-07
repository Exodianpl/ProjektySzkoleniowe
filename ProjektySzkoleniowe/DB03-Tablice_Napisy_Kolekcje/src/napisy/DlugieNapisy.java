package napisy;

import java.util.Arrays;
import java.util.Scanner;


public class DlugieNapisy {

	static String kolejneLiczby(int n) {
	
		String[] t = new String[n];
		for(int i = 0; i < n; i++) {
			t[i] = Integer.toString(i);
		}
		
		return Arrays.toString(t).replace(",","").replace("[", "").replace("]", "");
	}

	static String kolejneLiczbySB(int n) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <= n; i++) {
			builder.append(i).append(" ");
		}
		return builder.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj ilość liczb: ");
		int n = sc.nextInt();
		String napis = kolejneLiczby(n);
		String napis1 = kolejneLiczbySB(n);
		System.out.println("Długość wynikowego napisu: " + napis.length());
		System.out.println(napis);
		System.out.println("Długość wynikowego napisu: " + napis1.length());
		System.out.println(napis1);
	
	 
	 
	 }
	
	
}
