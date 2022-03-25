package ejercicio2;

public abstract class Poligono {
	
	private int numsLados;

	public Poligono(int numsLados) {
		this.numsLados = numsLados;
	}
	
	public int getNumsLados() {
		return numsLados;
	}

	@Override
	public String toString() {
		return "Lados -> " + numsLados;
	}
	
	public abstract double area();
}
