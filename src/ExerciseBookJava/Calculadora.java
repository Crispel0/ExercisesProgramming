package ExerciseBookJava;

import javax.swing.JOptionPane;

public class Calculadora {

	private void sumar(int n1 , int n2) {
		System.out.println();
		System.out.println(" la suma del " +n1+ " con el " + n2 + " es " + (n1 + n2));
		System.out.println();
	}
	
	private void restar(int n1 , int n2) {
		System.out.println();
		System.out.println("la  resta  del" + n1 + " con el " + n2 + " es " + (n1 - n2));
		System.out.println();
	}
	
	private void multiplicar(int n1 , int n2) {
		System.out.println();
		System.out.println(" la  multiplicacion  del " + n1 + " con el " + n2 + " es " + n1 * n2 );
		System.out.println();
	}
	
	private void dividir(int n1 , int n2) {
		System.out.println();
		System.out.println("la division del " + n1 + " con el " + n2 + " es "+  (double) n1 / n2 );
		System.out.println();
	}
	
	public static void main(String[] args) {
		Calculadora miCalculadora = new Calculadora();
		boolean salir = true;
		
		while(salir) {
			
		System.out.println("Operaciones Calculadora");
		System.out.println("para sumar escriba 1");
		System.out.println("para restat escriba 2");
		System.out.println("para multiplicar escriba 3");
		System.out.println("para dividir escriba 4");
		System.out.println("para salir escriba 5");	
	
		String palabra = JOptionPane.showInputDialog("Escriba un numero");
		String operacion = JOptionPane.showInputDialog("Escriba un numero para la operacion");
		String operacion2 = JOptionPane.showInputDialog("Escriba un numero para la operacion");

		
		int numero = Integer.parseInt(palabra);
		int numeroOperacion = Integer.parseInt(operacion);
		int numeroOperacion2 = Integer.parseInt(operacion2);
		
		switch (numero) {
		case 1:
			miCalculadora.sumar(numeroOperacion, numeroOperacion2);
			break;
		case 2:
			miCalculadora.restar(numeroOperacion, numeroOperacion2);

			break;
		case 3:
			miCalculadora.multiplicar(numeroOperacion, numeroOperacion2);

			break;
		case 4:
			miCalculadora.dividir(numeroOperacion, numeroOperacion2);
			break;
		case 5:
			salir = false;
			System.out.println();
			System.out.println("Se salio de la calculadora por apretar " + numero);
			System.out.println();
			break;
		default:
			System.out.println();
			System.out.println("ingresa numero entre 1 y 5");
			System.out.println();
			break;
		}
	
		}
	}
}
