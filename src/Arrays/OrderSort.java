package Arrays;

import java.util.Arrays;

public class OrderSort {
	public static void main(String[] args) {
	
		int [] Array = {5,10,21,30,14,25,41,20,35,15};
		
		OrderSort(Array);
		for (int i = 0; i < Array.length ;i ++){
			System.out.println(Array[i]);
		}
	}
	
	public static int []  OrderSort (int [] Array) {
		
		Arrays.sort(Array);
		return Array;
	}
}