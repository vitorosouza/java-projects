package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		
		double[] notasCursoJava = {8.8,10,7.6,6.8};
		double[] notasLogica = {7.1,8.7,5.4,9.8};
		
		//Criação do Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Vitoriano");
		aluno.setNomeEscola("CEAI");
		
		//Criação das Disciplinas
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notasCursoJava);
		//Add a disciplina na lista de disciplinas do aluno
		aluno.getDisciplinas().add(disciplina);
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Programação");
		disciplina2.setNota(notasLogica);
		//Add a disciplina na lista de disciplinas do aluno
		aluno.getDisciplinas().add(disciplina2);
		
		
		
		
		
		
	}

}
