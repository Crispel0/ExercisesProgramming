package ExerciseBookJava;

public class pairsAndOdd{
	
	/*DUF a la que se le pasa una tabla de enteros y un número. Debemos buscar el número en la tabla e
	indicar si se encuentra o no.
	*/
	

	public static void main(String[] args) {
		int [] numbers = new int [10];
		
		busca(numbers, 6);
		
	}
	
		public static boolean busca(int t[],int n)
		 {
		 int i;
		 boolean esta;
		 
		 i=0;
		 while (i<t.length && t[i]!=n) // si no es t[i], paso al siguiente
		 // con cuidado de no salirme de la tabla
		 i++;
		 // cuando termina el mientras, puede ser por dos motivos:
		 // - que he buscado por toda la tabla sin encontrarlo y al final me salgo de la tabla
		 // - o que lo he encontrado
		 if (i<t.length) // si no llego al final de la tabla es por que lo he encontrado
		 // t[i] == num no es válido, ya que si i está fuera de rango da un error
		 esta =true;
		 
		 else
			 esta =false;
		 
		 return(esta);
		 }
		
		
	}
	


