import java.util.*;

public class Ensalamento
{
	ArrayList<Sala> salas;
	ArrayList<Turma> turmas;
	ArrayList<TurmaEmSala> ensalamento;

	public Ensalamento()
	{
		salas = new ArrayList<Sala>();
		turmas = new ArrayList<Turma>();
		ensalamento = new ArrayList<TurmaEmSala>();
	}
	
	public void addSala(Sala sala)
	{
		salas.add(sala);
	}
	
	public void addTurma(Turma turma)
	{
		turmas.add(turma);
	}
	
	public Sala getSala(Turma turma)
	{
		Sala sala = null;
		for (TurmaEmSala element : ensalamento)
		{
			if(element.turma.equals(turma))
				sala = element.sala;
		}
		return sala;
	}
	
	public boolean salaDisponivel(Sala sala, int horario)
	{
		for(TurmaEmSala element : ensalamento)
		{
			for(Integer element2 : element.turma.horarios)
			{
				if(element2.equals(horario))
					return false;
			}
		}
		return true;
	}
	
	public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios)
	{
		for(TurmaEmSala element : ensalamento)
		{
			if(element.sala.equals(sala))
			{
				for(Integer inteiro : element.turma.horarios)
				{
					for(Integer inteiro2 : horarios)
					{
						if(inteiro.equals(inteiro2))
						{
							return false;
						}
					}
				}
			}
		}
		return true;
	}
	
	public boolean alocar(Turma turma, Sala sala)
	{
		if(((turma.acessivel == true && sala.acessivel == true) || (turma.acessivel == false && sala.acessivel == true) || (turma.acessivel == false && sala.acessivel == false)) && (turma.numAlunos <= sala.capacidade) && salaDisponivel(sala, turma.horarios))
		{
			TurmaEmSala turmaEmSala = new TurmaEmSala(turma,sala);
			ensalamento.add(turmaEmSala);
			return true;
		}
		else
			return false;
	}
	
	public void alocarTodas()
	{
		for(Turma turma : turmas)
		{
			for(Sala sala : salas) {
				if(alocar(turma,sala) == true)
					break;
			}
		}
	}
	
	public int getTotalTurmasAlocadas()
	{
		int cont = 0;
		for(TurmaEmSala element : ensalamento)
		{
			if(element.turma != null)
				cont++;
		}
		return cont;
	}
	
	public int getTotalEspacoLivre()
	{
		int cont = 0; 
		for(TurmaEmSala element : ensalamento)
		{
			if(element.turma != null)
			{
				cont += element.sala.capacidade - element.turma.numAlunos;
			}
		}
		return cont;
	}
	
	public String relatorioResumoEnsalamento()
	{
		String saida = new String();
		saida += "Total de Salas: " + salas.size() + '\n';
		saida += "Total de Turmas: " + turmas.size() + '\n';
		saida += "Turmas Alocadas: " + ensalamento.size() + '\n';
		saida += "Espaços Livres: " + getTotalEspacoLivre();
		return saida;
	}
	
	public String relatorioTurmasPorSala()
	{
		String saida = relatorioResumoEnsalamento() + "\n\n";
		for(Sala element : salas)
		{
			saida += "--- " + element.getDescricao() + " ---" + "\n\n";
			for(TurmaEmSala turma :  ensalamento)
			{
				if(turma.sala == element)
				{
					saida += turma.turma.getDescricao() + "\n\n";
				}
			}
		}
		return saida;
	}
	
	public String relatorioSalasPorTurma()
	{
		String saida = relatorioResumoEnsalamento() + "\n\n";
		Sala sala;
		for(Turma turma : turmas)
		{
			saida += turma.getDescricao();
			sala = getSala(turma);
			saida += '\n' + "Sala: " + (sala == null ? "SEM SALA" : sala.getDescricao()) + "\n\n";
		}
		return saida;
	}
}