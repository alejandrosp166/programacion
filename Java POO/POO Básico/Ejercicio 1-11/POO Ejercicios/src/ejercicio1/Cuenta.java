package ejercicio1;

public class Cuenta {

	private String nombreCliente;
	private String numeroCuenta;
	private double interes;
	private double saldo;

	public Cuenta() {

	}

	// CONSTRUCTOR DE PARÁMETROS
	public Cuenta(String nombreCliente, String numeroCuenta, double interes, double saldo) {
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.interes = interes;
		this.saldo = saldo;
	}

	// CONSTRUCTOR COPIA
	public Cuenta(final Cuenta objetoCuneta) {
		nombreCliente = objetoCuneta.nombreCliente;
		numeroCuenta = objetoCuneta.numeroCuenta;
		interes = objetoCuneta.interes;
		saldo = objetoCuneta.saldo;
	}

	@Override
	public String toString() {
		return "Los datos del usuario son:\n\nNombre Cliente -> " + nombreCliente + "\nNúmero Cuenta -> " + numeroCuenta
				+ "\nInterés -> " + interes + "\nSaldo -> " + saldo + "\n";
	}

	// NOMBRE CLIENTE
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	// NUMERO CUENTA
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	// INTERES
	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	// SALDO
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean integrarSaldo(double saldo) {
		if (saldo < 0) {
			return false;
		} else {
			this.saldo = this.saldo + saldo;
			return true;
		}
	}

	public boolean reintegrarSaldo(double saldo) {
		if (this.saldo < 0) {
			return false;
		} else {
			this.saldo -= saldo;
			return true;
		}
	}

	public boolean transferencia(final Cuenta cuentaDestino, double importe) {
		if ((this.saldo - importe) < 0) {
			return false;
		} else {
			this.saldo -= importe;
			cuentaDestino.saldo += importe;
			return true;
		}
	}
}
