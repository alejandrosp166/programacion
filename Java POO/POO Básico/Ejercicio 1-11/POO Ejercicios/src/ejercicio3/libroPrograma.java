package ejercicio3;
import java.util.*;
public class libroPrograma {

	public static void main(String[] args) {
		libro libro1 = new libro("El Quijote","Cervantes", 1, 0);
		libro libro2 = new libro();
		Scanner sn = new Scanner(System.in);
		
		System.out.println("DAME EL TÍTULO DEL LIBRO 2: ");
		libro2.setTitulo(sn.nextLine());
		System.out.println("DAME EL AUTOR DEL LIBRO 2: ");
		libro2.setAutor(sn.nextLine());
		System.out.println("DAME EL NÚMERO DE EJEMPLARES DEL LIBRO 2: ");
		libro2.setNumeroEjemplares(sn.nextInt());
		System.out.println("DAME EL NÚMERO DE EJEMPLARES PRESTADOS DEL LIBRO 2: ");
		libro2.setNumeroEjemplaresPrestados(sn.nextInt());
		
		System.out.println("EL OBJETO LIBRO 1 TIENE LAS SIGUIENTES CARACTERÍSTICAS: ");
		System.out.println(libro1.toString());
		
		libro1.prestamo();
		libro1.devolucion();
		libro1.prestamo();
		libro1.prestamo();
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		sn.close();
	}

}
