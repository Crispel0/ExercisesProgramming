package ExerciseBookJava;

import java.util.Scanner;
//Is Neccessary Fix this Problem
public class numbersFriend {
	/*Escriba una función que decida si dos números enteros positivos son amigos. Dos números son
	amigos, si la suma de sus divisores (distintos de ellos mismos) son iguales.
	*/
	
	/*public static void main(String[] args) {
		String numberOne = JOptionPane.showInputDialog("Write a number 1");
		String numberTwo = JOptionPane.showInputDialog("Write a number 2");
		int numeroUno = Integer.parseInt(numberOne);
		int numeroDos = Integer.parseInt(numberTwo);

		if (numeroUno <= 0|| numeroDos<= 0 ) {
			System.out.println("Write Numbers positive or more grather than 0");
		}
		
		System.out.println(numberFriend(numeroUno, numeroDos));
	}
	
	public static boolean numberFriend(int numberOne, int numberTwo) {
		
		int divisornumberOne,divisornumberTwo; int sumaDivisoresnumberOne = 0; int sumaDivisoresnumberTwo = 0;
		for(int i = 1 ; i < numberOne ; i++) {
			if (numberOne % i == 0) { divisornumberOne = i; sumaDivisoresnumberOne =+ divisornumberOne;}
			if (numberTwo % i ==0) {divisornumberTwo= i; sumaDivisoresnumberTwo =+ divisornumberTwo;}
		}
		
		if(sumaDivisoresnumberOne == sumaDivisoresnumberTwo) {
			return true;
		}else {return false;}
	}
}
*/
	public static void main(String[] args) {
		
		System.out.println("Type a Number");
		Scanner scanNumber = new Scanner(System.in);
		int number = scanNumber.nextInt();
		
		System.out.println("Type a Number");
		Scanner scanNumberTwo = new Scanner(System.in);
		int numberTwo = scanNumber.nextInt();
		
		isPrime(number);
		isPrime(numberTwo);
		
		if(number == sumaDivisores(numberTwo)) {
			System.out.println("the numbers is friend");}

	}
	
	public static int sumaDivisores (int num) {
		int sumaDivisores = 0;
		for(int i = 0 ; i < num ; i++) {
			if (num % i == 0) {
				sumaDivisores += i;
			}
		}
		return sumaDivisores;
	}
	
	public static boolean isPrime (int number2) {
	int i = 2; boolean isPrimo = true;
	while(i < number2 && isPrimo); {
		if (number2 % i == 0) {
			isPrimo = false;
		}
		return isPrimo;
		
	}
}
}

