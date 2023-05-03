package common;

public class Principal {

	public static void main(String[] args) {

		Pantalla pan = new Pantalla("1080", "5.5 pulgadas", "IPS", 600);
		Celular cl = new Celular();
		Celular cel = new Celular("Xiaomi", "A11B-02", "Azul", "Grande",60 , true);
		Celular celu = new Celular("Samsung", "A20", "Negro", "Grande", 120, true, pan);
		Smartphone sm = new Smartphone();
		SistemaOperativo sis = new SistemaOperativo("Android", "Google", "12");
		Smartphone s = new Smartphone("Huawei", "P30", "Negro", "Mediano", 60, true, pan,sis);
		
		cl.setMarca("Samsung");
		cl.setColor("Negro");
		cl.setModelo("A03");
		cl.setTamaño("Grande");
		cl.setMah(60);
		
		
		System.out.println(cl);
		System.out.println(cel);
		System.out.println(pan);
		System.out.println(celu);
		System.out.println(s);
		
		
		
//		Perro p = new Perro();
//		Perro pe = new Perro("Pasto Aleman", "Cafe", 2);
//		
//		p.setColor("Negro");
//		p.setEdad(3);
//		p.setRaza("Pastor Belga");
//		
//		
//		System.out.println(p);
//		System.out.println(pe);
//		
//		p.Comer("Pollo");
//		p.Dormir("Zzzz");
		
	}

}
