package set.Ordenacao.ListaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> alunoSet;

	
	public GerenciadorAlunos() {
		this.alunoSet = new HashSet<>();
	}

	
	public void adicionarAluno(String nome, Long matricula, double media) {
		alunoSet.add(new Aluno(nome, matricula, media));
	}

	
	public void removerAluno(long matricula) {
		Aluno alunoRemover = null;
		for(Aluno a : alunoSet) {
			if(a.getMatricula() == matricula) {
				alunoRemover = a;
			}
		}
		alunoSet.remove(alunoRemover);
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
		return alunosPorNome;
	}
	
	
	public Set<Aluno> exibirAlunosPorNota(){
		Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
		alunosPorNota.addAll(alunoSet);
		return alunosPorNota;
	}
	
	
	public Set<Aluno> exibirAlunos(){
		return alunoSet;
	}
	
	
	public static void main(String[] args) {
	
		GerenciadorAlunos alunos = new GerenciadorAlunos();
		
		alunos.adicionarAluno("Gabriel", 1234567890L, 30D);
		alunos.adicionarAluno("Pedro", 123456345L, 12D);
		alunos.adicionarAluno("Luiza", 1234567890L, 26D);
		alunos.adicionarAluno("Renato", 1567890L, 22D);
		
		System.out.println();
		
		System.out.println(alunos.exibirAlunos());
		alunos.removerAluno(1234567890L);
		System.out.println(alunos.exibirAlunos());
	
		System.out.println();
		
		System.out.println(alunos.exibirAlunosPorNome());
		System.out.println(alunos.exibirAlunosPorNota());
		
	}
	
}
