package aula12.polimorfismo01;

public class Cachorro extends Mamifero {
   
    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }
    
    public void enterrarOsso(){
       System.out.println("Osso enterrado!");
   } 
   
   public void abanarRabo(){
       System.out.println("Abanando o rabo!");
   }
}
