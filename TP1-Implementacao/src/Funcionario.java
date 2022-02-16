public class Funcionario {
	private int matricula;
	private String nome;
	private String cargo;
	private String admissao;
	private String sexo;
	private String nacionalidade;
	
	public Funcionario(int matricula, String nome, String cargo, String admissao, String sexo, String nacionalidade) {
		this.matricula = matricula;
		this.nome = nome;
		this.cargo = cargo;
		this.admissao = admissao;
		this.sexo = sexo;
		this.nacionalidade = nacionalidade;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public String getAdmissao() {
		return this.admissao;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setAdmissao(String admissao) {
		this.admissao = admissao;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
}