package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class PrimeiraClasseJava {

    public static void main(String[] args) {
    	
    	String login = JOptionPane.showInputDialog("Informe o login");
    	String senha = JOptionPane.showInputDialog("Informe a senha");
    	
    	
    	PermitirAcesso permitirAcesso = new Secretario(login, senha);
    	
    	
    	//Referência direta à interface, já dentro do criador de objeto do tipo Secretario, eu já tenha os atributos e métodos necessários
    	if (new FuncaoAutenticacao(permitirAcesso).autenticar()) { //Vou travar o contrato para autorizar somente quem tem autorização
    		
    			
    		List<Aluno> alunos = new ArrayList<Aluno>();
        
    		//È uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também
    		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
        
    		for (int qtd = 1; qtd<=2; qtd++){
    			//ENTRADA DE DADOS 
    			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd +"?"); /*
        		String idade = JOptionPane.showInputDialog("Qual a sua idade?");
        		String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
        		String rg = JOptionPane.showInputDialog("Qual o seu RG?");
        		String cpf = JOptionPane.showInputDialog("Qual o seu CPF?");
        		String mae = JOptionPane.showInputDialog("Qual o nome da sua mae?");
        		String pai = JOptionPane.showInputDialog("Qual o nome do seu pai?");
        		String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula?");
        		String serie = JOptionPane.showInputDialog("Qual a seria matriculada?");
        		String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
    			 	*/
    			
    			// new Aluno() e uma instancia (Criacao de Objeto) e a variavel aluno1 e uma referencia para o objeto Aluno
    			Aluno aluno1 = new Aluno(); 
    			
    			//Settando (passando) os dados
    			aluno1.setNome(nome);	/*
        		aluno1.setIdade(Integer.valueOf(idade));
        		aluno1.setDataNascimento(dataNascimento);
        		aluno1.setRegistroGeral(rg);
        		aluno1.setNumeroCPF(cpf);
        		aluno1.setNomeMae(mae);
        		aluno1.setNomePai(pai);
        		aluno1.setDataMatricula(dataMatricula);
        		aluno1.setSerieMatriculado(serie);
        		aluno1.setNomeEscola(escola);
    			 	*/
        
    			//RECEBER DE FORMA DINAMICA AS DISCIPLINAS E NOTAS
    			for (int pos = 1; pos <= 1; pos++){
    				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos +"?"); //Pede o nome das disciplinas
    				String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos +"?"); //Pede a nota das disciplinas
            
    				Disciplina disciplina = new Disciplina(); //Cria um objeto disciplina do tipo Disciplina
    				disciplina.setDisciplina(nomeDisciplina); // 
    				disciplina.setNota(Double.valueOf(notaDisciplina));
            
    				aluno1.getDisciplinas().add(disciplina);
    			}
       
    			//REMOVER DISCIPLINAS---------------------------------------------------------------------------------
    			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
        
    			if(escolha == 0){ //Opção SIM é o 0 (zero)
            
    				int continuarRemover = 0;
    				int posicao = 1;
            
    				while(continuarRemover == 0){
                
    					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4?");
    					aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - posicao);
    					posicao ++;
    					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
    				}
    			}//----------------------------------------------------------------------------------------------------
        
    			alunos.add(aluno1); //Add o aluno na lista
    		}
        
    		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
    		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
    		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
        
    		for (Aluno aluno : alunos) { //SEPAREI EM LISTAS
        	
    			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
    				maps.get(StatusAluno.APROVADO).add(aluno);
    			} else 
    				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
    					maps.get(StatusAluno.RECUPERACAO).add(aluno);
    				} else {
    					maps.get(StatusAluno.REPROVADO).add(aluno);
    				}
    			}
        
    		//PROCESSANDO ESSAS LISTAS
    			// Lista dos Aprovados
    		System.out.println("---------------Lista dos Aprovados------------------");
    		for (Aluno aluno : maps.get(StatusAluno.APROVADO)){
    			System.out.println("O aluno " + aluno.getNome() + " teve o resultado de " + aluno.getAlunoAprovado2() + " e com média de " + aluno.getMediaNota() + " pontos.");
    		}
        
    			// Lista dos Reprovados
    		System.out.println("---------------Lista dos Reprovados------------------");
    		for (Aluno aluno: maps.get(StatusAluno.REPROVADO)) {
    			System.out.println("O aluno " + aluno.getNome() + " teve o resultado de " + aluno.getAlunoAprovado2() + " e com média de " + aluno.getMediaNota() + " pontos.");
    		}
        
    			// Lista dos em Recuperação   
    		System.out.println("---------------Lista dos em Recuperação------------------");
    		for (Aluno aluno: maps.get(StatusAluno.RECUPERACAO)) {
    			System.out.println("O aluno " + aluno.getNome() + " teve o resultado de " + aluno.getAlunoAprovado2() + " e com média de " + aluno.getMediaNota() + " pontos.");
    		}
    		
    		} else {
    			JOptionPane.showMessageDialog(null, "Acesso Negado!");
    		}
    	
    	}	
    	
}
