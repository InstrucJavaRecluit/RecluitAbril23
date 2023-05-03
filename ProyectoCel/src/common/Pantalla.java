package common;

public class Pantalla {
	
	String resolucion;
	String tama�o;
	String tecnologia;
	int ppp;
	
	public Pantalla() {
		
		
	}

	public Pantalla(String resolucion, String tama�o, String tecnologia, int ppp) {
		super();
		this.resolucion = resolucion;
		this.tama�o = tama�o;
		this.tecnologia = tecnologia;
		this.ppp = ppp;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Pantalla [resolucion=" + resolucion + ", tama�o=" + tama�o + ", tecnologia=" + tecnologia + ", ppp="
				+ ppp + "]";
	}
	
	

}
