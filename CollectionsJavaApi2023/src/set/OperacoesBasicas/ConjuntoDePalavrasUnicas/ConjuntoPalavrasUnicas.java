package set.OperacoesBasicas.ConjuntoDePalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavrasSet;

	
	public ConjuntoPalavrasUnicas() {
		this.palavrasSet = new HashSet<>();
	}

	
	public Set<String> getPalavrasSet() {
		return palavrasSet;
	}

	
	public void adicionarPalavra(String palavra) {
		palavrasSet.add(palavra);
	}
	
	
	public void removerPalavra(String palavra) {
		String palavraRemover = null;
		for(String s : palavrasSet) {
			if(s == palavra) {
				palavraRemover = s;
				break;
			}
		}
		palavrasSet.remove(palavraRemover);
	}
	
	
	public String verificarPalavra(String palavra) {
		for(String s : palavrasSet) {
			if(s == palavra) {
				return "Esta palavra está no conjunto";
			}
		}
		return "Esta palavra não está no conjunto";
	}
	
	
	public void exibirPalavrasUnicas() {
		System.out.println(palavrasSet);
	}
	
	
	
	public static void main(String[] args) {
		
		ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();
		
		conjuntoPalavras.adicionarPalavra("Gabriel");
		conjuntoPalavras.adicionarPalavra("Bosta");
		conjuntoPalavras.adicionarPalavra("Jana");
		
		conjuntoPalavras.exibirPalavrasUnicas();
		
		conjuntoPalavras.removerPalavra("Bosta");
		
		conjuntoPalavras.exibirPalavrasUnicas();
		
		System.out.println(conjuntoPalavras.verificarPalavra("Jana"));
		
	}
	
	
	
	
}
