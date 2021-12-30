package aula12.polimorfismo01;

public class Canguru extends Mamifero{
    
    public void usarBolsa(){
        System.out.println("Esta usando a bolsa");
    }
    
    @Override
    public void locomover(){
        System.out.println("Pulando");
    }
    
}
