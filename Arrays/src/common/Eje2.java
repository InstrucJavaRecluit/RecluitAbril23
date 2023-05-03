package common;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Eje2 {
	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		String[][] matriz1 = new String[3][3];
		String[][] matriz2 = new String[3][3];
		int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];
		
		// llena matriz 1
		System.out.println("Matriz 1");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.println("Ingrese dato: [" + i + "] , [" + j + "] : ");
				matriz1[i][j] = lector.nextLine();

			}
		}
		// llena matriz 2
		System.out.println("Matriz 2");

		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.println("Ingrese dato: [" + i + "] , [" + j + "] : ");
				matriz2[i][j] = lector.nextLine();

			}
		}

		// muestra matriz 1
		System.out.println("muestra Matriz 1");
		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1[i].length; j++) {
				System.out.print(matriz1[i][j] + "  ");

			}
			System.out.println();
		}

		// muestra matriz 2
		System.out.println("muestra Matriz 2");
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + "  ");

			}
			System.out.println();
		}






		for (int i = 0; i < matriz1.length; i++) {
			for (int j = 0; j < matriz1.length; j++) {
				
				try {
					int arregloB= Integer.parseInt(matriz1[i][j]);
					int arregloA= Integer.parseInt(matriz2[i][j]);
					matrizSuma[i][j] = arregloA + arregloB;
					
							
				}catch(NumberFormatException e) {
					matrizSuma[i][j]=0;
				}
			}
		}

		
		System.out.println();
		System.out.println("MATRIZ SUMA");

		for (int y = 0; y < matrizSuma.length; y++) {

			for (int x = 0; x < matrizSuma[y].length; x++) {
				System.out.print(matrizSuma[y][x] + " ");
			}

			System.out.println();
		}

	}

}
