package common;

public class Celular {
	
	//Marca modelo color tama�o
	
	String marca;
	String modelo;
	String color;
	String tama�o;
	int mah;
	boolean encendido;
	Pantalla pantalla;
	
	//Metodo Constructor vacio
	
	public Celular() {
		
	}
	
	
	



	public Celular(String marca, String modelo, String color, String tama�o, int mah, boolean encendido) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tama�o = tama�o;
		this.mah = mah;
		this.encendido = encendido;
	}

	public Celular(String marca, String modelo, String color, String tama�o, int mah, boolean encendido,
			Pantalla pantalla) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tama�o = tama�o;
		this.mah = mah;
		this.encendido = encendido;
		this.pantalla = pantalla;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getTama�o() {
		return tama�o;
	}
	
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public int getMah() {
		return mah;
	}
	
	public void setMah(int mah) {
		this.mah = mah;
	}
	
	
	
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tama�o=" + tama�o + ", mah="
				+ mah + ", encendido=" + encendido + ", pantalla=" + pantalla + "]";
	}
	
	
	public void mensaje(String msg) {
		System.out.println("Estoy mandando un mensaje "+msg);
	}
	
	public void encender() {
		this.encendido = true;
	}

}
