package ejercicio1;

import java.util.*;

public class cuentaPrograma {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta("Juan Fernández Rubio", "1234567890", 1.75, 300);
		Scanner sn = new Scanner(System.in);

		System.out.println("DAME EL NOMBRE DEL CLIENTE: ");
		cuenta1.setNombreCliente(sn.nextLine());

		System.out.println("DAME EL NÚMERO DE CUENTA DEL CLIENTE: ");
		cuenta1.setNumeroCuenta(sn.nextLine());

		System.out.println("DAME EL INTERÉS DEL CLIENTE: ");
		cuenta1.setInteres(sn.nextDouble());

		System.out.println("DAME EL SALDO DEL CLIENTE: ");
		cuenta1.setSaldo(sn.nextDouble());

		System.out.println(cuenta1.toString());
		Cuenta cuenta3 = new Cuenta(cuenta1);

		// INGRESO DE DINERO
		System.out.println("\nHagamos un ingreso a la cuenta 1, dame el valor que quieres ingresar: ");

		while (cuenta1.integrarSaldo(sn.nextDouble()) == false) {
			System.out.println("El valor no puede ser negativo, vuelva a introducir el dato");
		}

		System.out.println("El saldo de cuenta1 ha aumentado a: " + cuenta1.getSaldo() + "\n");
		/*
		 * //REINTEGRO DE DINERO System.out.
		 * println("\nHagamos un reintegro, dame el valor que quieres reintegrar: ");
		 * 
		 * if(cuenta1.reintegrarSaldo(sn.nextDouble()) == false) { System.out.
		 * println("No se puedo reintegrar el valor introducido ya que el saldo actual de la cuenta es: "
		 * + cuenta1.getSaldo()); } else {
		 * System.out.println("El saldo ha disminuido ha: " + cuenta1.getSaldo()); }
		 */
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());

		// TRANSFERENCIA DE DINERO DE UNA CUENTA A OTRA
		System.out.println("Vamos a hacerle una transferencia ha la cuenta de: \n" + cuenta2.getNombreCliente() + "\nDame el valor que le quieres ingresar");
		if (cuenta3.transferencia(cuenta2, sn.nextDouble()) == false) {
			System.out.println("No se puede hacer la transferencia porque el saldo de la cuenta do origen es insuficiente");
			System.out.println("El saldo de la cuenta3 es de: " + cuenta3.getSaldo());
		} else {
			System.out.println("La transferencia se ha realizado correctamente: ");
			System.out.println(cuenta2.toString());
			System.out.println("\nEl saldo de cuenta3 es ahora de: " + cuenta3.getSaldo());
		}
		sn.close();
	}
}
