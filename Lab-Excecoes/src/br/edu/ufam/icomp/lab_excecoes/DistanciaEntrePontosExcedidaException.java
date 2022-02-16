package br.edu.ufam.icomp.lab_excecoes;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException {
	public static final long serialVersionUID = 8L;
	
	public DistanciaEntrePontosExcedidaException() {
		this("Distância máxima entre duas coordenadas vizinhas excedida");
	}
	
	public DistanciaEntrePontosExcedidaException(String s) {
		super(s);
	}
}