package ejercicio1;

public class Programa {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Rafa");
		Directivo d1 = new Directivo("Mario");
		Operario op1 = new Operario("Alfonso");
		Oficial of1 = new Oficial("Luis");
		Tecnico t1 = new Tecnico("Pablo");
		
		System.out.println(e1.toString());
		System.out.println(d1.toString());
		System.out.println(op1.toString());
		System.out.println(of1.toString());
		System.out.println(t1.toString());
	}
}
