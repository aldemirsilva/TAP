import java.sql.*;

public class PersonagemDAO extends BancoDeDados {
	
	public void listarPersosnagens() {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from personagens");
			while(rs.next()) {
				System.out.println("Personagem " + rs.getString(2) + " (" + rs.getString(3) + ")" + " do filme " + rs.getString(4));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean adicionarPersonagem(Personagem p) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO personagens VALUES (NULL, '" + p.getApelido() + "'," + " '" + p.getNome() + "', '" + p.getFilme() + "')");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public Personagem getPersonagem(String apelido) {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select *from personagens where " + "apelido='" + apelido + "'");
			if (rs.next()) {
				return new Personagem(rs.getString(2), rs.getString(3), rs.getString(4));
			}
			else
				return null;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public static void main(String args[]) {
		PersonagemDAO personagemDAO = new PersonagemDAO();
		Personagem personagem = personagemDAO.getPersonagem("sdflsdj");
		System.out.println(personagem.getNome());

//		Personagem personagem = new Personagem("Drax", "Drax the Destroyer", "Guardians of the Galaxy");
//		personagemDAO.adicionarPersonagem(personagem);
//		personagemDAO.listarPersosnagens();
	}
}