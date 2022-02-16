public class IniciadoJedi {
	String nome, especie;
	int anoNascimento;
	
	IniciadoJedi() {
		this(null, null, 0);
	}
	
	IniciadoJedi(String nome, String especie, int anoNascimento) {
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}
	
	String getAnoNascimento() {
		String saida;
		if(this.anoNascimento < 0)
			saida = this.anoNascimento * -1 + " ABY";
		else
			saida = this.anoNascimento + " DBY";
		return saida;
	}
	
	String getDescricao() {
		String saida = this.nome + " (especie=" + this.especie + ", nascimento=" + this.getAnoNascimento() + ')';
		return saida;
	}
}