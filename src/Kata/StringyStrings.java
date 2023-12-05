package Kata;

public class StringyStrings {
	public static void main(String[] args) {
	System.out.println(stringy(12));
	System.out.println(otherSolution(12));
}
	 public static String stringy(int size) {
		    String stringy = "";
		  for(int counter = 0; counter < size; counter++){
		    if(counter %2 == 0){
		      stringy += "1";
		    }else{
		      stringy+= "0";
		    }
		  }
		        return stringy;
		  }
	 
	 public static String otherSolution(int size) {
		 StringBuffer word = new StringBuffer();
		 
		 for(int i = 0; i < size; i++) { //the method append add a new char or string into of a chair of string in the last position of him
			 if(i %2 ==0) {
				 word.append('1'); 
			 }else {
				 word.append('0');
			 }
		 }
		 return word.toString();
	 }
}
