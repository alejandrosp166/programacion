package ejercicio2;

public class Rectangulo extends Poligono {
	private double lado1;
	private double lado2;
	
	public Rectangulo(double lado1, double lado2) {
		super(2);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double area() {
		return this.lado1 * this.lado2;
	}

	@Override
	public String toString() {
		return super.toString() + " Rectángulo [lado1=" + lado1 + ", lado2=" + lado2 + "]";
	}
}
