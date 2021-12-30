package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Classe Abstrata");
       p2.setNome("Maria");
       p3.setNome("Claudio");
       p4.setNome("Fabiana");
       
       p3.setSexo("M");
       p4.setSexo("F");
       p2.setIdade(18);
       
       
       p2.setCurso("Engenharia Quimica");
       p3.setSalario((int) 2500.75);
       p4.setSetor("Estoque");
       
       //p1.receberAumento(550.20);
       //p2.mudarTrabalho();
       //p4.cancelarMatricula();
       
       
       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
    }
    
}
