package Arrays;

import javax.swing.JOptionPane;

public class positionsArr {
	/*crea un array de un tamaño pasado por teclado, el array contendra numeros aleatorios entre 1 y 300 y mostrar aquellos numeros 
	que acaben en un digito que nosotros le indiquemos por teclado debes controlar que introduzca un numero correcto estos deben 
	guardarse en un nuevo array
	
	ejm un array con 10 posiciones le indicamos que termine en 5 puede aparecernos 
	5 15 25 35 45 55 65 75 85 95 105 115 125 135 145 155 165 175 185 195 205 215 225 235 245 255 265 275 285 295
	*/
	public static void main(String[] args) {
		String sizeArr = JOptionPane.showInputDialog("Type a number Size");
		int [] numbers = new int [Integer.parseInt(sizeArr)];

		
		int finalDigit = 0;
		do {
			String position = JOptionPane.showInputDialog("Type a position between 0 and 9");
			finalDigit = Integer.parseInt(position);
		}while(!(finalDigit >=0 && finalDigit <= 9));
		
		generateNumbersAleatory(numbers,1,300);
		int[] NumberFinishin = numberFinish(numbers, finalDigit);
		showArray(NumberFinishin);
	}
	
	public static void generateNumbersAleatory(int [] nums , int num1, int num2) {
		for (int i = 0 ;i < nums.length ; i++){
			int numberAleatory = (int) Math.floor(Math.random() * (num1-num2) + num2);
		}
	}
	
	public static int [] numberFinish (int [] nums, int numberFinal) {
		int [] numberFinalDigit = new int [nums.length];
		
		int finalDigit = 0;
		
		for (int i = 0 ; i < numberFinalDigit.length;i++) {
			//resta el valor del array con el mismo y su diferencia se guarda en la variable finalDigit
			finalDigit = nums[i] - (nums [i]/10*10);
			
			if(finalDigit == numberFinal) {
				numberFinalDigit[i] = nums[i];
			}
		}
		return numberFinalDigit;

	}
	
	public static void showArray (int [] nums) {
		int i;
		for (i = 0 ;i < nums.length ; i++) {
			if (nums[i] != 0){
				System.out.println("the array with the values pass for the final digit is " + nums[i]);
			}
		}
		
	}
	

		
}
