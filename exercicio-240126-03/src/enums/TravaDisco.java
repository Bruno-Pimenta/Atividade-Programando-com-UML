package enums;

public enum TravaDisco {
	TRAVA_DISCO_COM_LEMBRETE("com trava de disco com lembrete"),
	TRAVA_DISCO_COM_ALARME("com trava de disco com alarme"),
	SEM_TRAVA_DISCO("sem trava de disco");
		
	private String mensagem;

	private TravaDisco(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}
}
