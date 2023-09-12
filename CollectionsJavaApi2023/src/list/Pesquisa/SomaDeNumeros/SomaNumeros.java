package list.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Integer> numeros;

	
	public SomaNumeros() {
		this.numeros = new ArrayList<>();
	}
	
	
	public void adicionarNumero(int numero) {
		numeros.add(numero);
	}
	
	
	public int calcularSoma() {
		int soma = 0;
		if(!numeros.isEmpty()) {
			for(int i : numeros){
				soma += i; 
			}
		}
		return soma;
	}
	
	
	public int encontrarMaiorNumero() {
		int maiorNum = Integer.MIN_VALUE;
		if(!numeros.isEmpty()) {
			for(int i : numeros){
				if(i > maiorNum) {
					maiorNum = i;
				}
			}
		}
		return maiorNum;
	}
	
	
	public int encontrarMenorNumero() {
		int menorNum = Integer.MAX_VALUE;
		if(!numeros.isEmpty()) {
			for(int i : numeros){
				if(i < menorNum) {
					menorNum = i;
				}
			}
		}
		return menorNum;
	}
	
	
	public List<Integer> exibirNumeros() {
		return numeros;
	}
	
	
	public static void main(String[] args) {
		SomaNumeros listaNum = new SomaNumeros();
		
		listaNum.adicionarNumero(2);
		listaNum.adicionarNumero(1);
		listaNum.adicionarNumero(5);
		listaNum.adicionarNumero(2);
		
		System.out.println(listaNum.calcularSoma());
		System.out.println(listaNum.encontrarMaiorNumero());
		System.out.println(listaNum.encontrarMenorNumero());
		System.out.println(listaNum.exibirNumeros());
		
		
	}
	

}
