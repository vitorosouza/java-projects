package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        // PROGRAMA MOSTRANDO A CONDICIONAL COMPOSTA COM UM IF E UM ELSE
        Scanner t = new Scanner(System.in);
        System.out.println("Digite seu ano de nascimento: ");
        int nasc = t.nextInt();
        int i = 2021 - nasc;
        if (i>=18){
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
    }
    
}
