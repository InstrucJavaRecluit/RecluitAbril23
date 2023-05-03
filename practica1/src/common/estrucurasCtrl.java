package common;

public class estrucurasCtrl {
	public static void main(String args[]) {
//		//Estructuras de control
		//if, if-else, 
		//el operador == sirve para comprar primitivos
		//Para comparar String se usa equals
		
		int x = 11;
		String m = "Puebla 2023";
		
		// IF con AND
//		if (x == 10 && m.equals("Puebla 2023")) {
//			System.out.println("Ok");
//			
//		}else {
//			System.out.println("No lo es");
//		}
			
		
		//If con OR
//		if (x == 10 || m.equals("Puebla 2023")) {
//			System.out.println("Ok");
//			
//		}else {
//			System.out.println("No lo es");
//		}
		
		 	//Negando la estructura !
		if ( !(x == 10 || m.equals("Puebla 2023")) ) {
			System.out.println("Ok");
			
		}else {
			System.out.println("No lo es");
		}
		
	}
}
