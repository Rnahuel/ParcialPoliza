package ar.edu.unlam.pb2.eva03;

public class Persona {

	private String nombre;
	private Integer dni;
	private Integer num;
	
	public Persona(String nombre, Integer dni, Integer num) {
		this.nombre = nombre;
		this.dni = dni;
		this.num = num;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	
	
}
