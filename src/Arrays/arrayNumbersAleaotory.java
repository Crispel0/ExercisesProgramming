package Arrays;

import javax.swing.JOptionPane;

public class arrayNumbersAleaotory {
	
	public static void main(String[] args) {
	
		String Strcolumn = JOptionPane.showInputDialog("Type the lenght of the column of the array");
		int column = Integer.parseInt(Strcolumn);
		
		int [][] array = new int [5][column];
		
		int i, j;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[0].length; j++) { //what Represent the array[0].lenght
				array[i][j] = (int) Math.floor(Math.random() * 10);
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
