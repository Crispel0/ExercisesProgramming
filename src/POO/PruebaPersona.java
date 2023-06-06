package POO;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class PruebaPersona {
	
	public static void main(String[] args) {
		String Name = JOptionPane.showInputDialog("Type Name");
		String Age = JOptionPane.showInputDialog("Type Age");
		String Peso = JOptionPane.showInputDialog("Type Peso");
		String Altura = JOptionPane.showInputDialog("Type Hight");
		
		System.out.println("Type a Gender");
		Scanner scanSex = new Scanner(System.in);

		int age = Integer.parseInt(Age);
		double peso = Double.parseDouble(Peso);
		double altura = Double.parseDouble(Altura);
		char sex = scanSex.next().charAt(0);
		
		Persona julian = new Persona(Name,age,sex,peso,altura,8);
		Persona camila = new Persona(Name, age, sex);
		Persona juliana = new Persona();
		
		juliana.setNombre("Juliana");
		juliana.setEdad(24);
		juliana.setAltura(1.60);
		juliana.setPeso(80);
		juliana.setSexo('F');
		
		julian.calcularImc(peso, altura);
		camila.calcularImc(peso, altura);
		juliana.calcularImc(juliana.getPeso(),juliana.getAltura());
		
		julian.mayorEdad(age);
		camila.mayorEdad(age);
		juliana.mayorEdad(juliana.getEdad());
		
		System.out.println(julian.toString());
		System.out.println(camila.toString());
		System.out.println(juliana.toString());

	}
}
