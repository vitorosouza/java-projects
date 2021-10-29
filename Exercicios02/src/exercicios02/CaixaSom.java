package exercicios02;
public class CaixaSom {
    String marca;
    String cor;
    boolean bluetooth;
    boolean prova_dagua;
    
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tem bluetooth? " + this.bluetooth);
        System.out.println("É a prova d'àgua? " + this.prova_dagua);
       
            }
    
    void conectar(){
        if (bluetooth == true){
            System.out.println("Pode conectar o celular!");
        }
        
    }
}
