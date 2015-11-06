package Arvore;

public class Nodo {
	
	private int content;
	private Nodo esq;
	private Nodo dir;
	
	public Nodo(int c, Nodo esq, Nodo dir) {
		super();
		this.content = c;
		this.esq = esq;
		this.dir = dir;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public Nodo getEsq() {
		return esq;
	}

	public void setEsq(Nodo esq) {
		this.esq = esq;
	}

	public Nodo getDir() {
		return dir;
	}

	public void setDir(Nodo dir) {
		this.dir = dir;
	}
	
	
	
}