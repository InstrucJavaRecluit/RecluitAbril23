package common;

import java.util.Scanner;

public class Cinco {
	public static void main(String[] args) {

		System.out.println("Simulacion de comportamiento de Reloj Digital: \n");

		for (int h = 00; h <= 23; h++) {
			for (int m = 00; m <= 59; m++) {
				for (int s = 00; s <= 59; s++) {
					System.out.println(h + ":" + m + ":" + s);
				}
			}
		}
		System.out.println("Simulacion finalizada.");

	}

}
