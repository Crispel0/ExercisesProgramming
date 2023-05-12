package Arrays;

import java.util.Arrays;

public class CopyOf {
	public static void main(String[] args) {
	
		int [] numbers = new int [10];
		int [] numbersTwo;
		
		Arrays.fill(numbers, 5);
		numbersTwo = Arrays.copyOfRange(numbers ,2 ,numbers.length);
		
		for(int i = 0 ;i < numbersTwo.length ;i++) {
		System.out.println(numbersTwo[i]);
		
		/*when Create a array and desire fill this or loop this unto the final position of the same array is necessary indicate that is i < numberTwo.length 
		not i <= numbersTwo.length of the contrary can provoke a ArrayIndexBoundException
		*/
		
		}
}
}
