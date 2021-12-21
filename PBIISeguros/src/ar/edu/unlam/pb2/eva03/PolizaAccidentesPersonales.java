package ar.edu.unlam.pb2.eva03;

public class PolizaAccidentesPersonales extends Poliza implements SegurosDeVida {

	
	private Persona personas;
	private Integer cantidadDeBeneficiarios;
	
	public PolizaAccidentesPersonales(Integer numeroDePoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		super(numeroDePoliza, asegurado, sumaAsegurada, prima);
		// TODO Auto-generated constructor stub
		cantidadDeBeneficiarios=0;
	}

	@Override
	public void agregarBeneficiario(Persona persona) {
		// TODO Auto-generated method stub
		personas=persona;
		cantidadDeBeneficiarios++;
	}

	@Override
	public int obtenerCantidadDeBeneficiarios() {
		// TODO Auto-generated method stub
		return cantidadDeBeneficiarios;
	}

	
	
	

}
