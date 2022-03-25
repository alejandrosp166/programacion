package Ejercicio8;

public class Pizza {
	private String tamanio; // mediana o familiar
	private String tipo; // margarita, cuatro quesos o funghi
	private String estado = "Pedida"; // pedida o servida, por defecto es pedida
	static int pizzasPedidas = 0; // número que se se suma cuando una pizza es pedia
	static int pizzasServidas = 0; // número que se suma si una pizza es servida

	public Pizza(String tamanio, String tipo) {
		this.tamanio = tamanio;
		this.tipo = tipo;
		pizzasPedidas++;
	}

	public void servir() {
		if (this.estado == "servida") {
			System.out.println("La pizza ya se ha servido");
		} else {
			this.estado = "servida";
			pizzasServidas++;
		}
	}

	@Override
	public String toString() {
		return "Pizza " + tamanio + " " + tipo + " " + estado + "\n";
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static int getPizzasPedidas() {
		return pizzasPedidas;
	}

	public static void setPizzasPedidas(int pizzasPedidas) {
		Pizza.pizzasPedidas = pizzasPedidas;
	}

	public static int getPizzasServidas() {
		return pizzasServidas;
	}

	public static void setPizzasServidas(int pizzasServidas) {
		Pizza.pizzasServidas = pizzasServidas;
	}

}
