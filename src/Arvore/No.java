package Arvore;

/**
 * Classe que será usada como nó de árvore binária.
 * Seu conteúdo é um número inteiro.
 * @author Yoshiriro
 */
public class No {

	private Integer conteudo;
	private No esquerdo;
	private No direito;
	/// crie os gets e sets
	
	/**
	 * Construtor que recebe o conteúdo do No
	 * @param conteudo
	 */
	public No(Integer conteudo) {
		this.conteudo = conteudo;
	}
	
	public void inserirNo(Integer novoConteudo) { /*
		 O conteúdo que chegou no argumento...
		
		 é MENOR que o conteúdo deste nó?
		 -> SIM: 
		    O esquerdo já existe?
		    -> NÃO: instancie ele com esse conteúdo
			  -> SIM: insira esse nó nele
		
		 é MAIOR que o conteúdo deste nó?
		 -> SIM: 
		    O direito já existe?
		    -> NÃO: instancie ele com esse conteúdo
			  -> SIM: insira esse nó nele
		
		 se IGUAL, não faz nada.
		 */
		
		// o novo conteúdo é menor que o deste nó
		if (novoConteudo < this.conteudo) {
			if (esquerdo!=null) { // o nó esquerdo já existe
				esquerdo.inserirNo(novoConteudo);
			} else { // o nó esquerdo ainda não existe
				esquerdo = new No(novoConteudo);
			}
		}
		// o novo conteúdo é maior que o deste nó
		if (novoConteudo > this.conteudo) {
			if (direito!=null) { // o nó direito já existe
				direito.inserirNo(novoConteudo);
			} else { // o nó direito ainda não existe
				direito = new No(novoConteudo);
			}
		}
	}
	
	public boolean existeNo(Integer conteudo) {
		// o conteúdo que chegou...
		// é igual ao deste nó?
		//  SIM -> retorne Verdadeiro
		//  NÃO...
		//   é MENOR que o conteúdo deste nó?
		//    SIM -> o nó esquerdo é vazio?
		//	    SIM -> retorne Falso
		//      NÃO -> retorne o "existeNo()" nele
		//   é MAIOR que o conteúdo deste nó?
		//    SIM -> o nó direito é vazio?
		//	    SIM -> retorne Falso
		//      NÃO -> retorne o "existeNo()" nele	
		if (conteudo == this.conteudo) {
			return true;
		}
		if (conteudo < this.conteudo) {
			if (esquerdo == null) {
				return false;
			} else {
				return esquerdo.existeNo(conteudo);
			}
		}
		if (conteudo > this.conteudo) {
			if (direito == null) {
				return false;
			} else {
				return direito.existeNo(conteudo);
			}
		}
		return false;
	}
	
	
	
	public Integer getGrau(){
		Integer grau = 0;
		//se o nó esquerdo existir, é 1 + seu getGrau()
		//+
		//se o nó direito existir, é 1 + seu getGrau()
	
		if(esquerdo != null){
			grau = 1 + esquerdo.getGrau();
		}
		
		if(direito != null){
			grau += 1 + direito.getGrau();
		}
		return grau;
	}
	
	
	public Integer getAltura(){
		Integer altura = 0;
		Integer alturaEsquerda = 0;
		Integer alturaDireito = 0;
		//se o nó esquerdo existir, pegue seu getAltura()
		//se o nó direito existir, pegue seu getAltura()
		//se nenhum dos nós existir, a altura é 0(zero)
		//a altura é 1 + a maior das 2 altura
		
		if(esquerdo == null && direito == null){
			return  0;
		}
		
		if(esquerdo != null){
			alturaEsquerda = esquerdo.getAltura();
		}
		if(direito != null){
			alturaDireito = direito.getAltura();
		}
		
		if(alturaDireito > alturaEsquerda){
			altura = alturaDireito + 1;
		}
		else{
			altura = alturaEsquerda + 1;
		}
		
	
		return altura;
		
	}
	
	
	
	
	public Integer getConteudo() {
		return conteudo;
	}
	public void setConteudo(Integer conteudo) {
		this.conteudo = conteudo;
	}
	public No getEsquerdo() {
		return esquerdo;
	}
	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}
	public No getDireito() {
		return direito;
	}
	public void setDireito(No direito) {
		this.direito = direito;
	}
	
}
