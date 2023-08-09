package ExerciseBookJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Algorithm:

Initialize the input string
Check if the character present in the string is punctuation or not.
If a character is a punctuation, then erase that character and decrement the index.
Print the output string, which will be free of any punctuation.Algorithm:
*/

public class removeAllLettersPuntuaction {

	public static void main(String[] args) {
		removeAllLettersPuntuaction rl = new removeAllLettersPuntuaction();
		System.out.println(rl.removeLettersPuntuacion("ho!#$la"));
	
	}
	
	protected String removeLettersPuntuacion(String word){
		String wordNew = word.replaceAll("\\p{Punct}", ""); //reemplaza cualquier regex de puntuacion por nada y lo guarda en una variable
		
		return wordNew;
	}
}
