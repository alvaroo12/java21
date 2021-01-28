package poo;

public class Rectangulo {

	
	private double base; //valor de la base del rectángulo
	private double altura; //valor de la altura del rectángulo
	
	//Constructor del rectángulo
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	//Devulve la base del rectángulo
	public double getBase() {
		return this.base;
	}
	
	//Devuelve la altura del rectángulo
	public double getAltura() {
		return this.altura;
	}
	
	//Cambiar la base del rectángulo
	public void setBase(double nuevaBase) {
		this.base=nuevaBase;
	}
	
	//Cambiar la altura del rectángulo
	public void setAltura(double nuevaAltura) {
		this.altura=nuevaAltura;
	}
	
	//Calcular el área del rectángulo
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	//Calcular el perímetro del rectángulo
	public double calcularPerimetro() {
		double perimetro = (base*2)+(altura*2);
		return perimetro;
	}
	
}	
