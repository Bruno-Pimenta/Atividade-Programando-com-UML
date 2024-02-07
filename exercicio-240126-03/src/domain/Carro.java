package domain;

import enums.ArCondicionado;

public class Carro extends Veiculo{
	private ArCondicionado arCondicionado;

	public Carro(String placa, int ano, float consumoCombustivel, double preco, ArCondicionado arCondicionado) {
		super(placa, ano, consumoCombustivel, preco);
		this.arCondicionado = arCondicionado;
	}

	public ArCondicionado getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(ArCondicionado arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	@Override
	public void exibirDados() {
		System.out.println("Carro com ar condicionado do tipo " + this.arCondicionado.getMensagem());
		super.exibirDados();
	}
}
