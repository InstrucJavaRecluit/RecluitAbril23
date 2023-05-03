package common2;

public class Principal {

	public static void main(String[] args) {

		
		NavajaSuiza ns = new NavajaSuiza(8, "Acero", true);
		MultiUsosSuiza m = new MultiUsosSuiza(true, true);
		
		
		System.out.println(ns);
		System.out.println(m);
		
		m.setNumHojas(9);
		m.setMaterial("Acero");
		m.setPinzas(true);
		
		m.Cortar();
		m.Abrir();
		
		
	}

}
