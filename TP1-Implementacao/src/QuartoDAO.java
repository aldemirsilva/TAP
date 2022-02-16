import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuartoDAO extends BancoDeDados {

	public void listarQuartos() {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from quartos");
			while(rs.next()) {
				System.out.println("Número: " + rs.getInt(1) + " | Tipo: " + rs.getString(2) + " | Capacidade: " + rs.getString(3) + " | Preço: " + rs.getString(4) + " | Adicional: " + rs.getString(5));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean adicionarQuarto(Quarto q) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO quartos VALUES (default,'" + q.getTipo() + "','" + q.getCapacidade() + "','" + q.getPreco() + "','" + q.getAdicional() + "')");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public Quarto getQuarto(int numero) {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from quartos where " + "numero='" + numero + "'");
			if (rs.next()) {
				return new Quarto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getDouble(5));
			}
			else
				return null;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean atualizarQuarto(Quarto q) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("update quartos set numero='" + q.getNumero() + "',tipo='" + q.getTipo() + "',capacidade='" + q.getCapacidade() + "',preco='" + q.getPreco() + "',adicional='" + q.getAdicional() + "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean removerQuarto(Quarto q) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("delete from quartos where numero='" + q.getNumero() + "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}