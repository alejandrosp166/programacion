package Ejercicio6;

import java.util.*;

public class programaEmpleado {

	static Empleado[] empleados;

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);

		System.out.println("¿Cúantos empleados quieres guardar?");

		int tamanioVec = sn.nextInt();

		while (tamanioVec > 20) {
			System.out.println("El valor introducido no puede ser mayor a 20, dame de nuevo el dato: ");
			tamanioVec = sn.nextInt();
		}

		empleados = new Empleado[tamanioVec];
		sn.nextLine();// Limpiamos el buffer de la variable que recoge los datos

		String casado = "";
		// PEDIMOS LOS DATOS AL USUARIO PARA METERLOS EN EL ARRAY
		for (int i = 0; i < empleados.length; i++) {

			empleados[i] = new Empleado();

			System.out.println("---EMPLEADO NÚMERO: " + (i + 1) + "/" + empleados.length + "---");

			System.out.println("Dame el DNI: ");
			empleados[i].setDni(sn.nextLine());

			System.out.println("Dame el Nombre del empleado: ");
			empleados[i].setNombre(sn.nextLine());

			System.out.println("Dame el sueldo base del empleado: ");
			empleados[i].setSueldoBase(sn.nextInt());

			System.out.println("Dame las horas extras realizadas en este mes: ");
			empleados[i].setHorasExtras(sn.nextInt());

			System.out.println("Dame el IRPF del empleado: ");
			empleados[i].setIrpf(sn.nextInt());

			sn.nextLine();
			System.out.println("¿El empleado está casado? (s/n)");
			casado = sn.nextLine();

			if (casado.equalsIgnoreCase("s") || casado.equalsIgnoreCase("si")) {
				empleados[i].setCasado(true);
			} else {
				empleados[i].setCasado(false);
			}

			System.out.println("Dame el número de hijos del empleado: ");
			empleados[i].setNumeroHijos(sn.nextInt());

			sn.nextLine();
		}

		Empleado maxSueldo = empleados[0];
		Empleado minSueldo = empleados[0];

		Empleado maxHorasExtras = empleados[0];
		Empleado minHorasExtras = empleados[0];
		// SACA EL EMPLEADO QUE MÁS COBRA Y EL QUE MENOS COBRA
		// SACA EL EMPLEADO QUE MÁS COBRA Y EL QUE MENOS POR HORAS EXTRAS
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i].sueldoRetencionesIrpf() > maxSueldo.sueldoRetencionesIrpf()) {
				maxSueldo = empleados[i];
			}

			if (empleados[i].sueldoRetencionesIrpf() < minSueldo.sueldoRetencionesIrpf()) {
				minSueldo = empleados[i];
			}
			//AQUÍ HAY ERRORES, SIEMPRE SACA EL PRIMERO COMO EL QUE MÁS HA COBRADO
			if (empleados[i].complementoHorasExtras() > maxHorasExtras.complementoHorasExtras()) {
				maxHorasExtras = empleados[i];
			}

			if (empleados[i].complementoHorasExtras() < minHorasExtras.complementoHorasExtras()) {
				minHorasExtras = empleados[i];
			}
		}

		System.out.println("EL EMPLEADO QUE MÁS COBRA ES: " + "\n" + maxSueldo.toString());
		System.out.println("EL EMPLEADO QUE MENOS COBRA ES: " + "\n" + minSueldo.toString());
		System.out.println("EL EMPLEADO QUE MÁS COBRA POR HORAS EXTRAS: " + "\n" + maxHorasExtras.toString());
		System.out.println("EL EMPLEADO QUE MENOS COBRA POR HORAS EXTRAS: " + "\n" + minHorasExtras.toString());

		// ORDENA LOS EMPLEADOS POR SUELDO, ESTAMOS USANDO EL MÉTODO DE LA BURBÚJA
		System.out.println("LOS EMPLEADOS ORDENADOR POR SUELDO SON ->");
		Empleado empleado;
		for (int i = 0; i < empleados.length - 1; i++) {

			for (int j = 0; j < empleados.length - i - 1; j++) {

				if (empleados[j].sueldoRetencionesIrpf() > empleados[j + 1].sueldoRetencionesIrpf()) {
					empleado = empleados[j];
					empleados[j] = empleados[j + 1];
					empleados[j + 1] = empleado;
				}
			}
		}

		for (int i = empleados.length - 1; i >= 0 ; i--) {
			System.out.println(empleados[i].toString());
		}

		sn.close();
	}
}