package Arvore;

public class programaArvore {

	static Arvore ArvoreBinaria = new Arvore();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Nodo raiz = ArvoreBinaria.criaComFilhos(1,
				 ArvoreBinaria.criaSemFilhos(3),
				 ArvoreBinaria.criaSemFilhos(5));
				
				 if(ArvoreBinaria.pertence(6, raiz))
				 System.out.println("encontrou");
				 else
				 System.out.println("nao encontrou");
				
				 ArvoreBinaria.imprime(raiz);

	}
}
