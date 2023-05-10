package Arrays;

import javax.swing.JOptionPane;

public class ArrayPrime {
/*
 * Crea un array que reciba por input en teclado que nos diga los numeros primos de los numeros pasados(alaeotoriamente)
 * y finalmente decir cual es el mayor numero primo de todos
 * construye un metodo para comprobar si el numero aleatorio es primo se puede crear cualquier cantidad de metodos como sea necesario
 */
	
	public static void main(String[] args) {
		String textNumber = JOptionPane.showInputDialog("Type a Number");
		int [] numbers = new int [Integer.parseInt(textNumber)];
		generateNumbersAleotory(numbers,1 ,100);
		isPrime(Integer.parseInt(textNumber));
		showValues(numbers);
		
	}
	
	public static boolean isPrime (int nums) {
		if (nums < 1 )
			System.out.println("type numbers positive");
		
		int prueba, contador;
		contador = 0;
		prueba = (int) Math.sqrt(nums);
		for(;prueba>1;prueba--){ //I don't know that the for can be write out of beggin with a initializer// 
			if(prueba%nums == 0) {
				contador++;
			}
			
		}
		return contador<1;
			
		}

	
	public static int[] generateNumbersAleotory (int [] nums , int num1 , int num2) {
		int i = 0;
		while(i < nums.length) {
			int num = (int) Math.floor(Math.random() *(num1-num2)+num2); //el metodo  de Mathfloor es utilizado para redondear los numeros a un valor debajo de 4 decimal
			if(isPrime(num)) {
				nums[i] = num;
				i++;
			}
		}
		return nums;
	}
	
	public static void showValues (int [] nums) {
		for (int i = 0 ; i < nums.length; i++) {
			System.out.println("the value position array is " + nums[i]);
		}
	}
	
	public int[] PrimeMayor(int [] nums) {
		int mayor = 0;
		int i;
		for (i = 0 ; i < nums.length ; i++) {
			if(nums[i] > mayor) {
				nums[i] = mayor;
			}
		}
		return nums;
	}
}

