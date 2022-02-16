import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClienteDAO extends BancoDeDados {

	public void listarClientes() {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from clientes");
			while(rs.next()) {
				System.out.println("Código: " + rs.getInt(1) + " | Nome: " + rs.getString(2) + " | Endereço: " + rs.getString(3) + " | Telefone: " + rs.getString(4));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean adicionarCliente(Cliente c) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO clientes VALUES (default,'" + c.getNome() + "','" + c.getEndereco() + "','" + c.getTelefone() + "')");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public Cliente getCliente(int codigo) {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from clientes where " + "codigo='" + codigo + "'");
			if (rs.next()) {
				return new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			}
			else
				return null;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean atualizarCliente(Cliente c) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("update clientes set codigo='" + c.getCodigo() + "',nome='" + c.getNome() + "',endereco='" + c.getEndereco() + "',telefone='" + c.getTelefone() +  "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean removerCliente(Cliente c) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("delete from clientes where codigo='" + c.getCodigo() + "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}