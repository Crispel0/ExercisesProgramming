package leetCode;

public class RemoveElement {
	public static void main(String[] args) {
		int value = 2;
		int []  numbers = {0,1,2,2,3,0,4,2};
		
		removeElement(numbers, 2);
		
	}
	
	public static int removeElement(int [] nums, int value) {
		int k = 0;
		int [] valueExpected = new int [nums.length];
		int i;
		for (i = 0; i < nums.length; i++) {
			if(!(nums[i] == value)) {
				valueExpected[i] = nums[i];
				k++;
				System.out.print(valueExpected[i]);


			}
			System.out.print(" ");

		} 
		System.out.println("Value : " + k);
		return k;
	}
}
