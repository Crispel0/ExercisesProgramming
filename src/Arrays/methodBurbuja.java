package Arrays;

/* Ordenar por medio del metodo de la burbuja no entiendo que hace esto/*
 */
public class methodBurbuja {
	public static void main(String[] args) {
	
		int nums [] = {1,2,3,4,5,6,7,8,9,};
		
		ordenarBurbuja(nums);
		
		for(int i = 0 ; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
	
	
	public static void ordenarBurbuja (int [] nums) {
		int  contarIntercambios = 0;
		for (boolean order =false;!order;) {
			for(int i = 0 ; i < nums.length -1 ; i++) {
				if(nums[i] > nums[i+1]) {
					
					int intercambio = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = intercambio;
					
					contarIntercambios++;
					
				}
				if(contarIntercambios == 0) {
					order = true;
				}
				
			}
		}
		contarIntercambios = 0;
	}
}
