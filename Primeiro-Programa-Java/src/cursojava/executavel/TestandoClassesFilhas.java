package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Vítor");
		aluno.setNomeEscola("CSCS");
		aluno.setIdade(20);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("9283434");
		diretor.setNome("Marcos");
		diretor.setIdade(17);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Engenharia de Automação");
		secretario.setNumeroCPF("97239847234");
		secretario.setIdade(60);
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		
		System.out.println("Salário do Aluno é de " + aluno.salario());
		System.out.println("Salário do Diretor é de " + diretor.salario());
		System.out.println("Salário do Secretário é de " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
		
		
		
	}
	
	public static void teste(Pessoa pessoa) {
		System.out.println("O(a) " + pessoa.getNome() + " é demais! E o salário é de " + pessoa.salario() + " Reais");
		
		
		
	}
	
	
	
}
