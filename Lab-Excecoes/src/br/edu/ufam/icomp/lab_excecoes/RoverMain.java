package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
	public static void main(String[] args) {
		Caminho caminho = new Caminho(8);
		try {
//			Coordenada c1 = new Coordenada(32,67,9);
			Coordenada c2 = new Coordenada(35,40,5);
			Coordenada c3 = new Coordenada(38,30,8);
			Coordenada c4 = new Coordenada(30,36,6);
			Coordenada c5 = new Coordenada(40,36,6);
			Coordenada c6 = new Coordenada(33,31,4);
			Coordenada c7 = new Coordenada(-33,31,4);
//			Coordenada c8 = new Coordenada(31000,31,4);
//			caminho.addCoordenada(c1);
			caminho.addCoordenada(c2);
			caminho.addCoordenada(c3);
			caminho.addCoordenada(c4);
			caminho.addCoordenada(c5);
			caminho.addCoordenada(c6);
			caminho.addCoordenada(c7);
//			caminho.addCoordenada(c8);
			System.out.println(caminho);
		}
		catch(RoverException e) {
			System.out.println(e.getMessage());
			caminho.reset();
		}
	}
}