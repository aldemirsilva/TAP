import java.util.ArrayList;

public class SessaoJedi {
	String nome;
	TreinadorJedi treinador;
	ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();

	SessaoJedi(String nome, TreinadorJedi treinador) {
		this.nome = nome;
		this.treinador = treinador;
	}

	void addIniciado(IniciadoJedi iniciado) {
		if(!iniciados.contains(iniciado))
			iniciados.add(iniciado);
	}

	IniciadoJedi getIniciado(String nome) {
		IniciadoJedi jedi = new IniciadoJedi();
		for(int i = 0; i < iniciados.size(); i++) {
			if(iniciados.get(i).nome.equals(nome)) {
				jedi = iniciados.get(i);
			}
		}
		return jedi;
	}

	double getMediaAnoNascimento() {
		double soma = 0.0;
		for(int i = 0; i < iniciados.size(); i++) {
			soma += iniciados.get(i).anoNascimento;
		}
		return (double) soma/iniciados.size();
	}

	String getDescricao() {
		String saida = "--> SESSÃO " + this.nome + " (Treinador: " + treinador.getDescricao() + ')' + '\n';
		for(int i = 1; i <= iniciados.size(); i++) {
			saida += "  - Iniciado " + i + ": " + iniciados.get(i-1).getDescricao() + '\n';
		}
		return saida;
	}
}