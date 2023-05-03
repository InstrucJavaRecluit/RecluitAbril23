package common;

public class NavajaSu {
	
	String marca;
	String modelo;
	String precio;
	Caracteristica caracteristica;
	
	public NavajaSu() {
		
	}

	public NavajaSu(String marca, String modelo, String precio, Caracteristica caracteristica) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.caracteristica = caracteristica;
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

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "NavajaSu [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", caracteristica="
				+ caracteristica + "]";
	}

	
	
	

}
