package Recursive;

public class OrderNumberCrecientDecrecient {

//	Crea un método que imprima los dígitos desde N hasta 1. Se debe pasar como parámetro el número N
	
	public static void Order (int n) {
		if(n <= 0) {
			return;
		}
		
		System.out.println(n);
		 Order(n - 1);
		
	}
	
	public static void main(String[] args) {
		Order(50);
	}
}
