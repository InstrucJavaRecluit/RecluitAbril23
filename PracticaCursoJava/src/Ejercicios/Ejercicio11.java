package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);

		double montoDonacion, centroSalud, comedorNinos, inversionBolsa;
		
		
		System.out.println("Ingrese el monto de la Donacion");
		montoDonacion = lector.nextDouble();
		
		if (montoDonacion >=10000) {
			
			comedorNinos = montoDonacion * 0.3;
			centroSalud = montoDonacion * 0.5;
			inversionBolsa = montoDonacion - centroSalud - comedorNinos;
			
		}else {
			
			centroSalud = montoDonacion * 0.25;
			comedorNinos = montoDonacion * 0.6;
			inversionBolsa = montoDonacion - centroSalud - comedorNinos;
		}
		
		System.out.println("Monto destinado al centro de salud " + centroSalud );
		System.out.println("Monto destinado al comedor para niños " + comedorNinos);
		System.out.println("Monto destinado a la inversion en bolsa " + inversionBolsa);
		
	}

}
