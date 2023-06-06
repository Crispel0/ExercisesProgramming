package POO;

public class Persona{

	static final char[] sexos = {'M' , 'F'};
	private String nombre = "";
	private int edad = 0;
	private char sexo = sexos[0];
	private double peso = 0;
	private double altura = 0;
	private int dni;
	
	public Persona() {};
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre; this.edad = edad; this.sexo = sexo;
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura ,int dni) {
		this.nombre = nombre; this.edad = edad; this.sexo = sexo ; this.peso = peso; this.altura = altura;
		this.dni = generarDni(dni);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getDni() {
		return dni;
	}
	
	public int calcularImc(double peso , double altura){
		
		final int PESO_IDEAL = -1;
		final int BAJO_PESO = 0;
		final int SOBREPESO = 1;
		
		double pesoPromediado =  (peso / altura * 2);
		if(pesoPromediado < 20){
			return PESO_IDEAL;}
		else if(pesoPromediado >= 20 && pesoPromediado <=25) {
			return BAJO_PESO;
		}else {
			return SOBREPESO;
		}
	}

	private int generarDni(int numero) {
		int dni = 0;
		
		dni = (int) Math.floor(Math.random() + numero * 8);
		return dni;
	}
	
	public boolean mayorEdad (int edad) {
		boolean esMayor = edad >= 18;
		if (esMayor){
			System.out.println(this.nombre + " is " + esMayor);
			return true;
		}else 
			System.out.println(this.nombre + " is " + !esMayor);
			return false;
	}
	
	private void comprobarSexo(String sexo) {
		
	if(sexo.equals(sexos[1])) {
		System.out.println("el sexo es " + sexos[1]);
	}else {
		System.out.println("el sexo es " + this.sexo);
	}
}

	@Override
	public String toString() {
		return (this.nombre) + " tiene " + this.edad + " anhos su peso es " + this.peso + " junto con su sexo " + this.sexo + " y su altura "+ this.altura;
	}
}
