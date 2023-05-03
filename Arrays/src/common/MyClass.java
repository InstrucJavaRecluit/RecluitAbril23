package common;

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		
		//Arrays  es una estructura estatica
		/*
		int[] x = {34,56,00,7,345}; //Con valores desde el incio
		String[] xx = new String [5];
		
		//Imprimir unaposicion especifica del array
		System.out.println(x[3]);	
		
		//Agregar valores al array
		xx[0] = "a";
		xx[1] = "texto";
		xx[2] = "      ";
		xx[3] = "1234567";
		xx[4] = "ññlñ";
		
		//Arrays no tienen un tipo de dato especifico
		
		System.out.println(xx[3]);
				
		//declarar array que le quepa cualquier cosa
		Object[] array = new Object[10];
		
		array[0] = 56;
		array[1] = "Hola";
		array[2] = 32.86;
		array[3] = false;
		array[4] = 'b';
		*/
		///////////////////////////////////////////
		/*
		//Escribir un programa que:
		//REciba por teclado el tamaño del array
		//llenar el arraycon numeros
		//sumatoria de los numeros
		
		   Scanner lector = new Scanner(System.in);
	        int i;
	        double suma = 0;                    
	        
	        System.out.println("Ingrese el tamaño del arreglo: ");
	        int tama = lector.nextInt(); 
	        
	        int[] numeros = new int[tama];
	        
	        System.out.println("Lectura de los elementos del array: ");
	        for (i = 0; i < tama; i++) {
	            System.out.print("Posición [" + i + "]= ");
	            numeros[i]=lector.nextInt();
	        }

	        
	        for (i = 0; i < tama; i++) {
	                suma += numeros[i];
	               
	            } 
	        System.out.println("\nLa suma de los numeros es: "+suma);
	        */
	        /////////////////////////////////////////////////////////////
		
		//arrays bidimensionales
		//						   filas,columnas
		//String[][] matriz= new String[3][4];
		String[][] matriz2= new String[3][4];
		
//		matriz [0][0]= "x";
//		matriz [0][1]= "2";
//		matriz [0][2]= "7";
//		matriz [0][3]= "4";
//		
//		matriz [1][0]= "k";
//		matriz [1][1]= "8";
//		matriz [1][2]= "v";
//		matriz [1][3]= "9";
//		
//		matriz [2][0]= "x";
//		matriz [2][1]= "x";
//		matriz [2][2]= "x";
//		matriz [2][3]= "?";
		
		Scanner lector = new Scanner(System.in);
		
		   for (int i = 0; i < matriz2.length; i++) {
		        for (int j = 0; j < matriz2[i].length; j++) {
		            System.out.println("Ingrese dato: ["+i+"] , ["+j+"] : ");
		            matriz2[i][j] = lector.nextLine();
		            
		        }
		    }
		   
		   for (int i = 0; i < matriz2.length; i++) {
			    for (int j = 0; j < matriz2[i].length; j++) {
	            System.out.print(matriz2[i][j]+" ");
	            
	            
			    }
			    System.out.println();
	        }
				
	}

}
