package Arrays;

public class QuickSort {
	public static void main(String[] args) {
		
		int [] numbers = {5,6,2,10,1};

		
		
		ordernarQuickSort(numbers, 0, numbers.length);
		System.out.println(numbers.length);
}

	private static void ordernarQuickSort(int[] numbers, int izquierda, int derecha) {
		int i= izquierda;
		int j = derecha;
		int pivote = numbers[(i+j)/2];
		
		do {
			
			while(numbers[i] < pivote) {i++;} while(numbers[j] > pivote) {j--;}
			if(i<=j) {
				int intercambiador = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = intercambiador;
				i++;
				j--;
			}				
		}while(i<=j);

		if(izquierda<j) {
			ordernarQuickSort(numbers, izquierda, j);
		}else if(derecha > i) {
			ordernarQuickSort(numbers, i, derecha);
		}
	}
}

