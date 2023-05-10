package Arrays;

import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class DNI {
	
/*calcula la letra de un DNI pediremos el DNI por teclado y nos devolvera el DNI completo
para calcular la letra cogeremos el resto de dividir nuestro DNI entre 23 el resultado debe estar entre 0 y 22 haz un metodo donde 
el resultado de la anterior formula busque en un array de caracteres la posicion que corresponda a la letra esta es la table de 
caracteres
posicion

0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 
T R W A G M Y F P D X  B  N  J  Z  S  Q  V  H  L  C  K  L

SI introduzco 70588387 el resultado seria 7 que corresponde a F
*/
	public static void main(String[] args) {
		final int DIVISOR = 23;
		
		String StrDNI = JOptionPane.showInputDialog("Type a DNI");
		int DNI = Integer.parseInt(StrDNI);
		
		int resultado = DNI%DIVISOR;
		
		char letra = findletter(resultado);
		
		System.out.println("the dni is " + DNI + " and the letter of the number DNI is "  + letra);
		
		
	}
	
	public static char  findletter (int res) {
		
		char [] sequenceLetters = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'L'};
		
		return sequenceLetters[res];
	}
}