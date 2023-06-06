package POO;

import javax.swing.JOptionPane;

public class PruebaPassword {
	
	public static void main(String[] args) {

		String longhtPassword = JOptionPane.showInputDialog("Type a longth Password");
		int longPassword= Integer.parseInt(longhtPassword);
		
		boolean [] passwordStrongs = new boolean [longPassword];
		Password [] passWords = new Password [longPassword];
		
		int i;	
		for (i = 0; i < passWords.length; i++) {
			  
				String longitud = JOptionPane.showInputDialog("Type Longitud");
				int Objectlongitud = Integer.parseInt(longitud);
				
				Password password = new Password(Objectlongitud, null);
			
			passWords[i] = password;
			
			if(password.esSegura(password.getPassword())) {
				passwordStrongs[i] = true;
				System.out.println(passwordStrongs[i]);
			}else 
				passwordStrongs[i] = false;

			System.out.println("the password current is " + passWords[i] + " and the Strong is " + passwordStrongs[i]);
		}
		
		
	}
}
