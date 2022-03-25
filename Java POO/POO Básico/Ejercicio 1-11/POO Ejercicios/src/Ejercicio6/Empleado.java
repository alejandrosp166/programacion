package Ejercicio6;

public class Empleado {
	private String dni;
	private String nombre;
	private int sueldoBase;
	private int horasExtras;
	private int irpf;
	private Boolean casado;
	private int numeroHijos;
	private static int importeHorasExtras;

	public Empleado() {
		
	}

	public Empleado(String dni) {
		super();
		this.dni = dni;
	}

	@Override
	public String toString() {
		String casado = "";

		if (this.casado) {
			casado = "S";
		} else {
			casado = "N";
		}

		return dni + " " + nombre + "\nSueldo base: " + sueldoBase + "\nHoras Extras: " + horasExtras + "\nTipo IRPF: "
				+ irpf + "\nCasado=" + casado + "\nNumero Hijos: " + numeroHijos + "\n";
	}

	public int sueldoRetencionesIrpf() {
		int porcentajeIrpf = this.irpf - numeroHijos;

		if (this.casado) {
			porcentajeIrpf -= 2;
		}

		porcentajeIrpf /= 100;

		return sueldoBruto() - (sueldoBruto() * porcentajeIrpf); //FINALMENTE LE HACEMOS LAS RESTRICIONES
	}

	public int sueldoBruto() {
		return this.sueldoBase + complementoHorasExtras(); //LE SUMAMOS AL SUELDO BASE EL COMPLEMENTO DE LAS HORAS EXTRAS
	}

	public int complementoHorasExtras() {
		return this.horasExtras * importeHorasExtras; //CALCULA EL DINERO QUE SE LLEVA DE LAS HORAS EXTRAS
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public Boolean getCasado() {
		return casado;
	}

	public void setCasado(Boolean casado) {
		this.casado = casado;
	}

	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	public static int getImporteHorasExtras() {
		return importeHorasExtras;
	}

	public static void setImporteHorasExtras(int importeHorasExtras) {
		Empleado.importeHorasExtras = importeHorasExtras;
	}

}
