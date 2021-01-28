package segundo_triemestre;

import javax.swing.JOptionPane;

public class U1_T3_Refuerzo {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		
		String [] ejercicios= {"Ejercicio 1", "Ejercicio 2", "Ejercicio 3", "Ejercicio 4", "Ejercicio 5", "Ejercicio 6", "Ejercicio 7", "Ejercicio 8", "Ejercicio 9", "Ejercicio 10", "Salir"};
		
		int eleccion=0;
		
		while(eleccion!=10) {
			eleccion = JOptionPane.showOptionDialog(null, "Selecciona el ejercicio que quieres hacer", "MEN�", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, ejercicios, ejercicios[10]);
			
			switch(eleccion) {
				case 0: {
					ejercicio1();
					break;
				}
				case 1: {
					ejercicio2();
					break;
				}
				case 2: {
					ejercicio3();
					break;
				}
				case 3: {
					ejercicio4();
					break;
				}
				case 4: {
					ejercicio5();
					break;
				}
				/*case 5: {
					ejercicio6();
					break;
				}
				case 6: {
					ejercicio7();
					break;
				}
				case 7: {
					ejercicio8();
					break;
				}
				case 8: {
					ejercicio9();
					break;
				}
				case 9: {
					ejercicio10();
					break;
				}*/
				case 10: 
					JOptionPane.showMessageDialog(null, "Has terminado", "FIN", JOptionPane.INFORMATION_MESSAGE);
					break;
			}//fin switch
		
		}//fin while
				
	}//fin main
	
	
	
	public static void ejercicio1() {
		
		
	}//fin ejercicio 1
	
	
	
	public static void ejercicio2() {
		
		JOptionPane.showMessageDialog(null, "Te solicita tres n�meros."
				+ "\n Te dir� cual es el mayor, el menor y el intermedio", "EJERCICIO 2", JOptionPane.INFORMATION_MESSAGE);
		
		int num1=1, num2=1, num3=1;//variable para almacenar los n�meros del usuario
		int mayor=0, inter=0, menor=0;//variable para meter en cada caso el numero que le corresponda segun su posici�n
		boolean igual=false;//variable para ver si  los n�meros son iguales o no
				
			String num1str = JOptionPane.showInputDialog(null, "Introduce el primer n�mero", "1� N�MERO", JOptionPane.QUESTION_MESSAGE);
			num1 = Integer.parseInt(num1str);//pide el primer n�mero y lo pasa a int
			
			String num2str = JOptionPane.showInputDialog(null, "Introduce el segundo n�mero", "2� N�MERO", JOptionPane.QUESTION_MESSAGE);
			num2 = Integer.parseInt(num2str);//pide el segundo n�mero y lo pasa a int
	
			String num3str = JOptionPane.showInputDialog(null, "Introduce el tercer n�mero", "3� N�MERO", JOptionPane.QUESTION_MESSAGE);
			num3 = Integer.parseInt(num3str);//pide el tercer  n�mero y lo pasa a int
				
			//estructura cuando el primer n�mero es el mayor
			if(num1>num2&&num1>num3) {
				mayor=num1;
				if(num2>num3) { //si el segundo es mayor
					inter=num2;
					menor=num3;
				}else { //si el tercero es mayor
					inter=num3;
					menor=num2;
				}
			}
				
			//estructura para cuando el segundo n�mero es el mayor
			if(num2>num1&&num2>num3) {
				mayor=num2;
				if(num1>num3) {//si el primero es mayor
					inter=num1;
					menor=num3;
				}else {//si el tercero es mayor
					inter=num3;
					menor=num1;
				}
			}
			
			//estructura para cuando el tercer n�mero es el mayor
			if(num3>num1&&num3>num2) {
				mayor=num3;
				if(num1>num2) {//si el primero es mayor
					inter=num1;
					menor=num2;
				}else {//si el segundo es mayor
					inter=num2;
					menor=num3;
				}
			}
			
			//estructura para cuando el primer y el segundo n�mero son iguales
			if(num1==num2 & num1!=num3) {
				igual=true;
				JOptionPane.showMessageDialog(null, "Los n�meros " + num1 + " y " + num2 + " son iguales", "ORDEN N�MEROS", JOptionPane.INFORMATION_MESSAGE);
			}
			
			//estructura para cuando el primer y el tercer n�mero so n iguales
			if(num1==num3 & num1!=num2) {
				igual=true;
				JOptionPane.showMessageDialog(null, "Los n�meros " + num1 + " y " + num3 + " son iguales", "ORDEN N�MEROS", JOptionPane.INFORMATION_MESSAGE);
			}
			
			//estructura para cuando el segundo y el tercer n�mero son iguales
			if(num2==num3 & num2!=num1) {
				igual=true;
				JOptionPane.showMessageDialog(null, "Los n�meros " + num2 + " y " + num3 + " son iguales", "ORDEN N�MEROS", JOptionPane.INFORMATION_MESSAGE);
			}
			
			//estructura para cuando los tres n�meros son iguales
			if(num1==num2 & num1==num3 & num2==num3) {
				igual=true;
				JOptionPane.showMessageDialog(null, "Todos los n�meros son iguales", "ORDEN N�MEROS", JOptionPane.INFORMATION_MESSAGE);
			}
			
			//si ninguno de los n�meros son iguales muestra el orden de ellos
			if(igual==false) {
			JOptionPane.showMessageDialog(null, "El n�mero mayor es " + mayor + ", el intermedio es " + inter + " y el menor es " + menor, "ORDEN N�MEROS", JOptionPane.INFORMATION_MESSAGE);
			}
	
	}//fin ejercicio 2


	public static void ejercicio3() {
	
	
		JOptionPane.showMessageDialog(null, "El n�mero que introduzcas te lo devolver� en su equivalente en n�meros romanos."
				+ "\n Podr�s seguir introduciendo n�meros hasta que introduzcas un 0.", "EJERCICIO 4", JOptionPane.INFORMATION_MESSAGE);
		
		int numero=1; //variable para almacenar el n�mero que intriduce el usuario
		
		while(numero>1|numero<10) { //mientras el n�mero no este entre 1 y 10 lo vuelve a pedir

		while(numero!=0) { //mientras que el n�mero no sea 0 sigue funcionando
			String numerostr = JOptionPane.showInputDialog(null, "Introduce un n�mero del 1 al 10", "N�MERO", JOptionPane.QUESTION_MESSAGE);
			numero = Integer.parseInt(numerostr); //se pide el n�mero al usuario y se pasa a int
			
			switch(numero) { //dependiendo del n�emero introducido este switch determinar� que mensaje mostrar
			 case 0: //cuando el n�mero es 0 
				 JOptionPane.showMessageDialog(null, "Has terminado", "FIN", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 1: //cuando el n�mero es 1
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'I'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 2://cuando el n�mero es 2
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'II'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 3://cuando el n�mero es 3
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'III'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 4://cuando el n�mero es 4
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'IV'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 5://cuando el n�mero es 5
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'V'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 6://cuando el n�mero es 6
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'VI'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 7://cuando el n�mero es 7
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'VII'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 8://cuando el n�mero es 8
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'VIII'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 9://cuando el n�mero es 9
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'IX'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 10://cuando el n�mero es 10
				 JOptionPane.showMessageDialog(null, "El n�mero " + numero + " en n�meros romanos equivale a 'X'", "N�MERO ROMANO", JOptionPane.INFORMATION_MESSAGE);
				 break;
			}//fin switch
		
		}//fin while
		
		}//fin while
		
	}//fin ejercicio 3
	
	
	
	public static void ejercicio4() {
		
		
		
	}//fin ejercicio 4


	public static void ejercicio5() {
	
	
	}//fin ejercicio 5
	
	
}