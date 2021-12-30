package aula12.polimorfismo01;

public class Polimorfismo01 {

    public static void main(String[] args) {
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe();
       Ave a = new Ave();
       Canguru cang = new Canguru();
       Cachorro cach = new Cachorro();
       Tartaruga t = new Tartaruga();
       Cobra cob = new Cobra();
       
       
       cang.locomover();
       cang.usarBolsa();
       t.locomover();
       cob.locomover();
       cach.emitirSom();
       
    }
    
}
