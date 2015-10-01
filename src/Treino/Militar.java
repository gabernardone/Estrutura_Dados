package Treino;

public class Militar {

	private Militar Superior;
	private Militar Inferior;
	
	private String Nome;

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public Militar getSuperior() {
		return Superior;
	}

	public void setSuperior(Militar superior) {
		Superior = superior;
	}

	public Militar getInferior() {
		return Inferior;
	}

	public void setInferior(Militar inferior) {
		Inferior = inferior;
	}

	public boolean isGeneral() {
		return this.Superior == null ? true : false;
	}

	public boolean isAspira() {
		return this.Inferior == null ? true : false;
	}
}
