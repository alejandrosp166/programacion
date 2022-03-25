package ejercicio2;

public class contadorPrograma {

	public static void main(String[] args) {
		contador cont = new contador();
		cont.incrementar();
		System.out.println("El valor de cont1 es -> " + cont.toString());

		for (int i = 0; i < 2; i++) {
			cont.incrementar();
		}

		System.out.println("El valor de cont1 es -> " + cont.toString());
		cont.decrementar();
		System.out.println("El valor de cont1 es -> " + cont.toString());

		contador cont2 = new contador(10);
		cont2.incrementar();
		cont2.decrementar();

		System.out.println("El valor de cont2 es -> " + cont2);

		contador cont3 = new contador(cont2);
		System.out.println("El valor de cont3 es -> " + cont3.toString());
	}
}
