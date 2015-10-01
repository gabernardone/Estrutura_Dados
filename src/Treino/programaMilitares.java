package Treino;

public class programaMilitares {
	public static void main(String[] args) {
	
		Militar MilitarGen = new Militar();
		MilitarGen.setNome("Carlos Rafael");
		
		Militar MilitarSar = new Militar();
		MilitarSar.setNome("Barth");
		
		Militar MilitarAsp = new Militar();
		MilitarAsp.setNome("André");
		
		MilitarGen.setInferior(MilitarSar);
		MilitarSar.setInferior(MilitarAsp);
		
	}
}
