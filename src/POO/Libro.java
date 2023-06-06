package POO;

public class Libro {
//		 «El libro con ISBN creado por el autor tiene páginas»
//
//		 En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.
//
//		 Por último, indicar cuál de los 2 tiene más páginas.
	 private int isbn;
	 private String titulo;
	 private String autor;
	 private int numeroPaginas;

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	@Override
	public String toString() {
	return "el isbn del libro es " + this.isbn + " siendo el nombre " + this.titulo +  " y el autor " + this.autor + " por ultimo la cantidad de paginas del libro son " + this.numeroPaginas;
	}
	 
	}
