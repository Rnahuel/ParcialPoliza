package ar.edu.unlam.pb2.eva03;

public class PolizaCombinadoFamiliar extends Poliza implements SegurosGenerales, SegurosDeVida{

	private int cantidadDeBeneficiarios;
	private int cantidadDeBienes;
	private Persona personita;
	private Auto autito;
	private Vivienda viviendita;
	
	public PolizaCombinadoFamiliar(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		// TODO Auto-generated constructor stub
		cantidadDeBeneficiarios=0;
		cantidadDeBienes=0;
		personita=null;
		autito=null;
		viviendita=null;
	}

	@Override
	public void agregarBeneficiario(Persona persona) {
		// TODO Auto-generated method stub
		personita=persona;
		cantidadDeBeneficiarios++;
	}


	@Override
	public int obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return cantidadDeBeneficiarios;
	}

	@Override
	public void agregarBienAsegurado(Object object) {
		// TODO Auto-generated method stub
//		
		if(object instanceof Auto) {
			Auto auto=(Auto)object;
			autito=auto;	
		}else if(object instanceof Vivienda) {
			Vivienda vivienda=(Vivienda)object;
			viviendita=vivienda;
		}
	}

	@Override
	public Auto getAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	public int obtenerLaCantidadDePolizasEmitidas() {
		return cantidadDeBeneficiarios+cantidadDeBienes;
	}


}
