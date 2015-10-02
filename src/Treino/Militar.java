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
		return this.Inferior;
	}

	public void setInferior(Militar inferior) {
		this.Inferior = inferior;
	}

	public boolean isGeneral() {
		return this.Superior == null ? true : false;
	}

	public boolean isAspira() {
		return this.Inferior == null ? true : false;
	}

	public int getTotalSubordinados() {
		if(this.Inferior == null) { return 0; }
		return 1 + Inferior.getTotalSubordinados();
	}
}
