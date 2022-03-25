package ejercicio3;

public class Programa {

	public static void main(String[] args) {
		
		Repartidor repartidor = new Repartidor("Alejandro", 24, 700.5, "zona 3");
		Comercial comercial = new Comercial("Pepe", 45, 1000, 201);
		
		repartidor.plus();
		comercial.plus();
		
		System.out.println(comercial.toString());
		System.out.println(repartidor.toString());
	}

}
