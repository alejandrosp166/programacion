package Ejercicio11;

import ejercicio5.Fecha;

public class Persona {
	private String nombre;
	private String direccion;
	private String codPostal;
	private String ciudad;
	private Fecha fechaNacimiento;
	
	public Persona(String nombre, String direccion, String codPostal, String ciudad, Fecha fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona() {
		
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
	public String getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Fecha getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + "\n" + "Fecha nacimiento: " + fechaNacimiento + "\n" + "Dirección: " + direccion + " " + codPostal + " " + ciudad;
	}

	public boolean esMayorDeEdad() {
		return true;
	}
}
