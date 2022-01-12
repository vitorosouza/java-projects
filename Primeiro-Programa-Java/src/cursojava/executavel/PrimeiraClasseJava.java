package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

    public static void main(String[] args) {
        
        //ENTRADA DE DADOS
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a sua idade?");
        String dataNascimento = JOptionPane.showInputDialog("Qual sua data de nascimento?");
        String rg = JOptionPane.showInputDialog("Qual o seu RG?");
        String cpf = JOptionPane.showInputDialog("Qual o seu CPF?");
        String mae = JOptionPane.showInputDialog("Qual o nome da sua mae?");
        String pai = JOptionPane.showInputDialog("Qual o nome do seu pai?");
        String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula?");
        String serie = JOptionPane.showInputDialog("Qual a seria matriculada?");
        String escola = JOptionPane.showInputDialog("Qual o nome da escola?");
        
        // new Aluno() e uma instancia (Criacao de Objeto) e a variavel aluno1 e uma referencia para o objeto Aluno
        Aluno aluno1 = new Aluno(); 
        
        
        //BASICAMENTE, COMO CRIAMOS O OBJETO DISCIPLINA, A GENTE RESGATA O OBJETO E SETA O ATRIBUTO
        //Settando (passando) os dados
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(rg);
        aluno1.setNumeroCPF(cpf);
        aluno1.setNomeMae(mae);
        aluno1.setNomePai(pai);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setSerieMatriculado(serie);
        aluno1.setNomeEscola(escola);
        
        //RECEBER DE FORMA DINAMICA AS MATERIAS E NOTAS
        for (int pos = 1; pos <= 4; pos++){
            String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos +"?"); //Pede o nome das disciplinas
            String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos +"?"); //Pede a nota das disciplinas
            
            Disciplina disciplina = new Disciplina(); //Cria um objeto disciplina do tipo Disciplina
            disciplina.setDisciplina(nomeDisciplina); // 
            disciplina.setNota(Double.valueOf(notaDisciplina));
            
            aluno1.getDisciplinas().add(disciplina);
        }
       
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina? ");
        
        if(escolha == 0){
            String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina? 1, 2, 3 ou 4?");
            aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover));
            
        }
        
        System.out.println(aluno1.toString());
        System.out.println("Media do aluno: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
        
    }
    
}
