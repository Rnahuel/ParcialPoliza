package ar.edu.unlam.pb2.eva03;

public class Auto {

	private String marca;
	private String nombre;
	private Integer anio;
	private Double sumaAsegurada;
	public Auto(String marca, String nombre, Integer anio, Double sumaAsegurada) {
		super();
		this.marca = marca;
		this.nombre = nombre;
		this.anio = anio;
		this.sumaAsegurada = sumaAsegurada;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getAnio() {
		return anio;
	}
	public void setAnio(Integer anio) {
		this.anio = anio;
	}
	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}
	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}
	
	
	
}
