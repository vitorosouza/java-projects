package exercicios02;
public class Exercicios02 {

    public static void main(String[] args) {
        Copo c1 = new Copo();
        c1.marca = "Evolution";
        c1.material = "Polipropileno";
        c1.capacidade = 201;
        c1.cheio = true;
        c1.status();
        c1.encher();
        
        
        CaixaSom caixa = new CaixaSom();
        caixa.marca = "JBL";
        caixa.bluetooth = true;
        caixa.cor = "Preta";
        caixa.prova_dagua = true;
        caixa.status();
        caixa.conectar();
    }
  
}
