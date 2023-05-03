package common;

import java.util.Scanner;

public class Clase1 {
	
	public static void main(String[] args) {
		//Arrays (es una estructura estática, no se puede redimensionar)
		
//		int[] x = {34,56,00,7,345}; //Con valores desde inicio
//		int[] xx = new int[5]; //Sin valores, solo se indica el tamaño
		
		//Imprimir una posición específica del array
//		System.out.println(x[3]);
		
		//Todos los primitivos tienen un valor default
		
		//Agregarle valores al array apuntando al índice deseado
		
		//Los arrays no tienen un tipo de dato específico
		
//		xx[0] = 10;
//		xx[1] = 45;
//		xx[2] = 60;
//		xx[3] = 49;
//		xx[4] = 12;
//		xx[0] = 20;
//		
		//Escribir un programa que:
		//Reciba por teclado el tamaño del array
		//Llenar el array con números
		//Realizar sumatoria de esos números
		
//		Scanner lector = new Scanner(System.in);
//		System.out.println("Ingresa el tamaño del array indicado en número:");
//		int num = lector.nextInt();
//		System.out.println("Ingresa "+ num + " números:");
//		int datos = lector.nextInt();
		
		//  0,1,2,3,4,5,6,7,8,9,10
		// [1,2,3,4,5,6,7,8,9,10]
		
//		int[] miArray = new int[num];
//		
//		for(int var = 0; var <=miArray.length; var++) {
//		
//			System.out.println("Ingresa un número:");
//			miArray[var] = lector.nextInt();
//			
//		}
//		
		
//		String[][] matriz = new String[3][4];
//		
//		matriz[0][0] = "A";
//		matriz[0][1] = "B";
//		matriz[0][2] = "C";
//		matriz[0][3] = "D";
//		
//		matriz[1][0] = "E";
//		matriz[1][1] = "F";
//		matriz[1][2] = "G";
//		matriz[1][3] = "H";
//		
//		matriz[2][3] = "?";
		
		//Llenar mediante ciclos
		
		
		int filas = 3;
		int columnas = 4;
		int[][] matriz = new int[filas][columnas];

		for (int i = 0; i < filas; i++) {
		    for (int j = 0; j < columnas; j++) {
		        matriz[i][j] = i + j; // Asigna a cada celda el valor de la suma de la fila y la columna
		    }
		}

		
		
		
	}

}
