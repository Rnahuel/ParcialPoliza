package ar.edu.unlam.pb2.eva03;

public class PolizaInexistente extends Exception{

	public PolizaInexistente() {
		super("no existe la poliza");
	}
	
}