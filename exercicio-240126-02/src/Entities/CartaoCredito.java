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
			System.out.println("Não há limite disponível para efetuar o pagamento");
		}
	}
	
	@Override
	public String toString() {
		return "Cartão de Crédito [Número do Cartão: " + numeroCartao + ", limite disponível: " + String.format("%.2f", this.limiteDisponivel) +"]";
	}
}
