package Kata;

public class ThreeTrouble {
/*
 * Create a function that will return a string that combines all of the letters of the three
 *  inputed strings in groups. Taking the first letter of all of the inputs and grouping them 
 *  next to each other. Do this for every letter, see example below!

E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"

Note: You can expect all of the inputs to be the same length
 */
	
	public static void main(String[] args) {
		
		System.out.println(threeTrouble("sd","pe","ir"));
		System.out.println(threeTrouble2("sd","pe","ir"));
	}
	
	public static String threeTrouble2 (String one, String two,String three) {
		
		String palabra = "";
		
	    for(int i = 0 ; i < one.length();i++){
//	    char characterOne = one.charAt(i);
//	      char characterTwo = two.charAt(i);
//	      char characterThree = three.charAt(i);
	      
	       palabra += one.substring(i,+1) + two.substring(i,i+1) + three.substring(i,i+i);	    		   
	    		   
//	    		   String.valueOf(characterOne) + String.valueOf(characterTwo)  + String.valueOf(characterThree);	       

	    }
	    return palabra;
	}
	    
	    /*String word = Arrays.toString(wordMixed);*/
		
	    public static String threeTrouble (String one, String two,String three) {
			String [] word = new String [one.length()];
			
			String palabra = null;
			
		    for(int i = 0 ; i < one.length();i++){
		    char characterOne = one.charAt(i);
		      char characterTwo = two.charAt(i);
		      char characterThree = three.charAt(i);
		      
		      word[i] = String.valueOf(characterOne) + String.valueOf(characterTwo) + String.valueOf(characterThree);
		      palabra = String.join("", word);
		       

		    }
		    return palabra;
	    }
	}

