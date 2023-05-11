package Arrays;

import javax.swing.JOptionPane;

public class NotesStudents {
	/*crea un array de numeros y otro de strings de 10 posiciones donde insertamos notas entre 0 y 10 (se debe controlar que inserte una nota valida)
	pudiendo ser decimal la nota en el array de numeros en el de strings se insertaran los nombres de los alumnos 
	
	despues crearemos un array de String donde insertaremos el resultado de la nota con palabras 
	
	si la nota esta entre 0 y 4,99 -> suspenso
	5 y 6,99 -> Bien
	7 y 8,99 -> Aprobado
	9 y 10 -> Sobresaliente

	muestre por pantalla el nombre del alumno su nota y su resultado en palabras cree los metodos que vea conveniente
	*/
	
	public static void main(String[] args) {
	
		double [] notas = new double [10];
		String [] nameStudents = new String [10];
		
		insertNotesAndStudents(notas , nameStudents);
		String[] result = validNotes(notas);
		showValues (notas, nameStudents, result);
		
		
	}

	private static void showValues(double[] notas, String[] nameStudents, String[] result) {
		for (int i = 0; i < nameStudents.length; i++) {
			System.out.println("the name of the student is " + nameStudents[i] + " your note is " + notas[i]+ " and his " + result [i]);
		}
	}

	public static void insertNotesAndStudents(double [] notes, String [] nameStudent) {
		for(int i = 0 ;i < notes.length; i++ ) {
			nameStudent[i] = JOptionPane.showInputDialog("Type the name of student " + (i+1));
		
		double note;
		do {
			String strNote = JOptionPane.showInputDialog("Type a note " + (i+1));
			note = Double.parseDouble(strNote);
		}while(note <= 0 || note >= 10);	
		notes[i] = note;
		}
	}
	
	private static String [] validNotes(double[] notas) {
		String [] notasWords = new String [notas.length];
		for(int i = 0 ;i < notas.length; i++) {
			switch ((int)notas[i]) {
			case 1:
			case 2:
			case 3:
			case 4:
				notasWords [i] = "Desaprovado";
				break;
			case 5:
			case 6:
				notasWords [i] = "Bien";
				break;
			case 7:
			case 8:
				notasWords [i] = "Sobresaliente";
				break;
			default:
				notasWords [i] = "Aprovado";
				break;
			}
		}
		return notasWords;
	}
}


