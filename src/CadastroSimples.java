import java.util.Scanner;


public class CadastroSimples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner lerdados = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String Nome = lerdados.nextLine();
		
		System.out.println("Digite sua idade:");
		String Idade = lerdados.nextLine();
		int IIdade = Integer.parseInt(Idade);
		
		System.out.println("Digite sua altura:");
		String Altura = lerdados.nextLine();
		Double DAltura = Double.parseDouble(Altura);
		
		System.out.println("-------------------------------");
		
		
		System.out.println("Seu nome é " + Nome);
		System.out.println("O dobro da sua idade é " + (IIdade * 2));
		System.out.println("A metade da sua altura é " + ( DAltura / 2));
	}

}
