package poo;

public class Cilindro {

	
	private double radio; //valor del radio del cilindro
	private double altura; //valor de la altura del cilindro
	
	//Constructor del circulo
	public Cilindro(double radio, double altura) {
		this.radio=radio;
		this.altura=altura;
	}
	
	//Devuleve el radio del cilindro
	public double getRadio() {
		return this.radio;
	}
	
	//Devuelve la altura del cilindro
	public double getAltura() {
		return this.altura;
	}
	
	//Cambia el radio del cilindro
	public void setRadi0(double nuevoRadio) {
		this.radio=nuevoRadio;
	}
	
	//Cambia la altura del cilindro
	public void setAltura(double nuevaAltura) {
		this.altura=nuevaAltura;
	}
	
	//Calcula el área del cilindro
	public double calcularArea() {
		double area = (2*Math.PI*radio*altura)+(2*Math.PI*Math.pow(radio, 2));
		return area;
	}
	
	//Calcula el volumen del cilindro
	public double calcularVolumen() {
		double volumen = Math.PI*Math.pow(radio, 2)*altura;
		return volumen;
	}
	
	
}
