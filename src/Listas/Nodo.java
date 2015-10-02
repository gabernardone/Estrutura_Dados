package Listas;

public class Nodo {
	
	private String content;
	private Nodo Next;
	
	
	public Nodo(String content) {	
		this.content = content;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Nodo getNext() {
		return Next;
	}


	public void setNext(Nodo proximo) {
		this.Next = proximo;
	}
	
}
