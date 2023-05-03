package common;

public class Navaja {
	
	String marca;
	String modelo;
	String color;
	String tama�o;
	
	public Navaja() {
		
	}

	public Navaja(String marca, String modelo, String color, String tama�o) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tama�o = tama�o;
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

	@Override
	public String toString() {
		return "Navaja [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tama�o=" + tama�o + "]";
	}
	
	

}
