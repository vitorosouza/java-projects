package aula12.polimorfismo01;

public class Ave extends Animal {
    //Atributo
    private String corPena;

    //Metodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Ave");   
    }
    
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    //Metodo Getter e Setter
    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
    
}
