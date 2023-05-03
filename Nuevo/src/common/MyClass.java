package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class MyClass {
	
	public static void main(String[] args) {
		
		String linea ="";
		String texto = "Java 8";
		
		try {File archivo = new File("C:\\Users\\juana\\OneDrive\\Escritorio\\Archivo.txt");
//		FileWriter line = new FileWriter(archivo, false);	
//		
//		for(int i = 0; i < texto.length(); i++){
//			line.write(texto.charAt(i));
//		}
//		
//		line.close();
		
		FileReader fr = new FileReader(archivo);
		BufferedReader buffer = new BufferedReader(fr);
		
		while ((linea = buffer. readLine()) != null) {
			System.out.println("Línea: " + linea);
			
		}
		
		}catch(Exception ex) {
			ex.printStackTrace();
		
		}
	}

}
