package common;

public class PrincipalImpresora {
	
	public static void main(String[] args) {
		
		Impresora imp = new Impresora();
		
		imp.setEncendido(true);
		imp.setMarca("Canon");
		imp.setModelo("c920");
		imp.setTamaño("Mediana");
		
		System.out.println(imp);
	}
	


}
