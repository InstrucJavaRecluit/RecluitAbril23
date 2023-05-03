package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		
		String linea ="";
		String texto = "este texto es de prueba";
		//Intenta
		try {
			File archivo = new File("C:\\Users\\vale_\\Desktop\\notas.txt");
//			FileWriter line = new FileWriter(archivo,false);
//			
//			for (int i = 0; i < texto.length(); i++) {
//				line.write(texto.charAt(i));
//				
//			}
//			line.close();//Es importante siempre cerrar el writer
			
			FileReader fr = new FileReader(archivo);
			BufferedReader buffer = new BufferedReader(fr);
			
			while ((linea = buffer.readLine()) != null) {
				System.out.println("Linea: "+ linea);
				
			}
			
			
			
		} catch (Exception ex) {
			
			ex.printStackTrace();
		}
	}

}
