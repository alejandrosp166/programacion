package ejercicio2;

public class contador {

	private int cont;
	
	//CONSTRUCTOR POR DEFECTO
	public contador() {
		//cont = 0;
	}
	
	//CONSTRUCTOR POR PARÁMETROS
	public contador(int cont) {
		// super();
		this.cont = cont;
	}
	
	//CONSTRUCTOR COPIA
	public contador(final contador obj) {
		cont = obj.cont;
	}

	@Override
	public String toString() {
		return cont + " segundos";
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	public int incrementar() {
		return this.cont++;
	}

	public int decrementar() {
		this.cont--;
		if (this.cont < 0) {
			this.cont = 0;
		}
		return this.cont;
	}
}
