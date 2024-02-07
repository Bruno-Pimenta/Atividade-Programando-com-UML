package entities;

public abstract class Figura {
	
	private String cor;
	
	public Figura(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String toString() {
		return " cor = " + this.cor;
	}
}
