public class SessaoJediMain {
	public static void main(String[] args) {
		IniciadoJedi syfodias = new IniciadoJedi("Sifo-Dyas", "Humano", -102);
		System.out.println(syfodias.getDescricao());
		
		TreinadorJedi kostana = new TreinadorJedi("Mestra Jedi", "Lene Kostana");
		System.out.println(kostana.getDescricao());
		
		SessaoJedi sessao = new SessaoJedi("Visão do futuro", kostana);
		sessao.addIniciado(syfodias);
		
		System.out.println(sessao.getDescricao());
	}
}