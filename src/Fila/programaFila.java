package Fila;

public class programaFila {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fila inss = new Fila(4);
		
		inss.add("Joaquim");
		inss.add("Potira");
		inss.add("Marieta");
		inss.add("Roselinda");
		
		System.out.println(inss.peek());
		inss.remove();
		inss.remove();

	}

}
