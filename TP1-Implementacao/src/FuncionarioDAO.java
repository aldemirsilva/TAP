import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FuncionarioDAO extends BancoDeDados {
	
	public void listarFuncionarios() {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from funcionarios");
			while(rs.next()) {
				System.out.println("Matrícula: " + rs.getInt(1) + " | nome: " + rs.getString(2) + " | cargo: " + rs.getString(3) + " | sexo: " + rs.getString(5) + " | país de origem: " + rs.getString(6) + " | data de admissão: " + rs.getString(4));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean adicionarFuncionario(Funcionario f) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO funcionarios VALUES (default,'" + f.getNome() + "','" + f.getCargo() + "','" + f.getAdmissao() + "','" + f.getSexo() + "','" + f.getNacionalidade() + "')");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public Funcionario getFuncionario(int matricula) {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from funcionarios where " + "matricula='" + matricula + "'");
			if (rs.next()) {
				return new Funcionario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
			}
			else
				return null;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean atualizarFuncionario(Funcionario f) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("update funcionarios set nome='" + f.getMatricula() + "',nome='" + f.getNome() + "',cargo='" + f.getCargo() + "',admissao='" + f.getAdmissao() + "',sexo='" + f.getSexo() + "',nacionalidade='" + f.getNacionalidade() + "' where matricula='" + f.getMatricula() + "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean removerFuncionario(Funcionario f) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("delete from funcionarios where matricula='" + f.getMatricula() + "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}