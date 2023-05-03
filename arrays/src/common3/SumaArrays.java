package common3;

public class SumaArrays {
	public static void main(String[] args) {

		String[][] matA = {{"p", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
		String[][] matB = {{"10", "11", "12"}, {"13", "14", "15"}, {"16", "17", "18"}};
		int[][] matC = new int[matA.length][matB.length];
		
		
		
		
		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				
				
				try {
				

					int arregloA = Integer.parseInt(matA[i][j]);
					int arregloB = Integer.parseInt(matB[i][j]);
					matC[i][j] = arregloA + arregloB;
				
					
					
				} catch (NumberFormatException e) {
					matC[i][j] = 0;
				}
			}
		}
		
		System.out.println("Arreglo A");
		for (int i = 0; i < matA.length; i++) {
			for (int j = 0; j < matA.length; j++) {
				System.out.print(matA[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Arreglo B");
		for (int i = 0; i < matB.length; i++) {
			for (int j = 0; j < matB.length; j++) {
				System.out.print(matB[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Arreglo C");
		for (int i = 0; i < matC.length; i++) {
			for (int j = 0; j < matC.length; j++) {
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
