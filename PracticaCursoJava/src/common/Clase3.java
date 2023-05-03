package common;

import java.util.Scanner;

public class Clase3 {

	public static void main(String[] args) {

		
//		Object[]  array = new Object[10];
//		
//		array[0] = "Hola";
//		array[1] = 23;
//		array[2] = 'a';
//		array[3] = 2.2;
//		
//		System.out.println(array[0] + " \n" + array[1] + " \n" + array[2] + " \n" + array[3]);
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		
		
		
		
		System.out.println("Ingrese el tamaño del arreglo");
		num = sc.nextInt();
		
		int[] arreglo = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Ingrese el digito " + (i+1) + ":");
			arreglo[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < num; i++) {
			suma = suma + arreglo[i];
		}
		System.out.println("La suma del arreglo es " + suma);
	}

}
