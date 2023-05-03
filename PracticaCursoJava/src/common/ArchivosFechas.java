package common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivosFechas {

	public static void main(String[] args) {
		// Ruta de los archivos de entrada y salida
        String archivoEntrada = "C:\\Users\\erick\\Downloads\\FechaRead.txt";
        String archivoSalida = "C:\\Users\\erick\\Downloads\\FechaWrite.txt";

        // Variables para almacenar la fecha y el texto con los días y meses escritos en letras
        String fecha, fechaConLetras;

        try {
            // Crear un objeto FileReader para leer el archivo de entrada
            FileReader fileReader = new FileReader(archivoEntrada);

            // Crear un objeto BufferedReader para leer el archivo de entrada en búfer
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Crear un objeto FileWriter para escribir en el archivo de salida
            FileWriter fileWriter = new FileWriter(archivoSalida);

            // Leer el archivo de entrada línea por línea
            while ((fecha = bufferedReader.readLine()) != null) {
                // Convertir la fecha a texto con los días y meses escritos en letras
                fechaConLetras = convertirFecha(fecha);

                // Escribir la fecha con los días y meses en letras en el archivo de salida
                fileWriter.write(fechaConLetras + "\n");
            }

            // Cerrar los objetos FileReader, BufferedReader y FileWriter
            fileReader.close();
            bufferedReader.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String convertirFecha(String fecha) {
        // Dividir la fecha en día, mes y año
        String[] partes = fecha.split("/");

        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        // Convertir el día a texto con letras
        String[] dias = { "cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
                "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve",
                "veinte", "veintiuno", "veintidós", "veintitrés", "veinticuatro", "veinticinco", "veintiséis",
                "veintisiete", "veintiocho", "veintinueve", "treinta", "treinta y uno" };

        String diaConLetras = dias[dia];

        // Convertir el mes a texto con letras
        String[] meses = { "", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };

        String mesConLetras = meses[mes];

        // Combinar el día y mes en un solo texto
        String fechaConLetras = diaConLetras + " de " + mesConLetras + " de " + anio;

        return fechaConLetras;
    }

}