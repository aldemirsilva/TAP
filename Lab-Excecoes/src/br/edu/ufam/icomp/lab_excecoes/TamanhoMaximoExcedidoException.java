package br.edu.ufam.icomp.lab_excecoes;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException {
	public static final long serialVersionUID = 7L;
	
	public TamanhoMaximoExcedidoException() {
		this("Quantidade máxima de coordenadas excedida");
	}
	
	public TamanhoMaximoExcedidoException(String s) {
		super(s);
	}
}
