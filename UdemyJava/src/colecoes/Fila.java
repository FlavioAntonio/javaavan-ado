package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana");
		fila.offer("BIa");
		fila.add("Pedro");
		fila.offer("Ricardo");
		fila.offer("Silvia");
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
	}

}
