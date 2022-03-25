//import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
estar almacenada en una variable.*/
		
		//String e = JOptionPane.showInputDialog("Instroduce el número de pesetas");
		//int euros = Integer.parseInt(e);
		
		//De la manera que utilizamos arriba estamos haciendo el programa con entrada de datos
		
		int euros = 1;
		int ptas = (euros*1000)/6;
		
		System.out.print(ptas+" Es el número de euros en pesetas");
	}

}

//Sacar por pantalla los datos
//El otro método vale si usamos un diálogo de texto
//scanner sn =new scanner(system.in);
//int num = sn.nextInt();
//next.line para leer la línea directamente
//String x = sn.next.line();
