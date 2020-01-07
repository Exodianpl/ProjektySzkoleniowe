package gotowe.operatory;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OperatorWarunkowy2 {

	public static void main(String[] args) {
		int[] liczby = {100, 10, 20, 150, 7, 120};
		String wynik = IntStream.of(liczby)
				.mapToObj(a -> a >= 100 ? "duże" : "małe")
				.collect(Collectors.joining("; "));
		System.out.println(wynik);
		
	}
}
