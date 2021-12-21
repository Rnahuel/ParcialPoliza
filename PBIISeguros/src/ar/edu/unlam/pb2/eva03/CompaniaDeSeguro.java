package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro{

	
	private String nombre;
	private Set<Poliza> polizas;
	private int cantidadDePolizas;
	
	public CompaniaDeSeguro(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre=nombre;
		polizas= new TreeSet<Poliza>();
		cantidadDePolizas=0;
	}

	public void agregarPoliza(Poliza poliza) {
		// TODO Auto-generated method stub
		polizas.add(poliza);
		cantidadDePolizas=polizas.size();
		
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int obtenerLaCantidadDePolizasEmitidas() {
		// TODO Auto-generated method stub
		return cantidadDePolizas;
	}
	
	
	public Poliza getPoliza(int numPoliza) {
		Poliza polizita=null;
		for (Poliza poliza : polizas) {
			if(poliza.getNumeroDePoliza().equals(numPoliza)) {
				polizita=poliza;
			}
		}
		return polizita;
	}

	public void denunciarSiniestro(int numPoliza)throws PolizaInexistente {
		for (Poliza poliza : polizas) {
			if(poliza.getNumeroDePoliza().equals(numPoliza)) {
				poliza.setEstado(true);
				return;
			}
			
		}
		throw new PolizaInexistente();
		
	}
	
}
