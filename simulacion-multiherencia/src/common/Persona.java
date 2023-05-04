package common;

public class Persona {
	
	String nombre;
	double altura;
	double peso;
	
	public Persona(String nombre, double altura, double peso) {
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
	}
	
	public Persona() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", altura=" + altura + ", peso=" + peso + "]";
	}

}
