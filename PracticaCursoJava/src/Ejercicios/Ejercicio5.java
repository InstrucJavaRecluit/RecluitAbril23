package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		double precioInicial;
		char tipo;
		int tama�o;
		double precioFinal = 0;

		System.out.println("Ingrese el precio inicial al kilo de uva");
		precioInicial = lector.nextDouble();

		System.out.println("Ingrese el tipo de clasificacion A/B");
		tipo = lector.next().charAt(0);

		System.out.println("Ingrese el tama�o 1 o 2");
		tama�o = lector.nextInt();

		if (tipo == 'A' && tama�o == 1) {
			precioFinal = precioInicial + 0.20;
		} else if (tipo == 'A' && tama�o == 2) {

			precioFinal = precioInicial + 0.30;
		} else {
			System.out.println("Error");
		}
		if (tipo == 'B' && tama�o == 1) {
			precioFinal = precioInicial + 0.30;
		}
		if (tipo == 'B' && tama�o == 2) {
			precioFinal = precioInicial + 0.50;
		} else {
			System.out.println("Error");
		}

		System.out.println("El precio Final de la uva es: " + precioFinal);
	}

}
