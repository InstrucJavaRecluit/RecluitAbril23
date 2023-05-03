package common;

public class Pantalla {
	
	String resolucion;
	String tamaño;
	String tecnologia;
	int ppp;
	
	public Pantalla() {
		
		
	}

	public Pantalla(String resolucion, String tamaño, String tecnologia, int ppp) {
		super();
		this.resolucion = resolucion;
		this.tamaño = tamaño;
		this.tecnologia = tecnologia;
		this.ppp = ppp;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public int getPpp() {
		return ppp;
	}

	public void setPpp(int ppp) {
		this.ppp = ppp;
	}

	@Override
	public String toString() {
		return "Pantalla [resolucion=" + resolucion + ", tamaño=" + tamaño + ", tecnologia=" + tecnologia + ", ppp="
				+ ppp + "]";
	}
	
	

}
