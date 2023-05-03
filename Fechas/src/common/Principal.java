package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {

		// Intenta
		try {
			String[] dias = { "PRIMERO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", "DIEZ",
					"ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISEIS", "DIECISIETE", "DIECIOCHO", "DIECINUEVE",
					"VEINTE", "VEINTIUN", "VENTIDOS", "VEINTITRES", "VEINTICUATRO", "VEINTICINCO", "VEINTISEIS",
					"VEINTISIETE", "VEINTIOCHO", "VEINTINUEVE", "TREINTA", "TREINTA Y UNO" };
			String[] meses = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
					"OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };

			String fecha = "";

			String linea = "";

			File archivo = new File("C:\\Users\\vale_\\Desktop\\Ejercicio\\fechas.txt");
			File archivo2 = new File("C:\\Users\\vale_\\Desktop\\Ejercicio\\fechas_letras.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);
			FileWriter line = new FileWriter(archivo2, false);

			while ((linea = buffer.readLine()) != null) {

				fecha = dias[Integer.valueOf(linea.substring(0, 2)) - 1] + " de "
						+ meses[Integer.valueOf(linea.substring(2, 4)) - 1] + " del " + linea.substring(4);
				System.out.println(fecha);
				line.write(fecha + "\n");


			}
			line.close();// Es importante siempre cerrar el writer

		} catch (Exception ex) {

			ex.printStackTrace();
		}
	}

}
