package numeros;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int numero, soma=0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();
            soma += numero; // soma = soma + numero
            System.out.println("Quer continuar [S/N] ");
            resposta = teclado.next();
        } while (resposta.equals("S") || (resposta.equals("s")));
        System.out.println("A soma de todos os valor é " + soma);
        
        
    }
    
}
