package ExerciseBookJava;

public class DufOrderaTable {
	//	DUF que ordene la tabla que se le pasa
	public static void main(String[] args) {
				
		 int table[]=new int[8];
		 
		 for (int i=0;i<8;i++){
			 
		 table[i]=(int)(Math.random()*100)+1;
		 
		 }
		 
		 System.out.println("Tabla aleatoria");
		 
		 mostrar_tabla(table);
		 System.out.println("\n\nTabla ordenada");
		 
		 ordenar(table);
		 
		 mostrar_tabla(table);
	}
	


static void ordenar(int a[]){
	
	 int tam=a.length;
	 int aux;
	 // se ordena utilizando la ordenación por intercambio
		for (int i = 0; i < tam - 1 - 1; i++) {
			for (int j = 0; j < tam - i - 1; j++) {
				if (a[j] > a[j + 1]) // si el elemento j es mayor que el j+1
				{
					aux = a[j]; // los intercambiamos
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
	}

	static void mostrar_tabla(int t[]) {
		;
		for (int i = 0; i < t.length; i++) {
			System.out.print(t[i] + " ");
		}
		
	}
}
	 
		 
	
	 
	 
	
