package Arrays;

import java.io.Serializable;
import java.util.Scanner;

public class sumArrays2Form {
	public static void main(String[] args) {
System.out.println("Type the size of the lenght of the arrays");
		
		Scanner Scanlenght1 = new Scanner(System.in);
		int length1 = Scanlenght1.nextInt();
		Scanner Scanlenght2 = new Scanner(System.in);
		int length2 = Scanlenght2.nextInt();
		
		int [][] array1 = new int [length1][length2];
		int [][] array2= new int [length1][length2];
		int [][] arrayResult = new int [length1][length2];		
		int i, j;
		
		for(i = 0 ; i < array1.length ; i++) {
			for(j = 0 ; i < array1.length ; i++) {
				
				array1[i][j] = fillValuesArray(array1[i][j]);
				array2[i][j] = fillValuesArray(array2[i][j]);
				arrayResult[i][j] = array1[i][j] + array2[i][j];
				
				System.out.print("the array original one " + array1[i][j] + " and array two is " + array2[i][j] + "the result of the "
						+ "sum of the values is " + arrayResult[i][j] + " and the length array is " + array1.length);
			}
			System.out.println();
	}
		
	
		
}
	public static Serializable  fillValuesArray (int array[][]) {
		int[][] arrayValues = array;
		int i, j;
		for (i = 0; i < array.length; i++) {
			for (j= 0; j < array.length; j++) {
				Scanner scanValues = new Scanner(System.in);
				System.out.println("type the values");
				int values = scanValues.nextInt();
				arrayValues[i][j] =values;
				
			}
		}
		return arrayValues;
		}
}
