package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Poliza implements Comparable<Poliza>{

	private Integer numeroDePoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Double premio;
	private Boolean estado;
	
	
	public Poliza(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numeroDePoliza = numeroDePoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.premio= this.prima*1.2;
		this.estado=false;
	}


	public Integer getNumeroDePoliza() {
		return numeroDePoliza;
	}


	public void setNumeroDePoliza(Integer numeroDePoliza) {
		this.numeroDePoliza = numeroDePoliza;
	}


	public Persona getAsegurado() {
		return asegurado;
	}


	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}


	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}


	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}


	public Double getPremio() {
		return premio;
	}


	public void setPremio(Double premio) {
		this.premio = premio;
	}


	
	

	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	@Override
	public int compareTo(Poliza o) {
		// TODO Auto-generated method stub
		return this.getNumeroDePoliza().compareTo(o.getNumeroDePoliza());
	}


	public boolean fueRobado() {
		// TODO Auto-generated method stub
		return estado;
	}


	public boolean tuvoAlgunAccidente() {
		// TODO Auto-generated method stub
		return estado;
	}


	




	
	
	
	
}
