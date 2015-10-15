package Pilha;

public class programaPilha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pilha teste = new Pilha(3);

		System.out.println("Pilha vazia? " + teste.isEmpty());
		
		teste.push("Ola");
		teste.push("mundo");
		
		System.out.println("Pilha vazia? " + teste.isEmpty());
		
		
		System.out.println(teste.pop());
		System.out.println(teste.pop());
		
		System.out.println("Pilha vazia? " + teste.isEmpty());
	}

}
