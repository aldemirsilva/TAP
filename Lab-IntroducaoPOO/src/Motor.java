public class Motor {
	int tipo;
	double capacidade;
	int potencia;
	
	Motor() {
		this(0, 0.0, 0);
	}
	
	Motor(int tipo, double capacidade, int potencia) {
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.potencia = potencia;
	}
	
	String getTipoString() {
		int tipo = this.tipo;
		String saida = null;

		switch(tipo) {
			case 1:
				saida = "Gasolina";
				break;
			case 2:
				saida = "Alcool";
				break;
			case 3:
				saida = "Flex";
				break;
			case 4:
				saida = "Diesel";
				break;
			case 5:
				saida = "Eletrico";
				break;
			default:
				saida = "Outros";
				break;
		}
		return saida;
	}
	
	String getDescricao() {
		String saida = "Motor: tipo=" + this.getTipoString() + ", capacidade=" + this.capacidade + "L" + ", potencia=" + this.potencia + "CV" + ".";
		return saida;
	}

}

