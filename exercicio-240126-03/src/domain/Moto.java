package domain;

import enums.TravaDisco;

public class Moto extends Veiculo{
	private TravaDisco travaDisco;

	public Moto(String placa, int ano, float consumoCombustivel, double preco, TravaDisco travaDisco) {
		super(placa, ano, consumoCombustivel, preco);
		this.travaDisco = travaDisco;
	}
	
	public TravaDisco getTravaDisco() {
		return travaDisco;
	}

	public void setTravaDisco(TravaDisco travaDisco) {
		this.travaDisco = travaDisco;
	}

	@Override
	public void exibirDados() {
		System.out.println("Moto "+this.travaDisco.getMensagem());
		super.exibirDados();
	}
}
