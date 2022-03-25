package ejercicio4;

public class Fracciones {
	private int num;
	private int den;

	public Fracciones() {
		num = 0;
		den = 1;
	}

	public Fracciones(int num) {
		this.num = num;
		this.den = 1;
	}

	public Fracciones(int num, int den) {
		// super();
		this.num = num;
		this.den = den;
	}
	
	@Override
	public String toString() {
		return num + "/" + den;
	}

	//SUMAR
	public Fracciones sumar(Fracciones f) {

		int numerador = 0;
		int denominador = 0;
		Fracciones resul = new Fracciones();
		
		if (f.den == this.den) {
			numerador = this.num + f.num;
			denominador = this.den;
		} else {
			denominador = this.den * f.den;
			numerador = (this.num * f.den) + (this.den * f.num);
		}
		
		resul.den = denominador;
		resul.num = numerador;
		return resul.simplificar();

	}
	
	//MULTIPLICAR
	public Fracciones multiplicar(Fracciones f) {
		int numerador = this.num * f.num;
		int denominador = this.den * f.den;
		Fracciones resul = new Fracciones();
		
		resul.num=numerador;
		resul.den=denominador;

		return resul.simplificar();
	}
	
	//DIVIDIR
	public Fracciones dividir(Fracciones f) {
		int numerador = this.num * f.den;
		int denominador = f.num * this.den;
		Fracciones resul = new Fracciones();
		
		resul.num = numerador;
		resul.den = denominador;

		return resul.simplificar();
	}
	
	//RESTAR
	public Fracciones restar(Fracciones f) {
		int numerador = 0;
		int denominador = 0;
		Fracciones resul = new Fracciones();
		
		if (f.den == this.den) {
			numerador = this.num - f.num;
			denominador = this.den;
		} else {
			denominador = this.den * f.den;
			numerador = (this.num * f.den) - (this.den * f.num);
		}
		
		resul.den = denominador;
		resul.num = numerador;
		return resul.simplificar();
	}
	
	//SIMPLIFICAR
	public Fracciones simplificar() {
		Fracciones resul = new Fracciones();
		int mcd = mcd(this.den, this.num);
		
		this.den/=mcd;
		this.num/=mcd;
		
		resul.den=this.den;
		resul.num=this.num;
		return resul;
	}
	
	//MÁXIMO COMÚN DIVIDOR
	public static int mcd(int u, int v) {
		if (v == 0) {
			return u;
		}
		int r;
		while (v != 0) {
			r = u % v;
			u = v;
			v = r;
		}
		return u;
	}
}
