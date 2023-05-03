package common2;

import java.util.Scanner;

public class arrayDosDimensiones {
 public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 System.out.println("ingrese el tamaño de la columna del arreglo");
	 int c = sc.nextInt();
	 System.out.println("ingrese el tamaño de la fila arreglo");
	 int f = sc.nextInt();
	int arreglo [][] =new int [c][f];
	
//	creamos el arreglo
	
	for (int i = 0; i < arreglo.length; i++) {
	 for (int j = 0; j < arreglo.length; j++) {
		 System.out.println("ingresa un arreglo");
		 arreglo[i][j] = sc.nextInt();
		
		
	}
	 
	}
//	mostramos el arreglo
	
	for (int i = 0; i < arreglo.length; i++) {
		 for (int j = 0; j < arreglo.length; j++) {
			
			System.out.print(arreglo[i][j]);
		}
		 System.out.println();
		}
}
 
}
