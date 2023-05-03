package common;

public class Celular {
	
	//Marca,modelo,color y tamaño
	
	String marca;
	String modelo; 
	String color; 
	String tamaño;
	int mah;
	boolean encendido;
	Pantalla pantalla;
	
	//Metodo constructor vacio
	public Celular() {
		
	}
	
	//Metodo constructor con argumentos
			public Celular(String marca, String modelo, String color, String tamaño, int mah, boolean encendido) {
				this.marca = marca;
				this.modelo = modelo;
				this.color = color;
				this.tamaño = tamaño;
				this.mah = mah;
				this.encendido = encendido;
			}	
	
	//Constructor con todos sus argumentos
	public Celular(String marca, String modelo, String color, String tamaño, int mah, boolean encendido,
			Pantalla pantalla) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tamaño = tamaño;
		this.mah = mah;
		this.encendido = encendido;
		this.pantalla = pantalla;
	}

	//Setters y Getters
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

	public int getMah() {
		return mah;
	}

	public void setMah(int mah) {
		this.mah = mah;
	}
	
	
	
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	//toString reconoce el estado de los objetos
	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tamaño=" + tamaño + ", mah="
				+ mah + ", encendido=" + encendido + ", pantalla=" + pantalla + "]";
	}

	
	
	//Comportamiento
	/*Comportamiento propio(Metodos nativos)
	Metodos heredados(comunmente se sobre escriben)
	Metodos implementados(traidos de interfaces)
	*/
	
	public void llamar(String numero) {
		System.out.println("Estoy marcando al numero " +numero);
	}

	public void mensaje(String msg) {
		System.out.println("Estoy mandando un mensaje " +msg);
	}
	
	public void encender() {
		this.encendido = true;
	}
}

