package enums;

public enum ArCondicionado {
	ANALOGICO_SIMPLES("anal�gico simples"),
	AUTOMATICO_MANUAL("autom�tico manual"),
	DIGITAL("digital"),
	DIGITAL_AUTOMATICO("digital autom�tico");
		
	private String mensagem;

	private ArCondicionado(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
