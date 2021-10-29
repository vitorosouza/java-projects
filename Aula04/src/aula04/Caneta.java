package aula04;
public class Caneta {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    
   //1º Método CONSTRUTOR 
   /*public Caneta(){ 
       this.modelo = m;
       this.cor = c;
       this.ponta = p;
       this.tampar();
       this.cor = "Azul";     
   }  
    */
    
    //2º Método CONSTRUTOR
    public Caneta(String m, String c, float p){
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();               
    }
    //Método GETTER, não pode ser "public void" pois irá retornar uma String
    public String getModelo(){
        return this.modelo;      
    }    
    //Método SETTER, e abaixo vamos fazer que o "modelo" receba o "m"
    public void setModelo(String m){
        this.modelo = m;        
    }   
    //Irá retornar uma float
    public float getPonta(){
        return this.ponta;
    }
    //Irá receber um valor "float" que é "p"
    public void setPonta(float p){
        this.ponta = p;               
    }
    public void tampar(){
        this.tampada = true;       
    }
    public void destampar(){
        this.tampada = false;
    }    
    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("");
    }    
}
