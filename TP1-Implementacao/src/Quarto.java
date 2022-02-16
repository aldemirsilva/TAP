public class Quarto {
	private int numero;
	private String tipo;
	private int capacidade;
	private double preco;
	private double adicional;
	
	public Quarto(int numero, String tipo, int capacidade, double preco, double adicional) {
		this.numero = numero;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.preco = preco;
		this.adicional = adicional;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public double getAdicional() {
		return this.adicional;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
}