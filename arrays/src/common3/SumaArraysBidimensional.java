package common3;

import java.util.Scanner;

public class SumaArraysBidimensional {
	public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        String primeraMatriz[][] = new String[3][3];
        String segundaMatriz[][] = new String[3][3];
        int matrizResultadoSuma[][] = new int[3][3];
        
        			
        
        //Llenamos la primera matriz
        System.out.println("Digite los elementos de la primera matriz");
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3; j++){
                System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] : ");
                primeraMatriz[i][j] = teclado.next();
            }
        }
        
        System.out.println("");
        
        //Llenamos la segunda matriz
        System.out.println("Digite los elementos de la segunda matriz");
        for(int i = 0;i < 3; i++){
            for(int j = 0;j < 3; j++){
                System.out.print("Digite un elemento en la posicion ["+i+"]["+j+"] : ");
                segundaMatriz[i][j] = teclado.next();
            }
        }
        
        //Sumamos las matrices
        for(int i = 0;i < primeraMatriz.length; i++){
            for(int j = 0;j < segundaMatriz.length; j++){
            	
            	try {
    				

					int matriz1 = Integer.parseInt(primeraMatriz[i][j]);
					int matriz2 = Integer.parseInt(segundaMatriz[i][j]);
					matrizResultadoSuma[i][j] = matriz1 + matriz2;
				
					
					
				} catch (NumberFormatException e) {
					matrizResultadoSuma[i][j] = 0;
				}

//                matrizResultadoSuma[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
            }
        }
        
        
        System.out.println("");
        
        //Imprimos las matrices
        System.out.println("la suma de las matrices es : ");
        for(int i = 0;i < primeraMatriz.length; i++){
            for(int j = 0;j < primeraMatriz.length; j++){
                System.out.print(" [ " + primeraMatriz[i][j] + " ] ");
                
                
            }
            
            if(i == 1){
                System.out.print("     +    ");
            }
            else{
                System.out.print("          ");
            }
            
            for(int j = 0;j < segundaMatriz.length; j++){
                System.out.print(" [ " + segundaMatriz[i][j] + " ] ");
            }
            
            if(i == 1){
                System.out.print("     =    ");
            }
            else{
                System.out.print("          ");
            }
            
            for(int j = 0;j < matrizResultadoSuma.length; j++){
                System.out.print(" [ " + matrizResultadoSuma[i][j] + " ] ");
            }
            
            System.out.println("");
        }
	}
}
        
        