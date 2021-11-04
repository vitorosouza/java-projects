package aulas02;
public class Aulas02 {
    
   public static void main(String[] args) {
       //Agora irei instanciar a classe Caneta no objeto c1
       Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        //c1.tampada = true;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
   }
    


