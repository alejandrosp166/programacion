package ejercicio3;

public class Comercial extends Empleado {

	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public String toString() {
		return super.toString() + " Comercial [comision=" + comision + "]";
	}

	@Override
	public void plus() {
		if (super.getEdad() > 30 && this.comision > 200) {
			super.setSalario(super.getSalario() + super.getPlus());
		}
	}
}
