package common2;

public class NavajaSuiza {
	
	int numHojas;
	String material;
	boolean pinzas;
	
	
	public NavajaSuiza() {
		
	}


	public NavajaSuiza(int numHojas, String material, boolean pinzas) {
		this.numHojas = numHojas;
		this.material = material;
		this.pinzas = pinzas;
	}


	public int getNumHojas() {
		return numHojas;
	}


	public void setNumHojas(int numHojas) {
		this.numHojas = numHojas;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public boolean isPinzas() {
		return pinzas;
	}


	public void setPinzas(boolean pinzas) {
		this.pinzas = pinzas;
	}


	@Override
	public String toString() {
		return "NavajaSuiza [numHojas=" + numHojas + ", material=" + material + ", pinzas=" + pinzas + "]";
	}
	
	public void Cortar() {
		System.out.println("Cortando con la navaja Suiza");
	}
	public void Abrir() {
		System.out.println("Abriendo las hojas de la navaja Suiza");
		
	}
}
