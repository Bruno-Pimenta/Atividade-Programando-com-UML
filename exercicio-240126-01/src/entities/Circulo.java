package entities;

public class Circulo extends Figura{
	
	private double raio;

	public Circulo(double raio, String cor) {
		super(cor);
		this.raio = raio;
		// TODO Auto-generated constructor stub
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double diametro() {
		return 2*getRaio();
	}
	
	public double area() {
		return Math.pow(getRaio(), 2)*3.1416;
	}

	@Override
	public String toString() {
		return "Circulo:"+
				super.toString()+
				", raio = " + raio
				+ "\nDiametro = " + diametro()+
				", Área = " + area() + "\n";
	}
}
