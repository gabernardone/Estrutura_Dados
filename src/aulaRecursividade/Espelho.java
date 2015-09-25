package aulaRecursividade;

public class Espelho {
	
	private String corFundo;
	private Espelho EspelhoRetrovisor;
	
	public Espelho (){
		System.out.println("Espelho Criado");
		
	}
	
	public String getCorFundo() {
		return corFundo;
	}

	public void setCorFundo(String corFundo) {
		this.corFundo = corFundo;
	}

	public Espelho getEspelhoRetrovisor() {
		return EspelhoRetrovisor;
	}

	public void setEspelhoRetrovisor(Espelho espelhoRetrovisor) {
		EspelhoRetrovisor = espelhoRetrovisor;
	}
	
}
