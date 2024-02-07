package Entities;


public class CartaoCredito implements Pagamento{
	
	private String numeroCartao;
	private double limiteDisponivel;
	
	public CartaoCredito(String numeroCartao, double limiteDisponivel) {
		super();
		this.numeroCartao = numeroCartao;
		this.limiteDisponivel = limiteDisponivel;
	}

	@Override
	public void efetuarPagamento(double valor) {
		if(valor<=this.limiteDisponivel) {
			this.limiteDisponivel -= valor;
			System.out.println("Pagamento efetuado com sucesso!");
		}
		else {
			System.out.println("N�o h� limite dispon�vel para efetuar o pagamento");
		}
	}
	
	@Override
	public String toString() {
		return "Cart�o de Cr�dito [N�mero do Cart�o: " + numeroCartao + ", limite dispon�vel: " + String.format("%.2f", this.limiteDisponivel) +"]";
	}
}
