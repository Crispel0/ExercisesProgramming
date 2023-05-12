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
		
	
		arr1 = arr2;
		
		int [] arr3 = new int [arr1.length];
		fillValuesRandom(arr1, 10, 100);
		arr3 = multiplyOfArrays(arr1 ,arr2);

		System.out.println(arr1);
		mostrar(arr1);
		System.out.println(arr2);
		mostrar(arr2);
		System.out.println(arr3);
		mostrar(arr3);
		
		System.gc(); /*llamaRecolectorBasura*/
	}
	
	public static void mostrar (int [] nums) {
		for(int i = 0 ; i < nums.length; i++) {
			System.out.println("the index is " + i +  " and the value is " + nums[i]);
		}
	}
	
	public static void fillValuesRandom (int [] arr1 ,int num1 , int num2) {
		for (int i = 0 ;i < arr1.length; i++) {
			int numbersAleotory =(int) Math.floor(Math.random() * (num1-num2) + num2);
			arr1[i] = numbersAleotory;
		}
	}
	
	protected static int []multiplyOfArrays(int [] arr1, int []arr2){
		int [] multiplyArrays = new int [arr1.length];
		int i;
		
		
		for(i = 0; i < arr1.length ;i++) {
				multiplyArrays[i] = arr1[i] * arr2[i];

		}
		
		return multiplyArrays;
			
	}

}
