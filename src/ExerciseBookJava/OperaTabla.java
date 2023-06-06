package ExerciseBookJava;

import java.util.Arrays;

public class OperaTabla {
	
	/*.Diseñar la función opera_tabla, a la que se le pasa dos tablas, el número de elementos útiles y
	que operación se desea realizar: sumar, restar, multiplicar o dividir (mediante un carácter: 's',
	'r', 'm', 'd'). La función debe devolver una tabla con los resultados.
	*/
	
	public static void main(String[] args) {
		int [] numTabla1;
		int [] numTabla2;
		int elemNum = 5;
		numTabla1 = new int [elemNum];
		numTabla2 = new int [elemNum];
		
		int [] resultado = operatabla(numTabla1, numTabla2, elemNum, "s");
		System.out.println(Arrays.toString(resultado));
	}
	
	public static int [] operatabla (int [] numTabla1, int [] numTabla2, int elemNum , String operacion) {
		
		int [] resultado = new int [elemNum];
	
		char operation = operacion.charAt(0);
		
		switch(operation) {
		case 's': 
			for(int i = 0; i < elemNum ; i++) {
				resultado[i] = numTabla1[i] + numTabla2[i];
			}
			break;
		case 'r' :
			for(int i = 0; i < elemNum ; i++) {
				resultado[i] = numTabla1[i] - numTabla2[i];
			}
			break;
		case 'm':
			for(int i = 0; i < elemNum ; i++) {
				resultado[i] = numTabla1[i] * numTabla2[i];
			}
			break;
		case 'd':
			for(int i = 0; i < elemNum ; i++) {
				resultado[i] = numTabla1[i] / numTabla2[i];
			}
			break;
		default :
		System.out.println("Type s / r / m / d any letter");
		}
				
		return resultado;
	}
}
