package ejercicio3;

public class libro {
	private String titulo;
	private String autor;
	private int numeroEjemplares;
	private int numeroEjemplaresPrestados;

	// CONSTRUCTOR POR DEFECTO
	public libro() {

	}

	// CONSTRUCTOR POR PARÁMETROS
	public libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
		// super();
		this.titulo = titulo;
		this.autor = autor;
		this.numeroEjemplares = numeroEjemplares;
		this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
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

	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares = numeroEjemplares;
	}

	public int getNumeroEjemplaresPrestados() {
		return numeroEjemplaresPrestados;
	}

	public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
		this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
	}

	public boolean prestamo() {
		if (this.numeroEjemplares <= 0) {
			System.out.println("El préstamo no se ha realizado con éxito");
			return false;
		} else {
			System.out.println("El préstamo se realizó correctamente");
			this.numeroEjemplares--;
			this.numeroEjemplaresPrestados++;
			return true;
		}
	}

	public boolean devolucion() {
		if (this.numeroEjemplaresPrestados <= 0) {
			System.out.println("La devolución no se ha realizado con éxito");
			return false;
		} else {
			System.out.println("La devolución se realizó correctamente");
			this.numeroEjemplares++;
			this.numeroEjemplaresPrestados--;
			return true;
		}
	}

	@Override
	public String toString() {
		return "libro [titulo=" + titulo + ", autor=" + autor + ", numeroEjemplares=" + numeroEjemplares
				+ ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados + "]";
	}
}
