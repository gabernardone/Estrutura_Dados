package Arvore;

public interface IArvore {
	Nodo criaSemFilhos(char c);

	Nodo criaComFilhos(char c, Nodo esq, Nodo dir);

	boolean vazia(Nodo n);

	boolean pertence(char c, Nodo n);

	void imprime(Nodo n);
}
