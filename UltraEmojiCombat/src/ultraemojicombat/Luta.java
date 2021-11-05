package ultraemojicombat;
//Precisei importar para poder criar o objeto do tipo Random
import java.util.Random;

public class Luta {
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos Publicos
    public void marcarLuta(Lutador l1, Lutador l2) {
        //Se a categoria do l1 for igual a do l2
        if (l1.getCategoria().equals(l2.getCategoria())
                // e l1 for diferente de l2
                && l1 != l2)
        {
            //Faça
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
            //Senão
        } else
        {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("########## DESAFIADO ##########");
            this.desafiado.apresentar();
            System.out.println("######### DESAFIANTE ##########");
            this.desafiante.apresentar();
            
            //Criando um objeto do tipo Random
            Random aleatorio = new Random();
            //Gerando 3 resultados (0 1 2) p/ definir o vencedor
            int vencedor = aleatorio.nextInt(3);
            System.out.println("======== RESULTADO DA LUTA ========");
            //Estrutura "escolha"
            switch(vencedor){
                case 0: // Empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                    
                case 1: // Desafiado vence
                    System.out.println("Vitória do " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                    
                case 2: // Desafiante vence
                    System.out.println("Vitória do " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
                System.out.println("===================================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
    //Métodos Especiais
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
