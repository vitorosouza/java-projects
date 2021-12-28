package testefuncao01;

public class TesteFuncao01 {
    
    //O COMPILADOR SEMPRE RODARA PRIMEIRO O METODO "main"
    
    static int soma(int a, int b){
        int s = a + b;
        return s;
        //System.out.println("A soma e: " + soma);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa");
        //Atribuindo esse valor de retorno a uma variavel (sm)
        //sm ira receber o resultado da soma entre 5 e 2
        int sm = soma(5,2);
        System.out.println("A soma vale " + sm);
    }
    
}
