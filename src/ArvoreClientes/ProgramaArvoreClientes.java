package ArvoreClientes;

import ArvoreClientes.Arvore;

public class ProgramaArvoreClientes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cliente1 = new Cliente(1,"Gabriel","gabriel@gmail.com");
		Cliente cliente2 = new Cliente(2,"Douglas","douglas@gmail.com");
		Cliente cliente3 = new Cliente(3,"Evan","evan@gmail.com");
		Cliente cliente4 = new Cliente(4,"Cassiano","cassiano@gmail.com");
		
		Arvore AC = new Arvore();
		
		AC.inserirNo(cliente1);
		AC.inserirNo(cliente2);
		AC.inserirNo(cliente3);
		AC.inserirNo(cliente4);
		
		System.out.println("O Cliente 2 é: " + AC.procurarID(2).getNome());
		
		
	}

}