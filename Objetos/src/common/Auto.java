package common;

public class Auto {
	//Marca modelo color tama�o
	
	String marca;
	String submarca;
	String modelo;
	String color;
	float tama�oMotor;
	int peso;
	boolean encendido;
	
	//Metodo Constructor vacio
	
	public Auto() {
		
	}
		
	public Auto(String marca, String submarca, String modelo, String color, float tama�oMotor, int peso,
			boolean encendido) {
		super();
		this.marca = marca;
		this.submarca = submarca;
		this.modelo = modelo;
		this.color = color;
		this.tama�oMotor = tama�oMotor;
		this.peso = peso;
		this.encendido = encendido;
	}



	public String getSubmarca() {
		return submarca;
	}

	public void setSubmarca(String submarca) {
		this.submarca = submarca;
	}

	public float getTama�oMotor() {
		return tama�oMotor;
	}

	public void setTama�oMotor(float tama�oMotor) {
		this.tama�oMotor = tama�oMotor;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getSubMarca() {
		return submarca;
	}
	
	public void setSubMarca(String submarca) {
		this.submarca = submarca;
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
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String toString() {
		return "Auto [marca=" + marca + ", submarca " + submarca + ", modelo=" + modelo +", color=" + color + ", peso "
				+ peso + " toneladas]";
	}
	
	
	public void encender() {
		this.encendido = true;
	}
	public void acelerar() {
		System.out.println("Estoy acelerando");
		
	}
	
	public void frenar() {
		System.out.println("Estoy frenando");
	}
	

}
