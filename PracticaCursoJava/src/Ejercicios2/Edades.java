package Ejercicios2;

import java.util.Scanner;

public class Edades {

	public static void main(String[] args) {

	      Scanner entrada = new Scanner(System.in);

	      int n = 0;
	      int sumaEdades = 0; 
	      int edad; 
	      double promedioEdades; 

	      do {
	         System.out.print("Ingrese una edad: ");
	         edad = entrada.nextInt();

	         sumaEdades += edad;
	         n++;

	         promedioEdades = sumaEdades / n;

	      } while (promedioEdades <= 25);

	      System.out.println("El promedio de las edades ingresadas es: " + promedioEdades);
	   }

}
