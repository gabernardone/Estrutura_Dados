package Pilha;

public class Pilha {

	private String[] palavras;
	private int countElements = 0;

	public Pilha(int size) {
		palavras = new String[size];
	}

	public boolean isEmpty() {
		return (this.countElements <= 0);
	}

	public void push(String content) {
		this.palavras[this.countElements] = content;
		++this.countElements;
	}
	
	public String pop(){
		--this.countElements;
		return this.palavras[this.countElements+1];
	}
}
