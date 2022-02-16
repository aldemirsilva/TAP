package br.edu.ufam.icomp.lab_excecoes;

public class Caminho {
	private Coordenada[] caminho;
	private int tamanho = 0;

	public void reset() {
		this.tamanho = 0;
		for(int i = 0; i < this.caminho.length; i++)
			this.caminho[i] = null;
	}
	
	public Caminho(int maxTam) {
		this.caminho = new Coordenada[maxTam];
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
		if(this.caminho.length == this.tamanho) throw new TamanhoMaximoExcedidoException();
		if(this.tamanho > 0 && this.caminho[tamanho-1].distancia(coordenada) > 15) throw new DistanciaEntrePontosExcedidaException();
		this.caminho[tamanho++] = coordenada;
	}

	@Override
	public String toString() {
		String saida = "Dados do caminho:\n";
		saida += "  - Quantidade de pontos: " + this.tamanho + '\n';
		saida += "  - Pontos:\n";
		if(tamanho > 0) {
			for(int i = 0; i < tamanho; i++) {
				saida += "    -> " + this.caminho[i].getPosX() + ", " + this.caminho[i].getPosY() + '\n';
			}
		}
		return saida;
	}
}