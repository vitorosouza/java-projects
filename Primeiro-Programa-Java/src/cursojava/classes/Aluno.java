package cursojava.classes;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    // Atributos da classe 
    private String nome;
    private int idade;
    private String registroGeral;
    private String dataNascimento;
    private String numeroCPF;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    
    //Instanciando um objeto dentro do outro (isso para o metodo antigo, o novo sera para implementar uma lista
    /*private Disciplina disciplina = new Disciplina();*/
    
    //Lista de Disciplinas do Aluno
    private List <Disciplina> disciplinas = new ArrayList<Disciplina>();

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
    
    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 70){
           return true;
        } else {
            return false;
        }
    }
    
    public String getAlunoAprovado2(){
        double media = this.getMediaNota();
        if (media >= 70){
           return "Aluno aprovado!";
        } else {
            return "Aluno Reprovado";
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
    //Nota que no disciplina, ele ta mostrando o objeto disciplina todo, porem para que apareça e necessario criar um toString() dentro do objeto Disciplina para que apareça
    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", idade=" + idade + ", registroGeral=" + registroGeral + ", dataNascimento=" + dataNascimento 
                + ", numeroCPF=" + numeroCPF + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" 
                + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + '}';
    }
    
    //Equals() e hashCode() para que o programa diferencie os objetos por nome e CPF
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
