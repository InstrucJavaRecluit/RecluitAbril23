package common;

public class Perro {
	
	String raza;
	String color;
	int edad;
	
	public Perro() {
		
	}

	public Perro(String raza, String color, int edad) {
		this.raza = raza;
		this.color = color;
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", color=" + color + ", edad=" + edad + "]";
	}
	
	//Comportamiento
	public void Comer(String comer) {
		System.out.println("El perro esta comiendo " + comer);
	}
	
	public void Dormir(String dormir) {
		System.out.println("El perro esta durmiendo " + dormir);
	}
	public void Correr() {
		System.out.println("El perro corre a una velocidad rapida");
	}
}
