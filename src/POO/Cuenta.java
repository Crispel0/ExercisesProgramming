package POO;

public class Cuenta {
	
	/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
	El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
	Crea sus métodos get, set y toString.
	Tendrá dos métodos especiales:
	ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
	retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
	*/
	
	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta("Carlos", 0);
		
		cuenta.ingresarCantidad(30);
		
		System.out.println(cuenta.getCantidad());
		
		cuenta.retirarCantidad(-12);
		
		System.out.println(cuenta.getCantidad());

	}

	String titular;
	double cantidad;
	
	public Cuenta(String titular) {
		this.titular = titular;
	}
	
	public Cuenta(String titular, double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresarCantidad (int cantidad) {
		if(!(cantidad < 0)) {
			setCantidad(cantidad);
		}
	}
	
	public void retirarCantidad (int cantidad) {
		if(cantidad < 0) {
			setCantidad(0);
		}
	}
	
	public String toString() {
		return "El titular de la cuenta es" + this.titular + "y la cantidad de que tiene el titular es" + this.cantidad;
	}
	
}

