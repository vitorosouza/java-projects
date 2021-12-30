package aula13.polimorfismo02;

public class Mamifero extends Animal {
    //Atributo da CLASSE MAMIFERO
    protected String corPelo;
    //SOBRESCREVENDO o metodo emitirSom, pois som de mamifero e diferente de som de ave por exemplo
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
