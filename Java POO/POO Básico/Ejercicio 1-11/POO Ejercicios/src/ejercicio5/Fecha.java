package ejercicio5;

public class Fecha {
	private int dia, mes, anio;

	public Fecha() {

	}

	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	@Override
	public String toString() {

		String resul = "";
		if (this.dia < 10) {
			resul += "0" + this.dia + "-";
		} else {
			resul += this.dia + "-";
		}

		if (this.mes < 10) {
			resul += "0" + this.mes + "-";
		} else {
			resul += this.mes + "-";
		}

		return resul += this.anio;
	}

	// DIA
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	// MES
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	// AÑO
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean fechaCorrecta(Fecha f) { 
		if ((f.dia > 0 && f.dia < 32) && (f.mes > 0 && f.mes < 13)) {
			if((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && this.dia == 31) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	private boolean esBisiesto(int anio) {
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean esMayorQue(Fecha f) {
		return true;
	}

	public void diaSiguiente() {
		
		this.dia++;
		if (this.mes == 2) {
			
			if (esBisiesto(this.anio) && this.dia > 28) {
				this.dia = 1;
				this.mes++;
			} else if(!esBisiesto(this.anio) && this.dia > 29) {
				this.dia=1;
				this.mes++;
			}
		} else if(this.dia == 32) {
			if(this.mes == 12) {
				this.mes = 1;
				this.anio++;
			} else {
				this.mes++;
			}
			this.dia = 1;
		} else if((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && this.dia >= 31) {
			this.mes++;
			this.dia = 1;
		}
	}
}