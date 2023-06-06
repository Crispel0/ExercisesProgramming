package POO;

public class PruebaLibro {
	public static void main(String[] args) {
	
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		
		libro1.setIsbn(1578946);
		libro1.setTitulo("Detras Del Ultimo No hay Nadie");
		libro1.setAutor("CristoPalo");
		libro1.setNumeroPaginas(100);
		libro2.setIsbn(1578947);
		libro2.setTitulo("Hojas que del arbol son");
		libro2.setAutor("Alambrado");
		libro2.setNumeroPaginas(100);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		System.out.println();
		
	
		if(libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
			System.out.println("el libro " + libro1.getTitulo() + " tiene mas paginas que " + libro2.getTitulo() + " con una diferencia de " + (libro1.getNumeroPaginas() - libro2.getNumeroPaginas()) + " paginas" );
		}else if(libro1.getNumeroPaginas() == libro2.getNumeroPaginas()) {
			
			System.out.println("el libro " + libro1.getTitulo() + " tiene la misma cantidad de paginas que " + libro2.getTitulo());
		}
		else {
			System.out.println("el libro " + libro2.getTitulo() + " tiene mas paginas que " + libro1.getTitulo() + " con una diferencia de " + (libro2.getNumeroPaginas() - libro1.getNumeroPaginas()) + " paginas");
		}
	}
	
}
