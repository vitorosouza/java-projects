package aulas02;
public class Caneta {
  
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() { //Void significa "sem retorno"
        //This significa auto-referência à quem (à qual objeto) está chamando 
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Caneta de cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true)
        {
            System.out.println("ERRO! Não posso rabiscar!");
        } else
        {
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
