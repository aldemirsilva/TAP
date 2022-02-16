public class Placa {
	String placa;
	int tipo;
	
	Placa() {
		this(null, 0);
	}
	
	Placa(String placa, int tipo) {
		this.placa = placa;
		this.tipo = tipo;
	}

	String getTipoString() {
		int tipo = this.tipo;
		String saida = null;

		switch(tipo) {
			case 1:
				saida = "Normal";
				break;
			case 2:
				saida = "Servico";
				break;
			case 3:
				saida = "Oficial";
				break;
			case 4:
				saida = "Auto Escola";
				break;
			case 5:
				saida = "Prototipo";
				break;
			case 6:
				saida = "Colecionador";
				break;
			default:
				saida = "Outros";
				break;
		}
		return saida;
	}
	
	boolean temEstacionamentoLivre() {
		if(this.tipo == 2 || this.tipo == 3)
			return true;
		else
			return false;
	}
	
	String getDescricao() {
		String saida = "Placa: placa=" + this.placa + ", tipo=" + this.getTipoString() + ", estacionamentoLivre=" + this.temEstacionamentoLivre() + ".";
		return saida;
	}
}