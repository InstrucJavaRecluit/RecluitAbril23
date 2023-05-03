package objeto2common;

public class Principal {
	public static void main(String[] args) {
		laptop l1 = new laptop();
		laptop l2= new laptop("acer", "predator", 512, "ryzen 5");
		l1.setCapacidad(1000);
		l1.setMarca("asus");
		l1.setModelo("Zenbook 14");
		l1.setProcesador("core i5 8va ");
		
		System.out.println(l1);
		System.out.println(l2);
		
		l1.Almacenar("en la laptop");
		l1.CrearArchivo("word");
		
		
	}

}
