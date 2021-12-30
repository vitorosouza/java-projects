package aula13.polimorfismo02;

public class Aula13Polimorfismo02 {

    public static void main(String[] args) {
        //PROGRAMA PRINCIPAL
        //Instaciando os objetos a partir das classes criadas
        Cachorro c = new Cachorro();
        //Realizando as açoes
        
        c.reagir("Ola"); // Abanar e Latir
        c.reagir("Vai apanhar!"); // Rosnar
        c.reagir(11, 45); // Abanar
        c.reagir(21, 00); // Ignorar
        c.reagir(true); // Abanar
        c.reagir(false); // Rosnar e Latir
        c.reagir(2, 12.5f); //Latir
        c.reagir(17, 4.5f); // Rosnar
        
        
        
        
        
    }
    
}
