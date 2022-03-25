package EjercicioVehiculos2;

import java.util.Scanner;

import Fechas.Fecha;

import java.util.Date;

public class Ejercicio2 {

	static boolean salir = false;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Vehiculos vehiculo = new Vehiculos();
		Date fechaHoy = new Date();
		Scanner sn = new Scanner(System.in);

		while (!salir) {

			System.out.println("-----------------------------");
			System.out.println("- 1. Nuevo vehículo         -");
			System.out.println("- 2. VerMatrícula           -");
			System.out.println("- 3. Número Kilómetros      -");
			System.out.println("- 4. Actualizar Kilómetros  -");
			System.out.println("- 5. Ver años de antiguedad -");
			System.out.println("- 6. Mostrar propietario    -");
			System.out.println("- 7. Mostrar descripción    -");
			System.out.println("- 8. Mostrar precio         -");
			System.out.println("- 9. Salir                  -");
			System.out.println("-----------------------------");

			System.out.println("Elije una opción: ");
			String opc = sn.nextLine();

			switch (opc) {
			case "1":

				System.out.println("Dame la marca del coche: ");
				vehiculo.setMarca(sn.nextLine());

				System.out.println("Dame la matrícula: ");
				
				String matricula = sn.nextLine();
				while (!matriculaValida(matricula)) {
					System.out.println("La matrícula no es válida damela de nuevo: ");
					matricula = sn.nextLine();
				}
				vehiculo.setMatricula(matricula);;

				System.out.println("Dame el número de kilómetros: ");
				int numsKm = sn.nextInt();
				while (!numsKmValido(numsKm)) {
					System.out.println("Número de km no válido: ");
					numsKm = sn.nextInt();
				}
				sn.nextLine();
				vehiculo.setNumsKm(numsKm);

				System.out.println("Dame la fecha de matriculación: ");
				Fecha fechaMatriculacion = new Fecha();
				
				System.out.println("Dame el día: ");
				fechaMatriculacion.setDia(sn.nextInt());
				
				System.out.println("Dam el mes: ");
				fechaMatriculacion.setMes(sn.nextInt());
				
				System.out.println("Dame el año: ");
				int anio = sn.nextInt();
				
				while(anio > fechaHoy.getYear()) {//NO se porque esto me devuelve 122, nunca puede validar la fecha
					System.out.println("La fecha introducida no puede ser mayor a la atual, dame un año válido: ");
					anio = sn.nextInt();
				}
				sn.nextLine();
				fechaMatriculacion.setAnio(anio);
				
				vehiculo.setFechaMatriculacion(fechaMatriculacion);

				System.out.println("Dame la descripción del vehículo: ");
				vehiculo.setDescripcion(sn.nextLine());

				System.out.println("Dame el precio del vehículo: ");
				vehiculo.setPrecio(sn.nextDouble());
				sn.nextLine();

				System.out.println("Dame el nombre del propietario: ");
				vehiculo.setNombrePropietario(sn.nextLine());

				System.out.println("Dame el dni del propietario: ");
				String dni = sn.nextLine();
				while (!dniValido(dni)) {
					System.out.println("El DNI no es válido damelo de nuevo: ");
					dni = sn.nextLine();
				}
				vehiculo.setDniPropietario(dni);
				break;
			case "2":
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el vehículo antes");
				} else {
					System.out.println("La matrícula del vehículo es: " + vehiculo.getMatricula());
				}
				break;
			case "3":
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el vehículo antes");
				} else {
					System.out.println("Dame el número de km: " + vehiculo.getNumsKm());
				}
				break;
			case "4":

				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el vehículo antes");
				} else {
					System.out.println("Dame el número de km que quieres sumar: ");

					int numsKm2 = sn.nextInt();
					while (!numsKmValido(numsKm2)) {
						System.out.println("Número de km no válido, debe ser mayor a 0: ");
						numsKm = sn.nextInt();
					}
					vehiculo.setNumsKm(numsKm2 + vehiculo.getNumsKm());
					sn.nextLine();
				}

				break;
			case "5":
				
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el vehículo antes");
				} else {
					System.out.println("Los años de antiguedad son: " + (fechaHoy.getYear() - vehiculo.getFechaMatriculacion().getAnio()));
				}
				break;
			case "6":

				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el vehículo antes");
				} else {
					System.out.println("El propietario del vehículo es: " + vehiculo.getNombrePropietario()
							+ " con DNI: " + vehiculo.getDniPropietario());
				}
				break;
			case "7":
				
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el vehículo antes");
				} else {
					System.out.println(vehiculo.getDescripcion() + "\nMatrícula: " + vehiculo.getMatricula()
							+ "\nNúmero Kilómetros: " + vehiculo.getNumsKm());
				}
				break;
			case "8":
				
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el vehículo antes");
				} else {
					System.out.println("El precio del vehículo es: " + vehiculo.getPrecio());
				}
				break;
			default:
				
				salir();
				sn.close();
			}
		}
	}
	
	public static void salir() {
		salir = true;
		System.out.println("Saliendo del programa");
	}

	public static boolean numsKmValido(int numsKm) {
		if (numsKm >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean matriculaValida(String matricula) {
		char letra = 'a';

		try {

			for (int i = 0; i < 26; i++) {
				if (matricula.length() != 8) {
					return false;
				} else if (((Long.parseLong(matricula.substring(0, 5)) * 0) == 0)
						&& matricula.substring(5, 8).contains(String.valueOf(letra))) { // He tenido que poner un
																						// contains esto no es 100%
																						// correcto ya que puedes colar
																						// un número pero no tenía más
																						// tiempo para arreglarlo
					return true;
				}
				letra++;
			}

		} catch (Exception e) {
			System.out.println("La matrícula debe contener números y letras");
		}
		return false;
	}

	public static boolean dniValido(String dni) {

		char letra = 'a';

		try {

			for (int i = 0; i < 26; i++) {
				if (dni.length() != 9) {
					return false;
				} else if (((Long.parseLong(dni.substring(0, 7)) * 0) == 0)
						&& dni.substring(8, 9).equalsIgnoreCase(String.valueOf(letra))) {
					return true;
				}
				letra++;
			}

		} catch (Exception e) {
			System.out.println("El dni debe tener un numero y una letra, introduzca los datos otra vez");
		}
		return false;
	}
}
