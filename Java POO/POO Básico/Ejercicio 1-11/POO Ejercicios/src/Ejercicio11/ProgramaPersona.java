package Ejercicio11;

import java.util.*;

import ejercicio5.Fecha;

public class ProgramaPersona {

	static Persona[] arrayPersonas = new Persona[5];
	static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		leerPersonas();
		if(numeroPersonas() > 0) {
			System.out.println("Las personas introducidas son: ");
			mostrarPersonas();
			System.out.println("La persona de mayor edad es: ");
		}
	}

	public static void leerPersonas() {
		for (int i = 0; i < numeroPersonas(); i++) {
			System.out.println("INTRODUZCA LOS DATOS DE LA PERSONA " + (i + 1) + "/" + arrayPersonas.length);
			System.out.println("----------------------------------\n");
			System.out.println("Dame el nombre completo de la persona: ");
			arrayPersonas[i].setNombre(sn.nextLine());

			System.out.println("Dame la fecha de nacimiento de la persona: ");
			System.out.println("Dia: ");
			int dia = sn.nextInt();
			System.out.println("Mes: ");
			int mes = sn.nextInt();
			System.out.println("Año: ");
			int anio = sn.nextInt();
			Fecha fechaNac = new Fecha(dia, mes, anio);
			arrayPersonas[i].setFechaNacimiento(fechaNac);

			System.out.println("Dame la dirección de la persona: ");
			arrayPersonas[i].setDireccion(sn.nextLine());

			System.out.println("Dame el código postal de la persona: ");
			arrayPersonas[i].setCodPostal(sn.nextLine());

			System.out.println("Dame la ciudad de la persona: ");
			arrayPersonas[i].setCiudad(sn.nextLine());
		}
	}

	public static void mostrarPersonas() {
		for (int i = 0; i < numeroPersonas(); i++) {
			System.out.println(arrayPersonas[i].toString());
		}
	}

	public Persona personaMayorEdad() {
		Fecha mayorEdad = arrayPersonas[0].getFechaNacimiento();
		Persona personaMayorEdad = new Persona();
		
		for (int i = 0; i < numeroPersonas(); i++) {
			if (arrayPersonas[i].getFechaNacimiento().esMayorQue(mayorEdad)) {
				mayorEdad = arrayPersonas[i].getFechaNacimiento();
				personaMayorEdad = arrayPersonas[i];
			}
		}
		return personaMayorEdad;
	}

	public static int personaMayoresDeEdad() {
		Date fechaHoy = new Date();
		@SuppressWarnings("deprecation")
		Fecha fechaMayoriaEdad = new Fecha(fechaHoy.getDate(), fechaHoy.getMonth() + 1, fechaHoy.getYear() - 18);
		int contMayorEdad = 0;

		for (int i = 0; i < numeroPersonas(); i++) {
			if (arrayPersonas[i].getFechaNacimiento().esMayorQue(fechaMayoriaEdad)) {
				contMayorEdad++;
			}
		}
		return contMayorEdad;
	}

	public static int cuantasPersonasVivenEn(String ciudad) {
		int cont = 0;
		for (int i = 0; i < numeroPersonas(); i++) {
			if (arrayPersonas[i].getCiudad().equalsIgnoreCase(ciudad)) {
				cont++;
			}
		}
		return cont;
	}

	public static int numeroPersonas() {
		return arrayPersonas.length;
	}
}
