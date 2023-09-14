package set.Ordenacao.CadastroDeProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

	private Set<Produto> produtoSet;

	
	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(cod, nome, preco, quantidade));
	}
	
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
		return produtoPorNome;
	}
	
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPreco());
		produtoPorPreco.addAll(produtoSet);
		return produtoPorPreco;
	}
	
	
	
}
