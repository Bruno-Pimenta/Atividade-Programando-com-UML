package domain;

public abstract class Veiculo {
	private String placa;
	private int ano;
	private float consumoCombustivel;
	private double preco;
	
	public Veiculo(String placa, int ano, float consumoCombustivel, double preco) {
		super();
		this.placa = placa;
		this.ano = ano;
		this.consumoCombustivel = consumoCombustivel;
		this.preco = preco;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public float getConsumoCombustivel() {
		return consumoCombustivel;
	}

	public void setConsumoCombustivel(float consumoCombustivel) {
		this.consumoCombustivel = consumoCombustivel;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void exibirDados() {
		System.out.println("Placa: " + this.placa+", ano: " + this.ano);
		System.out.println("Faz " + this.consumoCombustivel+" km's por litro, " + " preço: " +String.format("%.2f", this.preco)+"\n");
	}
}
