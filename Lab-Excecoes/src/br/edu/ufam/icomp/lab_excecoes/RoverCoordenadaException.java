package br.edu.ufam.icomp.lab_excecoes;

public class RoverCoordenadaException extends RoverException {
	public static final long serialVersionUID = 2L;
	
	public RoverCoordenadaException() {
		this("Exceção geral de coordenada do rover");
	}
	
	public RoverCoordenadaException(String s) {
		super(s);
	}
}
