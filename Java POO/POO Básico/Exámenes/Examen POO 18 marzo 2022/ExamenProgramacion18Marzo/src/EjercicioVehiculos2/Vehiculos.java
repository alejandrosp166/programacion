package EjercicioVehiculos2; 
import Fechas.Fecha;

public class Vehiculos {
	private String marca;
	private String matricula;
	private int numsKm;
	private Fecha fechaMatriculacion;
	private String descripcion;
	private double precio;
	private String nombrePropietario;
	private String dniPropietario;
	
	//CONSTRUCTOR SIN PARÁMETROS
	public Vehiculos() {
		
	}
	//CONSTRUCTOR CON PARÁMETROS
	public Vehiculos(String marca, String matricula, int numsKm, Fecha fechaMatriculacion, String descripcion,
			double precio, String nombrePropietario, String dniPropietario) {
		this.marca = marca;
		this.matricula = matricula;
		this.numsKm = numsKm;
		this.fechaMatriculacion = fechaMatriculacion;
		this.descripcion = descripcion;
		this.precio = precio;
		this.nombrePropietario = nombrePropietario;
		this.dniPropietario = dniPropietario;
	}
	//CONSTRUCTOR COPIA
	public Vehiculos(final Vehiculos obj) {
		this.marca = obj.marca;
		this.matricula = obj.matricula;
		this.numsKm = obj.numsKm;
		this.fechaMatriculacion = obj.fechaMatriculacion;
		this.descripcion = obj.descripcion;
		this.precio = obj.precio;
		this.nombrePropietario = obj.nombrePropietario;
		this.dniPropietario = obj.dniPropietario;
	}
	//MÉTODO TO STRING
	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", matricula=" + matricula + ", numsKm=" + numsKm + ", fechaMatriculacion="
				+ fechaMatriculacion + ", descripcion=" + descripcion + ", precio=" + precio + ", nombrePropietario="
				+ nombrePropietario + ", dniPropietario=" + dniPropietario + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNumsKm() {
		return numsKm;
	}
	public void setNumsKm(int numsKm) {
		this.numsKm = numsKm;
	}
	public Fecha getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(Fecha fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	public String getDniPropietario() {
		return dniPropietario;
	}
	public void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	
	public int getAnios() {
		return 1;
	}
}
