public class Cliente {
	private int codigo;
	private String nome;
	private String endereco;
	private int telefone;
	
	public Cliente(int codigo, String nome, String endereco, int telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public int getTelefone() {
		return this.telefone;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}