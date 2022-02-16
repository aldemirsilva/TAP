public class TreinadorJedi {
	String titulacao, nome;
	
	TreinadorJedi() {
		this(null,null);
	}
	
	TreinadorJedi(String titulacao, String nome) {
		this.titulacao = titulacao;
		this.nome = nome;
	}
	
	String getDescricao() {
		String retorno = this.titulacao + " " + this.nome;
		return retorno;
	}
}