package list.OperacoesBasicas.CarinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Item> listaItens;
	
	public CarrinhoDeCompras() {
		this.listaItens = new ArrayList<>();
	}
	
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		listaItens.add(new Item(nome,preco,quantidade));
	}
	
	
	public void removerItem(String nome) {
		List<Item> itensRemover = new ArrayList<>();
		for(Item i : listaItens) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				itensRemover.add(i);
			}
		}
		listaItens.removeAll(itensRemover);
	}
	
	
	public double calcularValorTotal() {
		double precoTotal = 0.0;
		for(Item i : listaItens) {
			precoTotal += i.getPreco() * i.getQuantidade();
		}
		
		return precoTotal;
	}
	
	
	public void exibirItens() {
		System.out.println(listaItens);
	}
	
	
	public static void main(String[] args) {
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adicionarItem("Notebook", 3000.00, 1);
		carrinho.adicionarItem("Mulher", 300.00, 2);
		
		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
		
		carrinho.removerItem("Mulher");
		
		carrinho.exibirItens();
		System.out.println(carrinho.calcularValorTotal());
		
		
		
	}
	
	
	
	
}
