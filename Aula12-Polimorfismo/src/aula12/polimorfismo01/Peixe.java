package aula12.polimorfismo01;

public class Peixe extends Animal{
    //Atributo
    private String corEscama;

    //Metodos Abstratos
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias");    
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    //Metodo Getter e Setter
    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
    
}
