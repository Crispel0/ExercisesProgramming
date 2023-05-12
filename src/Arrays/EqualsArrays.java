package Arrays;

import java.util.Arrays;


public class EqualsArrays {
	public static void main(String[] args) {
	int [] Ages = new int [20];
	int [] estatura = new int [20];
	
	for (int i = 0 ; i < Ages.length ; i++) {
		Ages [i] = i;
		estatura[i] = i;
	}
	
	if(Arrays.equals(Ages, estatura)){
		System.out.println("is the same");
	}else {
		System.out.println("is different");
	}
}
}
