package cursojava.executavel;

import cursojava.classes.Aluno;
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
        String disciplina1 = JOptionPane.showInputDialog("Qual a materia 1?");
        String nota1 = JOptionPane.showInputDialog("Nota 1");
        String disciplina2 = JOptionPane.showInputDialog("Qual a materia 2?");
        String nota2 = JOptionPane.showInputDialog("Nota 2");
        String disciplina3 = JOptionPane.showInputDialog("Qual a materia 3?");
        String nota3 = JOptionPane.showInputDialog("Nota 3");
        String disciplina4 = JOptionPane.showInputDialog("Qual a materia 4?");
        String nota4 = JOptionPane.showInputDialog("Nota 4");
        
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
        
        //BASICAMENTE, COMO CRIAMOS O OBJETO DISCIPLINA, A GENTE RESGATA O OBJETO E SETA O ATRIBUTO
        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
        
        aluno1.getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);
        
        //Mostrando os resultados
        System.out.println(aluno1.toString());
        //Calcula a media
        System.out.println("Media do aluno: " + aluno1.getMediaNota());
        //Mostra o resultado
        System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
        
        
       
        
        

    }
    
}
