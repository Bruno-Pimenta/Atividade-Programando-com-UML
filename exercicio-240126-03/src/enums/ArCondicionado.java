package enums;

public enum ArCondicionado {
	ANALOGICO_SIMPLES("analógico simples"),
	AUTOMATICO_MANUAL("automático manual"),
	DIGITAL("digital"),
	DIGITAL_AUTOMATICO("digital automático");
		
	private String mensagem;

	private ArCondicionado(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
