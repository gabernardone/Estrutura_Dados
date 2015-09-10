package AulaSeis;

import java.util.Random;

public class Randomic {

	/**
	 * @param args
	 */
	
	
	public void run(int valor) {
		Random gerador = new Random();
        int resultado = gerador.nextInt(100);
        
        if(resultado == valor){
        	System.out.println("Acerto, Mizeravi!: " + resultado);
        } else {
        	System.out.println("Tente novamente!: " + resultado);
        	this.run(valor);
        }
        
	}

}
