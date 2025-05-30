package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		/*
		 * Numero para String binaria ... 6 => "110" Inverter a string... "110" => "011"
		 * Converter de volta para inteiro => "011" => 3
		 * 
		 */

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(System.out::println);

	}

}
