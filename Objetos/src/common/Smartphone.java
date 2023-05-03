package common;

public class Smartphone extends Celular {
	
	SistemaOperativo so;
	
	
	public Smartphone() {
		
	}


	public Smartphone(String marca, String modelo, String color, String tamaño, int mah, boolean encendido,
			Pantalla pantalla, SistemaOperativo so) {
		super(marca, modelo, color, tamaño, mah, encendido, pantalla);
		this.so = so;
	}


	public SistemaOperativo getSo() {
		return so;
	}


	public void setSo(SistemaOperativo so) {
		this.so = so;
	}


	@Override
	public String toString() {
		return "Smartphone [so=" + so + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamaño="
				+ tamaño + ", mah=" + mah + ", encendido=" + encendido + ", pantalla=" + pantalla + "]";
	}


	
}
