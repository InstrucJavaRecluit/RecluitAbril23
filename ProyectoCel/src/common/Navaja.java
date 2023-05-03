package common;

public class Navaja {
	
	String marca;
	String modelo;
	String color;
	String tamaño;
	
	public Navaja() {
		
	}

	public Navaja(String marca, String modelo, String color, String tamaño) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamaño = tamaño;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Navaja [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamaño=" + tamaño + "]";
	}
	
	

}
