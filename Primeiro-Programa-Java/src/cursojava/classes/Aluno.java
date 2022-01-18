package cursojava.classes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursojava.constantes.StatusAluno;

public class Aluno extends Pessoa{
    // Atributos da classe 
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    private List <Disciplina> disciplinas = new ArrayList<Disciplina>(); //Lista de Disciplinas do Aluno

    /*
    public Aluno(String nomePadrao) {
    	super.nome = nomePadrao;
		
	}
    
    public Aluno(String nomePadrao, int idadePadrao) {
    	super.nome = nomePadrao;
    	super.idade = idadePadrao;
    }
    */

	public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    //METODOS PERSONALIZADOS
    public double getMediaNota(){
        
        double somaNotas = 0.0;
        
        for (Disciplina disciplina : disciplinas){
            somaNotas += disciplina.getNota();
        }
        return  somaNotas / disciplinas.size();
    }
    
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 50){
            if(media >= 70){
               return StatusAluno.APROVADO;  
            } else {
                return StatusAluno.RECUPERACAO;
            }
        } else {
            return StatusAluno.REPROVADO;
        }
    } 
    
    //GETTERS E SETTERS
    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }
    
    //toString() 
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", registroGeral=" + registroGeral + ", dataNascimento=" + dataNascimento 
                + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" 
                + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + '}';
    }
    
    //Equals() e hashCode() para que o programa diferencie os objetos por nome e CPF, nesse caso
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.numeroCPF);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome))
        {
            return false;
        }
        if (!Objects.equals(this.numeroCPF, other.numeroCPF))
        {
            return false;
        }
        return true;
    }
    
}
