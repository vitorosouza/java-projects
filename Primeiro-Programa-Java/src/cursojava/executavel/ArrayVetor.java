package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	public static void main(String[] args) {
		
		//*** Pode ser declarado diretamente assim ***
		//double[] valores = {9.5,8.9,5.8};
		
		//***Tem tamb�m o Array de inteiros ***
		// int[] inteiros = new int[4];
		//*** Do tipo float ***
		// float[] floats = new float[10];
		
		//*** Se tiver v�rios tipos de dados, faz um Array de String ***
		/*String[] valores = new String[4];
		
		valores[0] = "alex";
		valores[1] = "90";
		valores[2] = "Curso Java";
		valores[3] = "contato@gmail.com"; */
		
		//***Pode ser declarado diretamente tamb�m ***
		/*String[] valores = {"alex","98.5","Curso de Java","contato@gmail.com","80"};
			
			//E para fazer a varredura:
			for (int pos = 0; pos < valores.length; pos++){
				System.out.println("Valor na posi��o " + pos + " � igual = " + valores[pos]);
			}
		
		String posicoes = JOptionPane.showInputDialog("Quantas posi��es o Array deve ter?");
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		//Entrada de valores de forma din�mica
		for(int pos = 0; pos < notas.length; pos++) {
			String valor = JOptionPane.showInputDialog("Qual o valor da posi��o = " + pos);
			notas[pos] = Double.valueOf(valor);
		}
		
		//Leitura de valores de forma din�mica
		for(int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota " + (pos + 1) + " � = " + notas[pos]);
		}
		 */
		
		double[] notasCursoJava = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.1,8.7,5.4,9.8};
		
		//Cria��o do Aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Vitoriano");
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
		
		
		
		
		
	}

}
