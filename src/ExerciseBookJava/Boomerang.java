package ExerciseBookJava;

public class Boomerang {
	/*
	 * Enunciado: Crea una función que retorne el número total de bumeranes de 
	 * un array de números enteros e imprima cada uno de ellos.
	 * - Un bumerán (búmeran, boomerang) es una secuencia formada por 3 números
	 *   seguidos, en el que el primero y el último son iguales, y el segundo
	 *   es diferente. Por ejemplo [2, 1, 2].
	 * - En el array [2, 1, 2, 3, 3, 4, 2, 4] hay 2 bumeranes ([2, 1, 2] 
	 *   y [4, 2, 4]).
	 */
	
	public static void main(String[] args) {
		int [] boomerang =  {
			4,5,4,2,3,2,7,5,7,6,4,5,1,2,1
		};
		
		System.out.println(cantidadBoomerang(boomerang));
	}
	
	public static int cantidadBoomerang(int boomerang []) {

		int cantidadBoomerangs = 0;
		
		/*por cada posicion verifica si es diferente de la que sigue y tambien si es igual a la actual mas dos adelante 
		si es es asi solo suma cantidadBoomerangs en uno. se posiciona en la antepenultima para evitar ArrayBoundException
		*/
		for(int i = 0 ; i< boomerang.length-2; i++){
		if(boomerang[i] != boomerang[i+1] && boomerang[i] == boomerang[i+2]) {
			cantidadBoomerangs++;
			}
		}
		return cantidadBoomerangs;
		}
	}

