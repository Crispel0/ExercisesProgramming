package ExerciseBookJava;

public class numberIndicate {
	/*
	 * DUF a la que se le pasa una tabla de enteros y un número. Debemos buscar el
	 * número en la tabla e indicar si se encuentra o no.
	 */

	public static void main(String[] args) {
		int numbers [] = {10 ,5 ,25 ,40 ,35 ,23 ,41};
		int number = 15;
		
		System.out.println(numberIndicate(numbers, number));
	}

	public static boolean numberIndicate(int[] tnumber, int number) {
		for (int i = 0; i < tnumber.length; i++) {
			
			tnumber[i] = i;
			
			if (tnumber[i] == number) {
				return true;
			}
		}
		return false;
	}
}


