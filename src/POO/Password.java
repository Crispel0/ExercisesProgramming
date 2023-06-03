package POO;

import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Password {

	private int longitud = 8;
	private String password ;
	
	public Password() {
	}
	
	public Password (int longitud, String password) {
		this.longitud = longitud;
		this.password = generarCadenaAleaotorio(longitud);
	}
	
	public int getLongitud (){
		return this.longitud;
	}
	
	public int setLongitud(int longitud) {
		return this.longitud = longitud;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	private static String generarCadenaAleaotorio(int longitud) {
		String charactherPassword = "ABCDEFGHIJKLMNOÑPQRSTWXYZabcdefghijklmnoprstwxyz0123456789";
		String chain = "";
		for(int i = 0 ;i < longitud; i++) {
			int indexRandom = generarNumeroAleatorio(0, charactherPassword.length() -1);
			char characterAleatory = charactherPassword.charAt(indexRandom);
			 chain += characterAleatory;
		}
		return chain;
	}
	
	public static int generarNumeroAleatorio(int minimo, int maximo) {
		return ThreadLocalRandom.current().nextInt(minimo , maximo+1);
	}
	
	public boolean esSegura(String password) {
		Pattern patron = Pattern.compile("[A-Z]{2}[a-z]+[0-9]{5,}");
		Matcher match = patron.matcher(password);
		if(match.find())
		return true;
		else 
			return false;
	}
	
	@Override
	public String toString() {
		return "the password is " + getPassword() + "and the Strong" + esSegura(password);
	}
}
