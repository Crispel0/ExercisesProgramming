package ExerciseBookJava;

public class Abaco{
	 public static void main(String[] args) {
	        abaco(new String[]{"O---OOOOOOOO", "OOO---OOOOOO", "---OOOOOOOOO", "OO---OOOOOOO", 
	        		"OOOOOOO---OO", "OOOOOOOOO---", "---OOOOOOOOO"});
	    }

	    private static void abaco(String[] numbers) {

	        String resultado = "";

	        int numero = 0;

	        for(String n : numbers) {
	            numero = n.split("---")[0].length();
	        
	            resultado += (numero > 0) ? numero : (resultado.length() != 0) ? 0 : "";
	        }

	        System.out.println(resultado);

	    }

	}
	

