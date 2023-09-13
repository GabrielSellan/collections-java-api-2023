package set.Pesquisa.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	//atributo
	private Set<Tarefa> tarefaList;

	
	public ListaTarefas() {
		this.tarefaList = new HashSet<>();
	}
	
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	
	public void removerTarefa(String descricao) {
		Tarefa tarefaParaRemover = null;
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefaParaRemover = t;
				break;
			}
		}
		tarefaList.remove(tarefaParaRemover);
	}
	
	
	public void exibirTarefas() {
		System.out.println(tarefaList);
	}
	
	
	public int contarTarefas() {
		return tarefaList.size();
	}
	
	
	public Set<Tarefa> obterTarefasConcluidas(){
		Set<Tarefa> tarefasConcluidas = new HashSet<>();
		for(Tarefa t : tarefaList) {
			if(t.isConcluida() == true) {
				tarefasConcluidas.add(t);
			}
		}
		return tarefasConcluidas;
	}
	

	public Set<Tarefa> obterTarefasPendentes(){
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		for(Tarefa t : tarefaList) {
			if(t.isConcluida() == false) {
				tarefasPendentes.add(t);
			}
		}
		return tarefasPendentes;
	}
	
	
	public void marcarTarefaConcluida(String descricao) {
		Tarefa tarefaMudada = null;
		for(Tarefa t : tarefaList) {
			if(t.isConcluida() == false) {
				t.setConcluida(true);
				tarefaMudada = t;
				break;
			}
		}
		System.out.println(tarefaMudada + " agora está como concluida!");
	}
	
	
	public void marcarTarefaPendente(String descricao){
		Tarefa tarefaMudada = null;
		for(Tarefa t : tarefaList) {
			if(t.isConcluida() == true) {
				t.setConcluida(false);
				tarefaMudada = t;
				break;
			}
		}
		System.out.println(tarefaMudada + " agora está como concluida!");
	}
	
	
	public void limparListaTarefas() {
		tarefaList.clear();
	}
	
	
	
	public static void main(String[] args) {
		ListaTarefas listaTarefa = new ListaTarefas();
		
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.contarTarefas());
		
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 2");
		listaTarefa.adicionarTarefa("Tarefa 3");
		listaTarefa.adicionarTarefa("Tarefa 4");
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.contarTarefas());
		
		listaTarefa.exibirTarefas();
		
		listaTarefa.removerTarefa("Tarefa 1");
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.contarTarefas());
		
		listaTarefa.exibirTarefas();
		
		listaTarefa.marcarTarefaConcluida("Tarefa 4");
		
		System.out.println(listaTarefa.obterTarefasConcluidas());
		System.out.println(listaTarefa.obterTarefasPendentes());
		
		
		
	}
	
}
