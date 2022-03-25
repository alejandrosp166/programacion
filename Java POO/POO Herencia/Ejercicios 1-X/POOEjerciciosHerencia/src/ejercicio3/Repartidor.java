package ejercicio3;

public class Repartidor extends Empleado {

	private String zona;

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public void plus() {
		if (super.getEdad() < 25 && this.zona.equals("zona 3")) {
			super.setSalario(super.getSalario() + super.getPlus());
		}
	}

	@Override
	public String toString() {
		return super.toString() + " Repartidor [zona=" + zona + "]";
	}
}
