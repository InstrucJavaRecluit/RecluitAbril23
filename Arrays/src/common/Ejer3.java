package common;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) throws IOException {
//        Scanner lector = new Scanner(System.in);
//        String texto;
//        int codigo=1;
//        
//        
//            System.out.print(  "Introduce un texto: ");
//            texto = lector.nextLine();
//        
//       
//       
//            System.out.println("Texto cifrado     : " + cifrado(texto, codigo));

		/*
		 * chartAT
		 * 
		 */

		String mensaje = " ESTE ES UN MENSAJE DE 120 PRUEBA";

		System.out.println(mensaje.charAt(15));
		System.out.println(mensaje.length());
		System.out.println(mensaje.substring(15));
		System.out.println(mensaje.substring(5, 20));
		System.out.println(mensaje.toLowerCase());
		System.out.println(mensaje.toUpperCase());
		System.out.println(mensaje.indexOf("A"));
		System.out.println(mensaje.trim());
		String[] arr = mensaje.split(" ");

		System.out.println(arr.length);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(mensaje.lastIndexOf('A'));
		System.out.println(mensaje.lastIndexOf('S'));
		
		char[]array = mensaje.toCharArray();
		System.out.println(Arrays.toString(array));
		
		System.out.println(mensaje.concat(" otro valor"));
		
		System.out.println(mensaje.replace("E", "A"));
		
		

	}

	// método para cifrar el texto
	public static String cifrado(String texto, int codigo) {
		StringBuilder cifrado = new StringBuilder();

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'y') {
				if ((texto.charAt(i) + codigo) > 'y') {
					cifrado.append((char) (texto.charAt(i) + codigo - 1));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Y') {
				if ((texto.charAt(i) + codigo) > 'Y') {
					cifrado.append((char) (texto.charAt(i) + codigo - 1));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= '0' && texto.charAt(i) <= '8') {
				if ((texto.charAt(i) + codigo) > '8') {
					cifrado.append((char) (texto.charAt(i) + codigo - 1));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= ' ' && texto.charAt(i) <= ' ') {
				if ((texto.charAt(i) + codigo) > ' ') {
					cifrado.append((char) (texto.charAt(i) + codigo - 1));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= '-' && texto.charAt(i) <= '-') {
				if ((texto.charAt(i) + codigo) > '-') {
					cifrado.append((char) (texto.charAt(i) + codigo - 1));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= 'Z' && texto.charAt(i) <= 'Z') {
				if ((texto.charAt(i) + codigo) > 'Z') {
					cifrado.append((char) (texto.charAt(i) + codigo - 26));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= 'z' && texto.charAt(i) <= 'z') {
				if ((texto.charAt(i) + codigo) > 'z') {
					cifrado.append((char) (texto.charAt(i) + codigo - 26));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= '9' && texto.charAt(i) <= '9') {
				if ((texto.charAt(i) + codigo) > '9') {
					cifrado.append((char) (texto.charAt(i) + codigo - 10));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			}

		}
		return cifrado.toString();
	}

}
