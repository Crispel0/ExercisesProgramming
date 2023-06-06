package Arrays;

public class NumberAleatoryNoRepeat {

	/* generar un array con numeros aleaotorios no repetidos entre si */
	public static void main(String[] args) {
		
		int [] numbersNoRepeat = new int [2];
		ArraysNoRepeat();
	}
	
	public static void fillValues(int [] numbers) {
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.println(" the values of the Array is "  + numbers[i]);
		}
	}
	
	public static void ArraysNoRepeat(int [] numbers ,int number, int numberTwo) {
		
		for(int i = 0 ; i < numbers.length ; i++) {
		int numberRandomico = (int) (Math.random() * (number-numberTwo) + number);
		if (numberRandomico) {
		numbers [i] = numberRandomico; }

		}
	}
}