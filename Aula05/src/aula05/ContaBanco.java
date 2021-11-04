package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
     
    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
 
    }   
    public void abrirConta(String t) {
        //this.setTipo(t);
        setTipo(t);
        setStatus(true);
        //Até se usa esse tipo de if, porém há esse outro método de escrever
        //if (t == "CC")
        if ("CC".equals(t))
        {
            //this.saldo = 50;
            this.setSaldo(50);           
        } else if ("CP".equals(t))
        {
            //this.saldo = 150;
            this.setSaldo(150);
        }
        System.out.println("A conta de " + this.getDono() + " foi aberta com sucesso!");
    }      
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("A conta de " + this.getDono() + ", não pode ser fechada! Pois há saldo!");
        }else if(this.getSaldo() < 0){
            System.out.println("A conta de " + this.getDono() +", não pode ser fechada pois tem débito!");
        }else{
            this.setStatus(false);
            System.out.println("A conta de " + this.getDono() + " foi fechada com sucesso!");
        }
    }   
    public void depositar(float v){
        if(this.status == true){
           //this.saldo = this.saldo + v; 
           setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado com sucesso de " + this.getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }    
    public void sacar(float v) {
        if (this.getStatus())
        {
            if (this.getSaldo() >= v)
            {
                //saldo = saldo - v;  
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else
            {
                System.out.println("Saldo Insuficiente para saque da conta de " + this.getDono());
            }
        } else
        {
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if(this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }       
    }   
    //Métodos Especiais - Construtor
    public ContaBanco() {
         
    }   
    //Métodos Especiais - GETTERS E SETTERS
    public void setNumConta(int n){
        this.numConta = n;
    }   
    public int getNumConta(){
        return this.numConta ;
    }    
    public void setTipo(String t){
        this.tipo = t;
    }    
    public String getTipo(){
        return this.tipo;
    }
    public void setDono(String d){
        this.dono = d;
    }
    public String getDono(){
        return this.dono;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }
    public void setStatus(boolean s){
        this.status = s;
    }
    public boolean getStatus(){
        return this.status;
    }
   
    
}
