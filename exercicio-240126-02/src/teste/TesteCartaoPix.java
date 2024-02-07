package teste;

import Entities.CartaoCredito;
import Entities.Pix;

public class TesteCartaoPix {
	public static void teste() {
		CartaoCredito cartaoCredito = new CartaoCredito("99856", 9500);
		Pix pix = new Pix("356.085.12", 8000);
		
		System.out.println(cartaoCredito);
		System.out.println(pix);
	}
}
