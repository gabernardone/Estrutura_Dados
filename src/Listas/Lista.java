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

	/**
	 * Verifica se a lista está vazia
	 * 
	 * @return bool true/fals
	 */
	public boolean isEmpty() {
		if (this.First == null)
			return true;
		else
			return false;
	}

	/**
	 * Adiciona um novo nó no inicio da lista
	 * 
	 * @param Topo
	 *            = Nodo a ser adicionado
	 */
	public void add(Nodo Nodo) {
		Nodo.setNext(this.First);
		this.setFirst(Nodo);
	}

	public void remove() {

	}

	/**
	 * busca por um elemento na lista
	 */
	public Nodo search(String element) {
		for (Nodo n = this.getFirst(); n != null; n = n.getNext()) {
			if (n.getContent() == element) {
				return n;
			}
		}
		return null; /* nao achou o elemento */
	}

}
