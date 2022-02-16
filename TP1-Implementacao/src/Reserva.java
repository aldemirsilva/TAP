public class Reserva {
	private int codigoReserva;
	private int codigoCliente;
	private int numeroQuarto;
	private String tipoQuarto;
	private int capacidade;
	private double preco;
	private double adicional;
	private int idFuncionario;
	
	public Reserva(int codigoReserva, int codigoCliente, int numeroQuarto, String tipoQuarto, int capacidade,double preco, double adicional, int idFuncionario){
		this.codigoReserva = codigoReserva;
		this.codigoCliente = codigoCliente;
		this.numeroQuarto = numeroQuarto;
		this.tipoQuarto = tipoQuarto;
		this.capacidade = capacidade;
		this.preco = preco;
		this.adicional = adicional;
		this.idFuncionario = idFuncionario;
	}
	
	public int getCodigoReserva() {
		return this.codigoReserva;
	}
	
	public int getCodigoCliente() {
		return this.codigoCliente;
	}
	
	public int getNumeroQuarto() {
		return this.numeroQuarto;
	}
	
	public String getTipoQuarto() {
		return this.tipoQuarto;
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
	
	public int getIdFuncionario() {
		return this.idFuncionario;
	}

	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public void setNumeroQuarto(int numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}
	
	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
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
	
	public void setIdFuncionario(int idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
}