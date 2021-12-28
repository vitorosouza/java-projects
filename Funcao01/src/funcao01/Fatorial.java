package funcao01;

public class Fatorial {
    //Atributos
    private int numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
    //Metodos
    public void setValor(int n){
       numero = n;
       int f = 1;
       String s = "";
       for (int c = numero; c > 1; c--){
           
           //f = f * c;
           f *= c;
           //s = s + c + " x ";
           s += c + " x ";
            }
       s += "1 = ";
       fatorial = f;
       formula = s;
    }
    public int getFatorial(){
        return fatorial;
    }
    public String getFormula(){
        return formula;
    }
    
    
}
