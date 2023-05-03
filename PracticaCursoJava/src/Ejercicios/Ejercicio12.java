package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
	      int horasTrabajadas;
	      double salarioSemanal;

	      System.out.print("Introduce las horas trabajadas esta semana: ");
	      horasTrabajadas = sc.nextInt();

	      if (horasTrabajadas <= 40) {
	         salarioSemanal = horasTrabajadas * 16;
	      } else {
	         salarioSemanal = 40 * 16 + (horasTrabajadas - 40) * 20;
	      }

	      System.out.println("El salario semanal es de: " + salarioSemanal);
	   }
		
	}


