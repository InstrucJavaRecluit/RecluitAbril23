package objeto2common;

public class laptop {
	String modelo;
	String marca;
	int capacidad;
	String procesador;
	 boolean encendido;
	
		public laptop() {
			
		}
	public laptop(String modelo, String marca, int capacidad, String procesador) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.capacidad = capacidad;
		this.procesador = procesador;
	}



	//Comportamiento
		/*Comportamiento propio(Metodos nativos)
		Metodos heredados(comunmente se sobre escriben)
		Metodos implementados(traidos de interfaces)
		*/
		
		public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getCapacidad() {
		return capacidad;
	}



	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}



	public String getProcesador() {
		return procesador;
	}



	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}



		@Override
	public String toString() {
		return "laptop [modelo=" + modelo + ", marca=" + marca + ", capacidad=" + capacidad + ", procesador="
				+ procesador + "]";
	}



		public void CrearArchivo(String ca) {
			System.out.println("Estoy crando un documento " +ca);
		}

		

		public void Almacenar(String alm) {
			System.out.println("Estoy almacenando datos " +alm);
		}
		
		public void encender() {
			this.encendido = true;
		}
	

}
