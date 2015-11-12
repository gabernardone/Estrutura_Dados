package Arvore;

/**
 * Esta classe é uma implementação 
 * de árvore binária cujos nós 
 * recebem números inteiros.
 * @author Yoshiriro
 */
public class Arvore {
	
	private No raiz;
	
	public boolean isVazia() {
		return raiz == null;
	}
	
	public void inserirNo(Integer conteudo) {
		if (isVazia()) {
			raiz = new No(conteudo);
		}
		// implementar a inserção nos "nós filhos"
		// caso já exista o "nó raiz"
		else {
			raiz.inserirNo(conteudo);
		}
	}

	
	public boolean existeNo(Integer conteudo) {
		// invocar apenas o método de busca na raiz
		// portanto, é preciso criar um método
		// de busca também na classe No
		if (!isVazia()) { 
			// só podemos fazer a busca 
			// se a árvore não for vazia
			return raiz.existeNo(conteudo);
		}
		// se a árvore for vazia, lógico que 
		// o conteúdo não existe na árvore
		return false;
	}
}
