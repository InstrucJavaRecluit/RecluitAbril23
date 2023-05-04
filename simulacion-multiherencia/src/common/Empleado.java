package common;

public class Empleado extends Persona{
	
	
	double salario;
	String horario;
	String rfc;
	
	
	public Empleado() {
		
	}

	public Empleado(String nombre, double altura, double peso, double salario, String horario, String rfc) {
		super(nombre, altura, peso);
		this.salario = salario;
		this.horario = horario;
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", horario=" + horario + ", rfc=" + rfc + "]";
	}
	

}
