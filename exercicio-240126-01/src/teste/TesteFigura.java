package teste;

import entities.*;

public class TesteFigura {

	public static void teste() {
		Retangulo retangulo = new Retangulo(2, 4, "azul");
		Triangulo triangulo = new Triangulo (4, 5, "vermelho");
		Circulo circulo = new Circulo(3, "amarelo");
		
		System.out.println(retangulo);
		System.out.println(triangulo);
		System.out.println(circulo);
	}
}
