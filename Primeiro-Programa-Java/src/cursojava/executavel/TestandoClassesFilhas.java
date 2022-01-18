package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Vítor");
		aluno.setNomeEscola("CSCS");
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("9283434");
		diretor.setNome("Marcos");
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Engenharia de Automação");
		secretario.setNumeroCPF("97239847234");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
	}
	
}
