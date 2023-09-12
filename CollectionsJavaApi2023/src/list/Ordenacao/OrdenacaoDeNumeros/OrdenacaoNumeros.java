package list.Ordenacao.OrdenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	private List<Integer> listaNum;

	public OrdenacaoNumeros() {
		this.listaNum = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaNum.add(numero);
	}
	
	public List<Integer> ordenarAscendente() {
		List<Integer> numAscendentes = new ArrayList<>(listaNum);
		Collections.sort(numAscendentes);
		return numAscendentes;
	}
	
	public List<Integer> ordenarDecrescente() {
		List<Integer> numDecrescentes = new ArrayList<>(listaNum);
		numDecrescentes.sort(Collections.reverseOrder());
		return numDecrescentes;
	}
	
	
	  public void exibirNumeros() {
		    if (!listaNum.isEmpty()) {
		      System.out.println(this.listaNum);
		    } else {
		      System.out.println("A lista está vazia!");
		    }
		  }
	
	
	public static void main(String[] args) {
	    // Criando uma instância da classe OrdenacaoNumeros
	    OrdenacaoNumeros numeros = new OrdenacaoNumeros();

	    // Adicionando números à lista
	    numeros.adicionarNumero(2);
	    numeros.adicionarNumero(5);
	    numeros.adicionarNumero(4);
	    numeros.adicionarNumero(1);
	    numeros.adicionarNumero(99);

	    // Exibindo a lista de números adicionados
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem ascendente
	    System.out.println(numeros.ordenarAscendente());

	    // Exibindo a lista
	    numeros.exibirNumeros();

	    // Ordenando e exibindo em ordem descendente
	    System.out.println(numeros.ordenarDecrescente());

	    // Exibindo a lista
	    numeros.exibirNumeros();
	  }
}
