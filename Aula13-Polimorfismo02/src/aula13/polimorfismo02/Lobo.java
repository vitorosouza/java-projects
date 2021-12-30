package aula13.polimorfismo02;

public class Lobo extends Mamifero {
    //Caso nao tenha atributos declarado, o mesmo HERDA tudo de sua MAE (mamifero)
    @Override
    public void emitirSom(){
        System.out.println("Auuuuuuuuuuuu!");
    }
}
