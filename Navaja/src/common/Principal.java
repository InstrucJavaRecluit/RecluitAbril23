package common;

public class Principal {
	
	public static void main(String[] args) {
		
		Caracteristica c = new Caracteristica(true, false, true, false, true, false, false, false, true, false, false, true);
		NavajaSu nv = new NavajaSu("Victorinos", "amg", "1500", c);
		
		System.out.println(nv);
		
	}
	

}
