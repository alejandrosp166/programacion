package EjercicioDelLibro;

import java.util.ArrayList;

public class Universidad {
	private ArrayList<Alumno> alumnos;
	private String nombre, direccion;

	public Universidad(String nombre) {
		this.alumnos = new ArrayList<Alumno>();
		this.nombre = nombre;
	}

	public Universidad(String nombre, String direccion) {
		this.alumnos = new ArrayList<Alumno>();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public void anadirAlumno(Alumno alumno) {
		this.alumnos.add(alumno);
	}

	public boolean eliminarAlumno(int idAlumno) {
		for (int i = 0; i < this.alumnos.size(); i++) {
			if (alumnos.get(i).getIdAlumno() == idAlumno) {
				return true;
			}
		}
		return false;
	}

	public String nombreAlumno(int idAlumno) {
		for (int i = 0; i < this.alumnos.size(); i++) {
			if (alumnos.get(i).getIdAlumno() == idAlumno) {
				return alumnos.get(i).getNombre();
			}
		}
		return "No existe un alumno con el id " + idAlumno;
	}
	
	public String apellidosAlumno(int idAlumno) {
		for (int i = 0; i < this.alumnos.size(); i++) {
			if (alumnos.get(i).getIdAlumno() == idAlumno) {
				return alumnos.get(i).getApellidos();
			}
		}
		return "No existe un alumno con el id " + idAlumno;
	}
	
	public String carreraAlumno(int idAlumno) {
		for (int i = 0; i < this.alumnos.size(); i++) {
			if (alumnos.get(i).getIdAlumno() == idAlumno) {
				return alumnos.get(i).getCarrera();
			}
		}
		return "No existe un alumno con el id: " + idAlumno;
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
