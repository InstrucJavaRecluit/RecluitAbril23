package common;

import java.util.Scanner;

public class Nombre {
	
	public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingresa tu nombre:");
        String cadena = lector.nextLine();
        StringBuilder siguiente = new StringBuilder();

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == 'z') {
                siguiente.append('a');
            } else if (caracter == 'Z') {
                siguiente.append('A'); 
            } else if(caracter == ' ') {
                siguiente.append('-');	
            
            } else if (Character.isLetter(caracter)) {
                char siguienteCaracter = (char) (caracter + 1);
                siguiente.append(siguienteCaracter);
            } else {
            	int var = Integer.parseInt(Character.toString(caracter))+1;
                siguiente.append(caracter);
            }
        }

        System.out.println("El siguiente caracter de cada letra es: " + siguiente);
    }
}

	



