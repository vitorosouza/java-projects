package aula06;
//2ª PARTE - CRIAR  CLASSE E 3ª PARTE - IMPLEMENTAR INTERFACE
public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos Especiais
    
    //Construtor
    public ControleRemoto(){
    this.setVolume(50);
    this.setLigado(true);
    this.setTocando(false);
    }
    //Getters e Setters
    private int getVolume() {
        return volume;
    }
    private boolean getLigado() {
        return ligado;
    }
    private boolean getTocando() {
        return tocando;
    }
    private void setVolume(int v) {
        this.volume = v;
    }
    private void setLigado(boolean l) {
        this.ligado = l;
    }
    private void setTocando(boolean t) {
        this.tocando = t;
    }
    
    //3ª PARTE - Sobrescreve os métodos abstratos da interface
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    @Override
    public void abrirMenu() {
        if(getLigado() == true){
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("|");
        }}else {
            System.out.println("Controle desligado...");
        }   
        System.out.println("");
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    @Override
    public void maisVolume() {
        if (getLigado()){
            this.setVolume(this.getVolume()+5);           
        } else {
            System.out.println("Impossível aumentar volume");
        }
    }
    @Override
    public void menosVolume() {
        if(getLigado()){
            this.setVolume(this.getVolume()-5);
        } else{
            System.out.println("Impossível diminuir volume");
        }
    }
    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        } else {
            System.out.println("Não consegui reproduzir");
        }
    }
    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        } else {
            System.out.println("Não consegui pausar");
        }
    }
    
    
    
}
