package Fila;

public class Fila {
	
	private String[] content;
	private int count = 0;
	
	public Fila(int Size){
		this.content = new String[Size];
	}
	
	public void add(String content){
		this.content[this.count] = content;
	}
	
	
	
}
