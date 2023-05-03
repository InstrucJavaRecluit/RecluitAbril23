package common2;

public class MultiUsosSuiza extends NavajaSuiza{

	boolean destornillador;
	boolean tijeras;
	
	public MultiUsosSuiza() {
		
	}

	public MultiUsosSuiza(boolean destornillador, boolean tijeras) {
		this.destornillador = destornillador;
		this.tijeras = tijeras;
	}

	public boolean isDestornillador() {
		return destornillador;
	}

	public void setDestornillador(boolean destornillador) {
		this.destornillador = destornillador;
	}

	public boolean isTijeras() {
		return tijeras;
	}

	public void setTijeras(boolean tijeras) {
		this.tijeras = tijeras;
	}

	@Override
	public String toString() {
		return "MultiUsosSuiza [destornillador=" + destornillador + ", tijeras=" + tijeras + "]";
	}
	
	//Metodos
	public void usarTijeras() {
		System.out.println("Usando las tijeras que contiene la navaja Suiza");
	}
	
	public void usarDestornillador() {
		System.out.println("Usando el destornillador de la navaja Suiza");
	}
	
}
