package common;

public class Caracteristica {
	
	boolean destornilladorn;
	boolean cuchilo;
	boolean tijeras;
	boolean sacaCorcho;
	boolean lima;
	boolean abrelatas;
	boolean regla;
	boolean pinzas;
	boolean luzLed;
	boolean cortaUñas;
	boolean lupa;
	boolean pluma;
	
	
	public Caracteristica(boolean destornilladorn, boolean cuchilo, boolean tijeras, boolean sacaCorcho, boolean lima,
			boolean abrelatas, boolean regla, boolean pinzas, boolean luzLed, boolean cortaUñas, boolean lupa,
			boolean pluma) {
		super();
		this.destornilladorn = destornilladorn;
		this.cuchilo = cuchilo;
		this.tijeras = tijeras;
		this.sacaCorcho = sacaCorcho;
		this.lima = lima;
		this.abrelatas = abrelatas;
		this.regla = regla;
		this.pinzas = pinzas;
		this.luzLed = luzLed;
		this.cortaUñas = cortaUñas;
		this.lupa = lupa;
		this.pluma = pluma;
	}


	public boolean isDestornilladorn() {
		return destornilladorn;
	}


	public void setDestornilladorn(boolean destornilladorn) {
		this.destornilladorn = destornilladorn;
	}


	public boolean isCuchilo() {
		return cuchilo;
	}


	public void setCuchilo(boolean cuchilo) {
		this.cuchilo = cuchilo;
	}


	public boolean isTijeras() {
		return tijeras;
	}


	public void setTijeras(boolean tijeras) {
		this.tijeras = tijeras;
	}


	public boolean isSacaCorcho() {
		return sacaCorcho;
	}


	public void setSacaCorcho(boolean sacaCorcho) {
		this.sacaCorcho = sacaCorcho;
	}


	public boolean isLima() {
		return lima;
	}


	public void setLima(boolean lima) {
		this.lima = lima;
	}


	public boolean isAbrelatas() {
		return abrelatas;
	}


	public void setAbrelatas(boolean abrelatas) {
		this.abrelatas = abrelatas;
	}


	public boolean isRegla() {
		return regla;
	}


	public void setRegla(boolean regla) {
		this.regla = regla;
	}


	public boolean isPinzas() {
		return pinzas;
	}


	public void setPinzas(boolean pinzas) {
		this.pinzas = pinzas;
	}


	public boolean isLuzLed() {
		return luzLed;
	}


	public void setLuzLed(boolean luzLed) {
		this.luzLed = luzLed;
	}


	public boolean isCortaUñas() {
		return cortaUñas;
	}


	public void setCortaUñas(boolean cortaUñas) {
		this.cortaUñas = cortaUñas;
	}


	public boolean isLupa() {
		return lupa;
	}


	public void setLupa(boolean lupa) {
		this.lupa = lupa;
	}


	public boolean isPluma() {
		return pluma;
	}


	public void setPluma(boolean pluma) {
		this.pluma = pluma;
	}


	@Override
	public String toString() {
		return "Caracteristica [destornilladorn=" + destornilladorn + ", cuchilo=" + cuchilo + ", tijeras=" + tijeras
				+ ", sacaCorcho=" + sacaCorcho + ", lima=" + lima + ", abrelatas=" + abrelatas + ", regla=" + regla
				+ ", pinzas=" + pinzas + ", luzLed=" + luzLed + ", cortaUñas=" + cortaUñas + ", lupa=" + lupa
				+ ", pluma=" + pluma + "]";
	}
	
	
	

}
