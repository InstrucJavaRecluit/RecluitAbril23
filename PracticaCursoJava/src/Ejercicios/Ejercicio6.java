package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		int alumno;
		double pagoCompañia;
		double costoAlumno;
		
		
		
		System.out.println("Ingrese la cantidad de alumnos que iran al viaje");
		alumno = lector.nextInt();
		
		if (alumno >= 100) {
			costoAlumno = 65;
		}else if (alumno >= 50 && alumno <= 99) {
			costoAlumno = 70;
		}else if (alumno >= 30 && alumno <= 49) {
			costoAlumno = 95;
		}else {
			costoAlumno = 4000.00 / alumno;
		}
			
		pagoCompañia = alumno * costoAlumno;
		
		System.out.println("Costo por alumno es: " + costoAlumno + "euros");
		System.out.println("El pago del viaje es de: " + pagoCompañia);
		
		
	}

}
