package heranca01;

public class Heranca01 {
    public static void main(String[] args) {
        /*Visitante v1 = new Visitante();
        v1.setNome("Vitor");
        v1.setIdade(26);
        v1.setSexo("M");
        System.out.println(v1.toString());
        */
        
       Aluno a1 = new Aluno();
        a1.setIdade(25);
        a1.setNome("Augusto");
        a1.setSexo("M");
        a1.setMatricula (14470);
        a1.setCurso("Engenharia de Produçao");
        a1.PagarMensalidade();
       
       
       Bolsista b1 = new Bolsista();
       b1.setMatricula(2455);
       b1.setCurso("Enfermagem");
       b1.setNome("David Velha");
       b1.setBolsa(7.5f);
       b1.setIdade(23);
       //b1.renovarBolsa();
       b1.PagarMensalidade();
       
       Tecnico t1 = new Tecnico();
       t1.setMatricula(23434);
       t1.setCurso("Tecnico em Informatica");
       t1.praticar();
    }
        
}
