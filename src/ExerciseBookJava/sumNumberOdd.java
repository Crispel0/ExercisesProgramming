package ExerciseBookJava;


public class sumNumberOdd {
	public static void main(String[] args) {
//	cree un array donde sume los numeros primos que contiene
		
		int [] numbersOdd = {10, 15, 20, 25, 30, 35, 40, 45};

		
		SumOddNumbers(numbersOdd);
		showValues(numbersOdd);
	}
	
	public static void SumOddNumbers( int [] number ) {
		int [] odd = new int [number.length];
		int i;
		for (i = 0 ; i < number.length ; i++) {
			if (number[i] <= 1 &&  number[i] % 2 != 0){
				odd [i] += i;
			}
		}
		
		
	}
	
	public static void showValues(int [] number) {
		int i ;
		for (i = 0; i < number.length ; i++) 
			System.out.println("the cantity of number odd (no primos son)" + number[i]);		
		}
	}

