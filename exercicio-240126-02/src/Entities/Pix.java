package Entities;

public class Pix implements Pagamento{
	
	private String chavePix;
	private double saldo;
	
	public Pix(String chavePix, double saldo) {
		super();
		this.chavePix = chavePix;
		this.saldo = saldo;
	}

	@Override
	public void efetuarPagamento(double valor) {
		if(valor<=this.saldo) {
			this.saldo -= valor;
			System.out.println("Pagamento efetuado com sucesso!");
		}
		else {
			System.out.println("Não há saldo disponível para efetuar o pagamento");
		}
	}

	@Override
	public String toString() {
		return "Pix [Chave Pix: " + chavePix + ", saldo: R$ " + String.format("%.2f", this.saldo) + "]";
	}
	
	
}
