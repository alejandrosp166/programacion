package EjercicioVehiculos3;

import java.util.Date;
import java.util.Scanner;

import EjercicioVehiculos2.Vehiculos;
import Fechas.Fecha;

public class Ejercicio3 {

	static Vehiculos[] vehiculo = new Vehiculos[50];
	static int insercion = 0;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		boolean salir = false;
		Scanner sn = new Scanner(System.in);
		Date fechaHoy = new Date();
		//MENÚ
		while (!salir) {
			System.out.println("-----------------------------");
			System.out.println("- 1. Nuevo vehículo         -");
			System.out.println("- 2. Listar vehículos       -");
			System.out.println("- 3. Buscar vehículos       -");
			System.out.println("- 4. Modificar Kms          -");
			System.out.println("- 5. Salir                  -");
			System.out.println("-----------------------------");
			System.out.println("Elije una opción: ");
			String opc = sn.nextLine();
			switch (opc) {
			case "1":
				System.out.println("Dame la marca del coche: ");
				String marca = sn.nextLine();

				System.out.println("Dame la matrícula: ");
				String matricula = sn.nextLine();
				while (!EjercicioVehiculos2.Ejercicio2.matriculaValida(matricula)) {
					System.out.println("El DNI no es válido damelo de nuevo: ");
					matricula = sn.nextLine();
				}

				System.out.println("Dame el número de kilómetros: ");
				int numsKm = sn.nextInt();
				while (!EjercicioVehiculos2.Ejercicio2.numsKmValido(numsKm)) {//USAMOS LOS MÉTODOS ANTERIORES
					System.out.println("Número de km no válido: ");
					numsKm = sn.nextInt();
				}
				sn.nextLine();

				System.out.println("Dame la fecha de matriculación: ");
				Fecha fechaMatriculacion = new Fecha();

				System.out.println("Dame el día: ");
				fechaMatriculacion.setDia(sn.nextInt());

				System.out.println("Dam el mes: ");
				fechaMatriculacion.setMes(sn.nextInt());

				System.out.println("Dame el año: ");
				int anio = sn.nextInt();

				while (anio > fechaHoy.getYear()) { //No se porque pasa lo de la fecha hoy (me devuelve 122)
					System.out.println("La fecha introducida no puede ser mayor a la atual");
					anio = sn.nextInt();
				}
				sn.nextLine();
				fechaMatriculacion.setAnio(anio);

				System.out.println("Dame la descripción del vehículo: ");
				String descripcion = sn.nextLine();

				System.out.println("Dame el precio del vehículo: ");
				double precio = sn.nextDouble();
				sn.nextLine();

				System.out.println("Dame el nombre del propietario: ");
				String nombre = sn.nextLine();

				System.out.println("Dame el dni del propietario: ");
				String dni = sn.nextLine();
				while (!EjercicioVehiculos2.Ejercicio2.dniValido(dni)) {
					System.out.println("El DNI no es válido damelo de nuevo: ");
					dni = sn.nextLine();
				}

				if (insertarVehiculo(marca, matricula, numsKm, fechaMatriculacion, descripcion, precio, dni,
						nombre) == 0) {
					System.out.println("Se insertaron los datos correctamente");
				} else if (insertarVehiculo(marca, matricula, numsKm, fechaMatriculacion, descripcion, precio, dni,
						nombre) == -1) {
					System.out.println("Concesionario lleno");
				} else if (insertarVehiculo(marca, matricula, numsKm, fechaMatriculacion, descripcion, precio, dni,
						nombre) == -2) {
					System.out.println("La matrícula ya existe");
				}
				break;
			case "2":
				listarVehiculos();
				break;
			case "3":
				System.out.println("Dame una matrícula: ");
				String varAux = buscarVehiculo(sn.nextLine());
				if (varAux == null) {
					System.out.println("No se encontró un matrícula con esos parámetros");
				} else {
					System.out.println(varAux);
				}
				break;
			case "4":
				System.out.println("Dame una matrícula: ");
				matricula = sn.nextLine();
				
				System.out.println("Dame los kilómetros: ");
				int kms = sn.nextInt();
				
				if(actualizarKms(matricula, kms)== false) {
					System.out.println("No se pudo hacer la operación");
				}
				sn.nextLine();
				break;
			case "5":
				salir = true;
				sn.close();
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("OPCIÓN NO VÁLIDA");
				break;
			}
		}
	}

	public static int insertarVehiculo(String marca, String matricula, int numsKm, final Fecha fechaMatriculacion,
			String descripcion, double precio, String dni, String nombre) {
		for (int i = 0; i < insercion; i++) {
			if (matricula.equals(vehiculo[insercion].getMatricula())) {
				return -2;
			}
		}

		if (insercion > 49) {
			return -1;
		} else {
			vehiculo[insercion] = new Vehiculos();
			vehiculo[insercion].setDescripcion(descripcion);
			vehiculo[insercion].setDniPropietario(dni);
			vehiculo[insercion].setFechaMatriculacion(fechaMatriculacion);
			vehiculo[insercion].setMarca(marca);
			vehiculo[insercion].setMatricula(matricula);
			vehiculo[insercion].setNombrePropietario(nombre);
			vehiculo[insercion].setNumsKm(numsKm);
			vehiculo[insercion].setPrecio(precio);
			insercion++;
		}
		return 0;
	}

	public static String buscarVehiculo(String matricula) {
		for (int i = 0; i < insercion; i++) {
			if (matricula.equals(vehiculo[i].getMatricula())) {
				return vehiculo[i].toString();
			}
		}
		return null;
	}

	public static void listarVehiculos() {
		for (int i = 0; i < insercion; i++) {
			System.out.println(vehiculo[i].toString());
		}
	}

	public static boolean actualizarKms(String matricula, int kms) {
		for (int i = 0; i < insercion; i++) {
			if (matricula.equals(vehiculo[i].getMatricula())) {
				vehiculo[insercion].setNumsKm(kms);
				return true;
			}
		}
		return false;
	}
}
