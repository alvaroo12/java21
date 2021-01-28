package poo;

public class Rectangulo {

	
	private double base; //valor de la base del rect�ngulo
	private double altura; //valor de la altura del rect�ngulo
	
	//Constructor del rect�ngulo
	public Rectangulo(double base, double altura) {
		this.base=base;
		this.altura=altura;
	}
	
	//Devulve la base del rect�ngulo
	public double getBase() {
		return this.base;
	}
	
	//Devuelve la altura del rect�ngulo
	public double getAltura() {
		return this.altura;
	}
	
	//Cambiar la base del rect�ngulo
	public void setBase(double nuevaBase) {
		this.base=nuevaBase;
	}
	
	//Cambiar la altura del rect�ngulo
	public void setAltura(double nuevaAltura) {
		this.altura=nuevaAltura;
	}
	
	//Calcular el �rea del rect�ngulo
	public double calcularArea() {
		double area = base * altura;
		return area;
	}
	
	//Calcular el per�metro del rect�ngulo
	public double calcularPerimetro() {
		double perimetro = (base*2)+(altura*2);
		return perimetro;
	}
	
}	
