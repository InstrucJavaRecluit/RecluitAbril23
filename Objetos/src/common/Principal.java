package common;

public class Principal {
	public static void main(String[] args) {
		
		
//		Auto au = new Auto();
//		Auto aut = new Auto("Aundi","r8", "azul", "2023" , 4.3f , 1, true);
//		
//		au.setMarca("Olsmobile");
//		au.setMarca("bravada");
//		au.setColor("negro");
//		au.setModelo("1996");
//		au.setTamañoMotor(4.3f);
//		au.setPeso(3);
//		au.setEncendido(false);
//		au.acelerar();
//		au.frenar();
//		
//		System.out.println(au);
//		System.out.println(aut);
		
		Celular cl = new Celular();
		Pantalla pan = new Pantalla("1080*1200", "5.5", "IPS", 600);
		Celular cel = new Celular("Xiomi","A0101", "Azul","grand", 60, false);
		Celular celu = new Celular("SAmsumng", "a45", "negro", "grand", 60, true, pan);
		Smartphone sm = new Smartphone();
		SistemaOperativo sis = new SistemaOperativo("ColorOS", "OPPO", "12");
		Smartphone s = new Smartphone("OPPO", "Reno 5 lite", "tornasol", "grande", 4600, true, pan, sis);
		
		cl.setMarca("SAmsung");
		cl.setColor("negro");
		cl.setModelo("A03");
		cl.setTamaño("Grande");
		cl.setMah(60);
		
				
		
		System.out.println(cl);
		System.out.println(cel);
		System.out.println(celu);
		
		System.out.println(s);
		
	
		
		
	}

}
