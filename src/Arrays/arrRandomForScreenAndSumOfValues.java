package Arrays;

import javax.swing.JOptionPane;

public class arrRandomForScreenAndSumOfValues{
	
/*	Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos 
	el array con números aleatorios entre 0 y 9, al
	final muestra por pantalla el valor de cada posición y la suma de todos los valores. Haz un método para rellenar
	el array (que tenga como parámetros los números entre los que tenga que generar), para mostrar el contenido y
	la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
*/
	public static void main(String[] args) {
		String sizeArray = JOptionPane.showInputDialog("Type a Number");
		int [] arr = new int [Integer.parseInt(sizeArray)];
		generateNumbersRandom(arr,0,9);
		fillValues(arr);
		
		
	}
	
	public static void fillValues (int [] num) {
		int i;
		for (i = 0; i < num.length; i++){
		System.out.println(" the value of each position of the arr is " + num[i]);
		}
		
	} 
	
	private static void generateNumbersRandom (int [] num, int num1, int num2) {
		int i;
		for (i = 0; i < num.length; i++){
			num[i] += Math.floor(Math.random()* (num1-num2)+num2); // Is necesarry explain this code because Idon't unerstand this//
		}
	}
}
