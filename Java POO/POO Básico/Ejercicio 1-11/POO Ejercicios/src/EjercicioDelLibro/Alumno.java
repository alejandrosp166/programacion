package EjercicioDelLibro;

public class Alumno {
	private String nombre, apellidos, carrera;
	private int edad, idAlumno;
	
	public Alumno(String nombre, String apellidos, String carrera, int idAlumno) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.carrera = carrera;
		this.idAlumno = idAlumno;
	}

	public Alumno(String nombre, String apellidos, String carrera, int edad, int idAlumno) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.carrera = carrera;
		this.edad = edad;
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
}
