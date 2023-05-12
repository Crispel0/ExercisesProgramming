package Arrays;

import java.util.Arrays;


public class MethodFill {
/*Rellenar un Array usando el metodo fill de array */

	public static void main(String[] args) {
		int [] array = new int [10];
		
		Arrays.fill(array, 20);
		Arrays.fill(array, 3, array.length, -1);
//		¿Existe una forma de rellenar este array de forma consecutiva y no con un valor hardcodeado?
		 for (int i = 0 ; i < array.length ; i++) {
			 System.out.println(array[i]);
		 }
}
}
