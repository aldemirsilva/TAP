public class Personagem {
	private int id;
	private String apelido;
	private String nome;
	private String filme;
//	private Citacao[] citacoes;
	
	public Personagem(String apelido, String nome, String filme) {
		this.apelido = apelido;
		this.nome = nome;
		this.filme = filme;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getApelido() {
		return this.apelido;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getFilme() {
		return this.filme;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setFilme(String filme) {
		this.filme = filme;
	}
}
