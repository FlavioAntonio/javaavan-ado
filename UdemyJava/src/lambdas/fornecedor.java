package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class fornecedor {

	public static void main(String[] args) {
		Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Lia", "Gui");

		System.out.println(umLista.get());

	}

}
