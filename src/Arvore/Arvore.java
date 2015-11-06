package Arvore;

public class Arvore implements IArvore {

	private Nodo root;

	@Override
	public Nodo criaSemFilhos(int c) {
		return new Nodo(c, null, null);
	}

	@Override
	public Nodo criaComFilhos(int c, Nodo esq, Nodo dir) {
		return new Nodo(c, esq, dir);
	}

	@Override
	public boolean vazia(Nodo n) {
		return n == null;
	}

	@Override
	public boolean pertence(int c, Nodo n) {
		if (vazia(n))
			return false;
		else
			return c == n.getContent() || pertence(c, n.getEsq())
					|| pertence(c, n.getDir());
	}

	@Override
	public void imprime(Nodo n) {
		if (!vazia(n)) {
			System.out.print(n.getContent() + " - ");
			imprime(n.getEsq());
			imprime(n.getDir());
		}
	}

}
