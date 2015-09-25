package aulaRecursividade;

public class ProgramaEspelho {

	/**
	 * 13. Cria uma classe "Espelho", que contém um atributo recursivo do mesmo
	 * tipo chamado "espelhoRetrovisor" e um atributo texto chamado "corFundo".
	 * Crie os gets e sets.
	 * 
	 * Numa outra classe, ProgramaEspelho, crie quantas instâncias de "Espelho"
	 * achar necessárias para que ela possa chamar um "getEspelhoRetrovisor()"
	 * infinitamente sem bug.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Espelho espelho = new Espelho();

		espelho.setEspelhoRetrovisor(espelho);
		espelho.setCorFundo("Verde");

		System.out.println(espelho.getEspelhoRetrovisor().getEspelhoRetrovisor().getEspelhoRetrovisor().getCorFundo());

	}

}
