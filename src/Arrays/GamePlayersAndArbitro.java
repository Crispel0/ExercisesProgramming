package Arrays;

import javax.swing.JOptionPane;

public class GamePlayersAndArbitro {
/* Se quieren simular un juego en el que participan N jugadores y otra persona que hace de arbitro , cada jugaodr elige 4 numeros en el rango [1 ||10]
 * pudiendo estar repetidos a continuacion el arbitro sin conocer los numeros que ha elegido el jugador selecciona Dos nmeros A Y b
 * 
 * el programa debe ser capaz de calcular cuantos numeros comprendidos por cada jugador hay entre A y B, 
 * ganara el jugador que mas numeros tenga en dicho intervalo
 * 
 * tanto los 4 datos de cada jugador como los valores para A y B se solicitaran por teclado en todos los casos el programa debe detectar la entrada
 * de numeros erroneos, solicitando nuevamente el dato hasta que sea valido.
 * 
 * se deben mostrar por pantalla no solo los aciertos de cada jugador si no los datos que ha introducido cada jugador y los que ha seleccionado el arbitro
 * por ultimo es necesario imprimir la media aritmetica de todos los jugadores.
 * 
 */
	
	public static void main(String[] args) {
		int [] datosA = new int [10];
		int [] datosB = new int [10];
		int [] numbersPlayer = new int [10];
		String [] jugadores = new String[4];
		String Arbitro;
		
		fillDatesAndValues(datosA , datosB);
		
		
	}
	
	/*public void differenceNumbers(int [] numbersA, int [] numbersB) {
		
	}
	*/
	
	public static  void fillDatesAndValues (int [] datosA, int [] datosB ) {
		while(!(datosA.length < 0 ||  datosA.length > 10 && datosB.length < 0 || datosA.length > 10)) {
			for (int i = 0 ; i < 4 ; i++) {
				String datosText = JOptionPane.showInputDialog("Ingrese datos Valor A"); 
				String datosText2 = JOptionPane.showInputDialog("Ingrese datos Valor B");
				int datos = Integer.parseInt(datosText); 
				int datos2 = Integer.parseInt(datosText2);
				datosA[datos] = datos; 
				datosB[datos2] = datos; 
			}
		}
		System.out.println("Ingrese datos validos en el rango de " + datosA[0] + " and " + datosA[-1]);
		//caso no tenga este rango nuevamente hacer el while
	}
	
	public static void tomarValoresJugador(int [] numbersPlayers , int [] jugador) {
		for (int i = 0 ; i < numbersPlayers.length ; i++) {
			jugador = 
		}
	}
}

