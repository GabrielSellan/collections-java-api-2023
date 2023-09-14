package map.Ordenacao.AgendaDeEventos;

import java.time.LocalDate;
import java.util.*;


public class AgendaEventos {

	private Map<LocalDate, Evento> eventoMap;

	public AgendaEventos() {
		this.eventoMap = new HashMap<>();
	}
	
	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		Evento evento = new Evento(nome, atracao);
		eventoMap.put(data, evento);
	}
	
	public void exibirAgenda() {
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		System.out.println(eventosTreeMap);
	}
	
	public void obterProximoEvento() {
		LocalDate dataAtual = LocalDate.now();
		LocalDate proximaData = null;
		Evento proximoEvento = null;
		Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
		for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
			if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
				proximaData = entry.getKey();
				proximoEvento = entry.getValue();
				System.out.println("O proximo evento: " + proximoEvento + " acontecera no data " + proximaData);
				break;
			}
		}
	}
	
	
	
}







