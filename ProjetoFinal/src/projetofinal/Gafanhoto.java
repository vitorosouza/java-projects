package projetofinal;

public class Gafanhoto extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;

    //Construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); //super pois ela puxa do construtor Pessoa()
        this.login = login;
        this.totAssistido = 0;
    }
    //Metodo Personalizado
    public void viuMaisUm(){
        this.totAssistido++;
    }
    //Metodos GETTERS e SETTERS
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    //SOBRESCRICAO de um toString() para mostrar tanto os dados da Pessoa quanto
    // do Gafanhoto
    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login
                + ", totAssistido=" + totAssistido + '}';
    }
    
    
    
    
}
