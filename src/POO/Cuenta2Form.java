package POO;

public class Cuenta2Form {
	/*Crea una clase llamada Cuenta que tendrá los siguientes atributos: titular y cantidad (puede tener decimales).
	El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.
	Crea sus métodos get, set y toString.
	Tendrá dos métodos especiales:
	ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
	retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.
	*/
	public static void main(String[] args) {
		Cuenta2Form cuentaCarlos = new Cuenta2Form("Carlos", 20);
		Cuenta2Form cuentaMaria = new Cuenta2Form("Maria", 20);
		
		cuentaCarlos.agregarCantidad(20);
		cuentaMaria.agregarCantidad(30);
		
		System.out.println(cuentaCarlos.toString());
		System.out.println(cuentaMaria.toString());
		
		cuentaCarlos.retirarCantidad(50);
		cuentaMaria.retirarCantidad(60);
		
		System.out.println(cuentaCarlos.toString());
		System.out.println(cuentaMaria.toString());
	}
	
	private String titular;
	private double cantidad;
	
	public Cuenta2Form(String titular, int cantidad){
		this.titular = titular;
		this.cantidad = cantidad;
		if(cantidad < 0) {
			cantidad = 0;
		}else {
			this.cantidad = cantidad;
		}
	}
	
	public double agregarCantidad(double cantidad) {
		if(cantidad > 0) {
			return this.cantidad += cantidad;
		}
		else return this.cantidad;
	}
	
	public double retirarCantidad(double cantidad) {
		if(this.cantidad - cantidad < 0) {
			return this.cantidad = 0;
		}
		else return this.cantidad - cantidad;
	}
	
	@Override
	public String toString() {
		return "el titular De la cuenta es " + this.titular + " y la cantidad de su cuenta es " + this.cantidad;
	}
}


