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
			System.out.println("- 1. Nuevo veh�culo         -");
			System.out.println("- 2. VerMatr�cula           -");
			System.out.println("- 3. N�mero Kil�metros      -");
			System.out.println("- 4. Actualizar Kil�metros  -");
			System.out.println("- 5. Ver a�os de antiguedad -");
			System.out.println("- 6. Mostrar propietario    -");
			System.out.println("- 7. Mostrar descripci�n    -");
			System.out.println("- 8. Mostrar precio         -");
			System.out.println("- 9. Salir                  -");
			System.out.println("-----------------------------");

			System.out.println("Elije una opci�n: ");
			String opc = sn.nextLine();

			switch (opc) {
			case "1":

				System.out.println("Dame la marca del coche: ");
				vehiculo.setMarca(sn.nextLine());

				System.out.println("Dame la matr�cula: ");
				
				String matricula = sn.nextLine();
				while (!matriculaValida(matricula)) {
					System.out.println("La matr�cula no es v�lida damela de nuevo: ");
					matricula = sn.nextLine();
				}
				vehiculo.setMatricula(matricula);;

				System.out.println("Dame el n�mero de kil�metros: ");
				int numsKm = sn.nextInt();
				while (!numsKmValido(numsKm)) {
					System.out.println("N�mero de km no v�lido: ");
					numsKm = sn.nextInt();
				}
				sn.nextLine();
				vehiculo.setNumsKm(numsKm);

				System.out.println("Dame la fecha de matriculaci�n: ");
				Fecha fechaMatriculacion = new Fecha();
				
				System.out.println("Dame el d�a: ");
				fechaMatriculacion.setDia(sn.nextInt());
				
				System.out.println("Dam el mes: ");
				fechaMatriculacion.setMes(sn.nextInt());
				
				System.out.println("Dame el a�o: ");
				int anio = sn.nextInt();
				
				while(anio > fechaHoy.getYear()) {//NO se porque esto me devuelve 122, nunca puede validar la fecha
					System.out.println("La fecha introducida no puede ser mayor a la atual, dame un a�o v�lido: ");
					anio = sn.nextInt();
				}
				sn.nextLine();
				fechaMatriculacion.setAnio(anio);
				
				vehiculo.setFechaMatriculacion(fechaMatriculacion);

				System.out.println("Dame la descripci�n del veh�culo: ");
				vehiculo.setDescripcion(sn.nextLine());

				System.out.println("Dame el precio del veh�culo: ");
				vehiculo.setPrecio(sn.nextDouble());
				sn.nextLine();

				System.out.println("Dame el nombre del propietario: ");
				vehiculo.setNombrePropietario(sn.nextLine());

				System.out.println("Dame el dni del propietario: ");
				String dni = sn.nextLine();
				while (!dniValido(dni)) {
					System.out.println("El DNI no es v�lido damelo de nuevo: ");
					dni = sn.nextLine();
				}
				vehiculo.setDniPropietario(dni);
				break;
			case "2":
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el veh�culo antes");
				} else {
					System.out.println("La matr�cula del veh�culo es: " + vehiculo.getMatricula());
				}
				break;
			case "3":
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el veh�culo antes");
				} else {
					System.out.println("Dame el n�mero de km: " + vehiculo.getNumsKm());
				}
				break;
			case "4":

				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el veh�culo antes");
				} else {
					System.out.println("Dame el n�mero de km que quieres sumar: ");

					int numsKm2 = sn.nextInt();
					while (!numsKmValido(numsKm2)) {
						System.out.println("N�mero de km no v�lido, debe ser mayor a 0: ");
						numsKm = sn.nextInt();
					}
					vehiculo.setNumsKm(numsKm2 + vehiculo.getNumsKm());
					sn.nextLine();
				}

				break;
			case "5":
				
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el veh�culo antes");
				} else {
					System.out.println("Los a�os de antiguedad son: " + (fechaHoy.getYear() - vehiculo.getFechaMatriculacion().getAnio()));
				}
				break;
			case "6":

				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el veh�culo antes");
				} else {
					System.out.println("El propietario del veh�culo es: " + vehiculo.getNombrePropietario()
							+ " con DNI: " + vehiculo.getDniPropietario());
				}
				break;
			case "7":
				
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el veh�culo antes");
				} else {
					System.out.println(vehiculo.getDescripcion() + "\nMatr�cula: " + vehiculo.getMatricula()
							+ "\nN�mero Kil�metros: " + vehiculo.getNumsKm());
				}
				break;
			case "8":
				
				if (vehiculo.getNombrePropietario() == null && vehiculo.getNombrePropietario() == null) {
					System.out.println("Debes introducir datos en el veh�culo antes");
				} else {
					System.out.println("El precio del veh�culo es: " + vehiculo.getPrecio());
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
																						// un n�mero pero no ten�a m�s
																						// tiempo para arreglarlo
					return true;
				}
				letra++;
			}

		} catch (Exception e) {
			System.out.println("La matr�cula debe contener n�meros y letras");
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
