package Listas;

import com.sun.xml.internal.ws.policy.spi.PolicyAssertionValidator.Fitness;

/**
 * Classe: Lista encadeada simples
 * 
 * @author BackFrontEnd <Douglas Alves> - alves.douglaz@gmail.com
 * 
 */
public class Lista {

	private Nodo First;

	public Nodo getFirst() {
		return First;
	}

	public void setFirst(Nodo first) {
		First = first;
	}

	private Nodo Last;

	public int getSize() {
		if (First == null) {
			return 0;
		}
		int Size = 1;
		Nodo NodoCurrent = this.First;
		while (NodoCurrent.getNext() != null) {
			++Size;
			NodoCurrent = NodoCurrent.getNext();
		}
		return Size;
	}

	public void create() {

	}

	public void add(Nodo Topo) {
		Topo.setNext(this.First);
		this.setFirst(Topo);
	}

	public void remove() {

	}

}
