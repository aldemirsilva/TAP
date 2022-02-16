public class Carro {
	String marca, modelo;
	Proprietario proprietario;
	Placa placa;
	Motor motor;
	
	Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.proprietario = proprietario;
		this.placa = placa;
		this.motor = motor;
	}
	
	String getDescricao() {
		String saida = "Carro "+ this.marca + "/" + this.modelo + ". Proprietario: nome=" + this.proprietario.nome + ", cnh=" + proprietario.cnh + ", anoNascimento=" + this.proprietario.anoNascimento + ". Placa: placa=" + this.placa.placa + ", tipo=" + this.placa.getTipoString() + ", estacionamentoLivre=" + this.placa.temEstacionamentoLivre() + ". Motor: tipo=" + motor.getTipoString() + ", capacidade=" + this.motor.capacidade + "L, potencia=" + this.motor.potencia + "CV" + ".";
		return saida;
	}
}