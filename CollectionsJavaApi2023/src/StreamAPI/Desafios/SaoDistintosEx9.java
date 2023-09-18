package StreamAPI.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SaoDistintosEx9 {
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 1);
		
		boolean distintos = numeros.stream()
								.distinct()
								.count() == 1;
		
		System.out.println("Os elementos são distintos: " + !distintos);
		
	}
}
