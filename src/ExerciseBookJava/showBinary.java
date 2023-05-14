package ExerciseBookJava;

import java.util.Scanner;

public class showBinary {
	//DUF que muestre en binario un número entre 0 y 255
	public static void main(String[] args) {
		System.out.println("type a number");
		Scanner scannumber = new Scanner(System.in);
		int number = scannumber.nextInt();
		if (number < 0 && number > 255) {
			System.out.println("I'm sorry write once again a number between 0 and 255");
		}
		
		getNumberBinary(number);
	}
	
	public static void getNumberBinary (int num) {
		int [] Binary = new int[8]; //un bit esta compuesto desde 0  hasta 255 
		int contador = 0;
		
		while (num = 0)
	}
}
