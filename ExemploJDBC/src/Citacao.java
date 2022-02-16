public class Citacao {
	private int id;
	private Personagem personagem;
	private String citacao;
	
	public Citacao(Personagem personagem, String citacao) {
		this.personagem = personagem;
		this.citacao = citacao;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Personagem getPersonagem() {
		return this.personagem;
	}
	
	public String getCitacao() {
		return this.citacao;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	public void setCitacao(String citacao) {
		this.citacao = citacao;
	}
}
