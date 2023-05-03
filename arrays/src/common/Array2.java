package common;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		int t;
		int suma = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese el tamaño del arreglo");
		 t = sc.nextInt();
		 int arr[] =new int[t];
		 
for (int i = 0; i< arr.length; i++) {
	System.out.println("ingrese el valor del cada elemento");
	arr[i]=sc.nextInt();
	suma = suma +arr[i];
}
System.out.println("la suma es:" +suma);
	}
	

}
