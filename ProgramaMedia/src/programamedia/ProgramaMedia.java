package programamedia;
import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        
        //PROGRAMA MOSTRANDO CONDICIONAL SIMPLES
        
        //Scanner vai monitorar a entrada do sistema
        Scanner teclado = new Scanner(System.in);
        System.out.println("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi " + m);
        
        if (m >= 9) {
            System.out.println("Parabéns, você foi ótimo!");
        } else {
            System.out.println("Você passou raspani!!!");
        }
        
       
        
        
        
        
        
    }
    
}
