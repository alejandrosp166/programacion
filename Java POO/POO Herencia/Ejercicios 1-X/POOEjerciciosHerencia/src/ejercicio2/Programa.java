package ejercicio2;
import java.util.*;

public class Programa {
	static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
	static Scanner sn = new Scanner(System.in);

	public static void main(String[] args) {
		llenarArray();
	}
	
	public static void llenarArray() {

		boolean salir = false;
		while(!salir) {
			System.out.println("--------------------------");
			System.out.println("1. Introducir triángulo  -");
			System.out.println("2. Introducir rectángulo -");
			System.out.println("3. Mostrar los polígonos -");
			System.out.println("4. Salir                 -");
			System.out.println("--------------------------");
			System.out.println("INTRODUZCA UNA OPCIÓN: ");
			String opc = sn.nextLine();
			
			switch (opc) {
			case "1":
				llenarTriangulo();
				break;
			case "2":
				llenarRectangulo();
				break;
			case "3":
				mostrarPoligonos();
				break;
			case "4":
				salir = true;
				sn.close();
				break;
			default:
				System.out.println("ERROR // NO SE RECONOCIÓ EL COMANDO INTRODUCIDO");
				break;
			}
		}
	}
	
	public static void llenarTriangulo() {
		
		System.out.println("Dame los lados de los triangulos: ");
		
		Triangulo triangulo = new Triangulo(sn.nextDouble(), sn.nextDouble(), sn.nextDouble());
		poligonos.add(triangulo);
		sn.nextLine();
	}
	
	public static void llenarRectangulo() {
		
		System.out.println("Dame los lados de los triangulos: ");
		
		Rectangulo triangulo = new Rectangulo(sn.nextDouble(), sn.nextDouble());
		poligonos.add(triangulo);
		sn.nextLine();
	}
	
	public static void mostrarPoligonos() {
		for (Poligono poligonos : poligonos) {
			System.out.println(poligonos.toString());
		}
	}
}
