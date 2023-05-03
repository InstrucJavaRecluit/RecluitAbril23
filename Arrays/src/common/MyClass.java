package common;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
//		String cifrado = "";
//		String texto = "";
//		
//		String[] abc = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "ñ", "o", "p", "q", "r",
//				"s", "t", "u", "v", "w", "x", "y", "z" };		
//		String numeros = "1234567890";		
//		String letra = "";		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Ingresa el texto");
//		texto = sc.nextLine().toLowerCase();
//		
//		// Iterar sobre el texto para obtener una letra a la vez
//		for (int i = 0; i < texto.length(); i++) {
//			
//			letra = Character.toString(texto.charAt(i));
//		
//			// Caso especial: z
//			if (letra.equals("z")) { 
//				cifrado = cifrado + "a";
//			} else if (numeros.indexOf(letra) >= 0) { //Determino si son numeros
//				cifrado = cifrado + (Integer.parseInt(letra) + 1);
//			} else if (letra.equals(" ")) {//Determino si es un espacio en blanco
//				cifrado = cifrado + "-";
//			} else { //Si no, ahora tengo que determinar en que posicion del abc está esta letra
//				// Iterar sobre el abc para encontrar la posicion de esa letra
//				for (int j = 0; j < abc.length; j++) {
//					if (letra.equals(abc[j])) {
//						cifrado = cifrado + abc[j + 1];
//					}
//				}
//			}
//		}	
//		System.out.println(cifrado);
		
		
		//INVESTIGAR BREVEMENTE ESTOS METODOS
		/*
		 * charAt
		 * substring(arg0)
		 * substring(arg0,arg1)
		 * toLowerCase
		 * toUppers
		 * indexOf
		 * trim
		 * split
		 * lastIndexOf
		 * toCharArray
		 * concat
		 * replace
		 * length
		 */
		
		
		
		String mensaje=" ESTE ES UN MENSAJE DE 120 PRUEBA ";
		
		System.out.println(mensaje.charAt(15));
		System.out.println(mensaje.length());
		System.out.println(mensaje.substring(15));
		System.out.println(mensaje.substring(5, 20));
		System.out.println(mensaje.toLowerCase());
		System.out.println(mensaje.toUpperCase());
		System.out.println(mensaje.indexOf("A"));
		System.out.println(mensaje.trim());
		String[] arr = mensaje.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(mensaje.lastIndexOf('A'));
		System.out.println(mensaje.lastIndexOf("S"));
		char[] array = mensaje.toCharArray();
		System.out.println(Arrays.toString(array));
		System.out.println(mensaje.concat("otro valor"));		
		System.out.println(mensaje.replace("E", "X"));
		
		//Leer y escribir archivos Java
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
