package common;

import java.io.IOException;
import java.util.Scanner;

public class Cuatro {
	 public static void main(String[] args) throws IOException {
		 Scanner lector = new Scanner(System.in);
		 System.out.println("programa que me diga el num de letras en una frase: \n");
	        String texto;
	        char caracter;
	        int numeroDeVeces = 0;
	        do {
	            System.out.println("Introduce texto: ");
	            texto = lector.nextLine();
	        } while (texto.isEmpty());
	        System.out.print("Introduce un car�cter: ");
	        caracter = (char) System.in.read();
	        numeroDeVeces = contarCaracteres(texto, caracter);
	        System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");                   
	    }

	    //calcular el n�mero de veces que se repite un car�cter en un String
	    public static int contarCaracteres(String cadena, char caracter) {
	        int posicion, contador = 0;
	        //se busca la primera vez que aparece
	        posicion = cadena.indexOf(caracter);
	        while (posicion != -1) { //mientras se encuentre el caracter
	            contador++;           //se cuenta
	            //se sigue buscando a partir de la posici�n siguiente a la encontrada
	            posicion = cadena.indexOf(caracter, posicion + 1);
	        }
	        return contador;
	    }

}
