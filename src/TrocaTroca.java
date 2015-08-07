import java.util.Scanner;


public class TrocaTroca {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner lerdados = new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		String FraseIni = lerdados.nextLine();
		
		System.out.println("Digite o que deseja procurar:");
		String Find = lerdados.nextLine();
		
		System.out.println("Pelo o que gostaria de alterar na frase principal?:");
		String Replace = lerdados.nextLine();
		
		System.out.println("--------------------------------------------------:");
		
		System.out.println("A frase final ficou:" + FraseIni.replace(Find,Replace));
	}

}
