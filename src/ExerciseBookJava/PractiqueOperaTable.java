package ExerciseBookJava;

import javax.swing.JOptionPane;

public class PractiqueOperaTable {
	/*Diseñar la función opera_tabla, a la que se le pasa dos tablas, el número de elementos útiles y
	que operación se desea realizar: sumar, restar, multiplicar o dividir (mediante un carácter: 's',
	'r', 'm', 'd'). La función debe devolver una tabla con los resultados.
	*/
	
	public static void main(String[] args) {
		int numbersTable1 [] = new int [5]; int numbersTable2 [] = new int [5];
		String Operacion = JOptionPane.showInputDialog("What is The Operation Are yuor Desire Realize?");
		
		 OperaTabla(numbersTable1, numbersTable2, Operacion);
	}
	
	public static int [] OperaTabla (int [] table1, int [] table2 , String Operacion){
		int i; int operacion [] = new int [0];
		
		for(i = 0 ;i < table1.length ; i++) {
			table1[i] = i;	 table2[i] = i;		
		}
		
		switch (Operacion) {
		case "s":
			operacion[i] = table1[i] + table2[i]; 
			break;
		case "r":
			operacion[i] = table1[i] - table2[i]; 
			break;
		case "m":
			operacion[i] = table1[i] * table2[i]; 
			break;
		case "d":
			operacion[i] = table1[i] / table2[i]; 
			break;
		default:
			break;
		}
		return operacion;
	} 
		
}
