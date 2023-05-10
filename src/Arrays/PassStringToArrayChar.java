package Arrays;

import java.util.Scanner;

public class PassStringToArrayChar{
	/*
	 * Pide por teclado una frase y guarde su contenido valor en el interior de un array de caracteres puede utilizar un metodo tipo Sti
	 */
	public static void main(String[] args) {
		
		
		/*System.out.println("Type a Phrase");
		
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		char [] charactersPhrase = new char [phrase.length()];
		
		for (int i = 0; i < phrase.length(); i++){
			charactersPhrase[i] = phrase.charAt(i);
		}
		
		System.out.println(charactersPhrase);
		*/
		System.out.println("Type a Phrase");
		
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		
		char [] charactersPhrase = new char [phrase.length()];
		
		StringToArrayChar(phrase, charactersPhrase);
	}
	
	
	
	public static char [] StringToArrayChar(String phrase, char [] charactersPhrase) {
		for (int i = 0; i < phrase.length(); i++){
			charactersPhrase[i] = phrase.charAt(i);
		}
		
		return charactersPhrase;
	}
}
