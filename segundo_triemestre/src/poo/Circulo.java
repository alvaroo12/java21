package poo;

public class Circulo {

	
	private double radio; //valor del radio del circulo
	
	//Constructor del circulo
	public Circulo(double radio) {
		this.radio=radio;
	}
	
	//Decuelve el radio del circulo
	public double getRadio() {
		return this.radio;
	}
	
	//Cambia el radio del circulo
	public void setRadio(double nuevoRadio) {
		this.radio = nuevoRadio;
	}
	
	//Calcula el area del circulo
	public double calcularArea() {
		double area = Math.PI*Math.pow(this.radio, 2);
		return area;
	}
	
	//Calcula el perímetro del circulo
	public double calcularPerimetro() {
		double perimetro = 2*Math.PI*radio;
		return perimetro;
	}
	
}
