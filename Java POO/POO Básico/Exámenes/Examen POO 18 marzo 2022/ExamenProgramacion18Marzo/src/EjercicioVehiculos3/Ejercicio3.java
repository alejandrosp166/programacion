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
		//MEN�
		while (!salir) {
			System.out.println("-----------------------------");
			System.out.println("- 1. Nuevo veh�culo         -");
			System.out.println("- 2. Listar veh�culos       -");
			System.out.println("- 3. Buscar veh�culos       -");
			System.out.println("- 4. Modificar Kms          -");
			System.out.println("- 5. Salir                  -");
			System.out.println("-----------------------------");
			System.out.println("Elije una opci�n: ");
			String opc = sn.nextLine();
			switch (opc) {
			case "1":
				System.out.println("Dame la marca del coche: ");
				String marca = sn.nextLine();

				System.out.println("Dame la matr�cula: ");
				String matricula = sn.nextLine();
				while (!EjercicioVehiculos2.Ejercicio2.matriculaValida(matricula)) {
					System.out.println("El DNI no es v�lido damelo de nuevo: ");
					matricula = sn.nextLine();
				}

				System.out.println("Dame el n�mero de kil�metros: ");
				int numsKm = sn.nextInt();
				while (!EjercicioVehiculos2.Ejercicio2.numsKmValido(numsKm)) {//USAMOS LOS M�TODOS ANTERIORES
					System.out.println("N�mero de km no v�lido: ");
					numsKm = sn.nextInt();
				}
				sn.nextLine();

				System.out.println("Dame la fecha de matriculaci�n: ");
				Fecha fechaMatriculacion = new Fecha();

				System.out.println("Dame el d�a: ");
				fechaMatriculacion.setDia(sn.nextInt());

				System.out.println("Dam el mes: ");
				fechaMatriculacion.setMes(sn.nextInt());

				System.out.println("Dame el a�o: ");
				int anio = sn.nextInt();

				while (anio > fechaHoy.getYear()) { //No se porque pasa lo de la fecha hoy (me devuelve 122)
					System.out.println("La fecha introducida no puede ser mayor a la atual");
					anio = sn.nextInt();
				}
				sn.nextLine();
				fechaMatriculacion.setAnio(anio);

				System.out.println("Dame la descripci�n del veh�culo: ");
				String descripcion = sn.nextLine();

				System.out.println("Dame el precio del veh�culo: ");
				double precio = sn.nextDouble();
				sn.nextLine();

				System.out.println("Dame el nombre del propietario: ");
				String nombre = sn.nextLine();

				System.out.println("Dame el dni del propietario: ");
				String dni = sn.nextLine();
				while (!EjercicioVehiculos2.Ejercicio2.dniValido(dni)) {
					System.out.println("El DNI no es v�lido damelo de nuevo: ");
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
					System.out.println("La matr�cula ya existe");
				}
				break;
			case "2":
				listarVehiculos();
				break;
			case "3":
				System.out.println("Dame una matr�cula: ");
				String varAux = buscarVehiculo(sn.nextLine());
				if (varAux == null) {
					System.out.println("No se encontr� un matr�cula con esos par�metros");
				} else {
					System.out.println(varAux);
				}
				break;
			case "4":
				System.out.println("Dame una matr�cula: ");
				matricula = sn.nextLine();
				
				System.out.println("Dame los kil�metros: ");
				int kms = sn.nextInt();
				
				if(actualizarKms(matricula, kms)== false) {
					System.out.println("No se pudo hacer la operaci�n");
				}
				sn.nextLine();
				break;
			case "5":
				salir = true;
				sn.close();
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("OPCI�N NO V�LIDA");
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
