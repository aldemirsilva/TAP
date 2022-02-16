public class EnsalamentoMain
{
	public static void main(String[] args)
	{
		Ensalamento ensalamento = new Ensalamento();
		Sala sala101 = new Sala(6,101,50,true);
		Sala sala102 = new Sala(6,102,100,true);
		Turma aed = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
		aed.addHorario(1);
		aed.addHorario(15);
		aed.addHorario(29);
		Turma tp = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
		tp.addHorario(11);
		tp.addHorario(25);
		tp.addHorario(32);
		ensalamento.addSala(sala101);
		ensalamento.addSala(sala102);
		ensalamento.addTurma(aed);
		ensalamento.addTurma(tp);
		ensalamento.alocarTodas();
		System.out.println(ensalamento.relatorioSalasPorTurma());
		System.out.println(ensalamento.relatorioTurmasPorSala());
	}
}