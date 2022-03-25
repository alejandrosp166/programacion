package ejercicio4;

public class FraccionesPrograma {

	public static void main(String[] args) {
		Fracciones f1 = new Fracciones(1,4);//1/4
		Fracciones f2 = new Fracciones(1,2);//1/2
		Fracciones f3 = new Fracciones();//0/1
		Fracciones f4 = new Fracciones(4);//4/1
		
		Fracciones suma = f1.sumar(f2);
		Fracciones resta = f1.restar(f3);
		Fracciones mul = f1.multiplicar(f4);
		Fracciones div = f1.dividir(f2);
		
		System.out.println(f1 + " + " + f2 + " = " + suma);
		System.out.println(f1 + " - " + f3 + " = " + resta);
		System.out.println(f1 + " * " + f4 + " = " + mul);
		System.out.println(f1 + " / " + f2 + " = " + div);
	}
}