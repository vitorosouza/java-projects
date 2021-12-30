package aula13.polimorfismo02;

public abstract class Animal {
    //Atributos da CLASSE ABSTRATA (CLASSE PROGENITORA)
    protected float peso;
    protected int idade;
    protected int membros;
    //Metodos Abstrato
    public abstract void emitirSom();
    //Metodos SETTERS E GETTERS
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

}
