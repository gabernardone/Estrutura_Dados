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
		MilitarSar.setSuperior(MilitarGen);
		MilitarSar.setInferior(MilitarAsp);		
		MilitarAsp.setSuperior(MilitarSar);
		
		System.out.println("1º Militar: "+ MilitarGen.getNome());
		System.out.println("É chefão: "+ MilitarGen.isGeneral());
		System.out.println("É aspira: "+ MilitarGen.isAspira());
		System.out.println("Seu inferior é :" + MilitarGen.getInferior().getNome());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("2º Militar: "+ MilitarSar.getNome());
		System.out.println("É chefão: "+ MilitarSar.isGeneral());
		System.out.println("É aspira: "+ MilitarSar.isAspira());
		System.out.println("Seu inferior é :" + MilitarSar.getInferior().getNome());
		System.out.println("Seu superior é :" + MilitarSar.getSuperior().getNome());
		System.out.println("--------------------------------------------------------");
		
		System.out.println("3º Militar: "+ MilitarAsp.getNome());
		System.out.println("É chefão: "+ MilitarAsp.isGeneral());
		System.out.println("É aspira: "+ MilitarAsp.isAspira());
		System.out.println("Seu superior é :" + MilitarAsp.getSuperior().getNome());
		
		
		System.out.println("__ \nfim programa");
		
		
		System.out.println(MilitarGen.getTotalSubordinados());
	}
}
