package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Copicua2 {

	public static void main(String[] args) {
		
		System.out.println("Ingrese solamente Numeros");
		 
		Scanner numCopicua = new Scanner(System.in);
 
		 int [] numeros = new int [numCopicua.nextInt()];
		 
		 System.out.println(copicua(numeros));
		 
	}
	
	public static boolean copicua(int [] numeros) {
		int [] copicua = new int [numeros.length];
		
		for (int i = 0; i < numeros.length; i++) {
			copicua[i] = numeros[numeros.length -1];	
	}
	
	if(Arrays.equals(copicua, copicua))
	return true;
		else
	return false;
	}
}
