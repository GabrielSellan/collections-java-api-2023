package map.Pesquisa.ContagemDePalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	private Map<String, Integer> palavrasMap;
	
	
	
	
	public ContagemPalavras() {
		this.palavrasMap = new HashMap<>();
	}


	public void adicionarPalavra(String palavra, Integer contagem) {
		palavrasMap.put(palavra, contagem);
	}
	
	
	public void removerPalavra(String palavra) {
		palavrasMap.remove(palavra);
	}
	
	
	public void exibirContagemPalavras() {
		System.out.println(palavrasMap);
	}
	
	
	public String encontrarPalavraMaisFrequente() {
		String palavaEncontrada = "";
		int contagem = Integer.MIN_VALUE;
		for(Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
			if(entry.getValue() > contagem) {
				palavaEncontrada = entry.getKey();
				contagem = entry.getValue();
			}
		}
		return palavaEncontrada;
	}
	
	public static void main(String[] args) {
        ContagemPalavras contador = new ContagemPalavras();

        contador.adicionarPalavra("gato", 3);
        contador.adicionarPalavra("cachorro", 5);
        contador.adicionarPalavra("girafa", 2);
        contador.adicionarPalavra("elefante", 4);

        contador.exibirContagemPalavras();
        
        String palavraMaisFrequente = contador.encontrarPalavraMaisFrequente();
        System.out.println("Palavra mais frequente: " + palavraMaisFrequente);
    }
	
}
