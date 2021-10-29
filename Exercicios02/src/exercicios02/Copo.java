package exercicios02;
public class Copo {
    String marca;
    String material;
    int capacidade;
    boolean cheio;
    
    void status(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Material: " + this.material);
        System.out.println("Capacidade no momento: " + this.capacidade + "ml");
            }
    
    void encher(){
        if (capacidade == 200){
        System.out.println("O copo está vazio...");
        }   
        else {
            System.out.println("O copo está cheio!!!");
        } 
          
    }
    
}
