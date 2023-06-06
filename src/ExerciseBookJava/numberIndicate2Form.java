package ExerciseBookJava;

public class numberIndicate2Form {
	public static void main(String[] args) {
		int [] numbers = {5 ,10 , 15, 20, 25, 30, 35, 40, 45, 50 };
		int number = 10;
		
		findNumberTable(numbers, number);
		System.out.println(findNumberTable(numbers, number));
	}
	
	public static boolean findNumberTable (int tNumber [], int number) {
		boolean esta = false;
		int i = 0;
		
		while (i < tNumber.length && tNumber[i] != number) {
			i++;
			if(i < tNumber.length) { /*if not found the number between of the range of numbers of I so return false because not find */
				esta = true;
			}else {
				
				esta = false;
				
			}
			
			
		}
		return esta;
	}
}
