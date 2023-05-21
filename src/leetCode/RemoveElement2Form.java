package leetCode;

public class RemoveElement2Form {
	/*con diferencia del otro algoritmo este lo tome de leetcode y la diferencia es que en el mio creo un array y guardo los elementos diferentes del valor
	pasado por parametro, aqui lo asigno en el mismo array que paso por parametro asignando al tamaño del array el contador del valor seleccionado a eliminar
	*/
	
	public static void main(String[] args) {
		int [] nums = {10,3,8,3,6,24,3,20};
		int value = 3;
		
		System.out.print(removeElement(nums, value));
	}
	
	public static int removeElement(int [] nums, int value) {
		int k = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if (!(nums[i] == value)) {
				nums[k++] = nums[i];
				System.out.print(nums[i] + " ");
			}
			
			
		}
		
		System.out.println("value is: " + k);
		return k;
	}
}
