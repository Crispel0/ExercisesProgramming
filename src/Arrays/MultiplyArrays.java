package Arrays;

import java.util.Scanner;

/*crea dos arrays de numeros de una posicion pasada por teclado
uno estara rellenando con numeros aleatorios y el otro estara apuntando al anterior
despues crea otro array con el primer array (usa de nuevo new con el primer array)
con el mismo tamaño que se ha pasado por teclado rellenalo con nuevos valores aleatorios

despues crea un metodo que tenga como parametros los dos arrays y devuelva uno con la multiplicacion 
de la posicion 0 del array 1 con el del array 2 y asi sucesivamente al final muestra el contenido de cada array

llama al final el recolector de basura
*/
public class MultiplyArrays {
	public static void main(String[] args) {
		System.out.println("Type a value");
		Scanner scan1 = new Scanner(System.in);
		int positionArr = scan1.nextInt();
		int [] arr1 = new int [positionArr];
		int [] arr2 = new int [positionArr];
		
		
		for (int i = 0 ;i < arr1.length; i++) {
			int numbersAleotory =(int) Math.floor(Math.random() * positionArr);
			arr1 [i] = numbersAleotory;
		}
				arr1 = arr2;
				
				multiplyOfArrays(arr1 ,arr2);

	}
	/*despues crea un metodo que tenga como parametros los dos arrays y devuelva uno con la multiplicacion 
	de la posicion 0 del array 1 con el del array 2 y asi sucesivamente al final muestra el contenido de cada array
	*/
	protected static int []multiplyOfArrays(int [] arr1, int []arr2){
		int [] multiplyArrays = new int [arr1.length + arr2.length];
		int i;
		
		for(i = 0; i < arr1.length ;i++) {
			for(int j = 0 ; j < arr2.length ;j++) {
				multiplyArrays[i + j] = arr1[i] * arr2[j];

			}

		}
		System.out.println(" the values of the first array is " +  arr1[i] + " and the values of second arrays is " + arr2[j]);

		
		return multiplyArrays;
			
	}

}
