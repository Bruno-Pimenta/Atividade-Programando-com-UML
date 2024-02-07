package entities;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;
	
	public Triangulo(double base, double altura, String cor) {
		super(cor);
		this.base = base;
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area() {
		return (getBase()*getAltura())/2;
	}

	@Override
	public String toString() {
		return "Triangulo:"+
				super.toString()+
				", base = "+this.base + ", altura = " + this.altura
				+ "\nÁrea: " + area()+"\n";
	}

}
