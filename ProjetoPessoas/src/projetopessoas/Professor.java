package projetopessoas;

public class Professor extends Pessoa {
   //Atributos
   private String especialidade;
   private float salario;
   
   public void receberAumento(float aumento){
       this.salario += aumento;
   }

    //Metodos GETTERS E SETTERS
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
   
}
