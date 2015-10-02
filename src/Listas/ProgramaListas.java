package Listas;

public class ProgramaListas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Nodo no1 = new Nodo("Carlos Rafael");
		Nodo no2 = new Nodo("Fabricio Barth");
		Nodo no3 = new Nodo("Silvestre");
		
		no1.setNext(no2);
		no2.setNext(no3);
		
		Lista listaMDP = new Lista();
		listaMDP.setFirst(no1);
		
		System.out.println(listaMDP.getSize());
	}

}
