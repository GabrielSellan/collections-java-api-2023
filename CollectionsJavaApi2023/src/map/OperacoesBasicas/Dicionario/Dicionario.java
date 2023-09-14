package map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

	private Map<String, String> dicionarioMap;
	
	
	
	
	public Dicionario() {
		this.dicionarioMap = new HashMap<>();
	}


	public void adicionarPalavra(String palavra, String definicao) {
		dicionarioMap.put(palavra, definicao);
	}
	
	
	public void removerPalavra(String palavra) {
		if(!dicionarioMap.isEmpty()) {
			dicionarioMap.remove(palavra);
		}
	}
	
	
	public void exibirPalavras() {
		System.out.println(dicionarioMap);
	}
	
	
	public void pesquisarPorPalavra(String palavra) {
		String descricao = null;
		if(!dicionarioMap.isEmpty()) {
			descricao = dicionarioMap.get(palavra);
		}
		System.out.println(descricao);
	}
	
	
	
	
	public static void main(String[] args) {
	
		Dicionario d = new Dicionario();
		
		d.adicionarPalavra("Casa", "Uma residencia");
		d.adicionarPalavra("Carro", "Um veiculo");
		d.adicionarPalavra("Notebook", "Um pc portatil");
		
		d.removerPalavra("Casa");
		
		d.exibirPalavras();
		
		d.pesquisarPorPalavra("Carro");
		
		
	}
	
	
	
	
	
	
	
	
}
