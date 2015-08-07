import java.util.Scanner;


public class ProgramaTexto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		Scanner lerdado = new Scanner(System.in);
		String nome = lerdado.nextLine();
		
		System.out.println(nome.substring(2,4));
		
		System.out.println(nome.replace("a","@"));
		
	}

}
