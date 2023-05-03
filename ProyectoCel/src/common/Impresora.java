package common;

public class Impresora {
	
	String marca;
	String modelo;
	String tamaño;
	boolean encendido;
	
	public Impresora() {
		
		
	}
	
	public Impresora(String marca, String modelo, String tamaño, boolean encendido) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.tamaño = tamaño;
		this.encendido = encendido;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public String toString() {
		return "Impresora [marca=" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño + ", encendido=" + encendido
				+ "]";
	}
	
	public void imprimir(String impresion) {
		System.out.println("Estoy imprimiendo: " + impresion);
	}
	
	public void scanear(String scan) {
		System.out.println("Estoy escaneando: " + scan);
	}
	
	public void encender() {
		this.encendido = true;
	}
	

}
