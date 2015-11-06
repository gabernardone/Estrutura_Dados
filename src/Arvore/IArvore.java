package Arvore;

public interface IArvore {

	Nodo criaComFilhos(int c, Nodo esq, Nodo dir);

	boolean vazia(Nodo n);

	boolean pertence(int c, Nodo n);

	void imprime(Nodo n);

	Nodo criaSemFilhos(int c);
}
