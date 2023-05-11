package Arrays;

public class ValuesInverted {
/*dado un array de numeros de 5 posiciones con los siguientes valores 12345 guardar los valores de este array en otro array distinto 
pero con los valores invertidos es decir que el segundo tendra los valores 54321 */
	
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5};
		int [] valuesInverted = new int [numbers.length];
		
		valuesInverted = valuesInverted(numbers);
		showvalues(valuesInverted);
	}

private static void showvalues(int[] valuesInverted) {
		for(int i = 0 ; i < valuesInverted.length ; i++) {
			System.out.println("the values inverted is " + valuesInverted[i]);
		}
	}

private static int[] valuesInverted(int[] numbers) {
	int [] valuesInverted = new int [numbers.length];
	for(int i = (valuesInverted.length -1) , j = 0 ; i >= 0 ; i--, j++) {
		valuesInverted[j] = numbers[i];
	}
	return valuesInverted;
}
	
	
	
	
}
