package Ejericicio7;

public class Disco {
	private String autor, titulo, genero, codigo = "LIBRE";
	private double duracion;
	
	//CONSTRUCTOR POR DEFECTO
	public Disco() {
	
	}
	
	//CONSTRUTOR CON PARÁMETROS
	public Disco(String autor, String titulo, String genero, int duracion) {
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	//CONSTRUCTOR COPIA
	public Disco(Disco disco) {
		this.autor = disco.autor;
		this.titulo = disco.titulo;
		this.genero = disco.genero;
		this.duracion = disco.duracion;
	}
	
	

	@Override
	public String toString() {
		return "Disco [autor=" + autor + ", titulo=" + titulo + ", genero=" + genero + ", codigo=" + codigo
				+ ", duracion=" + duracion + "]\n";
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
}