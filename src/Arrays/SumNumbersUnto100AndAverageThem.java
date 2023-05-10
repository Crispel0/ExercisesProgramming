package Arrays;
public class SumNumbersUnto100AndAverageThem {
	
/*	Crea un Array de 100 numeros desde el 1 hasta el 100 donde sumes sus valores y tengas el promedio del mismo al final muestralo 
	por pantalla */
	
	public static void SumValuesAndAVerage(int [] nums) {
		double sumValues = 0;
		int i;
		double media;
		for (i= 0 ; i < nums.length; i++) {
			nums[i] = i;
			sumValues += nums[i];
		}
		
		media = (double) sumValues/nums.length;
		
		System.out.println("The Sum Of The Values is" + sumValues);
		System.out.println("The Average of The Values is " + media);
	}
	
	public static void main(String[] args) {
		
		int [] numbers = new int [100];

		SumValuesAndAVerage(numbers);
	}
	
}
