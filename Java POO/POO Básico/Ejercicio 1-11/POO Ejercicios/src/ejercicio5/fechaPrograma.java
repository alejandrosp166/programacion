package ejercicio5;

import java.util.Scanner;

public class fechaPrograma {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("INTRODUCE UNA FECHA -> ");

		System.out.println("DIA:");
		int dia = sn.nextInt();
		System.out.println("MES:");
		int mes = sn.nextInt();
		System.out.println("AÑO:");
		int anio = sn.nextInt();

		Fecha fecha = new Fecha(dia, mes, anio);

		if (fecha.fechaCorrecta(fecha)) {
			System.out.println(fecha.toString());
			
			for (int i = 0; i < 10; i++) {
				fecha.diaSiguiente();
				System.out.println(fecha.toString());
			}
		} else {
			System.out.println("La fecha es incorrecta");
		}

		sn.close();
	}
}
