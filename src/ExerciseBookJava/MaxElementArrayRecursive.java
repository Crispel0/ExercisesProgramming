package ExerciseBookJava;

public class MaxElementArrayRecursive {

	public static int findMaxElement(int arr[], int index) {
		
		if(index == arr.length-1){
			return arr[index];
		}
		
		int maxElement = findMaxElement(arr, index+1);
		return Math.max(maxElement, index);
	}
	
	public static void main(String[] args) {
		
		int [] arr = {2,4,6,8,10};
		
		int maxElement = findMaxElement(arr, 0);
		
		System.out.println("the element more biggest is " + maxElement);
		
	}
}

