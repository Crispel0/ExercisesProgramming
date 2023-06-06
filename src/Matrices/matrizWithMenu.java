package Matrices;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class matrizWithMenu {
	/*crear una matriz de 4*4 que inicialmente esta vacia nos piden que contenga este menu
	rellenar toda la matriz de numeros pedida por el usuario
	suma de una fila que se pedira al usuario controlar que sea la correcta
	suma de una columna que se pedira al usuario controlar que sea la correcta
	sumar la diagonal principal y sumar la diagonal inversa 
	mostrar la media de todos los valores de la matriz 
	
	si no se cumple la primera condicion de rellenar la matriz mostrar un menaaje que diga que debe rellenar la matriz
	*/
	public static void main(String[] args) {
		int numeros [][] = new int [4][4];
		int columna = 0 , fila = 0;
		boolean fin = false;
		
		boolean llenarMatriz = false;
				
		
		do {
			
			System.out.println("1 Rellenar Matriz");
			System.out.println("2 Sumar Columnas");
			System.out.println("3 Sumar Filas");
			System.out.println("4 Sumar Diagonal");
			System.out.println("5 Sumar Diagonal Inversa");
			System.out.println("6 Mostar La media");
			System.out.println("7 Salir");
		
			String numberOptions = JOptionPane.showInputDialog("Type a Number for the differents options");
			int opciones = Integer.parseInt(numberOptions);
			
		switch (opciones) {
		case 1:
			llenarMatriz = true;
			fillValues(numeros);
			break ;
		case 2:
			if(llenarMatriz) {
				do {
					Scanner scanColumn = new Scanner(System.in);
					columna = scanColumn.nextInt();
					
				}while(columna > 0 && columna < numeros.length);
				
				System.out.println("the sum of the column in the matriz is with the column " + columna + sumColumn(columna, numeros));
				
			}else {
				System.out.println("llena la matriz primero");
			}

			
		case 3:
			if(llenarMatriz) {
				do {
					Scanner scanRow = new Scanner(System.in);
					fila = scanRow.nextInt();

				}while(fila > 0 && fila < numeros.length);
				
				System.out.println("the sum of the column in the matriz is with the row " + fila + sumRow(columna, numeros));
			}
		else {
			System.out.println("Llena la Matriz Primero");
		}
		case 4:
			if(llenarMatriz)		{
				int sumaDiagonal = sumDiagonal(numeros);
				System.out.println("the sum of the matriz diagonal inverse is" + sumaDiagonal);
			}
			else {		
				System.out.println("llena la matriz primero");
			}
							
		case 5:
			if(llenarMatriz ){
				int sumaDiagonalInversa = sumDiagonalInverse(numeros);
				System.out.println("the sum of the matriz diagonal inverse is" + sumaDiagonalInversa);
			}
			else {
					System.out.println("llena la matriz primero");
				}
			
		case 6:
			if(llenarMatriz) {
				int media = mediaMatriz(numeros);
				System.out.println("the average of the matriz is " + media);
			} 
			else {
				System.out.println("llena la matriz primero");
			}
		case 7:
			fin = true;
		default:
			System.out.println("Type a number between 1 and 7"); 
		}
		}while(!fin);		
		
	}
	
	public static void fillValues (int [][] numeros) {
		int i , j;
		
		for(i = 0 ; i < numeros.length ; i++) {
			for (j = 0 ; j < numeros.length ; j++) {
				String values =JOptionPane.showInputDialog("Type values");
				int valuesMatriz = Integer.parseInt(values);
				numeros[i][j] = valuesMatriz;
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static int sumDiagonal(int [][] matriz) {
		int sumDiagonal = 0;
		for (int i = 0 , j = 0; i < matriz.length; i++ , j++) {
			sumDiagonal = matriz[i][j];
		
		}
		
		System.out.println("Diagonal Matriz");
			return sumDiagonal;
	
	}
	
	public static int sumDiagonalInverse(int [][] matriz) {
		int sumDiagonalInverse = 0;
		for (int i = 0 , j = 3; i < matriz.length; i++ , j--) {
			sumDiagonalInverse = matriz[i][j];
		
		}
		System.out.println("Diagonal Inverse");
			return sumDiagonalInverse;
	
	}
	
	public static int sumRow (int fila , int [][] matriz) {
		int sum= 0;
		for(int i = 0 ,j = 0 ; i < matriz.length ; i++ ,j++) {
			sum = fila;
		}
		return sum;
	}
	
	
	public static int sumColumn (int column , int [][] matriz) {
		int sum= 0;
		for(int i = 0 ,j = 0 ; i < matriz.length ; i++ ,j++) {
			j = column;
		}
		return sum;
	}

	public static int mediaMatriz (int [][] numeros) {
		int suma = 0, media = 0;
		for(int i = 0;  i < numeros.length ;i++) {
			for (int j = 0;  j < numeros.length; j++) {
				suma = numeros[i][j];
			}
		}
		media = (suma / (numeros.length * numeros.length ));
		return media;
	}

	
	
}

	

