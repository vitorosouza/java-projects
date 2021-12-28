package classes;

public class Fatorial {
    //Atributos
    private int num = 0;
    private int fat = 1;
    private String formula = "";
    
    //Metodos
    public void setValor(int n){
       num = n;
       int f = 1;
       String s = "";
       for (int c = n; c > 1; c--){
           f *= c; //f = f * c;
           s += c + " x "; //s = s + c + " x ";
        }
       s += "1 = ";
       fat = f;
       formula = s;
    }
    public int getFatorial(){
        return fat;
    }
    public String getFormula(){
        return formula;
    }
    
    
}
