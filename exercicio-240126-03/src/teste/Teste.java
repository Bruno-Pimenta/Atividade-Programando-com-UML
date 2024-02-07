package teste;

import domain.Carro;
import domain.Moto;
import enums.ArCondicionado;
import enums.TravaDisco;

public class Teste {
	public static void testeCarroMoto() {
		Moto moto = new Moto("kmy-8996", 2006, 15, 7000, TravaDisco.TRAVA_DISCO_COM_ALARME);
		Carro carro = new Carro("brky-19258", 2010, 10, 25000, ArCondicionado.DIGITAL_AUTOMATICO);
		
		moto.exibirDados();
		carro.exibirDados();
	}
}
