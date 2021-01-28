package segundo_triemestre;

import javax.swing.JOptionPane;

public class Ejercicio_U1_T3_02 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		

		boolean correcto1 = false; //variable que indica si el email tiene @ o no
		boolean correcto2 = false;//variable que indica si la tiene mas de una @
		boolean correcto3 = false;//variable que indica si tiene un . o no
		boolean correcto4 = false;//variable que indica si el email tiene mas de 4 caracteres
		String email; //variable para almacenar el email del usuario
		int longitud; //variable para alamacenar la longitud del email
		int arroba=0; //variable para saber cuantas @ tiene
		
		//mientras que alguna condicion del email sea falsa se repetirá todo
		while(correcto1==false || correcto2==false || correcto3==false || correcto4==false) {
		
			email = JOptionPane.showInputDialog(null, "Introduce tu dirección de email", "EMAIL", JOptionPane.QUESTION_MESSAGE);
		
			//if para saber si el email contiene un @
			if (email.contains("@")) {
				correcto1 = true;
			} else {
				correcto1=false;
				JOptionPane.showMessageDialog(null, "El email debe contener una '@'", "EMAIL INCORRECTO", JOptionPane.ERROR_MESSAGE);
			}//fin if
			
			
			//for para recorrer el email
			for (int i=0;i<email.length();i++) {
				if(email.charAt(i)=='@'){//if para saber si ese lugar de la cadena es una @
					arroba++;
				}//fin if
			}//fin for
			//if para saber si tiene más de 1 @
			if (arroba<2) {
				correcto2=true;
			}else {
				correcto2=false;
				JOptionPane.showMessageDialog(null, "El email solo puede tener una '@'", "EMAIL INCORRECTO", JOptionPane.ERROR_MESSAGE);
				System.out.println(arroba);
			}//fin if
			
			
			//if para saber si el email contiene un .
			if (email.contains(".")) {
				correcto3=true;
			}else {
				correcto3=false;
				JOptionPane.showMessageDialog(null, "El email debe contener un '.'", "EMAIL INCORRECTO", JOptionPane.ERROR_MESSAGE);
			}//fin if
			
			
			longitud = email.length();
			//if para saber si el email tiene más de 4 caracteres
			if (longitud>4) {
				correcto4=true;
			} else {
				correcto4=false;
				JOptionPane.showMessageDialog(null, "El email debe tener al menos 4 caracteres", "EMAIL INCORRECTO", JOptionPane.ERROR_MESSAGE);
			}//fin if
		
		}//fin while
		
		JOptionPane.showMessageDialog(null, "El email está bien", "EMAIL CORRECTO", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	
	
	
}
