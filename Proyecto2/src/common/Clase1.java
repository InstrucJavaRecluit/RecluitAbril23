package common;

import java.util.Scanner;

public class Clase1 {
	
	public static void main(String[] args) {
		//Arrays (es una estructura est�tica, no se puede redimensionar)
		
//		int[] x = {34,56,00,7,345}; //Con valores desde inicio
//		int[] xx = new int[5]; //Sin valores, solo se indica el tama�o
		
		//Imprimir una posici�n espec�fica del array
//		System.out.println(x[3]);
		
		//Todos los primitivos tienen un valor default
		
		//Agregarle valores al array apuntando al �ndice deseado
		
		//Los arrays no tienen un tipo de dato espec�fico
		
//		xx[0] = 10;
//		xx[1] = 45;
//		xx[2] = 60;
//		xx[3] = 49;
//		xx[4] = 12;
//		xx[0] = 20;
//		
		//Escribir un programa que:
		//Reciba por teclado el tama�o del array
		//Llenar el array con n�meros
		//Realizar sumatoria de esos n�meros
		
//		Scanner lector = new Scanner(System.in);
//		System.out.println("Ingresa el tama�o del array indicado en n�mero:");
//		int num = lector.nextInt();
//		System.out.println("Ingresa "+ num + " n�meros:");
//		int datos = lector.nextInt();
		
		//  0,1,2,3,4,5,6,7,8,9,10
		// [1,2,3,4,5,6,7,8,9,10]
		
//		int[] miArray = new int[num];
//		
//		for(int var = 0; var <=miArray.length; var++) {
//		
//			System.out.println("Ingresa un n�mero:");
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
