package Kata;

public class FindPosition {
/*
 * When provided with a letter, return its position in the alphabet.

Input :: "a"

Ouput :: "Position of alphabet: 1"
 */
	public static void main(String[] args) {
		System.out.println(findPosition('z'));
	}
	
	
	public static String findPosition(char alphabet) {
		char letra = Character.toLowerCase(alphabet);
		
		int posicion = letra - 'a' +1;
		
		String resultado = "the positionAlphabet is" + posicion;
		
		return resultado;
	}

public static String position(char alphabet) { /*it was my first prueb but don't work correctly, I take this like a example or guide for the other*/
	int [] posicionAlfabeto = new int[3];
	char [] abecedario = {'a','b','c','d'};
	  int position = 0;
	  
	for(int i = 0 ; i < posicionAlfabeto.length;i++) {
		/*String opciones = String.valueOf(posicionAlfabeto[i]);*/
		posicionAlfabeto[i] = i;
		abecedario[i] = (char) i;
		System.out.println(abecedario[i]);
		
		if(Character.valueOf(alphabet).equals(Character.valueOf(abecedario[i]))) {
			position = posicionAlfabeto[i];
		}
		
	}
	return "the positionAlfabeto is" + position;
}
}
