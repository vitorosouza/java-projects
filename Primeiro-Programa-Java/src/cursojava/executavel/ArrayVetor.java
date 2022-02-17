package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		
		double[] notasCursoJava = {8.8,10,7.6,6.8};
		double[] notasLogica = {7.1,8.7,5.4,9.8};
		
		//Cria��o do Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Vitor Souza");
		aluno.setNomeEscola("CEAI");
		
		//Cria��o das Disciplinas
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notasCursoJava);
		//Add a disciplina na lista de disciplinas do aluno
		aluno.getDisciplinas().add(disciplina);
		
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Programa��o");
		disciplina2.setNota(notasLogica);
		//Add a disciplina na lista de disciplinas do aluno
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos = 0; pos < arrayAlunos.length; pos ++) {
			System.out.println("Nome do aluno �: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina �: " + d.getDisciplina());
				
				for (int posnota = 0; posnota < d.getNota().length; posnota ++) {
					System.out.println("A nota n�mero " + (posnota + 1) + " � igual = "+ d.getNota()[posnota]);
				}
				
			}
			
		}
		
		
		
		
	}

}
