package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;

public class PolizaDeAuto extends Poliza implements SegurosGenerales {

	private Auto autos;
	
	public PolizaDeAuto(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		// TODO Auto-generated constructor stub
		autos= null;
	}

	@Override
	public void agregarBienAsegurado(Object object) {
		Auto auto= (Auto)object;
		autos=auto;
	}

	@Override
	public Auto getAuto() {
		// TODO Auto-generated method stub
		return autos;
	}

	
	

	
	
}
