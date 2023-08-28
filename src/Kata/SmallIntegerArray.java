package Kata;

public class SmallIntegerArray {

	public static int findSmallIntegerArray(int [] args) {
		int smallInteger = args[0];
		for(int i = 1 ; i < args.length ; i++) {
			if(args[i] < smallInteger )
				smallInteger = args[i];
			}
		return smallInteger;
		}
		
	public static void main(String[] args) {
		int [] numbers = {10,15,20,50,301};
		 int numberSmall = findSmallIntegerArray(numbers);
		System.out.println(numberSmall);
	}
}
