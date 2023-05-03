package common;

import java.util.Scanner;

public class Tres {
	public static void main(String[]args) {
					
		        Scanner lector= new Scanner(System.in);
		        System.out.println("programa que me diga si la frase es palindorma: \n");
		        System.out.print("Introduce una frase: ");
		        String frase=lector.nextLine();
		        
		       
		        System.out.print(frase);
		        int fin = frase.length()-1;
		        int ini=0;
		        boolean espalin=true;
		        
		        while(ini < fin){
		            if(frase.charAt(ini)!=frase.charAt(fin)){
		                espalin=false;
		            }
		        ini++;
		        fin--;
		        }
		        if(espalin)
		            System.out.print("\nEs palindromo.");
		        else
		            System.out.print("\nNo es palindromo.");
		        
		    
	}

}
