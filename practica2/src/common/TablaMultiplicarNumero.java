package common;

import java.util.Scanner;

public class TablaMultiplicarNumero {
	public static void main(String[] args) {
        
	       int Multiplicando ;
	       System.out.println("¿Que tabla desea Realizar?");
	       Scanner valor1 = new Scanner(System.in);
	       Multiplicando = valor1.nextInt();
	    
	       int multiplicador;
	       for(multiplicador = 1; multiplicador <=95; multiplicador++){
	       System.out.println(Multiplicando + " X " + multiplicador +         " = " + Multiplicando * multiplicador );
	         }  
	    }

}
