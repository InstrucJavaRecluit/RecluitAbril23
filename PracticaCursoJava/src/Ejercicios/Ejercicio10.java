package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
        
		
		
		System.out.print("Introduce tu peso en kg: ");
        double peso = lector.nextDouble();
        System.out.print("Introduce tu altura en metros: ");
        double altura = lector.nextDouble();
        
       
        double imc = peso / (altura * altura);
        System.out.println("Tu IMC es: " + imc);
        

        
        if (imc < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Bajo peso");
        }else if (imc >= 18 && imc < 25) {
            System.out.println("Peso normal (SALUDABLE)");
		}else if (imc >= 25 && imc < 30) {
            System.out.println("Sobre Peso (OBESIDAD DE GRADO 1)");
		}else if (imc >= 30 && imc < 35) {
            System.out.println("Sobre peso cronico (OBESIDAD DE GRADO 2)");
		}else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad premorbida (OBESIDAD GRADO 3)");
		} else {
            System.out.println("Obesidad morbida (OBESIDAD DE GRADO 4)");
        }
    }

		
	}

