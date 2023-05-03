package common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArchivoEscritura {

	public static void main(String[] args) {
		
		
		String inputFile = "C:\\Users\\erick\\Downloads\\FechaRead.txt";
        String outputFile = "C:\\Users\\erick\\Downloads\\FechaWrite.txt";
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            
            String line;
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            while ((line = reader.readLine()) != null) {
                try {
                    Date date = dateFormat.parse(line);
                    String dateInWords = convertDateToWords(date);
                    writer.write(dateInWords + "\n");
                } catch (ParseException e) {
                    System.err.println("Error parsing date: " + line);
                }
            }
            
            reader.close();
            writer.close();
            System.out.println("Conversion completed successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    private static String convertDateToWords(Date date) {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        return dateFormat.format(date);
    }
}

