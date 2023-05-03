package common;

import java.util.Scanner;

public class Clase3_1 {

	public static void main(String[] args) {

		int[][] array = new int[3][4];
		
//		int[][] matriz = {{1,2,3},{4,5,6,},{4,5,6,}};
		
		Scanner lector = new Scanner(System.in);
		
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Ingrese un numero");
				array[i][j] = lector.nextInt();
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
