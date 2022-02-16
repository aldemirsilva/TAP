import java.util.*;

public class ListaInvertida {
	private Hashtable<String, LinkedList<String>> tabela;

	public ListaInvertida() {
		tabela = new Hashtable<String, LinkedList<String>>();
	}
	
	public boolean insere(String palavra, String documento) {
		LinkedList<String> lista = this.tabela.get(palavra);
		if(lista != null && !lista.contains(documento)) {
			lista.add(documento);
			return true;
		}
		else if(lista != null && lista.contains(documento)) {
			return false;
		}
		else if(lista == null) {
			lista = new LinkedList<String>();
			lista.add(documento);
			tabela.put(palavra, lista);
			return true;
			}
		return false;
		}
	
	public LinkedList<String> busca(String palavra) {
		LinkedList<String> 
		lista = this.tabela.get(palavra);
		return lista;
	}
	
	@Override
	public String toString() {
		return this.tabela.toString();
	}
}