package EjercicioDelLibro;

import java.util.*;

public class ProgramaUniversidad {

	public static void main(String[] args) {
		Universidad universidad1 = new Universidad("Universidad 1");
		int opc = 0;
		boolean salir = false;
		Scanner sn = new Scanner(System.in);

		while (!salir) {
			System.out.println("SISTEMA DE ALUMNOS DE LA UNIVERSIDAD");
			System.out.println("ELIJE UNA DE LAS OPCIONES PROPUESTAS: ");
			System.out.println("(1) Dar de alta a un alumno del sistema");
			System.out.println("(2) Dar de baja a un alumno del sistema");
			System.out.println("(3) Información del alumno");
			System.out.println("(4) Listar todos los alumnos del sistema");
			System.out.println("(5) Salir del programa");

			opc = sn.nextInt();

			switch (opc) {

			case 1:
				System.out.println("Introduce el nombre del alumno: ");
				sn.nextLine();
				String nombre = sn.nextLine();
				System.out.println("Introduce los apellidos del alumno: ");
				String apellidos = sn.nextLine();
				System.out.println("Introduce el ID del Alumno: ");
				int idAlumno = sn.nextInt();
				boolean repetido = false;

				if (universidad1.getAlumnos().size() > 0) {
					while (!repetido) {
						for (int i = 0; i < universidad1.getAlumnos().size(); i++) {
							if (universidad1.getAlumnos().get(i).getIdAlumno() == idAlumno) {
								repetido = true;
							}
						}

						if (repetido) {
							System.out.println("El ID introducido ya existe dentro del sistema");
							System.out.println("Vuelve a introducir el ID del alumno: ");
							idAlumno = sn.nextInt();
							repetido = false;
						}
					}
				}

				sn.nextLine();
				System.out.println("Introduce la carrera del alumno: ");
				String carrera = sn.nextLine();

				universidad1.anadirAlumno(new Alumno(nombre, apellidos, carrera, idAlumno));
				break;

			case 2:
				System.out.println("Introduce el ID del alumno: ");
				int alumnoEliminar = sn.nextInt();

				if (universidad1.eliminarAlumno(alumnoEliminar)) {
					System.out.println("El alumno se eliminó correctamente del sistema");
				} else {
					System.out.println("El alumno no existe dentro del sistema");
				}
				break;
			
			case 3:
				System.out.println("Introduce el ID del alumno: ");
				int alumnoInfor = sn.nextInt();
				
				System.out.println("(1) Obtener nombre");
				System.out.println("(3) Obtener apellidos");
				System.out.println("(3) Obtener carrera");
				
				int infor = sn.nextInt();
				
				switch(infor){
				
				case 1:
					System.out.println(universidad1.nombreAlumno(alumnoInfor));
					break;
				case 2:
					System.out.println(universidad1.apellidosAlumno(alumnoInfor));
					break;
				case 3:
					System.out.println(universidad1.carreraAlumno(alumnoInfor));
				}
				break;
			case 4:
				System.out.println("Lista del alumnados de la universidad");
				System.out.println("-------------------------------------");
				
				for(int i=0;i<universidad1.getAlumnos().size();i++) {
					System.out.println();
				}
				break;
			case 5:
				salir = true;
				System.out.println("Saliendo del sistema");
				break;
			default:
				System.out.println("Comando desconocido");
			}
		}
		sn.close();
	}
}
