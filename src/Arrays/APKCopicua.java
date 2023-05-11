package Arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class APKCopicua {
	/*crea una aplicacion que pida un numero por teclado y despues comprobamos si el numero introducido es copicua 
	es decir que se lee igual sin importar la direccion es decir si introducimos 30303 es copicua pero si introducimos 45872 no es copicua
	piensa como puedes dar la vuelta al numero una forma de pasar un numero a un array es esta Character.getNumeroValue(cadena.CharAt(posicion)); 
	*/
	public static void main(String[] args) {
	
		String Digit = JOptionPane.showInputDialog("TYPE A NUMBER");
		int digitos [] = convertirArray(Digit, Digit.length());
		
		if(isCopicua(digitos)){
			System.out.println("the number " + Digit +  " is copicua");
		}else {
			System.out.println("the number "+ Digit + " not is copicua");
		}
	}
	
	
	
	public static int [] convertirArray(String Digit , int length) {
		
		int [] arrConverted = new int [length];
		
		for(int i = 0; i < arrConverted.length; i++) {
			arrConverted[i] = Character.getNumericValue(Digit.charAt(i)); /*convierte a array de int el String (en valores numericos)*/
		}
		
		return arrConverted;
	}
	
	public static boolean isCopicua (int [] digitos) {
		int [] copicua = new int[digitos.length];
		
		for(int i= 0 ,j = 1; j < copicua.length; i++, j++) {
			copicua[i] = digitos[copicua.length -1];
		}
		
		if(Arrays.equals(copicua, digitos)) {
			return true;
		}
		else {
			return false;
		}
	}
}
	
