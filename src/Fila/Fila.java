package Fila;

public class Fila {
	
	private String[] content;
	private int count = 0;
	
	public Fila(int Size){
		this.content = new String[Size];
	}
	
	public void add(String content){
		this.content[this.count] = content;
		++this.count;
	}
	
	public String peek(){
		return this.content[0];
	}
	
	public String remove(){
		String temp = this.peek();
		for (int i = 0; i < count-1 ; i++) {
			content[i] = content[i+1];
		}	
		--this.count;
		this.content[this.count] = null;
		return temp;
		
	}
	
	public void clear(){
		for (int i = 0; i < this.count; i++) {
			content[i] = null;			
		}
		this.count = 0;
	}
}
