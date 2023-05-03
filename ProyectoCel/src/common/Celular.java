package common;

public class Celular {
	
	//Marca, modelo, color, tamaño y batería
	
	String marca;
	String modelo;
	String color;
	String tamaño;
	int mAh;
	boolean encendido;
	Pantalla pantalla;
	
	//Método constructor vacío
	public Celular () {
				
	}
	

public Celular(String marca, String modelo, String color, String tamaño, int mAh, boolean encendido,
			Pantalla pantalla) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamaño = tamaño;
		this.mAh = mAh;
		this.encendido = encendido;
		this.pantalla = pantalla;
	}

	//Geters y Seters

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


public int getmAh() {
	return mAh;
}


public void setmAh(int mAh) {
	this.mAh = mAh;
}


public boolean isEncendido() {
	return encendido;
}


public void setEncendido(boolean encendido) {
	this.encendido = encendido;
}


public Pantalla getPantalla() {
	return pantalla;
}


public void setPantalla(Pantalla pantalla) {
	this.pantalla = pantalla;
}


@Override
public String toString() {
	return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamaño=" + tamaño + ", mAh=" + mAh
			+ ", encendido=" + encendido + ", pantalla=" + pantalla + "]";
}


//	public Celular(String marca, String modelo, String color, String tamaño, int mAh) {
//		
//		this.marca = marca;
//		this.modelo = modelo;
//		this.color = color;
//		this.tamaño = tamaño;
//		this.mAh = mAh;
//	}

	


	
	
	
	//Establecer getters y setters



//	public String getMarca() {
//		return marca;
//	}
//
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//
//	public String getModelo() {
//		return modelo;
//	}
//
//	public void setModelo(String modelo) {
//		this.modelo = modelo;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public String getTamaño() {
//		return tamaño;
//	}
//
//	public void setTamaño(String tamaño) {
//		this.tamaño = tamaño;
//	}
//
//	public int getmAh() {
//		return mAh;
//	}
//
//	public void setmAh(int mAh) {
//		this.mAh = mAh;
//	}
//
//	//toString permite reconocer el estado del objeto
//	@Override
//	public String toString() {
//		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamaño=" + tamaño + ", mAh="
//				+ mAh + "]";
//	}

	//Comportamiento
	//¿Qué acciones puede hacer un celular?
	
//	public void llamar(String numero) {
//		System.out.println("Estoy llamando al número" + numero);
//	}
//	
//	public void enviarMensaje(String msg) {
//		System.out.println("Estoy enviando el mensaje: " + msg);
//	}
//	
//	public void encender() {
//		this.encendido = true;
//	}
	
}
