package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
	private int posX, posY, digito;
	
	public Coordenada(int posX, int posY, int digito) throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
		if(posX < 0 || posY < 0) throw new CoordenadaNegativaException();
		if(posX < 0 || posX > 30000 || posY < 0 || posY > 30000) throw new CoordenadaForaDosLimitesException();
		if( ( (posX+posY)%10 != digito ) || digito < 0 || digito > 10) throw new DigitoInvalidoException();
		this.posX = posX;
		this.posY = posY;
		this.digito = digito;
	}
	
	public int getPosX() {
		return this.posX;
	}
	
	public int getPosY() {
		return this.posY;
	}
	
	public double distancia(Coordenada coordenada) {
		return Math.sqrt(Math.pow(coordenada.posX-this.posX, 2) + Math.pow(coordenada.posY-this.posY, 2));
	}
	
	@Override
	public String toString() {
		String saida = this.posX + ", " + this.posY;
		return saida;
	}
}