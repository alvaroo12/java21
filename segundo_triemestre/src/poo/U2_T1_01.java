package poo;

import javax.swing.JOptionPane;

public class U2_T1_01 {

	public static void main(String[] args) {

		String [] formas = {"Circulo", "Rectángulo", "Cilindro", "Salir"};
		int eleccion = 0; //variable para la opcion que elige el usuario y utilizarlo en el switch
		while(eleccion!=3) { //Mientras que no indique que quiere salir se seguirá pidiendo que elija con que forma geométrica quiere trabajar
			eleccion = JOptionPane.showOptionDialog(null, "Con que forma geométrica quieres trabajar", "ELIGE FORMA GEOMÉTRICA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, formas, formas[3]);
			switch(eleccion) {
				case 0: { //circulo
					
					String radiostr = JOptionPane.showInputDialog(null, "Introduce el radio del circulo", "RADIO CIRCULO", JOptionPane.QUESTION_MESSAGE);
					double radio = Double.parseDouble(radiostr); //pide el radio
					
					Circulo circulo = new Circulo(radio); //constructor
					
					String [] opciones = {"Calcular área", "Calcular perímetro", "Cambiar radio", "Salir"};
					int eleccion1 = 0;//variable para la opcion que elige el usuario y utilizarlo en el switch
					while(eleccion1!=3) { //Mientras que no indique que quiere salir se seguirá pidiendo que eliga lo que quiere hacer
						eleccion1= JOptionPane.showOptionDialog(null, "Elige lo que quieras hacer", "CIRCULO", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[3]);
						switch(eleccion1) {
						case 0:{ //Calcular area
							JOptionPane.showMessageDialog(null, "El área del circulo con radio " + circulo.getRadio() + " es " + circulo.calcularArea() , "ÁREA CIRCULO", JOptionPane.INFORMATION_MESSAGE);
							break;
						} //fin caso 0
						case 1:{ //Calcular perimetro
							JOptionPane.showMessageDialog(null, "El perímetro del circulo con radio " + circulo.getRadio() + " es " + circulo.calcularPerimetro() , "PERÍMETRO CIRCULO", JOptionPane.INFORMATION_MESSAGE);
							break;
						} //fin caso 1
						case 2:{ //Cambiar radio
							String newradiostr = JOptionPane.showInputDialog(null, "Introduce el nuevo radio del circulo", "NUEVO RADIO CIRCULO", JOptionPane.QUESTION_MESSAGE);
							double newradio = Double.parseDouble(newradiostr); //pide el nuevo radio
							circulo.setRadio(newradio);//introduce el nuevo dato
							break;
						}//Fin caso 2
						case 3:{ //Salir
							JOptionPane.showMessageDialog(null, "Has terminado con el circulo", "FIN", JOptionPane.INFORMATION_MESSAGE);
							break;
						}//fin caso 3
						}//fin switch
					}//fin while
					break;
				}//fin caso 0
				
				case 1: { //Rectangulo
				
					String basestr = JOptionPane.showInputDialog(null, "Introduce la base del rectángulo", "BASE RECTÁNGULO", JOptionPane.QUESTION_MESSAGE);
					double base = Double.parseDouble(basestr); //pide la base
					String alturastr = JOptionPane.showInputDialog(null, "Introduce la altura del rectángulo", "ALTURA RECTÁNGULO", JOptionPane.QUESTION_MESSAGE);
					double altura = Double.parseDouble(alturastr); //pide la altura
					
					Rectangulo rectangulo = new Rectangulo(base, altura); //constructor
					
					String [] opciones = {"Calcular área", "Calcular perímetro", "Cambiar base", "Cambiar altura", "Salir"};
					int eleccion2=0;//variable para la opcion que elige el usuario y utilizarlo en el switch
					while(eleccion2!=4) { //Mientras que no indique que quiere salir se seguirá pidiendo que eliga lo que quiere hacer
						eleccion2 = JOptionPane.showOptionDialog(null, "Elige lo que quieras hacer", "RECTÁNGULO", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[3]);
						switch(eleccion2) {
						case 0:{ //Calcular área
							JOptionPane.showMessageDialog(null, "El área del rectángulo con base " + rectangulo.getBase() + " y altura " + rectangulo.getAltura() + " es " + rectangulo.calcularArea(), "ÁREA RECTÁNGULO", JOptionPane.INFORMATION_MESSAGE);
							break;
						}//fin caso 0
						case 1:{ //Calcular perímetro
							JOptionPane.showMessageDialog(null, "El perímetro del rectángulo con base " + rectangulo.getBase() + " y altura " + rectangulo.getAltura() + " es " + rectangulo.calcularPerimetro(), "PERÍMETRO RECTÁNGULO", JOptionPane.INFORMATION_MESSAGE);
							break;
						}//fin caso 1
						case 2: { //Cambiar base
							String newbasestr = JOptionPane.showInputDialog(null, "Introduce la nueva base del rectángulo", "NUEVA BASE RECTÁNGULO", JOptionPane.QUESTION_MESSAGE);
							double newbase = Double.parseDouble(newbasestr); //pide la nueva base
							rectangulo.setBase(newbase); //introduce el nuevo dato
							break;
						} //fin caso 2
						case 3:{ //Cambiar altura
							String newalturastr = JOptionPane.showInputDialog(null, "Introduce la nueva altura del rectángulo", "NUEVA ALTURA RECTÁNGULO", JOptionPane.QUESTION_MESSAGE);
							double newaltura = Double.parseDouble(newalturastr); //pide la nueva altura
							rectangulo.setAltura(newaltura); //introduce el nuevo dato
							break;
						}//fin caso 3
						case 4:{ //Salir
							JOptionPane.showMessageDialog(null, "Has terminado con el rectángulo", "FIN", JOptionPane.INFORMATION_MESSAGE);
							break;
						}//fin caso 4
						}//fin switch
					}//fin while
					break;
				}//fin caso 1
				
				case 2: { //Cilindro
					
					String radiostr = JOptionPane.showInputDialog(null, "Introduce el radio del cilindro", "RADIO CILINDRO", JOptionPane.QUESTION_MESSAGE);
					double radio = Double.parseDouble(radiostr); //pide el radio
					String alturastr = JOptionPane.showInputDialog(null, "Introduce la altura del cilindro", "ALTURA CILINDRO", JOptionPane.QUESTION_MESSAGE);
					double altura = Double.parseDouble(alturastr); //pide la altura
					
					Cilindro cilindro = new Cilindro(radio, altura); //constructor
					
					String [] opciones = {"Calcular área", "Calcular volumen", "Cambiar radio", "Cambiar altura", "Salir"};
					int eleccion3=0;//variable para la opcion que elige el usuario y utilizarlo en el switch
					while(eleccion3!=4) { //Mientras que no indique que quiere salir se seguirá pidiendo que eliga lo que quiere hacer
						eleccion3 = JOptionPane.showOptionDialog(null, "Elige lo que quieras hacer", "RECTÁNGULO", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[3]);
						switch(eleccion3) {
						case 0:{ //Calcular área
							JOptionPane.showMessageDialog(null, "El área del cilindro con radio " + cilindro.getRadio() + " y altura " + cilindro.getAltura() + " es " + cilindro.calcularArea(), "ÁREA CILINDRO", JOptionPane.INFORMATION_MESSAGE);
							break;
						} //fin caso 0
						case 1:{ //Calcular volumen
							JOptionPane.showMessageDialog(null, "El volumen del cilindro con radio " + cilindro.getRadio() + " y altura " + cilindro.getAltura() + " es " + cilindro.calcularVolumen(), "VOLUMEN CILINDRO", JOptionPane.INFORMATION_MESSAGE);
							break;
						}//fin caso 1
						case 2:{ //Cambiar radio
							String newradiostr = JOptionPane.showInputDialog(null, "Introduce el nuevo radio del cilindro", "NUEVO RADIO CILINDRO", JOptionPane.QUESTION_MESSAGE);
							double newradio = Double.parseDouble(newradiostr); //pide el nuevo radio
							cilindro.setRadi0(newradio);//introduce el nuevo dato
							break;
						}//fin caso 2
						case 3:{ //Cambiar altura
							String newalturastr = JOptionPane.showInputDialog(null, "Introduce la nueva altura del cilindro", "NUEVA ALTURA CILINDRO", JOptionPane.QUESTION_MESSAGE);
							double newaltura = Double.parseDouble(newalturastr); //pide la nueva altura					
							cilindro.setAltura(newaltura);//introduce el nuevo dato
							break;
						}//fin caso 3
						case 4:{ //Salir
							JOptionPane.showMessageDialog(null, "Has terminado con el cilindro", "FIN", JOptionPane.INFORMATION_MESSAGE);
							break;
						}//fin caso 4
						}//fin switch
					}//fin main
					break;
				}//fin caso 2
				
				case 3:{ //Salir
					JOptionPane.showMessageDialog(null, "Has terminado", "FIN", JOptionPane.INFORMATION_MESSAGE);
					break;
				}//fin caso 3

			}//fin switch	
	
		}//fin while
	
	}//fin main	

}//fin clase

