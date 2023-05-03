package Ejercicios2;

public class Reloj {

	public static void main(String[] args) {

		int hora, minutos,segundos;
		
		for (hora = 0; hora < 24; hora++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					System.out.println(hora + ":" + minutos + ":" + segundos);
				}
			}
			
		}
	
	}
		
}


