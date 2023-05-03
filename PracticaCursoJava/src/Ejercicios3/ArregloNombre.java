package Ejercicios3;

import java.util.Scanner;

public class ArregloNombre {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre");
		String nombre = sc.nextLine();
		
		
		
		char[] letras = nombre.toCharArray();
		
		String[] nom = new String[letras.length];
		
		//al usar toCharArray parte el string y nos facilita remplazar la letra con la siguienre en el abecedario
		for (int i = 0; i < letras.length; i++) {
			
			char sigLetra = 	(char) (letras[i]+1);
				nom[i] = String.valueOf(sigLetra);
				
				
				
				if (letras[i] == ' ') {
					nom[i] = "-";
				}
				
				if (letras[i] == 'z') {
					nom[i] = "a";
				}
		}
		
			System.out.println("El nombre ingresado es: " + nombre);
			System.out.println("La siguiente letra del abecedario es: ");
			for (String letra : nom) {
				System.out.print(letra);
			}
	}

}
