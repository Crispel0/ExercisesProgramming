package Arrays;

import java.util.Scanner;
/* Crea un array que contenga los caracteres de la A a la Z(Mayusculas) despues va pidiendo posiciones del array por teclado
y si la posicion es correcta se añadira una cadena que se mostrara al final, se dejara de insertar cuando se inserte un -1

EJEMPLO

0 -> añadira la A
5 -> añadira la F
25 -> añadira la Z
50 -> Ingrese Otro Numero
-1 -> fin
*/
public class PositionForInput {

	public static void main(String[] args) {
		
	char [] numbersUpperCase = new char [26];
	Scanner scn = new Scanner(System.in);
	
	for(int i = 65, j = 0 ; i <= 90 ;i++ , j++){
		numbersUpperCase[j] = (char) i;
	}
	
	String Chain = "";
	int eleccion = -1;
	
	do {
		System.out.println("type a positio of the size of " + (numbersUpperCase.length -1));
		if(eleccion > 0 && eleccion <= numbersUpperCase.length -1){
			System.out.println("I'm Sorry Type a value into of the range of " + (numbersUpperCase.length -1));
		}
		else if (eleccion != -1){
			Chain += numbersUpperCase[eleccion];
		}
	}while (eleccion != -1);
	
	System.out.println(Chain);
	}
}