package common;

public class Clase1 {

	public static void main (String[]args) {//Este es el metodo main
		
		//Primitivos
		byte by = 30;	//-128 - 127
		short sh = 4000; // -32768  -32767
		int i = 34569;
		long lo = 987654321l; //ele al final
		
		float f = 23.45f;
		double d = 34535.34;
		//camelCase
		char c = 'r'; //un caracter a la ves
		boolean bo = false; //true o false
		
		int otroNumeroEntero = 5000;
		
		//Objetos - Wrappers (envoltorios)
		
		Byte bb = new Byte("25"); //por constructor
		Byte bbb = 120; //valor directo
		
		Short s = new Short("3000");
		Short ss = 240;
		
		Integer  in =  new Integer(351);
		Integer inn = 12354;
		
		Long l = new Long("98756434l");
		Long ll = 98765432l;
		
		Float fl = new Float(235456);
		Float ffl = 23.45f;
		
		
		Double dd = new Double(345.35);
		Double ddd= 34535.23;
		
		Character ch = new Character('c');
		Character cch = 'a';
		
		Boolean b = new Boolean("true");
		Boolean bbb1 = false;
		
		String st = new String("HOLA");
		String str = ("mundo");
				
				
		
		
	
	}
	
}
