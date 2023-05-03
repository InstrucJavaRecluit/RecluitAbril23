package common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LecturaEscritura {

	public static void main(String[] args) {
		

		        String inputFile = "C:\\Users\\erick\\Downloads\\FechaRead.txt";
		        String outputFile = "C:\\Users\\erick\\Downloads\\FechaWrite.txt";
		        
		        BufferedReader reader = null;
		        BufferedWriter writer = null;
		        
		        try {
		            reader = new BufferedReader(new FileReader(inputFile));
		            writer = new BufferedWriter(new FileWriter(outputFile));
		            
		            String line;
		            
		            while ((line = reader.readLine()) != null) {
		                String[] parts = line.split("/");
		                
		                
		                int dia = Integer.parseInt(parts[0]);
		                int mes = Integer.parseInt(parts[1]);
		                int año = Integer.parseInt(parts[2]);
		                
		                String meses = "";
		                switch(mes) {
		                    case 1:
		                        meses = "Enero";
		                        break;
		                    case 2:
		                        meses = "Febrero";
		                        break;
		                    case 3:
		                        meses = "Marzo";
		                        break;
		                    case 4:
		                        meses = "Abril";
		                        break;
		                    case 5:
		                        meses = "Mayo";
		                        break;
		                    case 6:
		                        meses = "Junio";
		                        break;
		                    case 7:
		                        meses = "Julio";
		                        break;
		                    case 8:
		                        meses = "Agosto";
		                        break;
		                    case 9:
		                        meses = "Septiembre";
		                        break;
		                    case 10:
		                        meses = "Octubre";
		                        break;
		                    case 11:
		                        meses = "Noviembre";
		                        break;
		                    case 12:
		                        meses = "Deciembre";
		                        break;
		                }
		                
		                String fechaLetra = dia + " " + meses + " " + año;
		                writer.write(fechaLetra + "\n");
		            }
		            
		            System.out.println("Conversion completada");
		        } catch (IOException e) {
		            System.err.println("Error: " + e.getMessage());
		        } finally {
		            try {
		                if (reader != null) {
		                    reader.close();
		                }
		                if (writer != null) {
		                    writer.close();
		                }
		            } catch (IOException e) {
		                System.err.println("Error archivo cerrado: " + e.getMessage());
		            }
		        }
		    }
		}