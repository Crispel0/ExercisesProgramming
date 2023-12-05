package Kata;

public class LoopYears {
public static void main(String[] args) {
	isLeapYear(2100);
	isLeapYear(2020);     
	isLeapYear(2000);
	isLeapYear(2015);
	isLeapYear(2100);
	
	/*In this kata you should simply determine, whether a given year is a leap year or not. In case you don't know the rules, here they are:

	years divisible by 4 are leap years
	but years divisible by 100 are not leap years
	but years divisible by 400 are leap years*/
}

public static boolean isLeapYear(int year) {
	if(year % 4 == 0){
		/*valida que no sea divisible por 100 o que no sea divisible por 400 si alguna se cumple es bisiesto*/
	      if( ( year % 100 != 0 ) || (year % 400 == 0) ){
	    	  System.out.println(true);
	       return true;
	      }
	    }
	System.out.println(false);
	    return false;
	  }
	
	
}
		 


