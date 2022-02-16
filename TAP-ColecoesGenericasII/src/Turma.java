import java.util.ArrayList;

public class Turma
{
	String nome, professor;
	int numAlunos;
	boolean acessivel;
	ArrayList<Integer> horarios = new ArrayList<Integer>();

	Turma()
	{
		this(null,null,0,false);
	}

	Turma(String nome, String professor, int numAlunos, boolean acessivel)
	{
		this.nome = nome;
		this.professor = professor;
		this.numAlunos = numAlunos;
		this.acessivel = acessivel;
	}

	void addHorario(int horario)
	{
		horarios.add(horario);
	}

	String getHorariosString()
	{
		int hora = 0, temp;
		String dia = new String(), saida = new String();
		for(int i = 0; i < horarios.size(); i++)
		{
			temp = horarios.get(i);
			if(temp >= 1 && temp <= 7)
				dia = "segunda";
			else if(temp >= 8 && temp <= 14)
				dia = "terça";
			else if(temp >= 15 && temp <= 21)
				dia = "quarta";
			else if(temp >= 22 && temp <= 28)
				dia = "quinta";
			else if(temp >= 29 && temp <= 35)
				dia = "sexta";

			switch(temp)
			{
			case 1:
			case 8:
			case 15:
			case 22:
			case 29:
				hora = 8;
				break;

			case 2:
			case 9:
			case 16:
			case 23:
			case 30:
				hora = 10;
				break;

			case 3:
			case 10:
			case 17:
			case 24:
			case 31:
				hora = 12;
				break;
				
			case 4:
			case 11:
			case 18:
			case 25:
			case 32:
				hora = 14;
				break;

			case 5:
			case 12:
			case 19:
			case 26:
			case 33:
				hora = 16;
				break;

			case 6:
			case 13:
			case 20:
			case 27:
			case 34:
				hora = 18;
				break;

			case 7:
			case 14:
			case 21:
			case 28:
			case 35:
				hora = 20;
				break;

			default:
				break;
			}

			if(i < horarios.size()-1)
				saida += dia + ' ' + hora + "hs" + ", ";
			else
				saida += dia + ' ' + hora + "hs";

		}
		return saida;
	}
	
	String getDescricao()
	{
		String saida = new String();
		saida += "Turma: " + this.nome + '\n';
		saida += "Professor: " + this.professor + '\n';
		saida += "Número de Alunos: " + this.numAlunos + '\n';
		saida += "Horário: " + this.getHorariosString() + '\n';
		saida += "Acessível: " + (this.acessivel == true ? "sim" : "não");
		return saida;
	}
}