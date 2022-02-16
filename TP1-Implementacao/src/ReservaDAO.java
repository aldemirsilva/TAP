import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReservaDAO extends BancoDeDados {
	public void listarReservas() {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from reservas");
			while(rs.next()) {
				System.out.println("Código da reserva: " + rs.getInt(1) + " | Código do cliente: " + rs.getInt(2) + " | Número do quarto: " + rs.getInt(3) + " | Tipo do quarto: " + rs.getString(4) + " | Capacidade: " + rs.getInt(5) + " | Preço: " + rs.getDouble(6) + " | adicional: " + rs.getDouble(7) + " | Funcionário: " + rs.getInt(8));
			}
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public boolean adicionarReserva(Reserva r) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("INSERT INTO reservas VALUES (null,'" + r.getCodigoCliente() + "','" + r.getNumeroQuarto() + "','" + r.getTipoQuarto() + "','" + r.getAdicional() + "','" + r.getIdFuncionario() + "')");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public Reserva getReserva(int codigoReserva) {
		try {
			Statement st = conexao.createStatement();
			ResultSet rs = st.executeQuery("select * from reservas where " + "codigoReserva='" + codigoReserva + "'");
			if (rs.next()) {
				return new Reserva(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getInt(5), rs.getDouble(6),rs.getDouble(7),rs.getInt(8));
			}
			else
				return null;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public boolean atualizarReserva(Reserva r) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("update reservas set codigoReserva='" + r.getCodigoReserva() + "',codigoCliente='" + r.getCodigoCliente() + "',numeroQuarto='" + r.getNumeroQuarto() + "',tipoQuarto='" + r.getTipoQuarto() + "'capacidade='" + r.getCapacidade() + "'preco'" + r.getPreco() + "',adicional='" + r.getAdicional() + "',idFuncionario='" + r.getIdFuncionario() + "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean removerReserva(Reserva r) {
		try {
			Statement st = conexao.createStatement();
			st.executeUpdate("delete from reservas where codigoReserva='" + r.getCodigoReserva() + "'");
			return true;
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}