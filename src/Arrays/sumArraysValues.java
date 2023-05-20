package Arrays;

import java.util.Scanner;

public class sumArraysValues {
	public static void main(String[] args) {
		
		System.out.println("Type the size of the lenght of the arrays");
		
		Scanner Scanlenght1 = new Scanner(System.in);
		int length1 = Scanlenght1.nextInt();
		Scanner Scanlenght2 = new Scanner(System.in);
		int length2 = Scanlenght2.nextInt();
		
		int [][] arrayOriginal = new int [length1][length2];
		int [][] arrayCopy = new int [length1][length2];
		
		int i, j;
		
		for(i = 0 ; i < arrayOriginal.length ; i++) {
			for(j = 0 ; i < arrayOriginal.length ; i++) {
				
				arrayOriginal[i][j] = fillValuesArray(arrayOriginal);
				arrayCopy[i][j] = arrayOriginal[i][j] + arrayOriginal[i][j];
				
				System.out.print("the array original is " + arrayOriginal[i][j] + " " + "the result of the "
						+ "sum of the values is " + arrayCopy[i][j] + " and the length array is " + arrayOriginal.length);
			}
			System.out.println();
		}
	
	}
		
		public static int fillValuesArray (int [][] arrayOrigin) {
		int contador = 0;
		int values;
		do {
			
		Scanner scanValues = new Scanner(System.in);
		System.out.println("type the values");
		values = scanValues.nextInt();
		contador++;
		
		}while(contador <= arrayOrigin.length);
		return values;
		}
		
		
		
		
		
	}
	
		