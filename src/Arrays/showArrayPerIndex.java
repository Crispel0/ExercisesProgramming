package Arrays;

import javax.swing.JOptionPane;

public class showArrayPerIndex {

	public static void main(String[] args) {
		
		int [] numbers = new int [10];
		
		fillValues(numbers);
		showValues(numbers);
		
	}
	
	public static void fillValues(int [] num) {
		for (int i = 0; i < num.length; i++) {
			String textNumber = JOptionPane.showInputDialog("Type a Number");
			int number = Integer.parseInt(textNumber);
			num [i] = number;
		}
	}
	
	public static void showValues (int [] num) {
		for(int i = 0; i < num.length; i++) {
			System.out.println("the index of num is " + i + " and the value is " + num[i]);
		}
	}
	
	
}
