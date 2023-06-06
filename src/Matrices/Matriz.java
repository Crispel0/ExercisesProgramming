package Matrices;

public class Matriz {
//	crea matrices 3*3 con los numeros del 1 al 9 rellenalas y muestralas por pantalla
	
	public static void main(String[] args) {
		
		int [][] matrizNum = new int [3][3];
		int i;
		int j;
		//		i = filas j = columnas
		for (i = 0; i < matrizNum.length; i++) {
			for(j = 0 ; j < matrizNum[0].length; j++) {
				matrizNum [i][j] = (i+matrizNum.length) + (j+1);
				System.out.print(matrizNum[i][j]+ " ");
			}
					
		}
		
		System.out.println("");
		
	}
	
	
}
