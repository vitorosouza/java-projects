package projetofinal;

//Classe ABSTRATA nao pode instanciar OBJETOS
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    
    //Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }
    
    
    //Metodos GETTERS e SETTERS
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }
    
    //SOBRESCRICAO/OVERRIDE de um toString para mostrar os atributos
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + 
                ", idade=" + idade + 
                ", sexo=" + sexo + 
                ", experiencia=" + experiencia + '}';
    }
    
    
    
    
    
}
