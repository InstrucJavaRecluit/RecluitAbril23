package common;

public class Pantalla {
	
	String resolucion;
	String dimension;
	String tecnologia;
	int ppp;
	
	public Pantalla() {
		
	}

	public Pantalla(String resolucion, String dimension, String tecnologia, int ppp) {
		this.resolucion = resolucion;
		this.dimension = dimension;
		this.tecnologia = tecnologia;
		this.ppp = ppp;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
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
		return "Pantalla [resolucion=" + resolucion + ", dimension=" + dimension + ", tecnologia=" + tecnologia
				+ ", ppp=" + ppp + "]";
	}
	
	
	
}
