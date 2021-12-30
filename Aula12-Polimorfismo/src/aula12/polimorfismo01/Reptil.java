package aula12.polimorfismo01;

public class Reptil extends Animal{
    //Atributo
    private String corEscama;
    
    //Metodos ABstratos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Veggies");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    //Metodo Getter e Setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
