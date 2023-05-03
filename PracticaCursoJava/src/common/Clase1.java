package common;

public class Clase1 {

	public static void main(String[] args) { //Este es el metodo main

		//Primitivos
		byte by = 30;  // -128 -127
		short sh = 4000; // -32768 -32767
		int i = 34569; // 
		long lo = 9876543211l; //18 cifras es su capacidad de almacenar numericos
		
		float flo = 23.55f; 
		double dob = 25555.55;
		char r = 'a';
		boolean bo = true;
		
		//Objetos - wrappers (Envoltorios)
		
		Byte bb = new Byte("12"); //por constructor
		Byte bbb = 120; //Valor directo
		
		Short s = new Short("3000");
		Short ss = 240;
		
		Integer inte = new Integer("255");
		Integer intee = 255;
		
		Long lon = new Long("98373737");
		Long lonn = 9898989898l;
		
		Float f = new Float("555.55");
		Float ff = 255.22f;
		
		Double d = new Double("2222.55");
		Double dd = 22222.55;
		
		Character c = new Character('d');
		Character cc = 'a';
		
		Boolean b = new Boolean("true");
		Boolean bbbb = true;
		
		String st = new String("Hola");
		String stt = "HolaMundo";
		
		
	}

}
